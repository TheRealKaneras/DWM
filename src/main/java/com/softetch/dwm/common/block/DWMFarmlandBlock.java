package com.softetch.dwm.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.FarmlandWaterManager;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class DWMFarmlandBlock extends FarmlandBlock {
    private final Block dirtBlock;

    public DWMFarmlandBlock(Block dirtBlock) {
        super(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND));
        this.dirtBlock = dirtBlock;
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (!state.isValidPosition(worldIn, pos)) {
            turnToModdedDirt(state, worldIn, pos);
        } else {
            int i = state.get(MOISTURE);
            if (!hasWater(worldIn, pos) && !worldIn.isRainingAt(pos.up())) {
                if (i > 0) {
                    worldIn.setBlockState(pos, state.with(MOISTURE, Integer.valueOf(i - 1)), 2);
                } else if (!hasCrops(worldIn, pos)) {
                    turnToModdedDirt(state, worldIn, pos);
                }
            } else if (i < 7) {
                worldIn.setBlockState(pos, state.with(MOISTURE, Integer.valueOf(7)), 2);
            }

        }
    }

    public void turnToModdedDirt(BlockState state, World worldIn, BlockPos pos) {
        worldIn.setBlockState(pos, nudgeEntitiesWithNewState(state, dirtBlock.getDefaultState(), worldIn, pos));
    }

    private static boolean hasWater(IWorldReader worldIn, BlockPos pos) {
        for(BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-4, 0, -4), pos.add(4, 1, 4))) {
            if (worldIn.getFluidState(blockpos).isTagged(FluidTags.WATER)) {
                return true;
            }
        }

        return FarmlandWaterManager.hasBlockWaterTicket(worldIn, pos);
    }

    private boolean hasCrops(IBlockReader worldIn, BlockPos pos) {
        BlockState state = worldIn.getBlockState(pos.up());
        return state.getBlock() instanceof IPlantable && canSustainPlant(state, worldIn, pos, Direction.UP, (IPlantable) state.getBlock());
    }


}
