package com.softetch.dwm.common.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import com.softetch.dwm.DWMItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class ModOreFeatureConfig implements IFeatureConfig {
    public final FillerBlockType target;
    public final int size;
    public final BlockState state;

    public ModOreFeatureConfig(FillerBlockType target, BlockState state, int size) {
        this.size = size;
        this.state = state;
        this.target = target;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("size"), ops.createInt(this.size), ops.createString("target"), ops.createString(this.target.getName()), ops.createString("state"), BlockState.serialize(ops, this.state).getValue())));
    }

    public static ModOreFeatureConfig deserialize(Dynamic<?> data) {
        int i = data.get("size").asInt(0);
        ModOreFeatureConfig.FillerBlockType fillerBlockType = ModOreFeatureConfig.FillerBlockType.getByName(data.get("target").asString(""));
        BlockState blockstate = data.get("state").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
        return new ModOreFeatureConfig(fillerBlockType, blockstate, i);
    }

    public enum FillerBlockType {
        GALLIFREY_STONE("gallifrey_stone", (blockState) -> blockState.getBlock() == DWMItems.GALLIFREY_STONE);

        private final String name;
        private final Predicate<BlockState> blockStatePredicate;

        FillerBlockType(String name, Predicate<BlockState> blockStatePredicate) {
            this.name = name;
            this.blockStatePredicate = blockStatePredicate;
        }

        public String getName() {
            return name;
        }

        public Predicate<BlockState> getBlockStatePredicate() {
            return blockStatePredicate;
        }

        public static FillerBlockType getByName(String name) {
            for(FillerBlockType blockType : values()) {
                if (blockType.getName().equals(name))
                    return blockType;
            }
            return null;
        }
    }
}
