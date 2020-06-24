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
    public static final Block ASH_LEAVES = null;
    public static final Block ASH_SAPLING = null;

    public static final Block GALLIFREY_DIRT = null;
    public static final Block GALLIFREY_FARMLAND = null;
    public static final Block GALLIFREY_COARSE_DIRT = null;

    public static List<Block> tardises = new ArrayList<>();
    private static final HashMap<Block, ItemGroup> blocks = new HashMap<>();

    /**
     * The actual event handler that registers the custom blocks
     * @param event The event this event handler handles
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        DWMMain.CHAMELEON_REGISTRY.TARDIS_SKINS.values().forEach(tardis ->
                event.getRegistry().register(addBlock(new TardisExteriorBlock(tardis.getName()), "tardis_" + tardis.getName(), ItemGroup.TRANSPORTATION))
        );
        event.getRegistry().registerAll(
                // Gallifrey Update
                addBlock(new DWMLogBlock(MaterialColor.SAND, Block.Properties.create(Material.WOOD, MaterialColor.QUARTZ).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "ash_log", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "ash_planks", ItemGroup.BUILDING_BLOCKS),
                addBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "ash_slab", ItemGroup.BUILDING_BLOCKS),
                addBlock(new DWMLeavesBlock(), "ash_leaves", ItemGroup.DECORATIONS),
                addBlock(new DWMSaplingBlock(new AshTree()), "ash_sapling", ItemGroup.DECORATIONS),
                addBlock(new DWMTrapDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()), "ash_trapdoor", ItemGroup.REDSTONE),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "azbantium_ore", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.IRON).hardnessAndResistance(60.0F, 1300.0F)), "azbantium_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), "citadel_block_a", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), "citadel_block_b", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), "citadel_block_c", ItemGroup.BUILDING_BLOCKS),
                addBlock(new GlassBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()), "citadel_glass", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), "gallifrey_stone", ItemGroup.BUILDING_BLOCKS),
                addBlock(new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), "gallifrey_stone_slab", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), "gallifrey_stone_bricks", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), "gallifrey_cracked_stone_bricks", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "dwarf_star_alloy_ore", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F)), "dwarf_star_alloy_block", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)), "gallifrey_dirt", ItemGroup.BUILDING_BLOCKS),
                addBlock(new GallifreyFarmlandBlock(), "gallifrey_farmland", null),
                addBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), "gallifrey_sandstone", ItemGroup.BUILDING_BLOCKS),
                addBlock(new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), "gallifrey_sandstone_slab", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), "gallifrey_chiseled_sandstone", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), "gallifrey_cut_sandstone", ItemGroup.BUILDING_BLOCKS),
                addBlock(new SlabBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)), "gallifrey_cut_sandstone_slab", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "gallifrey_coal_ore", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "gallifrey_iron_ore", ItemGroup.BUILDING_BLOCKS),
                addBlock(new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)), "gallifrey_coarse_dirt", ItemGroup.BUILDING_BLOCKS),
                addBlock(new SandBlock(0xba3c3c, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)), "gallifrey_sand", ItemGroup.BUILDING_BLOCKS),

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
    }

    private static Block addBlock(Block block, String registryName, ItemGroup itemGroup) {
        block.setRegistryName(DWMMain.MOD_ID, registryName);
        if (block instanceof TardisExteriorBlock) {
            tardises.add(block);
        }
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
        blocks.entrySet().forEach(block ->
                event.getRegistry().register(new BlockItem(block.getKey(), new Item.Properties().group(block.getValue())).setRegistryName(block.getKey().getRegistryName()))
        );
    }

}
