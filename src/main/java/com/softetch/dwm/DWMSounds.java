package com.softetch.dwm;

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
public class DWMSounds {
    public static final SoundEvent SONIC_SCREWDRIVER = null;
    public static final SoundEvent EXTERMINATE = null;
    public static final SoundEvent DALEK_SCREAM = null;
    public static final SoundEvent DALEK_GUN = null;
    public static final SoundEvent TARDIS_OPEN = null;
    public static final SoundEvent TARDIS_CLOSE = null;
    public static final SoundEvent TARDIS_FAST_OPEN = null;
    public static final SoundEvent TARDIS_FAST_CLOSE = null;
    public static final SoundEvent TARDIS_DEADLOCK = null;
    public static final SoundEvent TARDIS_LOCK = null;
    public static final SoundEvent TARDIS_UNLOCK = null;

    private DWMSounds() {}

    /**
     * Set up the SoundEvent based on a resource location.
     * @param resourceLocation
     * @return
     */
    private static SoundEvent buildSound(ResourceLocation resourceLocation) {
        SoundEvent soundEvent = new SoundEvent(resourceLocation);
        soundEvent.setRegistryName(resourceLocation);
        return soundEvent;
    }

    /**
     * The actual event handler that registers the custom sounds
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "sonic_screwdriver")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "exterminate")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "dalek_scream")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "dalek_gun")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_open")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_close")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_fast_open")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_fast_close")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_deadlock")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_lock")),
                buildSound(new ResourceLocation(DWMMain.MOD_ID, "tardis_unlock"))
        );
    }
}