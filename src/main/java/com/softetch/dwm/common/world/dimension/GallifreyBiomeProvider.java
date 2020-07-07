package com.softetch.dwm.common.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.softetch.dwm.common.world.gen.biome.DWMBiomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Set;

public class GallifreyBiomeProvider extends BiomeProvider {
    private static final Set<Biome> BIOMES = ImmutableSet.of(DWMBiomes.GOLDEN_FIELDS, DWMBiomes.CLOISTER);

    public GallifreyBiomeProvider() {
        super(BIOMES);
    }

    /**
     * The base biome for the dimension
     * @param x coordinate
     * @param y coordinate
     * @param z coordinate
     * @return a default biome
     */
    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return DWMBiomes.GOLDEN_FIELDS;
    }
}
