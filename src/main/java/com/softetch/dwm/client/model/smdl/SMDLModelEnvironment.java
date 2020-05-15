package com.softetch.dwm.client.model.smdl;

import com.softetch.dwm.client.model.smdl.animation.Animation;
import com.softetch.dwm.client.model.smdl.animation.EntityAnimation;
import com.softetch.dwm.client.model.smdl.model.SMDLModel;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class SMDLModelEnvironment {
    private SMDLModel model;
    private Map<String, EntityAnimation> entityAnimations = new HashMap<>();
    private Map<String, Animation> animations = new HashMap<>();
    private Map<String, ResourceLocation> textures = new HashMap<>();

    public void setModel(SMDLModel model) {
        this.model = model;
        this.model.init();
    }

    public void addEntityAnimation(String name, EntityAnimation animation) {
        entityAnimations.put(name, animation);
    }

    public void addAnimation(String name, Animation animation) {
        animations.put(name, animation);
    }

    public void addTextures(Map<String, String> parsedTextures) {
        parsedTextures.forEach((key, value) -> {
            String namespace = value.contains(":") ? value.split(":")[0] : "minecraft";
            String path = value.contains(":") ? value.split(":")[1] : value;
            textures.put(key, new ResourceLocation(namespace, "textures/" + path + ".png"));
        });
    }

    public ResourceLocation getDefaultTexture() {
        return textures.get("default");
    }

    public SMDLModel getModel() {
        return model;
    }

    public void playAnimation(int index) {

    }
}
