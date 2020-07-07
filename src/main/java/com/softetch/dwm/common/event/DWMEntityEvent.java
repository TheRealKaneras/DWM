package com.softetch.dwm.common.event;

import com.softetch.dwm.DWMDimensions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public class DWMEntityEvent {
    private final Random random = new Random();

    @SubscribeEvent
    public void onLivingDeathEvent(LivingDeathEvent event) {
        if (event.getEntityLiving() instanceof AnimalEntity) {
//            event.getEntityLiving().entityDropItem(new ItemStack(DWMItems.GELATIN, random.nextInt(3)));
//            event.getEntityLiving().entityDropItem(new ItemStack(DWMItems.ADIPOSE_MATERIAL, random.nextInt(2)));
        }
    }

    @SubscribeEvent
    public void onEntityJoin(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (!entity.getEntityWorld().isRemote && entity instanceof ServerPlayerEntity) {
            ServerPlayerEntity player = (ServerPlayerEntity) entity;
            DimensionType spawnDimension = DimensionType.byName(DWMDimensions.DimensionTypes.GALLIFREY_TYPE);
            if (player.getSpawnDimension() == DimensionType.OVERWORLD) {
                player.setSpawnDimenion(spawnDimension);
            }
        }
    }
}
