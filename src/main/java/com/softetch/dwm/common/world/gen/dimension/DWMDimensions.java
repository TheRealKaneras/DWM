package com.softetch.dwm.common.world.gen.dimension;

import com.softetch.dwm.DWMMain;
import io.netty.buffer.Unpooled;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(DWMMain.MOD_ID)
public class DWMDimensions {

    public static final DWMModDimension TARDIS = new DWMModDimension("tardis");

    @Mod.EventBusSubscriber(modid=DWMMain.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class EventDimension {
        @SubscribeEvent
        public static void onDimensionRegistryEvent(RegistryEvent.Register<ModDimension> event) {
            DWMMain.LOGGER.info("Registering dimensions");
            event.getRegistry().register(
                    TARDIS
            );
        }
    }

    @Mod.EventBusSubscriber(modid=DWMMain.MOD_ID)
    public static class EventDimensionType {
        @SubscribeEvent
        public static void registerDimensions(RegisterDimensionsEvent event) {
            DWMMain.LOGGER.info("Registering dimension types");
            if (DimensionType.byName(TARDIS.getRegistryName()) == null) {
                DimensionManager.registerDimension(TARDIS.getRegistryName(), TARDIS, new PacketBuffer(Unpooled.buffer()), true);
            }
        }
    }

}
