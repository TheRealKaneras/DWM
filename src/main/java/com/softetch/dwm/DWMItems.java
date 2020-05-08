package com.softetch.dwm;

import com.softetch.dwm.client.tardis.ChameleonRegistry;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.block.*;
import com.softetch.dwm.common.item.DWMSpawnerItem;
import com.softetch.dwm.common.item.TardisKeyItem;
import com.softetch.dwm.common.item.clothing.FezItem;
import com.softetch.dwm.common.item.gadget.SonicScrewdriverItem;
import com.softetch.dwm.common.item.gadget.TwoDisItem;
import com.softetch.dwm.common.item.gadget.VortexManipulatorItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
    public static final Block STONE_ROUNDEL = null;

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
                // Regular Roundels
                addBlock(new RoundelBlock(), "white_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "orange_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "magenta_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "light_blue_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "yellow_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "lime_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "pink_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "gray_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "light_gray_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "cyan_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "purple_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "blue_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "brown_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "green_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "red_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "black_roundel", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelBlock(), "oak_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "spruce_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "birch_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "jungle_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "acacia_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "dark_oak_roundel", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelBlock(), "oak_log_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "spruce_log_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "birch_log_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "jungle_log_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "acacia_log_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "dark_oak_log_roundel", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelBlock(), "stripped_oak_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "stripped_spruce_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "stripped_birch_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "stripped_jungle_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "stripped_acacia_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "stripped_dark_oak_roundel", DWMItemGroups.ROUNDELS),
                
                addBlock(new RoundelBlock(), "stone_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "smooth_stone_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "granite_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "andesite_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "diorite_roundel", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelBlock(), "ice_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "packed_ice_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "frosted_ice_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "blue_ice_roundel", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelBlock(), "netherrack_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "netherbrick_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "magma_roundel", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelBlock(), "iron_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "gold_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "diamond_roundel", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelBlock(), "lapis_roundel", DWMItemGroups.ROUNDELS),

                // Split

                addBlock(new RoundelSplitBlock(), "white_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "orange_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "magenta_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "light_blue_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "yellow_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "lime_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "pink_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "gray_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "light_gray_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "cyan_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "purple_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "blue_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "brown_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "green_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "red_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "black_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "oak_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "spruce_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "birch_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "jungle_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "acacia_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "dark_oak_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "oak_log_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "spruce_log_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "birch_log_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "jungle_log_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "acacia_log_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "dark_oak_log_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "stripped_oak_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "stripped_spruce_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "stripped_birch_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "stripped_jungle_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "stripped_acacia_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "stripped_dark_oak_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "stone_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "smooth_stone_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "granite_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "andesite_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "diorite_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "ice_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "packed_ice_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "frosted_ice_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "blue_ice_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "netherrack_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "netherbrick_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "magma_roundel_split", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelSplitBlock(), "iron_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "gold_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "diamond_roundel_split", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelSplitBlock(), "lapis_roundel_split", DWMItemGroups.ROUNDELS),
                
                // Roundel Lamps

                // Glowstone

                addBlock(new RoundelLampBlock(), "white_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "orange_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "magenta_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "light_blue_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "yellow_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "lime_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "pink_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "gray_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "light_gray_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "cyan_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "purple_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "blue_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "brown_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "green_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "red_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "black_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "oak_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "spruce_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "birch_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "jungle_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "acacia_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "dark_oak_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "oak_log_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "spruce_log_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "birch_log_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "jungle_log_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "acacia_log_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "dark_oak_log_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "stripped_oak_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "stripped_spruce_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "stripped_birch_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "stripped_jungle_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "stripped_acacia_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "stripped_dark_oak_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "stone_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "smooth_stone_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "granite_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "andesite_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "diorite_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "ice_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "packed_ice_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "frosted_ice_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "blue_ice_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "netherrack_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "netherbrick_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "magma_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelLampBlock(), "iron_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "gold_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "diamond_roundel_glowlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelLampBlock(), "lapis_roundel_glowlamp", DWMItemGroups.ROUNDELS),

                // Redstone Lamp

                addBlock(new RoundelRedstoneLampBlock(), "white_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "orange_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "magenta_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "light_blue_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "yellow_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "lime_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "pink_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "gray_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "light_gray_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "cyan_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "purple_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "blue_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "brown_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "green_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "red_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "black_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "oak_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "spruce_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "birch_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "jungle_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "acacia_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "dark_oak_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "oak_log_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "spruce_log_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "birch_log_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "jungle_log_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "acacia_log_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "dark_oak_log_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "stripped_oak_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "stripped_spruce_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "stripped_birch_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "stripped_jungle_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "stripped_acacia_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "stripped_dark_oak_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "stone_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "smooth_stone_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "granite_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "andesite_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "diorite_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "ice_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "packed_ice_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "frosted_ice_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "blue_ice_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "netherrack_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "netherbrick_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "magma_roundel_redlamp", DWMItemGroups.ROUNDELS),

                addBlock(new RoundelRedstoneLampBlock(), "iron_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "gold_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "diamond_roundel_redlamp", DWMItemGroups.ROUNDELS),
                addBlock(new RoundelRedstoneLampBlock(), "lapis_roundel_redlamp", DWMItemGroups.ROUNDELS),

                // Special Roundels
                
                addBlock(new RoundelBlock(), "hartnell_roundel", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelSplitBlock(), "hartnell_roundel_split", ItemGroup.BUILDING_BLOCKS),

                addBlock(new RoundelLanternBlock(),"sea_roundel_oak", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_spruce", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_birch", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_jungle", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_acacia", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"sea_roundel_dark_oak", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_oak", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_spruce", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_birch", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_jungle", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_acacia", ItemGroup.BUILDING_BLOCKS),
                addBlock(new RoundelLanternBlock(),"glowstone_roundel_dark_oak", ItemGroup.BUILDING_BLOCKS),

                // Plastic Blocks

                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.WHITE)),"white_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.ORANGE)),"orange_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.MAGENTA)),"magenta_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.LIGHT_BLUE)),"light_blue_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.YELLOW)),"yellow_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.LIME)),"lime_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.PINK)),"pink_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.GRAY)),"gray_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.LIGHT_GRAY)),"light_gray_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.CYAN)),"cyan_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.PURPLE)),"purple_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.BLUE)),"blue_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.BROWN)),"brown_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.GREEN)),"green_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.RED)),"red_plastic_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOL, DyeColor.BLACK)),"black_plastic_block", ItemGroup.BUILDING_BLOCKS),

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
