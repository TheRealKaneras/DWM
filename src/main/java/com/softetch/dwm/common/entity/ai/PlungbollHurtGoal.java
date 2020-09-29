package com.softetch.dwm.common.entity.ai;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.TargetGoal;

import java.util.EnumSet;

public class PlungbollHurtGoal extends TargetGoal {
    private static final EntityPredicate targetPredicate = (new EntityPredicate()).setLineOfSiteRequired().setUseInvisibilityCheck();
    private boolean callsForHelp;
    private int revengeTimerOld;
    private final Class<?>[] excludedReinforcementTypes;
    private Class<?>[] reinforcementTypes;

    public PlungbollHurtGoal(CreatureEntity creature, Class<?>... excludedReinforcementTypes) {
        super(creature, true);
        this.excludedReinforcementTypes = excludedReinforcementTypes;
        this.setMutexFlags(EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean shouldExecute() {
        int i = this.goalOwner.getRevengeTimer();
        LivingEntity target = this.goalOwner.getRevengeTarget();
        if (i != revengeTimerOld && target != null) {
            for (Class<?> oclass : this.excludedReinforcementTypes) {
                if (oclass.isAssignableFrom(target.getClass()))
                    return false;
            }
            return isSuitableTarget(target, targetPredicate);
        }
        return false;
    }

    public PlungbollHurtGoal setCallsForHelp(Class<?>... reinforcementTypes) {
        this.callsForHelp = true;
        this.reinforcementTypes = reinforcementTypes;
        return this;
    }

    @Override
    public void startExecuting() {
        this.goalOwner.setAttackTarget(this.goalOwner.getRevengeTarget());
        this.target = this.goalOwner.getAttackTarget();
        this.revengeTimerOld = this.goalOwner.getRevengeTimer();
        this.unseenMemoryTicks = 300;

    }
}
