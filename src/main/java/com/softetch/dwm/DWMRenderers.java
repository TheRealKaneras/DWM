package com.softetch.dwm;

import com.softetch.dwm.client.render.entity.*;
import com.softetch.dwm.client.render.entity.dalek.GuardDalekRenderer;
import com.softetch.dwm.client.render.entity.dalek.InvasionDalekRenderer;
import com.softetch.dwm.client.render.entity.dalek.SkaroDalekRenderer;
import com.softetch.dwm.client.render.entity.projectile.LaserRenderer;
import com.softetch.dwm.client.render.tileentity.TardisExteriorRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * A class to handle the registration of any renderers used in the mod.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
@OnlyIn(Dist.CLIENT)
public class DWMRenderers {

    private DWMRenderers() {}

    /**
     * Register all renderers when the client is being set up
     * @param event - the event called when the client is being set up.
     */
    @SubscribeEvent
    public static void register(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.SKARO_DALEK, SkaroDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.INVASION_DALEK, InvasionDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.GUARD_DALEK, GuardDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.ADIPOSE, AdiposeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.LASER, LaserRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.TELLER, TellerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.CLASSIC_SILURIAN, ClassicSilurianRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.BROAKIR, BroakirRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(DWMEntities.FLUTTERWING, FlutterwingRenderer::new);

        ClientRegistry.bindTileEntityRenderer(DWMTileEntities.TARDIS, TardisExteriorRenderer::new);
    }
}
