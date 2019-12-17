package com.softetch.dwm;

import com.softetch.dwm.common.item.gadget.ItemSonicScrewdriver;
import com.softetch.dwm.common.item.gadget.ItemTwoDis;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * This class has the register event handler for all custom items
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DWMMain.MOD_ID)
public class DWMItems {
    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemSonicScrewdriver().setRegistryName(new ResourceLocation(DWMMain.MOD_ID, "sonic_screwdriver")),
                new ItemTwoDis().setRegistryName(new ResourceLocation(DWMMain.MOD_ID, "two_dis"))
        );
    }

}
