package com.softetch.dwm;

import com.google.common.eventbus.Subscribe;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = DWMMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DWMItemGroups {

    public static final ItemGroup ROUNDELS = new ItemGroup(DWMMain.MOD_ID + ".roundels") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(DWMItems.STONE_ROUNDEL);
        }
    };

    @SubscribeEvent
    public static void registerItemGroups(FMLCommonSetupEvent event) {

    }
}
