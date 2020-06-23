package com.softetch.dwm.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class DWMLogBlock extends LogBlock {
    public DWMLogBlock(MaterialColor verticalColorIn, Properties properties) {
        super(verticalColorIn, properties);
    }

    @Override
    public boolean canBeReplacedByLogs(BlockState state, IWorldReader world, BlockPos pos) {
        return true;
    }

}
