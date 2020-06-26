package com.softetch.dwm.common.tags;

import com.softetch.dwm.DWMMain;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class DWMBlockTags {
    public static final Tag<Block> LOGS = createTag("logs");
    public static final Tag<Block> LEAVES = createTag("leaves");
    public static final Tag<Block> SAPLINGS = createTag("saplings");
    public static final Tag<Block> TREE_GROUND = createTag("tree_ground");

    private static Tag<Block> createTag(String id) {
        return BlockTags.getCollection().getOrCreate(new ResourceLocation(DWMMain.MOD_ID, id));
    }
}
