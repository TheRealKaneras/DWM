package com.softetch.dwm;

import com.softetch.dwm.client.tardis.ChameleonRegistry;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.block.RoundelBlock;
import com.softetch.dwm.common.block.TardisBlock;
import com.softetch.dwm.common.item.DWMSpawnerItem;
import com.softetch.dwm.common.item.TardisKeyItem;
import com.softetch.dwm.common.item.clothing.FezItem;
import com.softetch.dwm.common.item.gadget.SonicScrewdriverItem;
import com.softetch.dwm.common.item.gadget.TwoDisItem;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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
    public static final RoundelBlock HARTNELL_ROUNDEL = null;
    public static final RoundelBlock HARTNELL_ROUNDEL_SPLIT = null;
    public static final Item ADIPOSE_PILL = null;
    public static final Item GELATIN = null;
    public static final Item ADIPOSE_MATERIAL = null;

    public static List<Block> tardises = new ArrayList<>();

    private DWMItems() {}

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        for (AbstractChameleonData tardis : ChameleonRegistry.TARDIS_SKINS.values()) {
            tardises.add(new TardisBlock(tardis.getName()).setRegistryName(DWMMain.MOD_ID, "tardis_" + tardis.getName()));
        }
        event.getRegistry().registerAll(
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "black_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "dark_gray_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "gray_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "white_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "dark_purple_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "light_purple_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "blue_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "dark_blue_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "dark_aqua_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "aqua_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "green_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "dark_green_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "yellow_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "gold_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "red_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "dark_red_roundel"),
                new RoundelBlock(false).setRegistryName(DWMMain.MOD_ID, "hartnell_roundel"),
                new RoundelBlock(true).setRegistryName(DWMMain.MOD_ID, "hartnell_roundel_split")
        );
        event.getRegistry().registerAll(tardises.toArray(new Block[tardises.size()]));
    }

    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties().group(ItemGroup.BREWING).food(DWMFoods.PILL)).setRegistryName(DWMMain.MOD_ID, "adipose_pill"),
                new Item(new Item.Properties().group(ItemGroup.FOOD).food(DWMFoods.SCOOBY_SNACK)).setRegistryName(DWMMain.MOD_ID, "scooby_snack"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "adipose_material"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "gelatin"),
                new SwordItem(ItemTier.WOOD, 2, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(DWMMain.MOD_ID, "cricket_bat"),
                new TwoDisItem().setRegistryName(DWMMain.MOD_ID, "two_dis"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_third"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_ten"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_lipstick"),
                new FezItem(Color.decode("#141519")).setRegistryName(DWMMain.MOD_ID, "black_fez"),
                new FezItem(Color.decode("#35399D")).setRegistryName(DWMMain.MOD_ID, "blue_fez"),
                new FezItem(Color.decode("#724728")).setRegistryName(DWMMain.MOD_ID, "brown_fez"),
                new FezItem(Color.decode("#158991")).setRegistryName(DWMMain.MOD_ID, "cyan_fez"),
                new FezItem(Color.decode("#546D1B")).setRegistryName(DWMMain.MOD_ID, "green_fez"),
                new FezItem(Color.decode("#3E4447")).setRegistryName(DWMMain.MOD_ID, "grey_fez"),
                new FezItem(Color.decode("#3AAFD9")).setRegistryName(DWMMain.MOD_ID, "light_blue_fez"),
                new FezItem(Color.decode("#8E8E86")).setRegistryName(DWMMain.MOD_ID, "light_grey_fez"),
                new FezItem(Color.decode("#70B919")).setRegistryName(DWMMain.MOD_ID, "lime_fez"),
                new FezItem(Color.decode("#BD44B3")).setRegistryName(DWMMain.MOD_ID, "magenta_fez"),
                new FezItem(Color.decode("#F07613")).setRegistryName(DWMMain.MOD_ID, "orange_fez"),
                new FezItem(Color.decode("#BD44B3")).setRegistryName(DWMMain.MOD_ID, "pink_fez"),
                new FezItem(Color.decode("#7E3DB5")).setRegistryName(DWMMain.MOD_ID, "purple_fez"),
                new FezItem(Color.decode("#A12722")).setRegistryName(DWMMain.MOD_ID, "red_fez"),
                new FezItem(Color.decode("#E9ECEC")).setRegistryName(DWMMain.MOD_ID, "white_fez"),
                new FezItem(Color.decode("#F8C627")).setRegistryName(DWMMain.MOD_ID, "yellow_fez"),
                new TardisKeyItem().setRegistryName(DWMMain.MOD_ID, "tardis_gold_key"),
                new Item(new Item.Properties()).setRegistryName(DWMMain.MOD_ID, "laser"),
                new DWMSpawnerItem(DWMEntities.ADIPOSE),
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
                new BlockItem(HARTNELL_ROUNDEL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "hartnell_roundel"),
                new BlockItem(HARTNELL_ROUNDEL_SPLIT, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(DWMMain.MOD_ID, "hartnell_roundel_split")
        );
        for (Block tardis : tardises) {
            event.getRegistry().register(new BlockItem(tardis, new Item.Properties().group(ItemGroup.TRANSPORTATION).maxStackSize(1)).setRegistryName(tardis.getRegistryName()));
        }
    }

}
