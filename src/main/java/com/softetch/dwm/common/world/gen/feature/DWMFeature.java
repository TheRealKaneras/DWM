package com.softetch.dwm.common.world.gen.feature;

import com.softetch.dwm.DWMMain;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DWMFeature {
    public static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<>(ForgeRegistries.FEATURES, DWMMain.MOD_ID);

    public static final RegistryObject<BasicTreeFeature> ASH_TREE = FEATURES.register("ash_tree", () -> new BasicTreeFeature(BasicTreeFeatureConfig::deserialize));


}
