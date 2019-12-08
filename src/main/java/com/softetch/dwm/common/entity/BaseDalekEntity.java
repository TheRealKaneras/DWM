package com.softetch.dwm.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

/**
 * The base dalek entity class to contain the properties for all daleks
 */
public class BaseDalekEntity extends MonsterEntity {

    /**
     * Create a new dalek entity
     * @param type of entity
     * @param world that the entity is in
     */
    public BaseDalekEntity(EntityType type, World world) {
        super(type, world);
    }

}
