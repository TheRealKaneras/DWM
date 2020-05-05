package com.softetch.dwm.common.world.dimension;

import com.softetch.dwm.DWMMain;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

import java.util.function.BiFunction;

public class DWMModDimension extends ModDimension {

    public DWMModDimension(String registryName) {
        this.setRegistryName(new ResourceLocation(DWMMain.MOD_ID, registryName));
    }

    public DimensionType getDimensionType() {
        return DimensionType.byName(getRegistryName());
    }

    @Override
    public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
        return DWMDimension::new;
    }
}
