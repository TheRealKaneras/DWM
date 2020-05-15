package com.softetch.dwm.client.model.smdl;

import com.google.gson.reflect.TypeToken;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.smdl.animation.Animation;
import com.softetch.dwm.client.model.smdl.animation.EntityAnimation;
import com.softetch.dwm.client.model.smdl.model.SMDLModel;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class SMDLModelLoader {
    private static final HashMap<ResourceLocation, SMDLModelEnvironment> MODEL_ENVIRONMENTS = new HashMap<>();

    /**
     * Load an SMDL Model from resources
     * @param namespace the namespace of your mod (the mod id)
     * @param path the file path in modid:models/smdl/ (no .smdl extension needed)
     * @return The model that has been loaded
     * @throws IOException if something goes wrong in loading the model, e.g. if the file isn't found.
     */
    public static SMDLModelEnvironment loadModelEnvironment(String namespace, String path) {
        ResourceLocation location = new ResourceLocation(namespace, "models/smdl/" + path + ".smdl");
        if (MODEL_ENVIRONMENTS.containsKey(location)) {
            return MODEL_ENVIRONMENTS.get(location);
        }
        SMDLModelEnvironment environment = new SMDLModelEnvironment();
        try {
            InputStream inputStream = Minecraft.getInstance().getResourceManager().getResource(location).getInputStream();
            ZipInputStream zipStream = new ZipInputStream(inputStream);

            ZipEntry zipEntry;
            while ((zipEntry = zipStream.getNextEntry()) != null) {
                InputStreamReader reader = new InputStreamReader(zipStream);
                if (zipEntry.getName().equals("model.json")) {
                    environment.setModel(parseModel(reader));
                } else if (zipEntry.getName().equals("textures.json")) {
                    environment.addTextures(parseTextures(reader));
                } else if (zipEntry.getName().endsWith(".emvmt")) {
                    environment.addEntityAnimation(zipEntry.getName().replace(".emvmt", ""), parseEntityAnimation(reader));
                } else if (zipEntry.getName().endsWith(".mvmt")) {
                    environment.addAnimation(zipEntry.getName().replace(".mvmt", ""), parseAnimation(reader));
                }
            }
        } catch (IOException e) {
            DWMMain.LOGGER.error(e + " failed to load model at " + location);
            return null;
        }

        return environment;
    }

    private static SMDLModel parseModel(InputStreamReader reader) {
        return DWMMain.GSON.fromJson(reader, SMDLModel.class);
    }

    private static Map<String, String> parseTextures(InputStreamReader reader) {
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        return DWMMain.GSON.fromJson(reader, type);
    }

    public static EntityAnimation parseEntityAnimation(InputStreamReader reader) {
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        return new EntityAnimation(DWMMain.GSON.fromJson(reader, type));
    }

    public static Animation parseAnimation(InputStreamReader reader) {
        return DWMMain.GSON.fromJson(reader, Animation.class);
    }
}
