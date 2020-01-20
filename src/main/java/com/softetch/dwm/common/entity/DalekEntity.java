package com.softetch.dwm.common.entity;

import com.softetch.dwm.common.entity.projectile.LaserEntity;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * The base class for all dalek-type entities
 */
public class DalekEntity extends MonsterEntity implements IRangedAttackMob {
    private static final DataParameter<Boolean> ATTACKING = EntityDataManager.createKey(DalekEntity.class, DataSerializers.BOOLEAN);

    /**
     * Create a new dalek entity
     * @param type of entity
     * @param world that the entity is in
     */
    public DalekEntity(EntityType<? extends DalekEntity> type, World world) {
        super(type, world);

    }

    /**
     * Register goals for the AI of the entity
     */
    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AnimalEntity.class, true));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.0D, 40, 20.0F));
        this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 10.0F));
        this.goalSelector.addGoal(3, new LookAtGoal(this, LivingEntity.class, 10.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
    }

    /**
     * Register entity attributes such as health and speed
     */
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2F);
    }

    /**
     * Get the height of the entity's eyes
     * @param poseIn the pose the entity is in
     * @param sizeIn an adjustable size of the entity
     * @return the height of the entity's eyes
     */
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 1.62F;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isAttacking() {
        return this.dataManager.get(ATTACKING);
    }

    public void setAttacking(boolean attacking) {
        this.dataManager.set(ATTACKING, attacking);
    }

    @Override
    protected void registerData() {
        super.registerData();
        this.dataManager.register(ATTACKING, false);
    }


    /**
     * Attack the specified entity using a ranged attack.
     *
     * @param target
     * @param distanceFactor
     */
    @Override
    public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
        System.out.println("range attack on " + target.getName());
        LaserEntity laserEntity = new LaserEntity(world, this);
        laserEntity.setPosition(this.posX,this.posY,this.posZ);
        double d0 = target.posX - this.posX;
        double d1 = target.getBoundingBox().minY + (double)(target.getHeight() / 3.0F) - laserEntity.posY;
        double d2 = target.posZ - this.posZ;
        double d3 = MathHelper.sqrt(d0 * d0 + d2 * d2);
        laserEntity.shoot(d0, d1 + d3 * (double)0.2F, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
        this.playSound(SoundEvents.ENTITY_SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.world.addEntity(laserEntity);
    }
}
