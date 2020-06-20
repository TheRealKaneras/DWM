package com.softetch.dwm.common.world.gen;

import com.softetch.dwm.DWMItems;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;

public class DWMOreGen {

    public static void init() {
        BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).forEach((BiomeManager.BiomeEntry biomeEntry) -> biomeEntry.biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DWMItems.PLASTIC_ORE.getDefaultState(), 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 32)))
        ));
    }
}
