package com.softetch.dwm;

import com.softetch.dwm.common.entity.*;
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
    public static final EntityType<AdiposeEntity> ADIPOSE;
    public static final EntityType<LaserEntity> LASER;
    public static final EntityType<TellerEntity> TELLER;
    public static final EntityType<ClassicSilurianEntity> CLASSIC_SILURIAN;
    public static final EntityType<BroakirEntity> BROAKIR;
    public static final EntityType<FlutterwingEntity> FLUTTERWING;
    public static final EntityType<MewingDogEntity> MEWING_DOG;
    public static final EntityType<PlungbollEntity> PLUNGBOLL;
    public static final EntityType<ConsoleEntity> CONSOLE;

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
        ADIPOSE = build("adipose", EntityType.Builder.create(AdiposeEntity::new, EntityClassification.CREATURE).size(0.3f, 0.4f));
        LASER = build("laser", EntityType.Builder.<LaserEntity>create(LaserEntity::new, EntityClassification.MISC).size(0.5f, 0.5f));
        TELLER = build("teller", EntityType.Builder.create(TellerEntity::new, EntityClassification.CREATURE).size(0.6F, 1.8F));
        CLASSIC_SILURIAN = build("classic_silurian", EntityType.Builder.create(ClassicSilurianEntity::new, EntityClassification.MONSTER).size(0.6F, 1.8F));
        BROAKIR = build("broakir", EntityType.Builder.create(BroakirEntity::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F));
        FLUTTERWING = build("flutterwing", EntityType.Builder.create(FlutterwingEntity::new, EntityClassification.CREATURE).size(0.9F, 0.5F));
        MEWING_DOG = build("mewing_dog", EntityType.Builder.create(MewingDogEntity::new, EntityClassification.CREATURE).size(0.6F, 0.85F));
        PLUNGBOLL = build("plungboll", EntityType.Builder.create(PlungbollEntity::new, EntityClassification.MONSTER).size(2.04F, 2.04F));
        CONSOLE = build("console", EntityType.Builder.create(ConsoleEntity::new, EntityClassification.MONSTER).size(2.0f, 2.0f));
    }

}
