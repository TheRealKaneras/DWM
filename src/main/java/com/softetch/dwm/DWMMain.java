package com.softetch.dwm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.softetch.dwm.client.event.DWMRenderEvent;
import com.softetch.dwm.client.tardis.ChameleonRegistry;
import com.softetch.dwm.common.event.DWMEntityEvent;
import com.softetch.dwm.common.event.DWMItemUseEvent;
import com.softetch.dwm.common.item.gadget.SonicActions;
import com.softetch.dwm.common.world.gen.DWMOreGen;
import com.softetch.dwm.common.world.gen.biome.DWMBiomes;
import com.softetch.dwm.common.world.gen.feature.DWMFeature;
import com.softetch.dwm.common.world.gen.schematic.SchematicLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The main class for the DWM
 */
@Mod(DWMMain.MOD_ID)
public class DWMMain {
    public static final String MOD_ID = "dwm";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static final ChameleonRegistry CHAMELEON_REGISTRY = new ChameleonRegistry();
    public static final SonicActions SONIC_ACTIONS = new SonicActions();

    /**
     * Create a new instance of the mod, set up listeners and event bus.
     */
    public DWMMain() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);

        DWMBiomes.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        DWMFeature.FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    /**
     * Set up all things that should be done pre-initialisation (e.g. block registry)
     * @param event the forge common setup event.
     */
    private void setup(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new DWMRenderEvent());
        MinecraftForge.EVENT_BUS.register(new DWMItemUseEvent());
        MinecraftForge.EVENT_BUS.register(new DWMEntityEvent());
        SchematicLoader.register();
        DWMOreGen.init();

    }

}
