package com.softetch.dwm.client.model.tileentity.tardis;

import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public abstract class AbstractTardisExteriorModel extends Model {
    public AbstractTardisExteriorModel() {
        super(RenderType::getEntityCutoutNoCull);
    }

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
