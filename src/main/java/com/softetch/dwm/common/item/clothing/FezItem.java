package com.softetch.dwm.common.item.clothing;

import com.softetch.dwm.DWMClothingMaterial;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.clothing.FezModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

import javax.annotation.Nullable;
import java.awt.*;

/**
 * Class to contain properties and methods required for hats
 */
public class FezItem extends ArmorItem implements IDyeableArmorItem {

    /**
     * Create a new hat item
     */
    public FezItem() {
        super(DWMClothingMaterial.CLOTH, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.MISC));
    }

    @Nullable
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        BipedModel<PlayerEntity> model = new FezModel(new Color(getColor(itemStack)));

        model.isChild = _default.isChild;
        model.isSneak = _default.isSneak;
        model.isSitting = _default.isSitting;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        return (A) model;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return DWMMain.MOD_ID +  ":textures/clothing/fez.png";
    }
}
