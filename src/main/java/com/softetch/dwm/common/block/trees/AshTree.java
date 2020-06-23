package com.softetch.dwm.common.block.trees;

import com.softetch.dwm.common.world.gen.feature.BasicTreeFeatureConfig;
import com.softetch.dwm.common.world.gen.feature.DWMBiomeFeatures;
import com.softetch.dwm.common.world.gen.feature.DWMFeature;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class AshTree extends DWMTree {
    /**
     * Get a {@link ConfiguredFeature} of tree
     *
     * @param randomIn
     * @param p_225546_2_
     */
    @Nullable
    @Override
    protected ConfiguredFeature<BasicTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return DWMFeature.ASH_TREE.get().withConfiguration(DWMBiomeFeatures.ASH_TREE_CONFIG);
    }
}
