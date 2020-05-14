package com.softetch.dwm.client.model.tileentity;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;

public abstract class TileEntityModel extends Model {

    public TileEntityModel() {
        super(RenderType::getEntityCutout);
    }

}
