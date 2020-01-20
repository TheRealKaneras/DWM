package com.softetch.dwm.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

/**
 * The time war dalek entity class to contain the properties for the entity
 */
public class TimeWarDalekEntity extends DalekEntity {

    /**
     * Create a new dalek entity
     * @param type of entity
     * @param world that the entity is in
     */
    public TimeWarDalekEntity(EntityType<TimeWarDalekEntity> type, World world) {
        super(type, world);

    }

}
