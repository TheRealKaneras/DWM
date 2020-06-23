package com.softetch.dwm.common.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import com.softetch.dwm.common.tags.DWMBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractSmallTreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class BasicTreeFeature extends AbstractSmallTreeFeature<BasicTreeFeatureConfig> {
    public BasicTreeFeature(Function<Dynamic<?>, ? extends BasicTreeFeatureConfig> data) {
        super(data);
    }

    protected static boolean exclude(IWorldGenerationBaseReader reader, BlockPos pos) {
        if (reader instanceof net.minecraft.world.IWorldReader) // FORGE: Redirect to state method when possible
            return reader.hasBlockState(pos, state -> state.canBeReplacedByLogs((net.minecraft.world.IWorldReader)reader, pos));
        return reader.hasBlockState(pos, (state) -> {
            Block block = state.getBlock();
            return state.isAir() || state.isIn(BlockTags.LEAVES) || state.isIn(DWMBlockTags.LEAVES) || isDirt(block) || block.isIn(BlockTags.LOGS) || state.isIn(DWMBlockTags.LOGS) || block.isIn(BlockTags.SAPLINGS) || block.isIn(DWMBlockTags.SAPLINGS) || block == Blocks.VINE;
        });
    }

    public static boolean isAirOrLeaves(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        if (worldIn instanceof net.minecraft.world.IWorldReader) // FORGE: Redirect to state method when possible
            return worldIn.hasBlockState(pos, state -> state.canBeReplacedByLeaves((net.minecraft.world.IWorldReader)worldIn, pos));
        return worldIn.hasBlockState(pos, (state) -> state.isAir() || state.isIn(BlockTags.LEAVES) || state.isIn(DWMBlockTags.LEAVES));
    }

    @Override
    public Optional<BlockPos> func_227212_a_(IWorldGenerationReader reader, int p_227212_2_, int p_227212_3_, int p_227212_4_, BlockPos pos, TreeFeatureConfig treeFeatureConfigIn) {
        BlockPos blockpos;
        if (!treeFeatureConfigIn.forcePlacement) {
            int i = reader.getHeight(Heightmap.Type.OCEAN_FLOOR, pos).getY();
            int j = reader.getHeight(Heightmap.Type.WORLD_SURFACE, pos).getY();
            blockpos = new BlockPos(pos.getX(), i, pos.getZ());
            if (j - i > treeFeatureConfigIn.maxWaterDepth) {
                return Optional.empty();
            }
        } else {
            blockpos = pos;
        }

        if (blockpos.getY() >= 1 && blockpos.getY() + p_227212_2_ + 1 <= reader.getMaxHeight()) {
            for(int i1 = 0; i1 <= p_227212_2_ + 1; ++i1) {
                int j1 = treeFeatureConfigIn.foliagePlacer.func_225570_a_(p_227212_3_, p_227212_2_, p_227212_4_, i1);
                BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

                for(int k = -j1; k <= j1; ++k) {
                    int l = -j1;

                    while(l <= j1) {
                        if (i1 + blockpos.getY() >= 0 && i1 + blockpos.getY() < reader.getMaxHeight()) {
                            blockpos$mutable.setPos(k + blockpos.getX(), i1 + blockpos.getY(), l + blockpos.getZ());
                            if (exclude(reader, blockpos$mutable) && (treeFeatureConfigIn.ignoreVines || !func_227222_d_(reader, blockpos$mutable))) {
                                ++l;
                                continue;
                            }

                            return Optional.empty();
                        }

                        return Optional.empty();
                    }
                }
            }

            return isSoilOrFarm(reader, blockpos.down(), treeFeatureConfigIn.getSapling()) && blockpos.getY() < reader.getMaxHeight() - p_227212_2_ - 1 ? Optional.of(blockpos) : Optional.empty();
        } else {
            return Optional.empty();
        }
    }

    @Override
    protected boolean func_225557_a_(IWorldGenerationReader reader, Random random, BlockPos pos, Set<BlockPos> changedLogs, Set<BlockPos> changedLeaves, MutableBoundingBox boundingBox, BasicTreeFeatureConfig config) {
        int i = config.baseHeight + random.nextInt(config.heightRandA + 1) + random.nextInt(config.heightRandB + 1);
        int j = config.trunkHeight >= 0 ? config.trunkHeight + random.nextInt(config.trunkHeightRandom + 1) : i - (config.foliageHeight + random.nextInt(config.foliageHeightRandom + 1));
        int k = config.foliagePlacer.func_225573_a_(random, j, i, config);
        Optional<BlockPos> optional = this.func_227212_a_(reader, i, j, k, pos, config);
        if (!optional.isPresent()) {
            return false;
        } else {
            BlockPos blockpos = optional.get();
            this.setDirtAt(reader, blockpos.down(), blockpos);
            config.foliagePlacer.func_225571_a_(reader, random, config, i, j, k, blockpos, changedLeaves);
            this.func_227213_a_(reader, random, i, blockpos, config.trunkTopOffset + random.nextInt(config.trunkTopOffsetRandom + 1), changedLogs, boundingBox, config);
            return true;
        }
    }
}
