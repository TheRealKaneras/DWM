package com.softetch.dwm;

import com.softetch.dwm.common.world.dimension.GallifreyDimension;
import com.softetch.dwm.common.world.dimension.GallifreyModDimension;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DWMDimensions {
    public static final DeferredRegister<ModDimension> DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, DWMMain.MOD_ID);

    public static final RegistryObject<ModDimension> GALLIFREY = DIMENSIONS.register("gallifrey", () -> new GallifreyModDimension());

    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
        if (DimensionType.byName(DimensionTypes.GALLIFREY_TYPE) == null) {
            DimensionManager.registerDimension(DimensionTypes.GALLIFREY_TYPE, GALLIFREY.get(), null, true);
        }
    }

    public static class DimensionTypes {
        public static final ResourceLocation GALLIFREY_TYPE = new ResourceLocation(DWMMain.MOD_ID, "gallifrey");
    }
}
