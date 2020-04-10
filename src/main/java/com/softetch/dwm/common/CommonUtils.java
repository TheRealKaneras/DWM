package com.softetch.dwm.common;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class CommonUtils {

    public static Vec3d getLastTickPos(Entity entity) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ);
    }
}
