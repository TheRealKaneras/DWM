package com.softetch.dwm.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ConsoleEntity extends LivingEntity {
    private final NonNullList<ItemStack> panelItems = NonNullList.withSize(8*6, ItemStack.EMPTY);

    public ConsoleEntity(EntityType<? extends LivingEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    public Iterable<ItemStack> getArmorInventoryList() {
        return this.panelItems;
    }

    @Override
    public ItemStack getItemStackFromSlot(EquipmentSlotType slotIn) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack) {

    }

    @Override
    public HandSide getPrimaryHand() {
        return HandSide.RIGHT;
    }

    @Override
    public ActionResultType applyPlayerInteraction(PlayerEntity player, Vec3d vec, Hand hand) {
        ItemStack itemStack = player.getHeldItem(hand);
        if (player.isSpectator()) {
            return ActionResultType.SUCCESS;
        } else if (player.world.isRemote) {
            return ActionResultType.CONSUME;
        } else {

        }
        return super.applyPlayerInteraction(player, vec, hand);
    }

    private EquipmentSlotType getClickedSlot(Vec3d lookVec) {
        System.out.println(lookVec);
        return null;
    }

    @Override
    public boolean canBePushed() {
        return false;
    }
}
