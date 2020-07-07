package com.softetch.dwm.common.world.gen.surfacebuilders;

import com.softetch.dwm.DWMItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModSurfaceBuilder {
    public static final BlockState AIR = Blocks.AIR.getDefaultState();
    public static final BlockState GALLIFREY_DIRT = DWMItems.GALLIFREY_DIRT.getDefaultState();
    public static final BlockState GALLIFREY_GRASS_BLOCK = DWMItems.GALLIFREY_GRASS_BLOCK.getDefaultState();
    public static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();

    public static final SurfaceBuilderConfig GALLIFREY_GRASS_DIRT_GRAVEL_CONFIG = new SurfaceBuilderConfig(GALLIFREY_GRASS_BLOCK, GALLIFREY_DIRT, GRAVEL);
}
