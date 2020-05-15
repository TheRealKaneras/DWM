package com.softetch.dwm.client.model.smdl;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.smdl.model.SMDLModel;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SMDLModelLoader {
    private static final HashMap<ResourceLocation, SMDLModelEnvironment> MODEL_ENVIRONMENTS = new HashMap<>();

    /**
     * Load an SMDL Model from resources
     * @param namespace the namespace of your mod (the mod id)
     * @param path the file path in modid:models/smdl/ (no .smdl extension needed)
     * @return The model that has been loaded
     * @throws IOException if something goes wrong in loading the model, e.g. if the file isn't found.
     */
    public static SMDLModelEnvironment loadModelEnvironment(String namespace, String path) throws IOException {
        ResourceLocation location = new ResourceLocation(namespace, "models/smdl/" + path + ".smdl");
        if (MODEL_ENVIRONMENTS.containsKey(location)) {
            return MODEL_ENVIRONMENTS.get(location);
        }
        InputStream inputStream = Minecraft.getInstance().getResourceManager().getResource(location).getInputStream();
        SMDLModelEnvironment environment = new SMDLModelEnvironment();
        environment.setModel(DWMMain.GSON.fromJson(new InputStreamReader(inputStream), SMDLModel.class));
        // TODO: Change loading to zip with textures and animations
        return environment;
    }
}
