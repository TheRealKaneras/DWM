package com.softetch.dwm.common.entity.dalek;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class InvasionDalekEntity extends DalekEntity {
    /**
     * Create a new dalek entity
     *
     * @param type  of entity
     * @param world that the entity is in
     */
    public InvasionDalekEntity(EntityType<? extends DalekEntity> type, World world) {
        super(type, world);
    }
}
