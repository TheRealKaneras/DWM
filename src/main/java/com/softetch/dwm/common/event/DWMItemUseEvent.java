package com.softetch.dwm.common.event;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.softetch.dwm.DWMEntities;
import com.softetch.dwm.DWMItems;
import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Map;

public class DWMItemUseEvent {

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        ItemStack heldItem = event.getPlayer().getHeldItem(event.getHand());
        if (heldItem != null) {
            if (heldItem.getItem() instanceof HoeItem) {
                onHoeUse(heldItem, event.getHand(), event.getWorld(), event.getPos(), event.getPlayer());
            }
            if (heldItem.getItem() instanceof ShovelItem) {
                onShovelUse(heldItem, event.getHand(), event.getWorld(), event.getPos(), event.getPlayer());
            }
        }
    }

    @SubscribeEvent
    public void onItemUseFinish(LivingEntityUseItemEvent.Finish event) {
        if (event.getItem().getItem() == DWMItems.ADIPOSE_PILL && event.getEntityLiving() instanceof PlayerEntity) {
            LivingEntity entity = event.getEntityLiving();
            World world = entity.getEntityWorld();
            AdiposeEntity adiposeEntity = new AdiposeEntity(DWMEntities.ADIPOSE, world);
            adiposeEntity.setPosition(entity.getPositionVec().x, entity.getPositionVec().y, entity.getPositionVec().z);
            adiposeEntity.setCreatorID(entity.getUniqueID());
            world.addEntity(adiposeEntity);
        }
    }

    protected static final Map<Block, BlockState> MODDED_HOE_LOOKUP = Maps.newHashMap(ImmutableMap.of(
            DWMItems.GALLIFREY_DIRT, DWMItems.GALLIFREY_FARMLAND.getDefaultState(),
            DWMItems.GALLIFREY_GRASS_BLOCK, DWMItems.GALLIFREY_FARMLAND.getDefaultState(),
            DWMItems.GALLIFREY_GRASS_PATH, DWMItems.GALLIFREY_FARMLAND.getDefaultState(),
            DWMItems.GALLIFREY_COARSE_DIRT, DWMItems.GALLIFREY_DIRT.getDefaultState()
    ));

    protected static final Map<Block, BlockState> MODDED_SHOVEL_LOOKUP = Maps.newHashMap(ImmutableMap.of(
            DWMItems.GALLIFREY_GRASS_BLOCK, DWMItems.GALLIFREY_GRASS_PATH.getDefaultState()
    ));

    private void onHoeUse(ItemStack stack, Hand hand, World world, BlockPos pos, PlayerEntity player) {
        BlockState blockState = MODDED_HOE_LOOKUP.get(world.getBlockState(pos).getBlock());
        if (blockState != null) {
            world.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isRemote) {
                world.setBlockState(pos, blockState, 11);
                if (player != null) {
                    stack.damageItem(1, player, entity -> entity.sendBreakAnimation(hand));
                }
            }
        }
    }

    private void onShovelUse(ItemStack stack, Hand hand, World world, BlockPos pos, PlayerEntity player) {
        BlockState blockState = MODDED_SHOVEL_LOOKUP.get(world.getBlockState(pos).getBlock());
        if (blockState != null && world.isAirBlock(pos.up())) {
            world.playSound(player, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isRemote) {
                world.setBlockState(pos, blockState, 11);
                if (player != null) {
                    stack.damageItem(1, player, entity -> entity.sendBreakAnimation(hand));
                }
            }
        }
    }


}
