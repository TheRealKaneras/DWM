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
    public static SoundEvent sonicScrewdriver;

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
                sonicScrewdriver = buildSound(new ResourceLocation(DWMMain.MOD_ID, "sonic_screwdriver"))
        );
    }
}
