package com.softetch.dwm.common.entity.ai;

import com.softetch.dwm.DWMEntities;
import com.softetch.dwm.common.entity.dalek.DalekEntity;
import com.softetch.dwm.common.entity.projectile.LaserEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RangedLaserAttackGoal<T extends DalekEntity> extends Goal {
    private final T parentEntity;
    public int attackTimer;

    public RangedLaserAttackGoal(T parentEntity) {
        this.parentEntity = parentEntity;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute() {
        return parentEntity.getAttackTarget() != null;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        this.attackTimer = 0;
    }

    /**
     * Reset the task's internal state
     */
    @Override
    public void resetTask() {
        parentEntity.setAttacking(false);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    @Override
    public void tick() {
        LivingEntity targetEntity = parentEntity.getAttackTarget();
        double d0 = 64.0D;
        if (targetEntity.getDistanceSq(parentEntity) < 4096.0D && parentEntity.canEntityBeSeen(targetEntity)) {
            World world = parentEntity.world;
            ++attackTimer;
            if (attackTimer == 20) {
                System.out.println("attacking " + targetEntity.getName().getString());
                double d1 = 4.0D;
                Vec3d lookVector = parentEntity.getLook(1.0f);
                double accelX = targetEntity.posX - (parentEntity.posX + lookVector.x * 4.0D);
                double accelY = targetEntity.getBoundingBox().minY + (double) (targetEntity.getHeight() / 2.0F) - (0.5D + parentEntity.posY + (double)(parentEntity.getHeight() / 2.0f));
                double accelZ = targetEntity.posZ - (parentEntity.posZ + lookVector.z * 4.0D);
                LaserEntity laser = new LaserEntity(DWMEntities.LASER, parentEntity, world);

                laser.posX = parentEntity.posX + lookVector.x * 4.0D;
                laser.posY = parentEntity.posY + (double)(parentEntity.getHeight() / 2.0f) + 0.5D;
                laser.posZ = parentEntity.posZ + lookVector.z * 4.0D;
                world.addEntity(laser);
                attackTimer = -40;
            }
            parentEntity.setAttacking(attackTimer > 10);
        }
    }

}
