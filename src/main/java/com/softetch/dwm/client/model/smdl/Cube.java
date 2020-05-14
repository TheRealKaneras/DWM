package com.softetch.dwm.client.model.smdl;

import java.util.Arrays;

public class Cube {
    private float[] position;
    private int[] size;
    private int[] uv_offset;
    private float inflate;
    private boolean mirror;

    public float[] getPosition() {
        return position;
    }

    public int[] getSize() {
        return size;
    }

    public int[] getUVOffset() {
        return uv_offset;
    }

    public float getInflate() {
        return inflate;
    }

    public boolean shouldMirror() {
        return mirror;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "position=" + Arrays.toString(position) +
                ", size=" + Arrays.toString(size) +
                ", uv_offset=" + Arrays.toString(uv_offset) +
                ", inflate=" + inflate +
                ", mirror=" + mirror +
                '}';
    }
}
