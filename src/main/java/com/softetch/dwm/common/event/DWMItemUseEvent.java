package com.softetch.dwm.common.event;

import com.softetch.dwm.DWMEntities;
import com.softetch.dwm.DWMItems;
import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DWMItemUseEvent {

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
}
