package com.softetch.dwm.common.tardis;

import com.softetch.dwm.DWMMain;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.storage.SaveHandler;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.HashMap;

public class TardisLoader {
    private static final HashMap<String, TardisData> tardises = new HashMap<>();

    public static void updateTardis(TardisData data) {
        tardises.put(data.getUuid(), data);
    }

    public static TardisData getTardisData(String uuid) {
        return tardises.get(uuid);
    }

    public static Collection<TardisData> getAllTardisData() {
        return tardises.values();
    }

    public static void loadTardises() throws IOException {
        DWMMain.LOGGER.info("Loading TARDISes");
        SaveHandler saveHandler = ServerLifecycleHooks.getCurrentServer().getWorld(DimensionType.OVERWORLD).getSaveHandler();
        File folder = new File(saveHandler.getWorldDirectory().getPath() + "//TARDIS_DATA//");
        if (!folder.exists())
            return;
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".json"));
        for (final File file : files) {
            StringBuilder json = new StringBuilder();
            Files.readAllLines(file.toPath()).forEach(txt -> json.append(txt));
            TardisData tardisData = DWMMain.GSON.fromJson(json.toString(), TardisData.class);
            if (tardisData != null) {
                tardises.put(tardisData.getUuid(), tardisData);
            }
        }
    }

    public static void saveTardis(TardisData data) throws IOException {
        DWMMain.LOGGER.info("Saving TARDIS with uuid " + data.getUuid());
        SaveHandler saveHandler = ServerLifecycleHooks.getCurrentServer().getWorld(DimensionType.OVERWORLD).getSaveHandler();
        File folder = new File(saveHandler.getWorldDirectory().getPath() + "//TARDIS_DATA//");
        if (!folder.exists())
            folder.mkdirs();
        File file = new File(folder.getPath() + "//" + data.getUuid() + ".json");
        if (!file.exists())
            file.createNewFile();
        String json = DWMMain.GSON.toJson(data);
        Files.write(file.toPath(), json.getBytes());
    }

    public static void clear() {
        tardises.clear();
    }

}
