package com.softetch.dwm.client.render;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.util.Direction;

public class RenderUtil {

    public static void glRotateDirection(Direction direction) {
        switch (direction) {
            case EAST:
                GlStateManager.rotated(270.0d, 0.0d, 1.0d, 0.0d);
                break;
            case WEST:
                GlStateManager.rotated(90.0d, 0.0d, 1.0d, 0.0d);
                break;
            case NORTH:
                GlStateManager.rotated(180.0d, 0.0d, 1.0d, 0.0d);
                break;
            default:
                break;
        }
    }
}
