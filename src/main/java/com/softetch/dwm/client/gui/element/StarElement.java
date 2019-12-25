package com.softetch.dwm.client.gui.element;

import net.minecraftforge.fml.client.config.GuiUtils;

public class StarElement extends AbstractElement {
    private static final int[] STAR_COLOURS = new int[] {
            0xFFD1D1FF, 0xFFEAEAFF, 0xFFF9F9FF, // Red
            0xFFDCCCFF, 0xFFF0EAFF, 0xFFFBFAFF, // Orange
            0xFEFFC6FF, 0xFFFFE5FF, 0xFFFFF9FF, // Yellow
            0xDBFFFFFF, 0xF4FFFFFF, 0xF9FFFFFF, // Light Blue
            0xCDFFCDFF, 0xE5FFE5FF, 0xF4FFF4FF, // Green
            0xD1D1FFFF, 0xE0E0FFFF, 0xF9F9FFFF // Dark Blue/Purple
    };
    private int x;
    private int y;
    private int width;
    private int height;
    private int colour;

    public StarElement(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.colour = STAR_COLOURS[RANDOM.nextInt(STAR_COLOURS.length - 1)];
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public int getColour() {
        return colour;
    }

    public void render() {
        GuiUtils.drawGradientRect(0, x, y, x + width, y + height, getColour(), getColour());
    }

}
