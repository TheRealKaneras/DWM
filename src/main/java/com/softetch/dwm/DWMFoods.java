package com.softetch.dwm;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

/**
 * Contains all food properties for foods in the mod
 */
public class DWMFoods {
    public static final Food PILL = new Food.Builder().hunger(4).saturation(0.1f).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.8F).fastToEat().build();
    public static final Food SCOOBY_SNACK = new Food.Builder().hunger(4).saturation(0.1f).fastToEat().build();

    private DWMFoods() {}
}
