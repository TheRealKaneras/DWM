package com.softetch.dwm.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.scoreboard.Team;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

/**
 * Holds properties for entities that are loyal to their creators.
 */
public abstract class LoyalEntity extends AnimalEntity {
    protected static final DataParameter<Optional<UUID>> OWNER_UNIQUE_ID = EntityDataManager.createKey(LoyalEntity.class, DataSerializers.OPTIONAL_UNIQUE_ID);

    /**
     * Create a new loyal entity
     * @param type of entity
     * @param worldIn that the entity is in
     */
    protected LoyalEntity(EntityType<? extends LoyalEntity> type, World worldIn) {
        super(type, worldIn);
    }


    /**
     * Register data with the data manager
     */
    protected void registerData() {
        super.registerData();
        this.dataManager.register(OWNER_UNIQUE_ID, Optional.empty());
    }

    /**
     * Write additional data to NBT
     */
    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.putString("CreatorUUID", (getCreatorID() == null ? "" : getCreatorID().toString()));
    }

    /**
     * Protected helper method to read the subclass entity data from NBT
     * @param compound the compound NBT data tags
     */
    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        String s;
        if (compound.contains("CreatorUUID", 8)) {
            s = compound.getString("CreatorUUID");
        } else {
            String s1 = compound.getString("Creator");
            s = PreYggdrasilConverter.convertMobOwnerIfNeeded(this.getServer(), s1);
        }

        if (!s.isEmpty()) {
            this.setCreatorID(UUID.fromString(s));
        }
    }

    /**
     * Setter for the creator of the entity
     * @param uuid of the creator entity
     */
    public void setCreatorID(@Nullable UUID uuid) {
        this.dataManager.set(OWNER_UNIQUE_ID, Optional.ofNullable(uuid));
    }

    /**
     * Getter for the creator entity's UUID
     * @return the creator entity's UUID
     */
    @Nullable
    public UUID getCreatorID() {
        return this.dataManager.get(OWNER_UNIQUE_ID).orElse(null);
    }

    /**
     * Getter for the creator entity
     * @return The creator entity
     */
    @Nullable
    public LivingEntity getCreator() {
        try {
            return getCreatorID() == null ? null : world.getPlayerByUuid(getCreatorID());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * Checks if an entity is the creator
     * @param entity to be checked if they are the creator
     * @return if the entity is the creator or not
     */
    public boolean isCreator(LivingEntity entity) {
        return entity == getCreator();
    }

    /**
     * Gets the team that the entity is on
     * @return the team that the entity is on
     */
    @Nullable
    @Override
    public Team getTeam() {
        if (getCreator() != null) {
            return getCreator().getTeam();
        }
        return super.getTeam();
    }

    /**
     * Checks if this entity is on the same team as the given entity
     * @param entityIn the given entity to check against
     * @return whether this entity is on the same team as the given entity
     */
    @Override
    public boolean isOnSameTeam(Entity entityIn) {
        if (getCreator() != null) {
            return entityIn == getCreator() || getCreator().isOnSameTeam(entityIn);
        }
        return super.isOnSameTeam(entityIn);
    }
}
