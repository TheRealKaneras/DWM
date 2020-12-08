package com.softetch.dwm.common.block;

import com.softetch.dwm.common.tileentity.ClassicDoorsTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class ClassicDoorsBlock extends SmartDoorBlock {
    public ClassicDoorsBlock() {
        super(Block.Properties.create(Material.WOOD).lightValue(12).doesNotBlockMovement());
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ClassicDoorsTile();
    }
}
