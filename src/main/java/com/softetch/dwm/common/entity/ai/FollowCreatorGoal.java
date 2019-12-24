package com.softetch.dwm.common.entity.ai;

import com.softetch.dwm.common.entity.LoyalEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

import java.util.EnumSet;

/**
 * A goal to get an entity to follow their creator (i.e. the entity that spawned them)
 */
public class FollowCreatorGoal extends Goal {
    protected final LoyalEntity loyalEntity;
    private LivingEntity creator;
    protected final IWorldReader world;
    private final double followSpeed;
    private final PathNavigator navigator;
    private int timeToRecalcPath;
    private final float maxDist;
    private final float minDist;
    private float oldWaterCost;

    /**
     * Sets up a new instance of FollowCreatorGoal, with new settings
     * @param loyalEntity the entity that is to follow its creator
     * @param followSpeed the speed at which the creator is followed
     * @param minDist the min distance at which the entity follows its creator
     * @param maxDist the max distance at which the entity follows its creator
     */
    public FollowCreatorGoal(LoyalEntity loyalEntity, double followSpeed, float minDist, float maxDist) {
        this.loyalEntity = loyalEntity;
        this.world = loyalEntity.world;
        this.followSpeed = followSpeed;
        this.navigator = loyalEntity.getNavigator();
        this.minDist = minDist;
        this.maxDist = maxDist;
        this.setMutexFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
        if (!(loyalEntity.getNavigator() instanceof GroundPathNavigator) && !(loyalEntity.getNavigator() instanceof FlyingPathNavigator)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowCreatorGoal");
        }
    }

    /**
     * Should the AI begin execution
     * @return Whether the Goal should begin execution
     */
    @Override
    public boolean shouldExecute() {
        LivingEntity creator = loyalEntity.getCreator();
        if (creator == null || (creator instanceof PlayerEntity && creator.isSpectator()) || loyalEntity.getDistanceSq(creator) < Math.pow(this.minDist, 2)) {
            return false;
        }
        this.creator = creator;
        return true;
    }

    /**
     * Should the Goal continue executing?
     * @return If an in-progress Goal should continue executing
     */
    @Override
    public boolean shouldContinueExecuting() {
        return !navigator.noPath() && loyalEntity.getDistanceSq(creator) > Math.pow(maxDist, 2);
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        timeToRecalcPath = 0;
        oldWaterCost = loyalEntity.getPathPriority(PathNodeType.WATER);
        loyalEntity.setPathPriority(PathNodeType.WATER, 0.0f);
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    @Override
    public void resetTask() {
        creator = null;
        navigator.clearPath();
        loyalEntity.setPathPriority(PathNodeType.WATER, oldWaterCost);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    @Override
    public void tick() {
        loyalEntity.getLookController().setLookPositionWithEntity(creator, 10.0f, (float) loyalEntity.getVerticalFaceSpeed());
        if (--timeToRecalcPath <= 0) {
            timeToRecalcPath = 10;
            if (!navigator.tryMoveToEntityLiving(creator, followSpeed)) {
                if (loyalEntity.getDistanceSq(creator) >= 144.0D) {
                    int i = MathHelper.floor(creator.posX) - 2;
                    int j = MathHelper.floor(creator.posZ) - 2;
                    int k = MathHelper.floor(creator.getBoundingBox().minY);

                    for(int l = 0; l <= 4; ++l) {
                        for(int i1 = 0; i1 <= 4; ++i1) {
                            if ((l < 1 || i1 < 1 || l > 3 || i1 > 3) && canTeleportToBlock(new BlockPos(i + l, k - 1, j + i1))) {
                                loyalEntity.setLocationAndAngles((float)(i + l) + 0.5F, k, (float)(j + i1) + 0.5F, loyalEntity.rotationYaw, loyalEntity.rotationPitch);
                                navigator.clearPath();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    protected boolean canTeleportToBlock(BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        return blockState.canEntitySpawn(world, pos, loyalEntity.getType()) && world.isAirBlock(pos.up());
    }
}
