package com.softetch.dwm.client.model.tileentity.tardis;

import com.softetch.dwm.client.model.tileentity.TileEntityModel;
import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.model.ModelRenderer;

public abstract class AbstractTardisExteriorModel extends TileEntityModel {
    public void doorRotation(TardisExteriorTile.DoorState doorState, float progression) {
        if (getLeftDoor() != null && getRightDoor() != null) {
            float angle = progression * 1.35f;
            if (doorState == TardisExteriorTile.DoorState.SINGLE) {
                getLeftDoor().rotateAngleY = angle;
            } else if (doorState == TardisExteriorTile.DoorState.BOTH) {
                getLeftDoor().rotateAngleY = angle;
                getRightDoor().rotateAngleY = -angle;
            } else {
                if (getLeftDoor().rotateAngleY != 0.0f) {
                    getLeftDoor().rotateAngleY = angle;
                }
                if (getRightDoor().rotateAngleY != 0.0f) {
                    getRightDoor().rotateAngleY = -angle;
                }
            }
        }
    }

    protected ModelRenderer getLeftDoor() {
        return null;
    }

    protected ModelRenderer getRightDoor() {
        return null;
    }

}
