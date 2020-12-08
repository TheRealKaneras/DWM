package com.softetch.dwm.client.model.tileentity;

import com.softetch.dwm.common.tileentity.DoorTypeTile;
import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public abstract class DoorModel extends Model {
    public DoorModel(Function<ResourceLocation, RenderType> renderTypeIn) {
        super(renderTypeIn);
    }

    public void doorRotation(DoorTypeTile.DoorState doorState, float progression) {
        if (getLeftDoor() != null && getRightDoor() != null) {
            float angle = progression * getMaximumAngle();
            if (doorState == TardisExteriorTile.DoorState.SINGLE) {
                getLeftDoor().rotateAngleY = angle;
            } else if (doorState == TardisExteriorTile.DoorState.BOTH) {
                getLeftDoor().rotateAngleY = angle;
                getRightDoor().rotateAngleY = inverse() ? -angle : angle;
            } else {
                if (getLeftDoor().rotateAngleY != 0.0f) {
                    getLeftDoor().rotateAngleY = angle;
                }
                if (getRightDoor().rotateAngleY != 0.0f) {
                    getRightDoor().rotateAngleY = inverse() ? -angle : angle;
                }
            }
        }
    }

    protected boolean inverse() {
        return true;
    }

    protected abstract ModelRenderer getLeftDoor();
    protected abstract ModelRenderer getRightDoor();
    protected abstract float getMaximumAngle();
}
