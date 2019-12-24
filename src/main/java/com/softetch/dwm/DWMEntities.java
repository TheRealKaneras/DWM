package com.softetch.dwm;

import com.softetch.dwm.common.entity.AdiposeEntity;
import com.softetch.dwm.common.entity.BaseDalekEntity;
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
    public static final EntityType<BaseDalekEntity> DALEK;
    public static final EntityType<AdiposeEntity> ADIPOSE;

    private DWMEntities() {}

    /**
     * Register the {@link net.minecraft.entity.Entity} types
     * @param event - The event
     */
    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        for (EntityType type : TYPES) {
            event.getRegistry().register(type);
        }
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
        DALEK = build("dalek", EntityType.Builder.create(BaseDalekEntity::new, EntityClassification.MONSTER).size(0.9f, 1.8f));
        ADIPOSE = build("adipose", EntityType.Builder.create(AdiposeEntity::new, EntityClassification.CREATURE).size(0.3f, 0.4f));
    }

}
