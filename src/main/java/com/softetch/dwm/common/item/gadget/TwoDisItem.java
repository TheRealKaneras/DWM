package com.softetch.dwm.common.item.gadget;

import com.softetch.dwm.DWMNBTTags;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

/**
 * Contains all the methods and properties required for a 2dis
 */
public class TwoDisItem extends Item {

    /**
     * Creates a new 2dis
     */
    public TwoDisItem() {
        super(new Item.Properties().group(ItemGroup.TOOLS));
    }

    /**
     * Handle item interaction with an entity
     *
     * @param stack  the stack of items that the item being used is part of
     * @param player the player entity using the item
     * @param target the entity being interacted with
     * @param hand   the hand that the item is being held in
     * @return if the item can be used to interact with the target entity
     */
    @Override
    public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity player, LivingEntity target, Hand hand) {
        if (target.getPersistentData().contains(DWMNBTTags.SCALE_2D.getTag())) {
            if (target.getPersistentData().getFloat(DWMNBTTags.SCALE_2D.getTag()) <= 0.05f) {
                target.getPersistentData().putFloat(DWMNBTTags.SCALE_2D.getTag(), 1.0f);
            } else {
                target.getPersistentData().putFloat(DWMNBTTags.SCALE_2D.getTag(), target.getPersistentData().getFloat(DWMNBTTags.SCALE_2D.getTag()) - 0.05f);
            }
        } else {
            target.getPersistentData().putFloat(DWMNBTTags.SCALE_2D.getTag(), 0.95f);
        }
        return true;
    }
}
