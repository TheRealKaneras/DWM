package com.softetch.dwm;

import com.softetch.dwm.client.render.entity.RenderBaseDalek;
import com.softetch.dwm.common.entity.BaseDalekEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * A class to handle the registration of any renderers used in the mod.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DWMRenderers {

    /**
     * Register all renderers when the client is being set up
     * @param event
     */
    @SubscribeEvent
    public static void register(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(BaseDalekEntity.class, entityRendererManager -> new RenderBaseDalek(entityRendererManager, new ResourceLocation(DWMMain.MODID, "textures/entity/dalek.png")));
    }
}
