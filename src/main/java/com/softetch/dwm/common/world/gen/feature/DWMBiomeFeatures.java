package com.softetch.dwm.common.world.gen.feature;

import com.softetch.dwm.DWMItems;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class DWMBiomeFeatures {
    public static final BasicTreeFeatureConfig ASH_TREE_CONFIG = new BasicTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(DWMItems.ASH_LOG.getDefaultState()),
            new SimpleBlockStateProvider(DWMItems.ASH_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(2, 0)).baseHeight(5).trunkHeight(3).trunkTopOffsetRandom(2).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) DWMItems.ASH_SAPLING).build();

    public static final BasicTreeFeatureConfig DARK_ASH_TREE_CONFIG = new BasicTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(DWMItems.DARK_ASH_LOG.getDefaultState()),
            new SimpleBlockStateProvider(DWMItems.DARK_ASH_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(2, 0)).baseHeight(5).trunkHeight(3).trunkTopOffsetRandom(2).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) DWMItems.DARK_ASH_SAPLING).build();

    public static final BasicTreeFeatureConfig CARDINAL_TREE_CONFIG = new BasicTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(DWMItems.CARDINAL_LOG.getDefaultState()),
            new SimpleBlockStateProvider(DWMItems.CARDINAL_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(2, 0)).baseHeight(5).trunkHeight(3).trunkTopOffsetRandom(2).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) DWMItems.CARDINAL_SAPLING).build();

}
