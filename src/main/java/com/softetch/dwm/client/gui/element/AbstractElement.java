package com.softetch.dwm.client.gui.element;

import java.util.Random;

public abstract class AbstractElement {
    protected float x;
    protected float y;
    protected int width;
    protected int height;
    protected static final Random RANDOM = new Random();


    public AbstractElement(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getPosition() {
        return new float[] {x,y};
    }

    public void grow(int width, int height) {
        this.width += width;
        this.height += height;
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int[] getDimensions() {
        return new int[] {width,height};
    }

    public abstract void render();
}
