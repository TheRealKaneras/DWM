package com.softetch.dwm.common.entity.projectile;

import com.softetch.dwm.DWMDamageSource;
import com.softetch.dwm.DWMEntities;
import com.softetch.dwm.common.entity.DalekEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.*;
import net.minecraft.world.World;


public class LaserEntity extends DamagingProjectileEntity implements IProjectile {
    private DalekEntity shootingEntity;

    public LaserEntity(EntityType<LaserEntity> type, World worldIn) {
        super(type, worldIn);
        this.shootingEntity = null;
    }

    public LaserEntity(World world, DalekEntity shooter){
        this(DWMEntities.LASER, world);
        this.shootingEntity = shooter;
    }

    /**
     * Called when this Entity hits a block or entity.
     *
     * @param result
     */
    protected void onImpact(RayTraceResult result) {
        if (!world.isRemote) {
            if (result.getType() == RayTraceResult.Type.ENTITY) {
                Entity entity = ((EntityRayTraceResult)result).getEntity();
                entity.attackEntityFrom(DWMDamageSource.DALEK_LASER, 3.0f);
            } else if (result.getType() == RayTraceResult.Type.BLOCK) {
                BlockPos blockPos = ((BlockRayTraceResult)result).getPos();
                Direction direction = ((BlockRayTraceResult)result).getFace();
                BlockState blockState = world.getBlockState(blockPos);
                Block block = blockState.getBlock();
                block.catchFire(blockState, world, blockPos, direction, this.shootingEntity);
            }
        }

    }

    public DalekEntity getShootingEntity() {
        return shootingEntity;
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        Entity entity = this.getShootingEntity();
        return new SSpawnObjectPacket(this, entity == null ? 0 : entity.getEntityId());
    }

    /**
     * Similar to setArrowHeading, it's point the throwable entity to a x, y, z direction.
     *
     * @param x
     * @param y
     * @param z
     * @param velocity
     * @param inaccuracy
     */
    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
        Vec3d vec3d = (new Vec3d(x, y, z)).normalize().add(this.rand.nextGaussian() * (double)0.0075F * (double)inaccuracy, this.rand.nextGaussian() * (double)0.0075F * (double)inaccuracy, this.rand.nextGaussian() * (double)0.0075F * (double)inaccuracy).scale(velocity);
        this.setMotion(vec3d);
        double f = MathHelper.sqrt(func_213296_b(vec3d));
        this.rotationYaw = (float)(MathHelper.atan2(vec3d.x, vec3d.z) * (180D / Math.PI));
        this.rotationPitch = (float)(MathHelper.atan2(vec3d.y, f) * (180D / Math.PI));
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
    }
}
