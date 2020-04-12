package com.softetch.dwm.common.tardis;

import net.minecraft.util.math.BlockPos;

public class TardisPosition {
    public int dimension;
    public int x;
    public int y;
    public int z;

    public TardisPosition(int dimension, int x, int y, int z) {
        this.dimension = dimension;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public TardisPosition(int dimension, BlockPos pos) {
        this.dimension = dimension;
        this.x = pos.getX();
        this.y = pos.getY();
        this.z = pos.getZ();
    }

    public BlockPos getBlockPos() {
        return new BlockPos(x, y, z);
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "TardisPosition[" +
                "dimension=" + dimension +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ']';
    }
}