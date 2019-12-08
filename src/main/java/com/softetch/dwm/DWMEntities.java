package com.softetch.dwm;

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
@Mod.EventBusSubscriber(modid = DWMMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DWMEntities {
    private static final List<EntityType> TYPES = new ArrayList<>();
    public static final EntityType<BaseDalekEntity> DALEK;

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
        final ResourceLocation registryName = new ResourceLocation(DWMMain.MODID, name);
        final EntityType<T> entityType = builder.build(registryName.toString());
        entityType.setRegistryName(registryName);
        TYPES.add(entityType);
        return entityType;
    }

    /**
     * Build all the entity types
     */
    static {
        DALEK = build("dalek", EntityType.Builder.<BaseDalekEntity>create(BaseDalekEntity::new, EntityClassification.MONSTER).size(0.9f, 1.8f));
    }

}
