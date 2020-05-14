package com.softetch.dwm.common.tardis;

import net.minecraft.util.math.BlockPos;

public class TardisData {
    private String dimension;
    private int[] exteriorPos;
    private final int[] interiorPos;

    public TardisData(String dimension, int[] exteriorPos, int[] interiorPos) {
        this.dimension = dimension;
        this.exteriorPos = exteriorPos;
        this.interiorPos = interiorPos;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int[] getExteriorPos() {
        return exteriorPos;
    }

    public void setExteriorPos(BlockPos pos) {
        this.exteriorPos = new int[] { pos.getX(), pos.getY(), pos.getZ() };
    }

    public int[] getInteriorPos() {
        return interiorPos;
    }
}
