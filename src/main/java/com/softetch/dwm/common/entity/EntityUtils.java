package com.softetch.dwm.common.entity;

import com.softetch.dwm.DWMNBTTags;
import net.minecraft.entity.LivingEntity;

public class EntityUtils {

    public static void setEntityFlatness(LivingEntity entity, float scale) {
        entity.getPersistentData().putFloat(DWMNBTTags.SCALE_2D, scale);
    }

    public static float getEntityFlatness(LivingEntity entity) {
        return entity.getPersistentData().contains(DWMNBTTags.SCALE_2D) ? entity.getPersistentData().getFloat(DWMNBTTags.SCALE_2D) : 1.0F;

    }
}
