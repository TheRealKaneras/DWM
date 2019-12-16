package com.softetch.dwm.common.item.gadget;

import com.softetch.dwm.DWMSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.TNTBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IBlockStatePalette;
import net.minecraft.world.gen.feature.structure.StrongholdPieces;

/**
 * A class containing all the properties and methods required for a sonic screwdriver
 */
public class ItemSonicScrewdriver extends Item {

    /**
     * Creates a new sonic screwdriver
     */
    public ItemSonicScrewdriver() {
        super(new Item.Properties().group(ItemGroup.TOOLS));
    }

    /**
     * Handles all interactions with blocks
     * @param world - the world that the item is used in
     * @param playerEntity - the player entity using the item
     * @param blockState - the block state of the block that has been interacted with
     * @param blockPos - the block pos of the block that has been interacted with
     */
    private void handleBlockInteraction(World world, PlayerEntity playerEntity, BlockState blockState, BlockPos blockPos) {
        if (blockState.getBlock() == Blocks.IRON_DOOR) {
            ((DoorBlock) blockState.getBlock()).toggleDoor(world, blockPos, !blockState.get(DoorBlock.OPEN));
        }
        if (blockState.getBlock() == Blocks.TNT) {
            ((TNTBlock)blockState.getBlock()).catchFire(blockState, world, blockPos, Direction.UP, playerEntity);
            world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
        }
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getPos();
        BlockState blockState = world.getBlockState(blockPos);
        world.playSound(blockPos.getX(), blockPos.getY(), blockPos.getZ(), DWMSounds.sonicScrewdriver, SoundCategory.BLOCKS, 1.0f, 1.0f,false);
        if (!world.isRemote && blockState != null) {
            PlayerEntity playerEntity = context.getPlayer();
            handleBlockInteraction(world, playerEntity, blockState, blockPos);
            return ActionResultType.SUCCESS;
        }
        return super.onItemUse(context);
    }

}
