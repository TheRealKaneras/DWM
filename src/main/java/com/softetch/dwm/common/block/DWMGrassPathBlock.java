package com.softetch.dwm.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.GrassPathBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class DWMGrassPathBlock extends GrassPathBlock {
    public DWMGrassPathBlock(Properties builder) {
        super(builder);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        DWMFarmlandBlock.turnToDirt(state, worldIn, pos);
    }
}
