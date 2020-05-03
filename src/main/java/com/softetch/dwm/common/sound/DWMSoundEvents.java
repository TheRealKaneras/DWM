package com.softetch.dwm.common.sound;

import com.softetch.dwm.DWMMain;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * This class has the register event handler for all custom sounds
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DWMMain.MOD_ID)
public class DWMSoundEvents {
    public static final DWMSoundEvent SONIC_SCREWDRIVER = null;
    public static final DWMSoundEvent EXTERMINATE = null;
    public static final DWMSoundEvent DALEK_SCREAM = null;
    public static final DWMSoundEvent DALEK_GUN = null;
    public static final DWMSoundEvent TARDIS_OPEN = null;
    public static final DWMSoundEvent TARDIS_CLOSE = null;
    public static final DWMSoundEvent TARDIS_CHEST_OPEN = null;
    public static final DWMSoundEvent TARDIS_CHEST_CLOSE = null;
    public static final DWMSoundEvent TARDIS_FAST_OPEN = null;
    public static final DWMSoundEvent TARDIS_FAST_CLOSE = null;
    public static final DWMSoundEvent TARDIS_DEADLOCK = null;
    public static final DWMSoundEvent TARDIS_LOCK = null;
    public static final DWMSoundEvent TARDIS_UNLOCK = null;
    public static final DWMSoundEvent TOYOTA_HUM = null;
    public static final DWMSoundEvent TARDIS_MC_HUM = null;

    private DWMSoundEvents() {}

    private static DWMSoundEvent buildSound(String name) {
        ResourceLocation resourceLocation = new ResourceLocation(DWMMain.MOD_ID, name);
        DWMSoundEvent soundEvent = new DWMSoundEvent(resourceLocation);
        soundEvent.setRegistryName(resourceLocation);
        return soundEvent;
    }

    private static DWMSoundEvent buildSound(String name, float recommendedVolume) {
        DWMSoundEvent soundEvent = buildSound(name);
        soundEvent.setRecommendedVolume(recommendedVolume);
        return soundEvent;
    }

    private static DWMSoundEvent buildSound(String name, float recommendedVolume, long duration) {
        DWMSoundEvent soundEvent = buildSound(name, recommendedVolume);
        soundEvent.setDuration(duration);
        return soundEvent;
    }

    /**
     * The actual event handler that registers the custom sounds
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(
                buildSound("sonic_screwdriver"),
                buildSound("exterminate"),
                buildSound("dalek_scream"),
                buildSound("dalek_gun"),
                buildSound("tardis_open", 0.3f),
                buildSound("tardis_close", 0.3f),
                buildSound("tardis_chest_open", 0.3f, 26L),
                buildSound("tardis_chest_close", 0.3f, 26L),
                buildSound("tardis_fast_open"),
                buildSound("tardis_fast_close"),
                buildSound("tardis_deadlock"),
                buildSound("tardis_lock"),
                buildSound("tardis_unlock"),
                buildSound("toyota_hum", 0.06f, 60L),
                buildSound("tardis_mc_hum", 1.0f, 20L)
        );
    }
}