package com.softetch.dwm;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

/**
 * Create the clothing material types for the mod
 */
public enum DWMClothingMaterial implements IArmorMaterial {
    CLOTH("cloth", 8, SoundEvents.BLOCK_WOOL_HIT);

    private String name;
    private int durability;
    private SoundEvent soundEvent;

    DWMClothingMaterial(String name, int durability, SoundEvent soundEvent) {
        this.name = name;
        this.durability = durability;
        this.soundEvent = soundEvent;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return 0;
    }
}
