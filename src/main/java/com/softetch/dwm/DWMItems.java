package com.softetch.dwm;

import com.softetch.dwm.common.block.*;
import com.softetch.dwm.common.block.trees.AshTree;
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
    public static final Block PLASTIC_ORE = null;
    public static final Block STONE_ROUNDEL = null;

    public static final Block ASH_LOG = null;
    public static final Block ASH_PLANKS = null;
    public static final Block ASH_LEAVES = null;
    public static final Block ASH_SAPLING = null;

    public static final Block GALLIFREY_DIRT = null;
    public static final Block GALLIFREY_FARMLAND = null;
    public static final Block GALLIFREY_COARSE_DIRT = null;
    public static final Block GALLIFREY_GRASS_BLOCK = null;
    public static final Block GALLIFREY_GRASS_PATH = null;

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
                // Gallifrey
                addBlock("ash_log", new DWMLogBlock(MaterialColor.SAND, Block.Properties.create(Material.WOOD, MaterialColor.QUARTZ).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("ash_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("ash_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS),
                addBlock("ash_leaves", new DWMLeavesBlock(), ItemGroup.DECORATIONS),
                addBlock("ash_sapling", new DWMSaplingBlock(new AshTree()), ItemGroup.DECORATIONS),
                addBlock("ash_trapdoor", new DWMTrapDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()), ItemGroup.REDSTONE),
                addBlock("azbantium_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("azbantium_block", new Block(Block.Properties.create(Material.ROCK, MaterialColor.IRON).hardnessAndResistance(60.0F, 1300.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_block_a", new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_block_b", new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_block_c", new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), ItemGroup.BUILDING_BLOCKS),
                addBlock("citadel_glass", new GlassBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_stone", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_stone_slab", new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_stone_bricks", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_cracked_stone_bricks", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("dwarf_star_alloy_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("dwarf_star_alloy_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_dirt", new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_farmland", new GallifreyFarmlandBlock(), null),
                addBlock("gallifrey_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_sandstone_slab", new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_chiseled_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_cut_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_cut_sandstone_slab", new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_coal_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_iron_ore", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_coarse_dirt", new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_sand", new SandBlock(0xba3c3c, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)), ItemGroup.BUILDING_BLOCKS),
                addBlock("plutarch", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_grass_block", new DWMGrassBlock(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)), ItemGroup.BUILDING_BLOCKS),
                addBlock("gallifrey_grass_path", new DWMGrassPathBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.65F).sound(SoundType.PLANT)), null),

                // Plastic Blocks
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
                addBlock("black_plastic_block",new Block(Block.Properties.create(Material.WOOL, DyeColor.BLACK)), ItemGroup.BUILDING_BLOCKS),

                addBlock("plastic_ore",new DWMOreBlock(), ItemGroup.BUILDING_BLOCKS)
        );

        registerBlockProperties();
    }

    private static void registerBlockProperties() {
        ((FireBlock)Blocks.FIRE).setFireInfo(ASH_PLANKS, 5, 20);
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
        blocksWithItems.entrySet().forEach(block ->
                event.getRegistry().register(new BlockItem(block.getKey(), new Item.Properties().group(block.getValue())).setRegistryName(block.getKey().getRegistryName()))
        );
    }

}
