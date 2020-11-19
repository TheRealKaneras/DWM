package com.softetch.dwm.common.tileentity;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class ClassicDoorsTile extends TileEntity implements ITickableTileEntity {
    private CompoundNBT compoundNBT;

    public ClassicDoorsTile(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public void tick() {
        if (world != null && !world.isRemote) {

        }
    }

}
