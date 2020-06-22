package com.softetch.dwm.common.world.gen.biome;

import com.softetch.dwm.DWMMain;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DWMBiomes {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, DWMMain.MOD_ID);

    public static final RegistryObject<Biome> GOLDEN_FIELDS = BIOMES.register("golden_fields", () -> new GoldenFieldsBiome());
}
