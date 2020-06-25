package com.softetch.dwm.common.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractSmallTreeFeature;

import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class BasicTreeFeature extends AbstractSmallTreeFeature<BasicTreeFeatureConfig> {
    public BasicTreeFeature(Function<Dynamic<?>, ? extends BasicTreeFeatureConfig> data) {
        super(data);
    }

    public boolean func_225557_a_(IWorldGenerationReader world, Random random, BlockPos pos, Set<BlockPos> logs, Set<BlockPos> leaves, MutableBoundingBox bounds, BasicTreeFeatureConfig config) {
        int i = config.baseHeight + random.nextInt(config.heightRandA + 1) + random.nextInt(config.heightRandB + 1);
        int j = config.trunkHeight >= 0 ? config.trunkHeight + random.nextInt(config.trunkHeightRandom + 1) : i - (config.foliageHeight + random.nextInt(config.foliageHeightRandom + 1));
        int k = config.foliagePlacer.func_225573_a_(random, j, i, config);
        Optional<BlockPos> optional = this.func_227212_a_(world, i, j, k, pos, config);
        if (!optional.isPresent()) {
            return false;
        } else {
            BlockPos blockpos = optional.get();
            this.setDirtAt(world, blockpos.down(), blockpos);
            config.foliagePlacer.func_225571_a_(world, random, config, i, j, k, blockpos, leaves);
            this.func_227213_a_(world, random, i, blockpos, config.trunkTopOffset + random.nextInt(config.trunkTopOffsetRandom + 1), logs, bounds, config);
            return true;
        }
    }
}
