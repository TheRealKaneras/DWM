package com.softetch.dwm;

import com.softetch.dwm.client.tardis.ChameleonRegistry;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.block.DWMOreBlock;
import com.softetch.dwm.common.block.RoundelBlock;
import com.softetch.dwm.common.block.RoundelLanternBlock;
import com.softetch.dwm.common.block.TardisExteriorBlock;
import com.softetch.dwm.common.item.DWMSpawnerItem;
import com.softetch.dwm.common.item.TardisKeyItem;
import com.softetch.dwm.common.item.clothing.FezItem;
import com.softetch.dwm.common.item.gadget.SonicScrewdriverItem;
import com.softetch.dwm.common.item.gadget.TwoDisItem;
import com.softetch.dwm.common.item.gadget.VortexManipulatorItem;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class has the register event handler for all custom items
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DWMMain.MOD_ID)
public class DWMItems {
    public static final Item ADIPOSE_PILL = null;
    public static final Item GELATIN = null;
    public static final Item ADIPOSE_MATERIAL = null;
    public static final Block PLASTIC_ORE = null;

    public static List<Block> tardises = new ArrayList<>();
    private static final HashMap<Block, ItemGroup> blocks = new HashMap<>();

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        for (AbstractChameleonData tardis : ChameleonRegistry.TARDIS_SKINS.values()) {
            tardises.add(new TardisExteriorBlock(tardis.getName()).setRegistryName(DWMMain.MOD_ID, "tardis_" + tardis.getName()));
        }
        event.getRegistry().registerAll(
                addBlock(new RoundelBlock(false), "white_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "orange_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "magenta_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "light_blue_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "yellow_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "lime_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "pink_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "gray_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "light_gray_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "cyan_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "purple_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "blue_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "brown_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "green_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "red_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(false), "black_roundel", ItemGroup.DECORATIONS),

                addBlock(new RoundelBlock(false), "hartnell_roundel", ItemGroup.DECORATIONS),
                addBlock(new RoundelBlock(true), "hartnell_roundel_split", ItemGroup.DECORATIONS),

                addBlock(new RoundelLanternBlock(),"sea_roundel_oak", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_spruce", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_birch", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_jungle", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_acacia", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_dark_oak", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_oak", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_spruce", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_birch", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_jungle", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_acacia", ItemGroup.DECORATIONS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_dark_oak", ItemGroup.DECORATIONS),

                addBlock(new DWMOreBlock(),"plastic_ore", ItemGroup.BUILDING_BLOCKS)
        );
        event.getRegistry().registerAll(tardises.toArray(new Block[tardises.size()]));
    }

    private static Block addBlock(Block block, String registryName, ItemGroup itemGroup) {
        block.setRegistryName(DWMMain.MOD_ID, registryName);
        blocks.put(block, itemGroup);
        return block;
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

                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "white_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "orange_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "magenta_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "light_blue_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "yellow_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "lime_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "pink_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "gray_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "light_gray_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "cyan_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "purple_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "blue_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "brown_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "green_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "red_plastic"),
                new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(DWMMain.MOD_ID, "black_plastic"),

                new SwordItem(ItemTier.WOOD, 2, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(DWMMain.MOD_ID, "cricket_bat"),
                new TwoDisItem().setRegistryName(DWMMain.MOD_ID, "two_dis"),
                new VortexManipulatorItem().setRegistryName(DWMMain.MOD_ID, "vortex_manipulator"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_third"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_screwdriver_ten"),
                new SonicScrewdriverItem().setRegistryName(DWMMain.MOD_ID, "sonic_lipstick"),
                new FezItem().setRegistryName(DWMMain.MOD_ID, "fez"),
                new TardisKeyItem().setRegistryName(DWMMain.MOD_ID, "tardis_gold_key"),
                new Item(new Item.Properties()).setRegistryName(DWMMain.MOD_ID, "laser"),
                new DWMSpawnerItem(DWMEntities.ADIPOSE)
        );
        for (Map.Entry<Block, ItemGroup> block : blocks.entrySet()) {
            event.getRegistry().register(new BlockItem(block.getKey(), new Item.Properties().group(block.getValue())).setRegistryName(block.getKey().getRegistryName()));
        }
        for (Block tardis : tardises) {
            event.getRegistry().register(new BlockItem(tardis, new Item.Properties().group(ItemGroup.TRANSPORTATION).maxStackSize(1)).setRegistryName(tardis.getRegistryName()));
        }
    }

}
