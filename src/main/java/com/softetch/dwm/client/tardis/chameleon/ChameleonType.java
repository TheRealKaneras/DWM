package com.softetch.dwm.client.tardis.chameleon;

public enum ChameleonType {
    POLICE_BOX("box"), MINECRAFT;

    private String texturePath;
    ChameleonType() {
    }
    ChameleonType(String texturePath) {
        this.texturePath = texturePath;
    }

    public String getTexturePath() {
        return texturePath;
    }
}
