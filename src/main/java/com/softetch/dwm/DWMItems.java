package com.softetch.dwm;

import com.softetch.dwm.common.block.RoundelBlock;
import com.softetch.dwm.common.item.DWMSpawnerItem;
import com.softetch.dwm.common.item.clothing.HatItem;
import com.softetch.dwm.common.item.gadget.ItemSonicScrewdriver;
import com.softetch.dwm.common.item.gadget.ItemTwoDis;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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
    public static final RoundelBlock DARK_GRAY_ROUNDEL = null;
    public static final RoundelBlock GRAY_ROUNDEL = null;
    public static final RoundelBlock WHITE_ROUNDEL = null;
    public static final RoundelBlock DARK_PURPLE_ROUNDEL = null;
    public static final RoundelBlock LIGHT_PURPLE_ROUNDEL = null;
    public static final RoundelBlock BLUE_ROUNDEL = null;
    public static final RoundelBlock DARK_BLUE_ROUNDEL = null;
    public static final RoundelBlock DARK_AQUA_ROUNDEL = null;
    public static final RoundelBlock AQUA_ROUNDEL = null;
    public static final RoundelBlock GREEN_ROUNDEL = null;
    public static final RoundelBlock DARK_GREEN_ROUNDEL = null;
    public static final RoundelBlock YELLOW_ROUNDEL = null;
    public static final RoundelBlock GOLD_ROUNDEL = null;
    public static final RoundelBlock RED_ROUNDEL = null;
    public static final RoundelBlock DARK_RED_ROUNDEL = null;
    public static final Block CLASSIC_ROUNDEL = null;
    public static final Item ADIPOSE_PILL = null;
    public static final Item LASER = null;

    private DWMItems() {}

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "black_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "dark_gray_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "gray_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "white_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "dark_purple_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "light_purple_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "blue_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "dark_blue_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "dark_aqua_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "aqua_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "green_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "dark_green_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "yellow_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "gold_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "red_roundel"),
                new RoundelBlock().setRegistryName(DWMMain.MOD_ID, "dark_red_roundel")
        );
    }

    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties().group(ItemGroup.BREWING).food(DWMFoods.PILL)).setRegistryName(DWMMain.MOD_ID, "adipose_pill"),
                new SwordItem(ItemTier.WOOD, 2, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(DWMMain.MOD_ID, "cricket_bat"),
                new ItemTwoDis().setRegistryName(DWMMain.MOD_ID, "two_dis"),
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver"),
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_third"),
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_ten"),
                new ItemSonicScrewdriver().setRegistryName(DWMMain.MOD_ID, "sonic_lipstick"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "black_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "blue_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "brown_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "cyan_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "green_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "grey_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "light_blue_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "light_grey_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "lime_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "magenta_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "orange_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "pink_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "purple_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "red_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "white_fez"),
                new HatItem().setRegistryName(DWMMain.MOD_ID, "yellow_fez"),
                new Item(new Item.Properties()).setRegistryName(DWMMain.MOD_ID, "laser"),
                new DWMSpawnerItem(DWMEntities.ADIPOSE),
                new DWMSpawnerItem(DWMEntities.TIME_WAR_DALEK),
                new BlockItem(BLACK_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "black_roundel"),
                new BlockItem(DARK_GRAY_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "dark_gray_roundel"),
                new BlockItem(GRAY_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "gray_roundel"),
                new BlockItem(WHITE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "white_roundel"),
                new BlockItem(DARK_PURPLE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "dark_purple_roundel"),
                new BlockItem(LIGHT_PURPLE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "light_purple_roundel"),
                new BlockItem(BLUE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "blue_roundel"),
                new BlockItem(DARK_BLUE_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "dark_blue_roundel"),
                new BlockItem(DARK_AQUA_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "dark_aqua_roundel"),
                new BlockItem(AQUA_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "aqua_roundel"),
                new BlockItem(GREEN_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "green_roundel"),
                new BlockItem(DARK_GREEN_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "dark_green_roundel"),
                new BlockItem(YELLOW_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "yellow_roundel"),
                new BlockItem(GOLD_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "gold_roundel"),
                new BlockItem(RED_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "red_roundel"),
                new BlockItem(DARK_RED_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "dark_red_roundel"),
                new BlockItem(CLASSIC_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "classic_roundel")
        );
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.addSpecialModel(ResourceLocation.tryCreate("dwm:models/block/classic_roundel.obj"));
    }

}
