package com.softetch.dwm;

import com.softetch.dwm.common.item.gadget.ItemSonicScrewdriver;
import com.softetch.dwm.common.item.gadget.ItemTwoDis;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
    public static Item sonicScrewdriver;
    public static Item twoDis;

    public static Block ironOxideDust;

    /**
     * The actual event handler that registers the custom items
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                sonicScrewdriver = new ItemSonicScrewdriver().setRegistryName(new ResourceLocation(DWMMain.MOD_ID, "sonic_screwdriver")),
                twoDis = new ItemTwoDis().setRegistryName(new ResourceLocation(DWMMain.MOD_ID, "two_dis"))
        );
    }

    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                ironOxideDust = new SandBlock(11098145, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)).setRegistryName(DWMMain.MOD_ID, "iron_oxide_dust")
        );
    }

}
