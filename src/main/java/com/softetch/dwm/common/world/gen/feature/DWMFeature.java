package com.softetch.dwm.common.world.gen.feature;

import com.softetch.dwm.DWMMain;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DWMFeature {
    public static Feature<ModOreFeatureConfig> MOD_ORE = register("mod_ore", new ModOreFeature(ModOreFeatureConfig::deserialize));
    public static Feature<BasicTreeFeatureConfig> ASH_TREE = register("ash_tree", new BasicTreeFeature(BasicTreeFeatureConfig::deserializeAsh));
    public static Feature<BasicTreeFeatureConfig> DARK_ASH_TREE = register("dark_ash_tree", new BasicTreeFeature(BasicTreeFeatureConfig::deserializeDarkAsh));
    public static Feature<BasicTreeFeatureConfig> CARDINAL_TREE = register("cardinal_tree", new BasicTreeFeature(BasicTreeFeatureConfig::deserializeCardinal));
    public static Feature<BasicTreeFeatureConfig> SOUL_TREE = register("soul_tree", new BasicTreeFeature(BasicTreeFeatureConfig::deserializeSoul));

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        event.getRegistry().registerAll(MOD_ORE, ASH_TREE, DARK_ASH_TREE, CARDINAL_TREE);
    }

    private static <T extends IFeatureConfig> Feature<T> register(String name, Feature<T> feature) {
        feature.setRegistryName(new ResourceLocation(DWMMain.MOD_ID, name));
        return feature;
    }
}
