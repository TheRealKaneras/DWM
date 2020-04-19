package com.softetch.dwm.client.gui.element;

import net.minecraftforge.fml.client.config.GuiUtils;

public class DustElement extends AbstractElement {
    private static final int[] DUST_COLOURS = new int[] {
            0xFFCC89FF, 0xFFA735FF, 0xD3A870FF
    };
    private int colour;

    public DustElement(int x, int y, int width, int height) {
        this(x,y,width,height, DUST_COLOURS[RANDOM.nextInt(DUST_COLOURS.length - 1)]);
    }

    public DustElement(int x, int y, int width, int height, int colour) {
        super(x, y, width, height);
        this.colour = colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public int getColour() {
        return colour;
    }

    public void render() {
        GuiUtils.drawGradientRect(2, (int) x, (int) y, (int) x + width, (int) y + height, getColour(), getColour());
    }

}
