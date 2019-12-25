package com.softetch.dwm.client.gui.element;

import java.util.Random;

public abstract class AbstractElement {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected static final Random RANDOM = new Random();


    public AbstractElement(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getPosition() {
        return new int[] {x,y};
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
