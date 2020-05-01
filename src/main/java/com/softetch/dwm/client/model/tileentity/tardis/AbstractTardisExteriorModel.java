package com.softetch.dwm.client.model.tileentity.tardis;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
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

    protected void preLampRender() {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.color4f(2.0f, 2.0f, 2.0f, 0.8f);
    }

    protected void postLampRender() {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.popMatrix();
    }
}
