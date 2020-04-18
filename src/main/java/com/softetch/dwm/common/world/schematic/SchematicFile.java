package com.softetch.dwm.common.world.schematic;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.Vec3i;

import java.util.List;

public class SchematicFile {
    private final int width;
    private final int height;
    private final int length;
    private final int[] blocks;
    private final byte[] blockData;
    private final List<CompoundNBT> tileEntities;
    private final List<CompoundNBT> entities;

    public SchematicFile(Vec3i dimensions, int[] blocks, byte[] blockData, List<CompoundNBT> tileEntities, List<CompoundNBT> entities) {
        this.width = dimensions.getX();
        this.height = dimensions.getY();
        this.length = dimensions.getZ();
        this.blocks = blocks;
        this.blockData = blockData;
        this.tileEntities = tileEntities;
        this.entities = entities;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int[] getBlocks() {
        return blocks;
    }

    public byte[] getBlockData() {
        return blockData;
    }

    public List<CompoundNBT> getTileEntities() {
        return tileEntities;
    }

    public List<CompoundNBT> getEntities() {
        return entities;
    }
}
