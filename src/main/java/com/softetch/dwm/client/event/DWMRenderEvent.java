package com.softetch.dwm.client.event;

import com.softetch.dwm.common.entity.EntityUtils;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/**
 * A class to handle the rendering events, i.e. when alterations to rendering are required
 */
@OnlyIn(Dist.CLIENT)
public class DWMRenderEvent {

    /**
     * Handles all code required before rendering a living entity
     * @param event the event called when an entity is about to be rendered
     */
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onRenderLivingPre(RenderLivingEvent.Pre event) {
        LivingEntity entity = event.getEntity();
        if (EntityUtils.getEntityFlatness(entity) == 1.0f)
            return;
        event.getMatrixStack().push();
        event.getMatrixStack().scale(EntityUtils.getEntityFlatness(entity), 1.0f, 1.0f);
    }

    /**
     * Handles all code required after rendering a living entity (i.e. tidy up)
     * @param event the event called after an entity is rendered
     */
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onRenderLivingPost(RenderLivingEvent.Post event) {
        LivingEntity entity = event.getEntity();
        if (EntityUtils.getEntityFlatness(entity) == 1.0f)
            return;
        event.getMatrixStack().pop();
    }
}
