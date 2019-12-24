package com.softetch.dwm.common.entity;

import com.softetch.dwm.common.entity.ai.FollowCreatorGoal;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Class containing all methods and properties of adipose entities
 */
public class AdiposeEntity extends LoyalEntity {

    /**
     * Create a new adipose entity
     * @param type of entity
     * @param world that the entity is in
     */
    public AdiposeEntity(EntityType<? extends LoyalEntity> type, World world) {
        super(type, world);
    }

    /**
     * Register goals for the AI of the entity
     */
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
        this.goalSelector.addGoal(2, new FollowCreatorGoal(this, 1.0D, 10.0F, 2.0F));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
    }

    /**
     * Register entity attributes such as health and speed
     */
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2F);
    }

    /**
     * Get the height of the entity's eyes
     * @param poseIn the pose the entity is in
     * @param sizeIn an adjustable size of the entity
     * @return the height of the entity's eyes
     */
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 0.4F;
    }


    /**
     * Create a new child of the entity
     * @param ageable the entity to create a child for
     * @return the new child entity
     */
    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }
}
