package com.softetch.dwm;

import com.softetch.dwm.client.render.entity.AdiposeRenderer;
import com.softetch.dwm.client.render.entity.dalek.GuardDalekRenderer;
import com.softetch.dwm.client.render.entity.dalek.InvasionDalekRenderer;
import com.softetch.dwm.client.render.entity.dalek.SkaroDalekRenderer;
import com.softetch.dwm.client.render.entity.dalek.TimeWarDalekRenderer;
import com.softetch.dwm.client.render.entity.projectile.LaserRenderer;
import com.softetch.dwm.client.render.tileentity.TardisExteriorRenderer;
import com.softetch.dwm.common.entity.AdiposeEntity;
import com.softetch.dwm.common.entity.TimeWarDalekEntity;
import com.softetch.dwm.common.entity.dalek.GuardDalekEntity;
import com.softetch.dwm.common.entity.dalek.InvasionDalekEntity;
import com.softetch.dwm.common.entity.dalek.SkaroDalekEntity;
import com.softetch.dwm.common.entity.projectile.LaserEntity;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
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
        RenderingRegistry.registerEntityRenderingHandler(TimeWarDalekEntity.class, TimeWarDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(SkaroDalekEntity.class, SkaroDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(InvasionDalekEntity.class, InvasionDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(GuardDalekEntity.class, GuardDalekRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(AdiposeEntity.class, AdiposeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(LaserEntity.class, LaserRenderer::new);

        ClientRegistry.bindTileEntitySpecialRenderer(TardisTileEntity.class, new TardisExteriorRenderer());
    }
}
