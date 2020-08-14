package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.DWMNBTTags;
import com.softetch.dwm.DWMTileEntities;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
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
import java.util.UUID;

public class TardisExteriorTile extends TileEntity implements ITickableTileEntity {
    private CompoundNBT compoundNBT;

    public TardisExteriorTile() {
        super(DWMTileEntities.TARDIS);
        createUuid();
    }

    @Override
    public void tick() {
        if (getChameleonData() == null)
            return;
        if (world != null && !world.isRemote()) {
            if (world.getGameTime() % getChameleonData().getAmbientSound().getDuration() == 0) {
                playSound(getChameleonData().getAmbientSound(), SoundCategory.AMBIENT);
            }
            if (!isOwnerNearby() && isOpen() || isLocked()) {
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

    public void toggleDoor() {
        if (getDoorState() != DoorState.CLOSED) {
            setDoorState(DoorState.CLOSED, false);
        } else {
            setDoorState(DoorState.BOTH, false);
        }
    }

    public void updateDoorProgression(float doorProgression) {
        createCompoundNBT();
        compoundNBT.putFloat(DWMNBTTags.DOOR_PROGRESSION, doorProgression);
        markDirty();
        updateClient();
    }

    public float getDoorProgression() {
        return compoundNBT != null ? compoundNBT.getFloat(DWMNBTTags.DOOR_PROGRESSION) : 0.0f;
    }

    private void createCompoundNBT() {
        if (compoundNBT == null)
            compoundNBT = new CompoundNBT();
    }

    public boolean isLocked() {
        return compoundNBT != null && compoundNBT.getBoolean(DWMNBTTags.LOCKED);
    }

    public void setLocked(boolean locked) {
        createCompoundNBT();
        compoundNBT.putBoolean(DWMNBTTags.LOCKED, locked);
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

    public String getOwnerUUID() {
        return compoundNBT != null ? compoundNBT.getString(DWMNBTTags.TARDIS_OWNER) : null;
    }

    public void setOwnerUUID(String ownerUUID) {
        createCompoundNBT();
        compoundNBT.putString(DWMNBTTags.TARDIS_OWNER, ownerUUID);
        markDirty();
        updateClient();
    }

    public boolean isOwner(PlayerEntity player) {
        return compoundNBT != null && player.getUniqueID().toString().equals(getOwnerUUID());
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
            compoundNBT.putInt(DWMNBTTags.DOOR_STATE, doorState.getId());
            markDirty();
            updateClient();
    }

    public DoorState getDoorState() {
        if (compoundNBT != null)
            return DoorState.fromId(compoundNBT.getInt(DWMNBTTags.DOOR_STATE));
        return DoorState.CLOSED;
    }

    public void setChameleon(String chameleon) {
        createCompoundNBT();
        compoundNBT.putString(DWMNBTTags.CHAMELEON, chameleon);
        markDirty();
        updateClient();
    }

    public String getChameleon() {
        return compoundNBT != null ? compoundNBT.getString(DWMNBTTags.CHAMELEON) : null;
    }

    public BaseChameleonData getChameleonData() {
        if (getChameleon() == null) {
            return null;
        }
        return DWMMain.CHAMELEON_REGISTRY.TARDIS_SKINS.get(getChameleon());
    }

    public void setInteriorPos(BlockPos pos) {
        createCompoundNBT();
        compoundNBT.putIntArray(DWMNBTTags.INTERIOR_POS, new int[] {pos.getX(), pos.getY(), pos.getZ()});
        markDirty();
        updateClient();
    }

    public BlockPos getInteriorPos() {
        if (compoundNBT != null && compoundNBT.getIntArray(DWMNBTTags.INTERIOR_POS) != null) {
            int[] pos = compoundNBT.getIntArray(DWMNBTTags.INTERIOR_POS);
            if (pos.length > 0)
                return new BlockPos(pos[0], pos[1], pos[2]);
        }
        return null;
    }

    private void createUuid() {
        createCompoundNBT();
        compoundNBT.putUniqueId(DWMNBTTags.UUID, UUID.randomUUID());
        markDirty();
        updateClient();
    }

    public UUID getUUID() {
        return compoundNBT.getUniqueId(DWMNBTTags.UUID);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        createCompoundNBT();
        compound.put(DWMNBTTags.TARDIS_DATA, compoundNBT);
        return compound;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        compoundNBT = (CompoundNBT) compound.get(DWMNBTTags.TARDIS_DATA);
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
        if (world != null && !world.isRemote) {
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
