package com.softetch.dwm.client.model.tileentity.tardis;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.client.model.tileentity.DoorModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;

public abstract class AbstractTardisExteriorModel extends DoorModel {
    public AbstractTardisExteriorModel() {
        super(RenderType::getEntityTranslucentCull);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        matrixStack.scale(getScale(), getScale(), getScale());
        matrixStack.translate(0.0f, -getScale() + 1, 0.0f);
    }

    protected ModelRenderer getLeftDoor() {
        return null;
    }

    protected ModelRenderer getRightDoor() {
        return null;
    }

    protected float getScale() { return 1.0f; }

    /**
     * Get the maximum angle to rotate the doors by
     * @return The maximum door rotation in radians
     */
    protected float getMaximumAngle() { return (float) Math.toRadians(80.0D); }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
