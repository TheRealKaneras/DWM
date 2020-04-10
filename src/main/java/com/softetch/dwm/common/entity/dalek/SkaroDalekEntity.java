package com.softetch.dwm.common.entity.dalek;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

/**
 * The dalek entity class to contain the properties for the entity
 */
public class SkaroDalekEntity extends DalekEntity {
    /**
     * Create a new dalek entity
     *
     * @param type  of entity
     * @param world that the entity is in
     */
    public SkaroDalekEntity(EntityType<SkaroDalekEntity> type, World world) {
        super(type, world);
    }
}
