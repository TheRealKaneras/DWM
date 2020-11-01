package com.softetch.dwm;

import com.softetch.dwm.common.block.*;
import com.softetch.dwm.common.block.trees.AshTree;
import com.softetch.dwm.common.block.trees.CardinalTree;
import com.softetch.dwm.common.block.trees.DarkAshTree;
import com.softetch.dwm.common.block.trees.SoulTree;
import com.softetch.dwm.common.item.DWMSpawnerItem;
import com.softetch.dwm.common.item.TardisKeyItem;
import com.softetch.dwm.common.item.clothing.FezItem;
import com.softetch.dwm.common.item.gadget.SonicScrewdriverItem;
import com.softetch.dwm.common.item.gadget.TwoDisItem;
import com.softetch.dwm.common.item.gadget.VortexManipulatorItem;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    // Console Communications
    public static final Item MONITOR_SWITCH = null;
    public static final Item DISTRESS_CALL_RECEIVER = null;
    public static final Item TELEPATHIC_CIRCUIT = null;

    // Console Fabrication
    public static final Item SHIELDS_LEVER = null;
    public static final Item CLOAK_LEVER = null;
    public static final Item DOOR_LOCK = null;
    public static final Item DOOR_SWITCH = null;
    public static final Item CHAMELEON_CIRCUIT_BUTTON = null;

    // Console Helm
    public static final Item FAST_RETURN = null;
    public static final Item MATERIALISATION_LEVER = null;
    public static final Item STABILISER_BUTTON = null;

    // Console Navigation
    public static final Item BIOME_SELECTOR = null;
    public static final Item COORDINATE_LOCK = null;
    public static final Item PLANET_LOCATOR = null;
    public static final Item PLAYER_LOCATOR = null;
    public static final Item WAYPOINT_SELECTOR = null;

    // Console Environmental Instruments
    public static final Item DIAGNOSTIC_SCAN_LEVER = null;
    public static final Item PREFERENCES_BUTTON = null;
    public static final Item OXYGEN_READER = null;
    public static final Item PRESSURE_READER = null;
    public static final Item RADIATION_LEVER = null;
    public static final Item REFUELER = null;
    public static final Item TEMPERATURE_READER = null;

    // Console Misc
    public static final Item LIGHT_SWITCH = null;
    public static final Item MISC_LEVER = null;
    public static final Item DISPLAY = null;

    // Console Top Parts
    public static final Item PANEL_COVER = null;
    public static final Item TOP_VENT = null;

    public static final Block PLASTIC_ORE = null;
    public static final Block STONE_ROUNDEL = null;

    public static final Block ASH_LOG = null;
    public static final Block DARK_ASH_LOG = null;
    public static final Block CARDINAL_LOG = null;
    public static final Block SOUL_LOG = null;
    public static final Block ASH_PLANKS = null;
    public static final Block DARK_ASH_PLANKS = null;
    public static final Block CARDINAL_PLANKS = null;
    public static final Block ASH_LEAVES = null;
    public static final Block DARK_ASH_LEAVES = null;
    public static final Block CARDINAL_LEAVES = null;
    public static final Block SOUL_LEAVES = null;
    public static final Block ASH_SAPLING = null;
    public static final Block DARK_ASH_SAPLING = null;
    public static final Block CARDINAL_SAPLING = null;
    public static final Block SOUL_SAPLING = null;

    public static final Block GALLIFREY_STONE = null;
    public static final Block GALLIFREY_DIRT = null;
    public static final Block GALLIFREY_FARMLAND = null;
    public static final Block GALLIFREY_COARSE_DIRT = null;
    public static final Block GALLIFREY_GRASS_BLOCK = null;
    public static final Block GALLIFREY_GRASS_PATH = null;
    public static final Block GALLIFREY_SAND = null;

    public static final Block CITADEL_GLASS = null;

    public static final Block GALLIFREY_COAL_ORE = null;
    public static final Block GALLIFREY_IRON_ORE = null;
    public static final Block DWARF_STAR_ALLOY_ORE = null;
    public static final Block WHITE_POINT_STAR_ORE = null;
    public static final Block AZBANTIUM_ORE = null;

    public static List<Block> tardises = new ArrayList<>();
    private static final HashMap<Block, ItemGroup> blocksWithItems = new HashMap<>();

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        DWMMain.CHAMELEON_REGISTRY.TARDIS_SKINS.values().forEach(tardis ->
                event.getRegistry().register(addBlock("tardis_" + tardis.getName(), new TardisExteriorBlock(tardis.getName()), ItemGroup.TRANSPORTATION))
        );
        event.getRegistry().registerAll(
                addBlock("ash_log", new DWMLogBlock(MaterialColor.SAND, Block.Properties.create(Material.WOOD, MaterialColor.QUARTZ).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("dark_ash_log", new DWMLogBlock(MaterialColor.GRAY, Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("cardinal_log", new DWMLogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0f).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("soul_log", new DWMLogBlock(MaterialColor.GRAY, Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0f).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("ash_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("dark_ash_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("cardinal_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("ash_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("dark_ash_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("cardinal_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("ash_leaves", new DWMLeavesBlock(false), ItemGroup.DECORATIONS),
                addBlock("dark_ash_leaves", new DWMLeavesBlock(false), ItemGroup.DECORATIONS),
                addBlock("cardinal_leaves", new DWMLeavesBlock(false), ItemGroup.DECORATIONS),
                addBlock("soul_leaves", new DWMLeavesBlock(true), ItemGroup.DECORATIONS),
                addBlock("ash_sapling", new DWMSaplingBlock(new AshTree()), ItemGroup.DECORATIONS),
                addBlock("dark_ash_sapling", new DWMSaplingBlock(new DarkAshTree()), ItemGroup.DECORATIONS),
                addBlock("cardinal_sapling", new DWMSaplingBlock(new CardinalTree()), ItemGroup.DECORATIONS),
                addBlock("soul_sapling", new DWMSaplingBlock(new SoulTree()), ItemGroup.DECORATIONS),
                addBlock("ash_trapdoor", new DWMTrapDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()), ItemGroup.REDSTONE),
                addBlock("gallifrey_stone", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_stone_slab", new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_stone_bricks", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_cracked_stone_bricks", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_dirt", new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_farmland", new DWMFarmlandBlock(GALLIFREY_DIRT), null),
                addBlock("gallifrey_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_sandstone_slab", new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_chiseled_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_cut_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_cut_sandstone_slab", new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_coarse_dirt", new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_sand", new SandBlock(0xba3c3c, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_grass_block", new DWMGrassBlock(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_grass_path", new DWMGrassPathBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.65F).sound(SoundType.PLANT)), null),
                addBlock("plutarch", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F)), ItemGroup.BUILDING_BLOCKS),

                addBlock("citadel_block_a", new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_block_b", new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_block_c", new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_glass", new GlassBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()), ItemGroup.BUILDING_BLOCKS),

                addBlock("plastic_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_coal_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_iron_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("dwarf_star_alloy_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("white_point_star_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).lightValue(3)), ItemGroup.BUILDING_BLOCKS),
                addBlock("azbantium_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),

                addBlock("dwarf_star_alloy_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("azbantium_block", new Block(Block.Properties.create(Material.ROCK, MaterialColor.IRON).hardnessAndResistance(60.0F, 1300.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("white_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.WHITE)), ItemGroup.BUILDING_BLOCKS),
                addBlock("orange_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.ORANGE)), ItemGroup.BUILDING_BLOCKS),
                addBlock("magenta_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.MAGENTA)), ItemGroup.BUILDING_BLOCKS),
                addBlock("light_blue_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.LIGHT_BLUE)), ItemGroup.BUILDING_BLOCKS),
                addBlock("yellow_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.YELLOW)), ItemGroup.BUILDING_BLOCKS),
                addBlock("lime_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.LIME)), ItemGroup.BUILDING_BLOCKS),
                addBlock("pink_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.PINK)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gray_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.GRAY)), ItemGroup.BUILDING_BLOCKS),
                addBlock("light_gray_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.LIGHT_GRAY)), ItemGroup.BUILDING_BLOCKS),
                addBlock("cyan_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.CYAN)), ItemGroup.BUILDING_BLOCKS),
                addBlock("purple_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.PURPLE)), ItemGroup.BUILDING_BLOCKS),
                addBlock("blue_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.BLUE)), ItemGroup.BUILDING_BLOCKS),
                addBlock("brown_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.BROWN)), ItemGroup.BUILDING_BLOCKS),
                addBlock("green_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.GREEN)), ItemGroup.BUILDING_BLOCKS),
                addBlock("red_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.RED)), ItemGroup.BUILDING_BLOCKS),
                addBlock("black_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.BLACK)), ItemGroup.BUILDING_BLOCKS)

        );

        registerFireInfo();
    }

    private static void registerFireInfo() {
        ((FireBlock)Blocks.FIRE).setFireInfo(ASH_PLANKS, 5, 20);
        ((FireBlock)Blocks.FIRE).setFireInfo(DARK_ASH_PLANKS, 5, 20);
        ((FireBlock)Blocks.FIRE).setFireInfo(CARDINAL_PLANKS, 5, 20);
        ((FireBlock)Blocks.FIRE).setFireInfo(ASH_LEAVES, 30, 60);
        ((FireBlock)Blocks.FIRE).setFireInfo(DARK_ASH_LEAVES, 30, 60);
        ((FireBlock)Blocks.FIRE).setFireInfo(CARDINAL_LEAVES, 30, 60);
    }

    private static Block addBlock(String registryName, Block block, ItemGroup itemGroup, boolean createItem) {
        block.setRegistryName(DWMMain.MOD_ID, registryName);
        if (block instanceof TardisExteriorBlock) {
            tardises.add(block);
        }
        if (createItem) {
            blocksWithItems.put(block, itemGroup);
        }
        return block;
    }

    private static Block addBlock(String registryName, Block block, ItemGroup itemGroup) {
        return addBlock(registryName, block, itemGroup, true);
    }

    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                addFoodItem("adipose_pill", ItemGroup.BREWING, DWMFoods.PILL),
                addFoodItem("scooby_snack", ItemGroup.FOOD, DWMFoods.SCOOBY_SNACK),

                addItem("adipose_material", ItemGroup.MATERIALS),
                addItem("gelatin", ItemGroup.MATERIALS),
                addItem("white_point_star", ItemGroup.MATERIALS),
                addItem("dwarf_star_alloy_ingot", ItemGroup.MATERIALS),
                addItem("dwarf_star_alloy_nugget", ItemGroup.MATERIALS),

                addItem("white_plastic", ItemGroup.MATERIALS),
                addItem("orange_plastic", ItemGroup.MATERIALS),
                addItem("magenta_plastic", ItemGroup.MATERIALS),
                addItem("light_blue_plastic", ItemGroup.MATERIALS),
                addItem("yellow_plastic", ItemGroup.MATERIALS),
                addItem("lime_plastic", ItemGroup.MATERIALS),
                addItem("pink_plastic", ItemGroup.MATERIALS),
                addItem("gray_plastic", ItemGroup.MATERIALS),
                addItem("light_gray_plastic", ItemGroup.MATERIALS),
                addItem("cyan_plastic", ItemGroup.MATERIALS),
                addItem("purple_plastic", ItemGroup.MATERIALS),
                addItem("blue_plastic", ItemGroup.MATERIALS),
                addItem("brown_plastic", ItemGroup.MATERIALS),
                addItem("green_plastic", ItemGroup.MATERIALS),
                addItem("red_plastic", ItemGroup.MATERIALS),
                addItem("black_plastic", ItemGroup.MATERIALS),

                addItem("cricket_bat", new SwordItem(ItemTier.WOOD, 2, -2.4f, new Item.Properties().group(ItemGroup.COMBAT))),
                addItem("two_dis", new TwoDisItem()),
                addItem("vortex_manipulator", new VortexManipulatorItem()),
                addItem("sonic_second_doctor", new SonicScrewdriverItem()),
                addItem("sonic_third_doctor", new SonicScrewdriverItem()),
                addItem("sonic_fourth_doctor", new SonicScrewdriverItem()),
                addItem("sonic_fifth_doctor", new SonicScrewdriverItem()),
                addItem("sonic_seventh_doctor", new SonicScrewdriverItem()),
                addItem("fez", new FezItem()),
                addItem("tardis_gold_key", new TardisKeyItem()),
                addItem("laser", new Item(new Item.Properties())),
                addItem("adipose_spawner", new DWMSpawnerItem(DWMEntities.ADIPOSE))
        );
        blocksWithItems.entrySet().forEach(block ->
                event.getRegistry().register(new BlockItem(block.getKey(), new Item.Properties().group(block.getValue())).setRegistryName(block.getKey().getRegistryName()))
        );
    }

    private static Item addFoodItem(String name, ItemGroup group, Food food) {
        return addItem(name, new Item(new Item.Properties().group(group).food(food)));
    }

    private static Item addItem(String name, ItemGroup group) {
        return addItem(name, new Item(new Item.Properties().group(group)));
    }

    private static Item addItem(String name, Item item) {
        return item.setRegistryName(DWMMain.MOD_ID, name);
    }

}
