package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMNBTTags;
import com.softetch.dwm.common.sound.DWMSoundEvent;
import com.softetch.dwm.common.sound.DWMSoundEvents;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundCategory;

public class DoorTypeTile extends TileEntity implements ITickableTileEntity {
    private CompoundNBT compoundNBT;

    public DoorTypeTile(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public void tick() {
        if (world != null && !world.isRemote) {
            if (closeByProximity() && isOpen() || isLocked()) {
                setDoorState(DoorState.CLOSED, false);
            }
            if (canOpenFurther()) {
                progressDoorOpen();
            } else if (canCloseFurther()) {
                progressDoorClose();
            }
        }
    }

    public void setDoorState(DoorState doorState, boolean slam) {
        if (getDoorState() != doorState) {
            if (getDoorState() != doorState) {
                if (doorState == DoorState.CLOSED) {
                    if (slam && getDoorSlamSound() != null) {
                        playSound(getDoorSlamSound(), SoundCategory.BLOCKS);
                    } else {
                        playSound(getCloseDoorSound(), SoundCategory.BLOCKS);
                    }
                } else {
                    playSound(getOpenDoorSound(), SoundCategory.BLOCKS);
                }
            }
            createCompoundNBT();
            compoundNBT.putInt(DWMNBTTags.DOOR_STATE, doorState.getId());
            markDirty();
            updateClient();
        }
    }

    public void toggleDoor() {
        if (isLocked())
            return;
        if (getDoorState() != DoorState.CLOSED) {
            setDoorState(DoorState.CLOSED, false);
        } else {
            setDoorState(DoorState.BOTH, false);
        }
    }

    protected DWMSoundEvent getCloseDoorSound() {
        return DWMSoundEvents.TARDIS_CLOSE;
    }

    protected DWMSoundEvent getOpenDoorSound() {
        return DWMSoundEvents.TARDIS_OPEN;
    }

    protected DWMSoundEvent getDoorSlamSound() {
        return DWMSoundEvents.TARDIS_FAST_CLOSE;
    }

    protected DWMSoundEvent getLockDoorSound() { return DWMSoundEvents.TARDIS_LOCK; }

    protected DWMSoundEvent getUnlockDoorSound() { return DWMSoundEvents.TARDIS_UNLOCK; }

    protected void playSound(DWMSoundEvent soundEvent, SoundCategory soundCategory) {
        if (soundEvent == null || world == null)
            return;

        world.playSound(null, getPos().getX(), getPos().getY(), getPos().getZ(), soundEvent, soundCategory, soundEvent.getRecommendedVolume(), 1.0f);
    }

    public boolean isLocked() {
        return compoundNBT != null && compoundNBT.getBoolean(DWMNBTTags.LOCKED);
    }

    public void setLocked(boolean locked) {
        createCompoundNBT();
        compoundNBT.putBoolean(DWMNBTTags.LOCKED, locked);
    }

    public void cycleLock() {
        setLocked(!isLocked());
        if (isLocked()) {
            if (shouldDoorLockFast()) {
                forceOpen(false);
            } else {
                setDoorState(DoorState.CLOSED, false);
            }
            playSound(getLockDoorSound(), SoundCategory.BLOCKS);
        } else {
            playSound(getUnlockDoorSound(), SoundCategory.BLOCKS);
        }
        markDirty();
        updateClient();
    }

    private void forceOpen(boolean open) {
        setDoorState(open ? DoorState.BOTH : DoorState.CLOSED, true);
        updateDoorProgression(open ? 1.0f : 0.0f);
    }

    protected boolean shouldDoorLockFast() {
        return false;
    }

    private boolean canOpenFurther() {
        return !isLocked() && isOpen() && getDoorProgression() < 1.0f;
    }

    private boolean canCloseFurther() {
        return !isOpen() && getDoorProgression() > 0.0f;
    }

    private void progressDoorOpen() {
        updateDoorProgression(getDoorProgression() + getOpenSpeed());
        cleanDoorAngle();
    }

    private void progressDoorClose() {
        updateDoorProgression(getDoorProgression() - getCloseSpeed());
        cleanDoorAngle();
    }

    protected float getOpenSpeed() {
        return 0.05f;
    }

    protected float getCloseSpeed() {
        return 0.05f;
    }

    private void cleanDoorAngle() {
        if (getDoorProgression() > 1.0f) {
            updateDoorProgression(1.0f);
        } else if (getDoorProgression() < 0.0f) {
            updateDoorProgression(0.0f);
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

    public DoorState getDoorState() {
        if (compoundNBT != null)
            return DoorState.fromId(compoundNBT.getInt(DWMNBTTags.DOOR_STATE));
        return DoorState.CLOSED;
    }

    protected boolean isOpen() {
        return getDoorState() != DoorState.CLOSED;
    }

    protected boolean closeByProximity() {
        return false;
    }

    private void createCompoundNBT() {
        if (compoundNBT == null)
            compoundNBT = new CompoundNBT();
    }

    protected void updateClient() {
        if (world != null && !world.isRemote) {
            BlockState blockState = getWorld().getBlockState(getPos());
            world.notifyBlockUpdate(getPos(), blockState, blockState, 3);
        }
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        createCompoundNBT();
        compound.put(DWMNBTTags.DOOR_DATA, compoundNBT);
        return compound;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        compoundNBT = (CompoundNBT) compound.get(DWMNBTTags.DOOR_DATA);
    }

    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        return new SUpdateTileEntityPacket(this.getPos(), 0, write(new CompoundNBT()));
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        read(pkt.getNbtCompound());
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
