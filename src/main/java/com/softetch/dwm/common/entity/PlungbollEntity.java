package com.softetch.dwm.common.entity;

import com.softetch.dwm.DWMNBTTags;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class PlungbollEntity extends MonsterEntity {
    private static final DataParameter<Integer> PLUNGBOLL_SIZE = EntityDataManager.createKey(PlungbollEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> PLUNGBOLL_COLOR = EntityDataManager.createKey(PlungbollEntity.class, DataSerializers.VARINT);
    public PlungbollEntity congregateTarget;

    public PlungbollEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new PlungbollEntity.CongregateGoal(this));
        this.goalSelector.addGoal(2, new PlungbollEntity.AttackGoal<>(this, PlayerEntity.class, true));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
    }

    public void setCongregateTarget(PlungbollEntity congregateTarget) {
        this.congregateTarget = congregateTarget;
    }

    public PlungbollEntity getCongregateTarget() {
        return congregateTarget;
    }

    protected void registerData() {
        super.registerData();
        this.dataManager.register(PLUNGBOLL_SIZE, 1);
        this.dataManager.register(PLUNGBOLL_COLOR, 0);
    }

    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);
    }

    protected void setPlungbollSize(int size, boolean resetHealth) {
        this.dataManager.set(PLUNGBOLL_SIZE, size);
        this.recenterBoundingBox();
        this.recalculateSize();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((size * size));
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((0.2F + 0.1F * (float)size));
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(size);
        if (resetHealth) {
            this.setHealth(this.getMaxHealth());
        }

        this.experienceValue = size;
    }

    /**
     * Returns the size of the plungboll.
     */
    public int getPlungbollSize() {
        return this.dataManager.get(PLUNGBOLL_SIZE);
    }

    protected void setPlungbollColor(int color) {
        this.dataManager.set(PLUNGBOLL_COLOR, color);
    }

    public int getPlungbollColor() {
        return this.dataManager.get(PLUNGBOLL_COLOR);
    }

    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.putInt(DWMNBTTags.SIZE, this.getPlungbollSize() - 1);
        compound.putInt(DWMNBTTags.COLOR, this.getPlungbollColor());
    }

    public void readAdditional(CompoundNBT compound) {
        int i = compound.getInt(DWMNBTTags.SIZE);
        if (i < 0) {
            i = 0;
        }

        this.setPlungbollSize(i + 1, false);
        this.setPlungbollColor(compound.getInt(DWMNBTTags.COLOR));
        super.readAdditional(compound);
    }

    public boolean isPlungbollSmall() {
        return this.getPlungbollSize() <= 1;
    }

    @Override
    protected boolean isDespawnPeaceful() {
        return !isPlungbollSmall();
    }

    @Override
    public void recalculateSize() {
        double x = getPosX();
        double y = getPosY();
        double z = getPosZ();
        super.recalculateSize();
        this.setPosition(x, y, z);
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return this.isPlungbollSmall() ? SoundEvents.ENTITY_SLIME_HURT_SMALL : SoundEvents.ENTITY_SLIME_HURT;
    }

    protected SoundEvent getDeathSound() {
        return this.isPlungbollSmall() ? SoundEvents.ENTITY_SLIME_DEATH_SMALL : SoundEvents.ENTITY_SLIME_DEATH;
    }

    @Override
    protected float getSoundVolume() {
        return 0.4F * (float) getPlungbollSize();
    }

    @Override
    public EntitySize getSize(Pose poseIn) {
        return super.getSize(poseIn).scale(0.255F * (float) getPlungbollSize());
    }

    private int getCombinedColor(int colorA, int colorB) {
        return (colorA + colorB) / 2;
    }

    public void combineHealth(float additionalHealth) {
        this.setHealth(this.getHealth() + additionalHealth);
    }

    @Override
    public void applyEntityCollision(Entity entityIn) {
        super.applyEntityCollision(entityIn);
        if (entityIn instanceof PlungbollEntity) {
            PlungbollEntity plungboll = (PlungbollEntity) entityIn;
            if ((plungboll.getCongregateTarget() == this)) {
                this.setPlungbollColor(getCombinedColor(this.getPlungbollColor(), plungboll.getPlungbollColor()));
                this.setPlungbollSize(plungboll.getPlungbollSize() + this.getPlungbollSize(), false);
                this.combineHealth(plungboll.getHealth());
                plungboll.remove();
            }
        }
    }

    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        this.setPlungbollColor(worldIn.getRandom().nextInt(16));
        this.setPlungbollSize(worldIn.getRandom().nextInt(3), true);
        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }


    static class AttackGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {

        public AttackGoal(PlungbollEntity goalOwnerIn, Class<T> targetClassIn, boolean checkSight) {
            super(goalOwnerIn, targetClassIn, checkSight);
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        @Override
        public boolean shouldExecute() {
            return super.shouldExecute() && ((PlungbollEntity) goalOwner).getCongregateTarget() == null;
        }
    }

    static class CongregateGoal extends Goal {
        protected final int targetChance;
        protected final PlungbollEntity goalOwner;
        protected PlungbollEntity target;

        public CongregateGoal(PlungbollEntity goalOwner) {
            this(goalOwner, 10);
        }

        public CongregateGoal(PlungbollEntity goalOwner, int targetChance) {
            this.goalOwner = goalOwner;
            this.targetChance = targetChance;
            this.setMutexFlags(EnumSet.of(Goal.Flag.LOOK));
        }

        protected double getTargetDistance() {
            IAttributeInstance iattributeinstance = this.goalOwner.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE);
            return iattributeinstance == null ? 16.0D : iattributeinstance.getValue();
        }

        protected double getPursueSpeed() {
            return this.goalOwner.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue() * 1.025D;
        }

        protected AxisAlignedBB getTargetableArea(double targetDistance) {
            return this.goalOwner.getBoundingBox().grow(targetDistance, 4.0D, targetDistance);
        }

        protected void findTarget() {
            List<PlungbollEntity> targets = this.goalOwner.getEntityWorld().getEntitiesWithinAABB(PlungbollEntity.class, getTargetableArea(getTargetDistance()));
            for(PlungbollEntity entity : targets) {
                if (entity.getAttackTarget() != null) {
                    this.target = entity;
                    return;
                }
            }
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        @Override
        public boolean shouldExecute() {
            if (this.targetChance > 0 && goalOwner.getRNG().nextInt(this.targetChance) != 0) {
                return false;
            } else {
                this.findTarget();
                return this.target != null && this.goalOwner.getAttackTarget() == null;
            }
        }

        @Override
        public void startExecuting() {
            this.goalOwner.setCongregateTarget(this.target);
            this.goalOwner.setAIMoveSpeed((float) getPursueSpeed());
            super.startExecuting();
        }

        @Override
        public boolean shouldContinueExecuting() {
            PlungbollEntity target = this.goalOwner.getCongregateTarget();
            return target != null && target.isAlive();
        }

        @Override
        public void tick() {
            this.goalOwner.faceEntity(this.goalOwner.getCongregateTarget(), 10.0F, 10.0F);
        }
    }
}
