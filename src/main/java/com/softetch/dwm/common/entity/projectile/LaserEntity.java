package com.softetch.dwm.common.entity.projectile;

import com.softetch.dwm.DWMDamageSource;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.network.IPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class LaserEntity extends ThrowableEntity {
    private static final float DAMAGE_AMOUNT = 3.0f;

    public LaserEntity(EntityType<? extends ThrowableEntity> type, World worldIn) {
        super(type, worldIn);
        setNoGravity(true);
    }

    public LaserEntity(EntityType<? extends ThrowableEntity> type, double x, double y, double z, World worldIn) {
        super(type, x, y, z, worldIn);
        setNoGravity(true);
    }

    public LaserEntity(EntityType<? extends ThrowableEntity> type, LivingEntity livingEntityIn, World worldIn) {
        super(type, livingEntityIn, worldIn);
        setNoGravity(true);
    }

    @Override
    public void tick() {
        if (ticksExisted > 5 * 20)
            remove();
        super.tick();
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     *
     * @param result
     */
    @Override
    protected void onImpact(RayTraceResult result) {
        if (result == null || !isAlive())
            return;
        if (result.getType() == RayTraceResult.Type.ENTITY) {
            Entity entity = ((EntityRayTraceResult) result).getEntity();
            entity.attackEntityFrom(DWMDamageSource.DALEK_LASER, DAMAGE_AMOUNT);
            remove();
        } else if (result.getType() == RayTraceResult.Type.BLOCK) {
            BlockRayTraceResult blockResult = (BlockRayTraceResult) result;
            BlockPos pos = blockResult.getPos();
            Direction direction = blockResult.getFace();
            BlockState blockState = world.getBlockState(pos);
            blockState.catchFire(world, pos, direction, getThrower());
            remove();
        }
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerData() {
    }

}
