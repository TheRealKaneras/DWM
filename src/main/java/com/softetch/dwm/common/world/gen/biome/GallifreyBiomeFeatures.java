package com.softetch.dwm.common.world.gen.biome;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.softetch.dwm.DWMItems;
import com.softetch.dwm.common.world.gen.feature.DWMBiomeFeatures;
import com.softetch.dwm.common.world.gen.feature.DWMFeature;
import com.softetch.dwm.common.world.gen.feature.ModOreFeatureConfig;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.*;

public class GallifreyBiomeFeatures {
    private static final BlockState GRASS_BLOCK = DWMItems.GALLIFREY_GRASS_BLOCK.getDefaultState();
    private static final BlockState DIRT = DWMItems.GALLIFREY_DIRT.getDefaultState();
    private static final BlockState SAND = DWMItems.GALLIFREY_SAND.getDefaultState();
    private static final BlockState CLAY = Blocks.CLAY.getDefaultState();
    private static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
    private static final BlockState COAL_ORE = DWMItems.GALLIFREY_COAL_ORE.getDefaultState();
    private static final BlockState IRON_ORE = DWMItems.GALLIFREY_IRON_ORE.getDefaultState();
    private static final BlockState DWARF_STAR_ALLOY_ORE = DWMItems.DWARF_STAR_ALLOY_ORE.getDefaultState();
    private static final BlockState WHITE_POINT_STAR_ORE = DWMItems.WHITE_POINT_STAR_ORE.getDefaultState();
    private static final BlockState AZBANTIUM_ORE = DWMItems.AZBANTIUM_ORE.getDefaultState();

    public static void addStoneVariants(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, DIRT, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 256))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, GRAVEL, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 256))));
    }

    public static void addSedimentDisks(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(SAND, 7, 2, Lists.newArrayList(DIRT, GRASS_BLOCK))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(3))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(CLAY, 4, 1, Lists.newArrayList(DIRT, CLAY))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(GRAVEL, 6, 2, Lists.newArrayList(DIRT, GRASS_BLOCK))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));
    }

    public static void addAshTree(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DWMFeature.ASH_TREE.get().withConfiguration(DWMBiomeFeatures.ASH_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
    }

    public static void addFlowers(Biome biome) {
        // TODO: Add flowers
    }

    public static void addOres(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, COAL_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, IRON_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64))));
//        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, GOLD_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32))));
//        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, REDSTONE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, DWARF_STAR_ALLOY_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 16))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, WHITE_POINT_STAR_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 16))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, DWMFeature.ORE.get().withConfiguration(new ModOreFeatureConfig(ModOreFeatureConfig.FillerBlockType.GALLIFREY_STONE, AZBANTIUM_ORE, 7)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 12))));
    }

}
