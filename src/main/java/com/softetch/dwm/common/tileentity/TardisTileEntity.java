package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMNBTTags;
import com.softetch.dwm.DWMSounds;
import com.softetch.dwm.DWMTileEntities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class TardisTileEntity extends TileEntity implements ITickableTileEntity {
    private CompoundNBT compoundNBT;

    public TardisTileEntity() {
        super(DWMTileEntities.TARDIS);
    }

    @Override
    public void tick() {
        if (!world.isRemote()) {
            if (isOwnerNearby() && !isOpen() && !isLocked()) {
                setDoorState(DoorState.BOTH, false);
            } else if (!isOwnerNearby() && isOpen() || isLocked()) {
                setDoorState(DoorState.CLOSED, false);
            }

            if (isOpen() && getDoorProgression() < 1.0f) {
                updateDoorProgression(getDoorProgression() + 0.05f);
            } else if (!isOpen() && getDoorProgression() > 0.0f) {
                updateDoorProgression(getDoorProgression() - 0.05f);
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

    private void playSound(SoundEvent soundEvent, SoundCategory soundCategory) {
        getWorld().playSound(null, getPos().getX(), getPos().getY(), getPos().getZ(), soundEvent, soundCategory, 1.0f, 1.0f);
    }

    public void cycleLock() {
        setLocked(!isLocked());
        if (isLocked()) {
            forceOpen(false);
            playSound(DWMSounds.TARDIS_LOCK, SoundCategory.BLOCKS);
        } else {
            playSound(DWMSounds.TARDIS_UNLOCK, SoundCategory.BLOCKS);
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
        world.notifyBlockUpdate(getPos(), getWorld().getBlockState(getPos()), getWorld().getBlockState(getPos()), 3);
    }

    public boolean isOwner(PlayerEntity player) {
        return compoundNBT != null && player.getUniqueID().toString().equals(getOwnerUuid());
    }

    public boolean isOwnerNearby() {
        List<PlayerEntity> list = getWorld().getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(getPos()).grow(2, 1.5, 2));
        for (PlayerEntity player : list) {
            if (isOwner(player))
                return true;
        }
        return false;
    }

    public boolean isOpen() {
        return getDoorState() != DoorState.CLOSED;
    }

    public void setDoorState(DoorState doorState, boolean isFast) {
            if (getDoorState() != doorState) {
                if (doorState == DoorState.CLOSED) {
                    playSound(isFast ? DWMSounds.TARDIS_FAST_CLOSE : DWMSounds.TARDIS_CLOSE, SoundCategory.BLOCKS);
                } else {
                    playSound(isFast ? DWMSounds.TARDIS_FAST_OPEN : DWMSounds.TARDIS_OPEN, SoundCategory.BLOCKS);
                }
            }
            createCompoundNBT();
            compoundNBT.putInt(DWMNBTTags.DOOR_STATE.getTag(), doorState.getId());
            markDirty();
            updateClient();
    }

    public DoorState getDoorState() {
        return compoundNBT != null ? DoorState.fromId(compoundNBT.getInt(DWMNBTTags.DOOR_STATE.getTag())) : DoorState.CLOSED;
    }

    public void setChameleon(int chameleon) {
        createCompoundNBT();
        compoundNBT.putInt(DWMNBTTags.CHAMELEON.getTag(), chameleon);
        markDirty();
        updateClient();
    }

    public int getChameleon() {
        return compoundNBT != null ? compoundNBT.getInt(DWMNBTTags.CHAMELEON.getTag()) : 0;
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
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
        if (!world.isRemote)
            world.notifyBlockUpdate(getPos(), getWorld().getBlockState(getPos()), getWorld().getBlockState(getPos()), 3);
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
