package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMSounds;
import com.softetch.dwm.DWMTileEntities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class TardisTileEntity extends TileEntity implements ITickableTileEntity {
    private DoorState doorState = DoorState.CLOSED;
    private float doorProgression = 0.0f;

    public TardisTileEntity() {
        super(DWMTileEntities.TARDIS);
    }

    @Override
    public void tick() {
        List<PlayerEntity> list = getWorld().getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(getPos()).grow(2, 1.5, 2));
        if (!list.isEmpty() && !isOpen()) {
            setDoorState(DoorState.BOTH);
        } else if (list.isEmpty() && isOpen()) {
            setDoorState(DoorState.CLOSED);
        }
        if (isOpen() && doorProgression < 1.0f) {
            doorProgression += 0.05f;
        } else if (!isOpen() && doorProgression > 0.0f) {
            doorProgression -= 0.05f;
        }

        if (doorProgression > 1.0f) {
            doorProgression = 1.0f;
        } else if (doorProgression < 0.0f) {
            doorProgression = 0.0f;
        }
    }

    public boolean isOpen() {
        return doorState != DoorState.CLOSED;
    }

    public void setDoorState(DoorState doorState) {
        if (doorState != this.doorState) {
            if (doorState == DoorState.CLOSED) {
                getWorld().playSound(getPos().getX(), getPos().getY(), getPos().getZ(), DWMSounds.TARDIS_CLOSE, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
            } else {
                getWorld().playSound(getPos().getX(), getPos().getY(), getPos().getZ(), DWMSounds.TARDIS_OPEN, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        this.doorState = doorState;
    }

    public DoorState getDoorState() {
        return doorState;
    }

    public float getDoorProgression() {
        return doorProgression;
    }

    public enum DoorState {
        BOTH, SINGLE, CLOSED
    }
}
