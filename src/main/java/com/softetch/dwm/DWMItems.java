package com.softetch.dwm;

import com.softetch.dwm.common.block.RoundelBlock;
import com.softetch.dwm.common.item.gadget.ItemSonicScrewdriver;
import com.softetch.dwm.common.item.gadget.ItemTwoDis;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
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
    public static final RoundelBlock CLASSIC_ROUNDEL = null;

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "classic_roundel")
        );
    }

    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemSonicScrewdriver().setRegistryName(new ResourceLocation(DWMMain.MOD_ID, "sonic_screwdriver")),
                new ItemTwoDis().setRegistryName(new ResourceLocation(DWMMain.MOD_ID, "two_dis")),
                new BlockItem(CLASSIC_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "classic_roundel")
        );
    }


}
