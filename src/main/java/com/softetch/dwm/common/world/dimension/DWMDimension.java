package com.softetch.dwm.common.world.dimension;

import com.softetch.dwm.common.world.dimension.gen.TardisChunkGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;

import javax.annotation.Nullable;

public class DWMDimension extends Dimension {
    private final SingleBiomeProvider BIOME = new SingleBiomeProvider(new SingleBiomeProviderSettings(this.world.getWorldInfo()).setBiome(Biomes.THE_VOID));

    public DWMDimension(World p_i225788_1_, DimensionType p_i225788_2_) {
        super(p_i225788_1_, p_i225788_2_, 0.0f);
    }

    @Override
    public ChunkGenerator<?> createChunkGenerator() {
        return new TardisChunkGenerator(world, BIOME, new TardisChunkGenerator.TardisGenerationSettings());
    }

    @Nullable
    @Override
    public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid) {
        return BlockPos.ZERO;
    }

    @Nullable
    @Override
    public BlockPos findSpawn(int posX, int posZ, boolean checkValid) {
        return BlockPos.ZERO;
    }

    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     *
     * @param worldTime
     * @param partialTicks
     */
    @Override
    public float calculateCelestialAngle(long worldTime, float partialTicks) {
        return 0;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    @Override
    public boolean isSurfaceWorld() {
        return false;
    }

    /**
     * Return Vec3D with biome specific fog color
     *
     * @param celestialAngle
     * @param partialTicks
     */
    @Override
    public Vec3d getFogColor(float celestialAngle, float partialTicks) {
        return new Vec3d(0,0,0);
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    @Override
    public boolean canRespawnHere() {
        return false;
    }

    /**
     * Returns true if the given X,Z coordinate should show environmental fog.
     *
     * @param x
     * @param z
     */
    @Override
    public boolean doesXZShowFog(int x, int z) {
        return false;
    }
}
