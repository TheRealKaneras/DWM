package com.softetch.dwm;

import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

/**
 * This class has the register event handler for all custom tile entities
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the tile entity types.
 */
@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DWMMain.MOD_ID)
public class DWMTileEntities {
    public static final TileEntityType<TardisTileEntity> TARDIS = null;

    private static TileEntityType<?> createTileEntity(Supplier<? extends TileEntity> factoryIn, ResourceLocation registryName, Block... validBlocks) {
        return TileEntityType.Builder.create(factoryIn, validBlocks).build(null).setRegistryName(registryName);
    }

    @SubscribeEvent
    public static void onTileEntityRegistration(final RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().registerAll(
            createTileEntity(TardisTileEntity::new, new ResourceLocation(DWMMain.MOD_ID, "tardis"), DWMItems.TARDIS)
        );
    }
}
