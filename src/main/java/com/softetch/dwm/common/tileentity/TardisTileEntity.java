package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMNBTTags;
import com.softetch.dwm.DWMSounds;
import com.softetch.dwm.DWMTileEntities;
import com.softetch.dwm.common.tardis.TardisData;
import com.softetch.dwm.network.PacketHandler;
import com.softetch.dwm.network.packets.PacketChameleonData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class TardisTileEntity extends TileEntity implements ITickableTileEntity {
    private DoorState doorState = DoorState.CLOSED;
    private float doorProgression = 0.0f;
    private TardisData data;

    public TardisTileEntity() {
        super(DWMTileEntities.TARDIS);
    }

    @Override
    public void tick() {
        if (data == null)
            return;
        if (isOwnerNearby() && !isOpen()) {
            setDoorState(DoorState.BOTH);
        } else if (!isOwnerNearby() && isOpen()) {
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

    public TardisData getData() {
        return data;
    }

    public void setData(TardisData data) {
        this.data = data;
    }

    public boolean isOwner(PlayerEntity player) {
        return player.getUniqueID().toString().equals(getData().getOwnerUuid());
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
        return doorState != DoorState.CLOSED;
    }

    public void setDoorState(DoorState doorState) {
        if (doorState != this.doorState && getWorld() != null && !getWorld().isRemote) {
            if (doorState == DoorState.CLOSED) {
                getWorld().playSound(getPos().getX(), getPos().getY(), getPos().getZ(), DWMSounds.TARDIS_CLOSE, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
            } else {
                getWorld().playSound(getPos().getX(), getPos().getY(), getPos().getZ(), DWMSounds.TARDIS_OPEN, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        this.doorState = doorState;
        markDirty();
    }

    public DoorState getDoorState() {
        return doorState;
    }

    public float getDoorProgression() {
        return doorProgression;
    }

    public void setChameleon(int chameleon, boolean sendPacketUpdate) {
        getData().setChameleonId(chameleon);
        markDirty();
        if (sendPacketUpdate) {
            PacketHandler.HANDLER.sendToServer(new PacketChameleonData(getPos(), getChameleon()));
        }
    }

    public int getChameleon() {
        return getData().getChameleonId();
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        compound.putInt(DWMNBTTags.DOOR_STATE.getTag(), getDoorState().getId());
        return compound;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        setDoorState(DoorState.fromId(compound.getInt(DWMNBTTags.DOOR_STATE.getTag())));
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
