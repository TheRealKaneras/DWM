package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMNBTTags;
import com.softetch.dwm.DWMTileEntities;
import com.softetch.dwm.client.tardis.ChameleonRegistry;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.sound.DWMSoundEvent;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class TardisExteriorTile extends TileEntity implements ITickableTileEntity {
    private CompoundNBT compoundNBT;

    public TardisExteriorTile() {
        super(DWMTileEntities.TARDIS);
    }

    @Override
    public void tick() {
        if (getChameleonData() == null)
            return;
        if (!world.isRemote()) {
            if (world.getGameTime() % getChameleonData().getAmbientSound().getDuration() == 0) {
                playSound(getChameleonData().getAmbientSound(), SoundCategory.AMBIENT);
            }
            if (isOwnerNearby() && !isOpen() && !isLocked()) {
                setDoorState(DoorState.BOTH, false);
            } else if (!isOwnerNearby() && isOpen() || isLocked()) {
                setDoorState(DoorState.CLOSED, false);
            }

            if (isOpen() && getDoorProgression() < 1.0f) {
                updateDoorProgression(getDoorProgression() + getChameleonData().getOpenSpeed());
            } else if (!isOpen() && getDoorProgression() > 0.0f) {
                updateDoorProgression(getDoorProgression() - getChameleonData().getCloseSpeed());
            }
            if (getDoorProgression() > 1.0f) {
                updateDoorProgression(1.0f);
            } else if (getDoorProgression() < 0.0f) {
                updateDoorProgression(0.0f);
            }
        }
    }

    public void updateDoorProgression(float doorProgression) {
        createCompoundNBT();
        compoundNBT.putFloat(DWMNBTTags.DOOR_PROGRESSION.getTag(), doorProgression);
        markDirty();
        updateClient();
    }

    public float getDoorProgression() {
        return compoundNBT != null ? compoundNBT.getFloat(DWMNBTTags.DOOR_PROGRESSION.getTag()) : 0.0f;
    }

    private void createCompoundNBT() {
        if (compoundNBT == null)
            compoundNBT = new CompoundNBT();
    }

    public boolean isLocked() {
        return compoundNBT != null && compoundNBT.getBoolean(DWMNBTTags.LOCKED.getTag());
    }

    public void setLocked(boolean locked) {
        createCompoundNBT();
        compoundNBT.putBoolean(DWMNBTTags.LOCKED.getTag(), locked);
    }

    public void forceOpen(boolean open) {
        setDoorState(open ? DoorState.BOTH : DoorState.CLOSED, true);
        updateDoorProgression(open ? 1.0f : 0.0f);
    }

    private void playSound(DWMSoundEvent soundEvent, SoundCategory soundCategory) {
        if (soundEvent != null)
            getWorld().playSound(null, getPos().getX(), getPos().getY(), getPos().getZ(), soundEvent, soundCategory, soundEvent.getRecommendedVolume(), 1.0f);
    }

    public void cycleLock() {
        setLocked(!isLocked());
        if (isLocked()) {
            if (getChameleonData().shouldDoorLockFast()) {
                forceOpen(false);
            } else {
                setDoorState(DoorState.CLOSED, false);
            }
            playSound(getChameleonData().getLockDoorSound(), SoundCategory.BLOCKS);
        } else {
            playSound(getChameleonData().getUnlockDoorSound(), SoundCategory.BLOCKS);
        }
        markDirty();
        updateClient();
    }

    public String getOwnerUuid() {
        return compoundNBT != null ? compoundNBT.getString(DWMNBTTags.TARDIS_OWNER.getTag()) : null;
    }

    public void setOwnerUuid(String ownerUuid) {
        createCompoundNBT();
        compoundNBT.putString(DWMNBTTags.TARDIS_OWNER.getTag(), ownerUuid);
        markDirty();
        updateClient();
    }

    public boolean isOwner(PlayerEntity player) {
        return compoundNBT != null && player.getUniqueID().toString().equals(getOwnerUuid());
    }

    public boolean isOwnerNearby() {
        AxisAlignedBB searchBounds = new AxisAlignedBB(getPos()).grow(2, 1.5, 2);
        List<PlayerEntity> list = getWorld().getEntitiesWithinAABB(PlayerEntity.class, searchBounds);
        for (PlayerEntity player : list) {
            if (isOwner(player))
                return true;
        }
        return false;
    }

    public boolean isOpen() {
        return getDoorState() != DoorState.CLOSED;
    }

    public void setDoorState(DoorState doorState, boolean slam) {
            if (getDoorState() != doorState) {
                if (doorState == DoorState.CLOSED) {
                    if (slam && getChameleonData().getDoorSlamSound() != null) {
                        playSound(getChameleonData().getDoorSlamSound(), SoundCategory.BLOCKS);
                    } else {
                        playSound(getChameleonData().getCloseDoorSound(), SoundCategory.BLOCKS);
                    }
                } else {
                    playSound(getChameleonData().getOpenDoorSound(), SoundCategory.BLOCKS);
                }
            }
            createCompoundNBT();
            compoundNBT.putInt(DWMNBTTags.DOOR_STATE.getTag(), doorState.getId());
            markDirty();
            updateClient();
    }

    public DoorState getDoorState() {
        if (compoundNBT != null)
            return DoorState.fromId(compoundNBT.getInt(DWMNBTTags.DOOR_STATE.getTag()));
        return DoorState.CLOSED;
    }

    public void setChameleon(String chameleon) {
        createCompoundNBT();
        compoundNBT.putString(DWMNBTTags.CHAMELEON.getTag(), chameleon);
        markDirty();
        updateClient();
    }

    public String getChameleon() {
        return compoundNBT != null ? compoundNBT.getString(DWMNBTTags.CHAMELEON.getTag()) : null;
    }

    public AbstractChameleonData getChameleonData() {
        if (getChameleon() == null) {
            return null;
        }
        return ChameleonRegistry.TARDIS_SKINS.get(getChameleon());
    }

    public void setInteriorPos(BlockPos pos) {
        createCompoundNBT();
        compoundNBT.putIntArray(DWMNBTTags.INTERIOR_POS.getTag(), new int[] {pos.getX(), pos.getY(), pos.getZ()});
        markDirty();
        updateClient();
    }

    public BlockPos getInteriorPos() {
        if (compoundNBT != null && compoundNBT.getIntArray(DWMNBTTags.INTERIOR_POS.getTag()) != null) {
            int[] pos = compoundNBT.getIntArray(DWMNBTTags.INTERIOR_POS.getTag());
            if (pos.length > 0)
                return new BlockPos(pos[0], pos[1], pos[2]);
        }
        return null;
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        createCompoundNBT();
        compound.put(DWMNBTTags.TARDIS_DATA.getTag(), compoundNBT);
        return compound;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        compoundNBT = (CompoundNBT) compound.get(DWMNBTTags.TARDIS_DATA.getTag());
    }

    @Override
    public CompoundNBT getUpdateTag() {
        return write(new CompoundNBT());
    }

    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        return new SUpdateTileEntityPacket(this.getPos(), 0, write(new CompoundNBT()));
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        read(pkt.getNbtCompound());
    }

    private void updateClient() {
        if (!world.isRemote) {
            BlockState blockState = getWorld().getBlockState(getPos());
            world.notifyBlockUpdate(getPos(), blockState, blockState, 3);
        }
    }

    public enum DoorState {
        CLOSED(0), SINGLE(1), BOTH(2);

        private final int id;

        DoorState(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public static DoorState fromId(int id) {
            for (DoorState state : DoorState.values()) {
                if (state.getId() == id)
                    return state;
            }
            return DoorState.CLOSED;
        }
    }
}
