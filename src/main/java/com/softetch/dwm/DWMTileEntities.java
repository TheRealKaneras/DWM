package com.softetch.dwm;

import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
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
    public static final TileEntityType<TardisExteriorTile> TARDIS = null;

    private static TileEntityType<?> createTileEntity(Supplier<? extends TileEntity> factoryIn, String name, Block... validBlocks) {
        return TileEntityType.Builder.create(factoryIn, validBlocks).build(null).setRegistryName(DWMMain.MOD_ID, name);
    }

    @SubscribeEvent
    public static void onTileEntityRegistration(final RegistryEvent.Register<TileEntityType<?>> event) {
        DWMMain.LOGGER.info("Registering DWM tile entities");
        event.getRegistry().registerAll(
            createTileEntity(TardisExteriorTile::new, "tardis", DWMItems.tardises.toArray(new Block[DWMItems.tardises.size()]))
        );
    }
}
