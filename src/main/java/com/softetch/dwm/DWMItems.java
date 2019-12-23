package com.softetch.dwm;

import com.softetch.dwm.common.block.RoundelBlock;
import com.softetch.dwm.common.item.gadget.ItemSonicScrewdriver;
import com.softetch.dwm.common.item.gadget.ItemTwoDis;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
    public static final RoundelBlock BLACK_ROUNDEL = null;
    public static final RoundelBlock BLUE_ROUNDEL = null;
    public static final RoundelBlock BROWN_ROUNDEL = null;
    public static final RoundelBlock CYAN_ROUNDEL = null;
    public static final RoundelBlock GREEN_ROUNDEL = null;
    public static final RoundelBlock GREY_ROUNDEL = null;
    public static final RoundelBlock LIGHT_BLUE_ROUNDEL = null;
    public static final RoundelBlock LIGHT_GREY_ROUNDEL = null;
    public static final RoundelBlock LIME_ROUNDEL = null;
    public static final RoundelBlock MAGENTA_ROUNDEL = null;
    public static final RoundelBlock ORANGE_ROUNDEL = null;
    public static final RoundelBlock PINK_ROUNDEL = null;
    public static final RoundelBlock PURPLE_ROUNDEL = null;
    public static final RoundelBlock RED_ROUNDEL = null;
    public static final RoundelBlock WHITE_ROUNDEL = null;
    public static final RoundelBlock YELLOW_ROUNDEL = null;

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "black_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "blue_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "brown_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "cyan_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "green_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "grey_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "light_blue_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "light_grey_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "lime_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "magenta_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "orange_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "pink_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "purple_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "red_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "white_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "yellow_roundel")

        );
    }

    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver"),
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_ten"),
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_lipstick"),
                new ItemTwoDis().setRegistryName(DWMMain.MOD_ID, "two_dis"),
                new BlockItem(BLACK_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "black_roundel"),
                new BlockItem(BLUE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "blue_roundel"),
                new BlockItem(BROWN_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "brown_roundel"),
                new BlockItem(CYAN_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "cyan_roundel"),
                new BlockItem(GREEN_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "green_roundel"),
                new BlockItem(GREY_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "grey_roundel"),
                new BlockItem(LIGHT_BLUE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "light_blue_roundel"),
                new BlockItem(LIGHT_GREY_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "light_grey_roundel"),
                new BlockItem(LIME_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "lime_roundel"),
                new BlockItem(MAGENTA_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "magenta_roundel"),
                new BlockItem(ORANGE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "orange_roundel"),
                new BlockItem(PINK_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "pink_roundel"),
                new BlockItem(PURPLE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "purple_roundel"),
                new BlockItem(RED_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "red_roundel"),
                new BlockItem(WHITE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "white_roundel"),
                new BlockItem(YELLOW_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "yellow_roundel")
        );
    }

}
