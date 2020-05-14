package com.softetch.dwm.client.model.smdl;

import com.softetch.dwm.DWMMain;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SMDLModelLoader {
    private static final HashMap<ResourceLocation, SMDLModel> MODELS = new HashMap<>();

    /**
     * Load an SMDL Model from resources
     * @param namespace the namespace of your mod (the mod id)
     * @param path the file path in modid:models/smdl/ (no .smdl extension needed)
     * @return The model that has been loaded
     * @throws IOException if something goes wrong in loading the model, e.g. if the file isn't found.
     */
    public static SMDLModel loadModel(String namespace, String path) throws IOException {
        ResourceLocation location = new ResourceLocation(namespace, "models/smdl/" + path + ".smdl");
        if (MODELS.containsKey(location)) {
            return MODELS.get(location);
        }
        InputStream inputStream = Minecraft.getInstance().getResourceManager().getResource(location).getInputStream();
        return DWMMain.GSON.fromJson(new InputStreamReader(inputStream), SMDLModel.class);
    }
}
