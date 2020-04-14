package com.softetch.dwm.client.tardis;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.tileentity.tardis.*;
import net.minecraft.util.ResourceLocation;

public enum EnumChameleonData {
    BRACHACKI_BOX_A(0, "brachacki_box_a", new BrachackiBoxAModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/brachacki_box_a.png")),
    BRACHACKI_BOX_B(1, "brachacki_box_b", new BrachackiBoxBModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/brachacki_box_b.png")),
    BRACHACKI_BOX_C(2, "brachacki_box_c", new BrachackiBoxCModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/brachacki_box_c.png")),
    BRACHACKI_BOX_D(3, "brachacki_box_d", new BrachackiBoxDModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/brachacki_box_d.png")),
    NEWBERY_BOX_A(4, "newbery_box_a", new NewberyBoxAModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/newbery_box_b.png")),
    NEWBERY_BOX_B(5, "newbery_box_b", new NewberyBoxBModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/newbery_box_a.png"));

    private final int id;
    private final String name;
    private final AbstractTardisExteriorModel model;
    private final ResourceLocation texture;

    EnumChameleonData(int id, String name, AbstractTardisExteriorModel model, ResourceLocation texture) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.texture = texture;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AbstractTardisExteriorModel getModel() {
        return model;
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    public static EnumChameleonData fromId(int id) {
        for (EnumChameleonData chameleonData : EnumChameleonData.values()) {
            if (chameleonData.getId() == id)
                return chameleonData;
        }
        return EnumChameleonData.BRACHACKI_BOX_A;
    }
}
