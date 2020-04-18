package com.softetch.dwm.common.event;

import com.softetch.dwm.DWMItems;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public class DWMEntityEvent {
    private final Random random = new Random();

    @SubscribeEvent
    public void onLivingDeathEvent(LivingDeathEvent event) {
        if (event.getEntityLiving() instanceof AnimalEntity) {
            event.getEntityLiving().entityDropItem(new ItemStack(DWMItems.GELATIN, random.nextInt(3)));
            event.getEntityLiving().entityDropItem(new ItemStack(DWMItems.ADIPOSE_MATERIAL, random.nextInt(2)));
        }
    }
}
