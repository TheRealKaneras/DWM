package com.softetch.dwm.client.model.tileentity.tardis;

import com.softetch.dwm.client.model.tileentity.TileEntityModel;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

public abstract class AbstractTardisExteriorModel extends TileEntityModel {
    public void doorRotation(TardisTileEntity.DoorState doorState, float progression) {
        if (getLeftDoor() != null && getRightDoor() != null) {
            float angle = progression * 1.35f;
            if (doorState == TardisTileEntity.DoorState.SINGLE) {
                getLeftDoor().rotateAngleY = angle;
            } else if (doorState == TardisTileEntity.DoorState.BOTH) {
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
