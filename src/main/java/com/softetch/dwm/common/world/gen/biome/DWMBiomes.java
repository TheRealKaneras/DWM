package com.softetch.dwm.common.world.gen.biome;

import com.softetch.dwm.DWMMain;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DWMMain.MOD_ID)
public class DWMBiomes {
    public static final Biome GOLDEN_FIELDS = null;
    public static final Biome CLOISTER = null;

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        event.getRegistry().registerAll(
                register("golden_fields", new GoldenFieldsBiome()),
                register("cloister", new CloisterBiome())
        );
    }

    private static Biome register(String name, Biome biome) {
        biome.setRegistryName(DWMMain.MOD_ID, name);
        return biome;
    }


}
