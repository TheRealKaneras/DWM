package com.softetch.dwm.common.world.gen.feature;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.Dynamic;
import com.softetch.dwm.DWMItems;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraftforge.common.IPlantable;

import java.util.List;

public class BasicTreeFeatureConfig extends TreeFeatureConfig {

    protected BasicTreeFeatureConfig(BlockStateProvider trunkProviderIn, BlockStateProvider leavesProviderIn, FoliagePlacer foliagePlacerIn, List<TreeDecorator> decoratorsIn, int baseHeightIn, int heightRandAIn, int heightRandBIn, int trunkHeightIn, int trunkHeightRandomIn, int trunkTopOffsetIn, int trunkTopOffsetRandomIn, int foliageHeightIn, int foliageHeightRandomIn, int maxWaterDepthIn, boolean ignoreVinesIn) {
        super(trunkProviderIn, leavesProviderIn, foliagePlacerIn, decoratorsIn, baseHeightIn, heightRandAIn, heightRandBIn, trunkHeightIn, trunkHeightRandomIn, trunkTopOffsetIn, trunkTopOffsetRandomIn, foliageHeightIn, foliageHeightRandomIn, maxWaterDepthIn, ignoreVinesIn);

    }

    protected BasicTreeFeatureConfig setTreeSapling(IPlantable value) {
        this.sapling = value;
        return this;
    }

    public static <T> BasicTreeFeatureConfig deserialize(Dynamic<T> data) {
        BaseTreeFeatureConfig basetreefeatureconfig = BaseTreeFeatureConfig.deserialize(data);
        FoliagePlacerType<?> foliageplacertype = Registry.FOLIAGE_PLACER_TYPE.getOrDefault(new ResourceLocation(data.get("foliage_placer").get("type").asString().orElseThrow(RuntimeException::new)));
        return new BasicTreeFeatureConfig(basetreefeatureconfig.trunkProvider, basetreefeatureconfig.leavesProvider, foliageplacertype.func_227391_a_(data.get("foliage_placer").orElseEmptyMap()), basetreefeatureconfig.decorators, basetreefeatureconfig.baseHeight, data.get("height_rand_a").asInt(0), data.get("height_rand_b").asInt(0), data.get("trunk_height").asInt(-1), data.get("trunk_height_random").asInt(0), data.get("trunk_top_offset").asInt(0), data.get("trunk_top_offset_random").asInt(0), data.get("foliage_height").asInt(-1), data.get("foliage_height_random").asInt(0), data.get("max_water_depth").asInt(0), data.get("ignore_vines").asBoolean(false));
    }

    public static <T> BasicTreeFeatureConfig deserializeAsh(Dynamic<T> data) {
        return deserialize(data).setTreeSapling((IPlantable) DWMItems.ASH_SAPLING);
    }

    public static class Builder extends BaseTreeFeatureConfig.Builder {
        private final FoliagePlacer foliagePlacer;
        private List<TreeDecorator> decorators = ImmutableList.of();
        private int baseHeight;
        private int heightRandA;
        private int heightRandB;
        private int trunkHeight = -1;
        private int trunkHeightRandom;
        private int trunkTopOffset;
        private int trunkTopOffsetRandom;
        private int foliageHeight = -1;
        private int foliageHeightRandom;
        private int maxWaterDepth;
        private boolean ignoreVines;

        public Builder(BlockStateProvider trunkProviderIn, BlockStateProvider leavesProviderIn, FoliagePlacer foliagePlacerIn) {
            super(trunkProviderIn, leavesProviderIn);
            this.foliagePlacer = foliagePlacerIn;
        }

        public BasicTreeFeatureConfig.Builder decorators(List<TreeDecorator> decoratorsIn) {
            this.decorators = decoratorsIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder baseHeight(int baseHeightIn) {
            this.baseHeight = baseHeightIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder heightRandA(int heightRandAIn) {
            this.heightRandA = heightRandAIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder heightRandB(int heightRandBIn) {
            this.heightRandB = heightRandBIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder trunkHeight(int trunkHeightIn) {
            this.trunkHeight = trunkHeightIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder trunkHeightRandom(int trunkHeightRandomIn) {
            this.trunkHeightRandom = trunkHeightRandomIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder trunkTopOffset(int trunkTopOffsetIn) {
            this.trunkTopOffset = trunkTopOffsetIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder trunkTopOffsetRandom(int trunkTopOffsetRandomIn) {
            this.trunkTopOffsetRandom = trunkTopOffsetRandomIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder foliageHeight(int foliageHeightIn) {
            this.foliageHeight = foliageHeightIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder foliageHeightRandom(int foliageHeightRandomIn) {
            this.foliageHeightRandom = foliageHeightRandomIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder maxWaterDepth(int maxWaterDepthIn) {
            this.maxWaterDepth = maxWaterDepthIn;
            return this;
        }

        public BasicTreeFeatureConfig.Builder ignoreVines() {
            this.ignoreVines = true;
            return this;
        }

        @Override
        public BasicTreeFeatureConfig.Builder setSapling(net.minecraftforge.common.IPlantable value) {
            super.setSapling(value);
            return this;
        }

        public BasicTreeFeatureConfig build() {
            return new BasicTreeFeatureConfig(this.trunkProvider, this.leavesProvider, this.foliagePlacer, this.decorators, this.baseHeight, this.heightRandA, this.heightRandB, this.trunkHeight, this.trunkHeightRandom, this.trunkTopOffset, this.trunkTopOffsetRandom, this.foliageHeight, this.foliageHeightRandom, this.maxWaterDepth, this.ignoreVines).setTreeSapling(this.sapling);
        }
    }
}
