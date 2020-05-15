package com.softetch.dwm.client.model.smdl;

import com.softetch.dwm.client.model.smdl.animation.Animation;
import com.softetch.dwm.client.model.smdl.model.SMDLModel;

import java.awt.image.BufferedImage;

public class SMDLModelEnvironment {
    private SMDLModel model;
    private BufferedImage[] textures;
    private Animation[] animations;

    public void setModel(SMDLModel model) {
        this.model = model;
    }

    public void setTextures(BufferedImage[] textures) {
        this.textures = textures;
    }

    public void setAnimations(Animation[] animations) {
        this.animations = animations;
    }

    public SMDLModel getModel() {
        return model;
    }

    public BufferedImage getTexture(int index) {
        return textures[index];
    }

    public BufferedImage getDefaultTexture() {
        return textures[0];
    }

    public void playAnimation(int index) {

    }
}
