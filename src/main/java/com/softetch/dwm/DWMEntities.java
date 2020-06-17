package com.softetch.dwm;

import com.softetch.dwm.common.entity.AdiposeEntity;
import com.softetch.dwm.common.entity.TellerEntity;
import com.softetch.dwm.common.entity.dalek.GuardDalekEntity;
import com.softetch.dwm.common.entity.dalek.InvasionDalekEntity;
import com.softetch.dwm.common.entity.dalek.SkaroDalekEntity;
import com.softetch.dwm.common.entity.projectile.LaserEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to register entities for the mod
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DWMEntities {
    private static final List<EntityType> TYPES = new ArrayList<>();
    public static final EntityType<SkaroDalekEntity> SKARO_DALEK;
    public static final EntityType<InvasionDalekEntity> INVASION_DALEK;
    public static final EntityType<GuardDalekEntity> GUARD_DALEK;
    public static final EntityType<AdiposeEntity> ADIPOSE;
    public static final EntityType<LaserEntity> LASER;
    public static final EntityType<TellerEntity> TELLER;

    private DWMEntities() {}

    /**
     * Register the {@link net.minecraft.entity.Entity} types
     * @param event - The event
     */
    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        TYPES.forEach(type -> event.getRegistry().register(type));
    }

    /**
     * Build an {@link EntityType} from a {@link EntityType.Builder} using the specified name
     * @param name - The entity type name
     * @param builder - The entity type builder to build
     * @param <T> - The entity class for the builder.
     * @return The built entity type
     */
    private static <T extends Entity> EntityType<T> build(final String name, final EntityType.Builder<T> builder) {
        final ResourceLocation registryName = new ResourceLocation(DWMMain.MOD_ID, name);
        final EntityType<T> entityType = builder.build(registryName.toString());
        entityType.setRegistryName(registryName);
        TYPES.add(entityType);
        return entityType;
    }

    /**
     * Build all the entity types
     */
    static {
        SKARO_DALEK = build("skaro_dalek", EntityType.Builder.create(SkaroDalekEntity::new, EntityClassification.MONSTER).size(0.9f, 1.85f));
        INVASION_DALEK = build("invasion_dalek", EntityType.Builder.create(InvasionDalekEntity::new, EntityClassification.MONSTER).size(0.9f, 1.85f));
        GUARD_DALEK = build("guard_dalek", EntityType.Builder.create(GuardDalekEntity::new, EntityClassification.MONSTER).size(0.9f, 1.8f));
        ADIPOSE = build("adipose", EntityType.Builder.create(AdiposeEntity::new, EntityClassification.CREATURE).size(0.3f, 0.4f));
        LASER = build("laser", EntityType.Builder.<LaserEntity>create(LaserEntity::new, EntityClassification.MISC).size(0.5f, 0.5f));
        TELLER = build("teller", EntityType.Builder.create(TellerEntity::new, EntityClassification.CREATURE).size(0.6F, 1.8F));
    }

}
