package com.softetch.dwm.common.world.gen.foliageplacer;

import com.softetch.dwm.common.world.gen.feature.BasicTreeFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public abstract class ModFoliagePlacer extends FoliagePlacer {

    public ModFoliagePlacer(int p_i225848_1_, int p_i225848_2_, FoliagePlacerType<?> p_i225848_3_) {
        super(p_i225848_1_, p_i225848_2_, p_i225848_3_);
    }

    protected void func_227384_a_(IWorldGenerationReader p_227384_1_, Random p_227384_2_, TreeFeatureConfig p_227384_3_, int p_227384_4_, BlockPos p_227384_5_, int p_227384_6_, int p_227384_7_, Set<BlockPos> p_227384_8_) {
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

        for(int i = -p_227384_7_; i <= p_227384_7_; ++i) {
            for(int j = -p_227384_7_; j <= p_227384_7_; ++j) {
                if (!this.func_225572_a_(p_227384_2_, p_227384_4_, i, p_227384_6_, j, p_227384_7_)) {
                    blockpos$mutable.setPos(i + p_227384_5_.getX(), p_227384_6_ + p_227384_5_.getY(), j + p_227384_5_.getZ());
                    this.func_227385_a_(p_227384_1_, p_227384_2_, blockpos$mutable, p_227384_3_, p_227384_8_);
                }
            }
        }

    }

    protected void func_227385_a_(IWorldGenerationReader p_227385_1_, Random p_227385_2_, BlockPos p_227385_3_, TreeFeatureConfig p_227385_4_, Set<BlockPos> p_227385_5_) {
        if (BasicTreeFeature.isAirOrLeaves(p_227385_1_, p_227385_3_) || AbstractTreeFeature.isTallPlants(p_227385_1_, p_227385_3_) || AbstractTreeFeature.isWater(p_227385_1_, p_227385_3_)) {
            p_227385_1_.setBlockState(p_227385_3_, p_227385_4_.leavesProvider.getBlockState(p_227385_2_, p_227385_3_), 19);
            p_227385_5_.add(p_227385_3_.toImmutable());
        }

    }
}
