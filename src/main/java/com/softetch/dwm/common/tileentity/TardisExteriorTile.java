package com.softetch.dwm.common.tileentity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.DWMNBTTags;
import com.softetch.dwm.DWMTileEntities;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.UUID;

public class TardisExteriorTile extends DoorTypeTile {
    private CompoundNBT compoundNBT;

    public TardisExteriorTile() {
        super(DWMTileEntities.TARDIS);
        createUuid();
    }

    @Override
    public void tick() {
        if (getChameleonData() == null)
            return;
        if (world == null || world.isRemote())
            return;

        playAmbientSound();
        super.tick();
    }

    private void playAmbientSound() {
        if (world == null || world.getGameTime() % getChameleonData().getAmbientSound().getDuration() != 0)
            return;

        playSound(getChameleonData().getAmbientSound(), SoundCategory.AMBIENT);
    }

    @Override
    protected boolean closeByProximity() {
        return !isOwnerNearby();
    }

    @Override
    protected float getOpenSpeed() {
        return getChameleonData().getOpenSpeed();
    }

    @Override
    protected float getCloseSpeed() {
        return getChameleonData().getCloseSpeed();
    }

    private void createCompoundNBT() {
        if (compoundNBT != null)
            return;
        compoundNBT = new CompoundNBT();
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
        AxisAlignedBB searchBounds = new AxisAlignedBB(getPos()).grow(5, 3, 5);
        List<PlayerEntity> list = getWorld().getEntitiesWithinAABB(PlayerEntity.class, searchBounds);
        for (PlayerEntity player : list) {
            if (isOwner(player))
                return true;
        }
        return false;
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

}
