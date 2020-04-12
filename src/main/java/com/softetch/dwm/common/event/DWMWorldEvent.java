package com.softetch.dwm.common.event;

import com.softetch.dwm.common.tardis.TardisData;
import com.softetch.dwm.common.tardis.TardisLoader;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.io.IOException;

public class DWMWorldEvent {

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        try {
            TardisLoader.loadTardises();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (TardisData data : TardisLoader.getAllTardisData()) {
            int dimId = event.getWorld().getDimension().getType().getId();
            if (data.getPosition().getDimension() == dimId) {
                TileEntity tileEntity = event.getWorld().getTileEntity(data.getPosition().getBlockPos());
                if (tileEntity instanceof TardisTileEntity) {
                    ((TardisTileEntity) tileEntity).setData(data);
                }
            }
        }

    }

    @SubscribeEvent
    public void onWorldSave(WorldEvent.Save event) {
        for (TardisData data : TardisLoader.getAllTardisData()) {
            try {
                TardisLoader.saveTardis(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event) {
        TardisLoader.clear();
    }

}
