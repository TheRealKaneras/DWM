package com.softetch.dwm.common.item.clothing;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

/**
 * Class to contain properties and methods required for hats
 */
public class HatItem extends Item {
    public static final IDispenseItemBehavior DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior() {
        /**
         * Dispense the specified stack, play the dispense sound and spawn particles.
         */
        protected ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
            ItemStack itemstack = ArmorItem.dispenseArmor(source, stack);
            return itemstack.isEmpty() ? super.dispenseStack(source, stack) : itemstack;
        }
    };

    /**
     * Create a new hat item
     */
    public HatItem() {
        super(new Item.Properties().group(ItemGroup.MISC));
        DispenserBlock.registerDispenseBehavior(this, DISPENSER_BEHAVIOR);
    }

    /**
     * Put the hat on the player's head when the item is right clicked.
     */
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack heldStack = playerIn.getHeldItem(handIn);
        ItemStack equippedStack = playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD);
        if (equippedStack.isEmpty()) {
            playerIn.setItemStackToSlot(EquipmentSlotType.HEAD, heldStack.copy());
            heldStack.setCount(0);
            return new ActionResult<>(ActionResultType.SUCCESS, heldStack);
        } else {
            return new ActionResult<>(ActionResultType.FAIL, heldStack);
        }
    }

}