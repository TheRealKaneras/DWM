package com.softetch.dwm;

import com.softetch.dwm.client.render.entity.*;
import com.softetch.dwm.client.render.entity.projectile.LaserRenderer;
import com.softetch.dwm.client.render.tileentity.ClassicDoorsRenderer;
import com.softetch.dwm.client.render.tileentity.TardisExteriorRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Function;

/**
 * A class to handle the registration of any renderers used in the mod.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
@OnlyIn(Dist.CLIENT)
public class DWMRenderers {

    private DWMRenderers() {}

    private static synchronized <T extends Entity> void bindRenderer(EntityType<T> entityType, IRenderFactory<? super T> renderFactory) {
        RenderingRegistry.registerEntityRenderingHandler(entityType, renderFactory);
    }

    private static synchronized <T extends TileEntity> void bindRenderer(TileEntityType<T> tileEntityType, Function<? super TileEntityRendererDispatcher, ? extends TileEntityRenderer<? super T>> rendererFactory) {
        ClientRegistry.bindTileEntityRenderer(tileEntityType, rendererFactory);
    }

    /**
     * Register all renderers when the client is being set up
     * @param event - the event called when the client is being set up.
     */
    @SubscribeEvent
    public static void register(final FMLClientSetupEvent event) {
        bindRenderer(DWMEntities.ADIPOSE, AdiposeRenderer::new);
        bindRenderer(DWMEntities.LASER, LaserRenderer::new);
        bindRenderer(DWMEntities.TELLER, TellerRenderer::new);
        bindRenderer(DWMEntities.CLASSIC_SILURIAN, ClassicSilurianRenderer::new);
        bindRenderer(DWMEntities.BROAKIR, BroakirRenderer::new);
        bindRenderer(DWMEntities.FLUTTERWING, FlutterwingRenderer::new);
        bindRenderer(DWMEntities.MEWING_DOG, MewingDogRenderer::new);
        bindRenderer(DWMEntities.PLUNGBOLL, PlungbollRenderer::new);
        bindRenderer(DWMEntities.CONSOLE, ConsoleRenderer::new);

        bindRenderer(DWMTileEntities.TARDIS, TardisExteriorRenderer::new);
        bindRenderer(DWMTileEntities.CLASSIC_DOORS, ClassicDoorsRenderer::new);
    }
}
