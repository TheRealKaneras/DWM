package com.softetch.dwm.common.item.gadget;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;

public class SonicActions {
    private final HashMap<Block, BlockModificationAction> actions = new HashMap<>();

    public SonicActions() {
        actions.put(Blocks.IRON_DOOR, (world, blockPos, blockState, playerEntity) -> ((DoorBlock) blockState.getBlock()).toggleDoor(world, blockPos, !blockState.get(DoorBlock.OPEN)));

        actions.put(Blocks.IRON_TRAPDOOR, (world, blockPos, blockState, playerEntity) -> {
            BlockState newBlockState = blockState.cycle(TrapDoorBlock.OPEN);
            world.setBlockState(blockPos, newBlockState, 2);
            if (newBlockState.get(TrapDoorBlock.WATERLOGGED)) {
                world.getPendingFluidTicks().scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }
            SoundEvent soundEvent = newBlockState.get(TrapDoorBlock.OPEN) ? SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN : SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE;
            world.playSound(blockPos.getX(), blockPos.getY(), blockPos.getZ(), soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f,false);
        });

        actions.put(Blocks.TNT, (world, blockPos, blockState, playerEntity) -> {
            blockState.getBlock().catchFire(blockState, world, blockPos, Direction.UP, playerEntity);
            world.destroyBlock(blockPos, false);
        });

        actions.put(Blocks.REDSTONE_LAMP, (world, blockPos, blockState, playerEntity) -> {
            BlockState newBlockState = blockState.cycle(RedstoneLampBlock.LIT);
            world.setBlockState(blockPos, newBlockState, 2);
        });

        actions.put(Blocks.NETHERRACK, (world, blockPos, blockState, playerEntity) -> blockState.catchFire(world, blockPos, Direction.UP, playerEntity));

        actions.put(Blocks.SNOW, (world, blockPos, blockState, playerEntity) -> world.destroyBlock(blockPos, true));
    }

    public void tryPerformAction(World world, BlockPos pos, BlockState blockState, PlayerEntity playerEntity) {
        if (actions.containsKey(blockState.getBlock())) {
            actions.get(blockState.getBlock()).onAction(world, pos, blockState, playerEntity);
        }
    }
}
