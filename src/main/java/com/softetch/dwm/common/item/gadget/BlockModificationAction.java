package com.softetch.dwm.common.item.gadget;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@FunctionalInterface
public interface BlockModificationAction {

    void onAction(World world, BlockPos blockPos, BlockState blockState, PlayerEntity playerEntity);
}
