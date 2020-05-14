package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.common.block.DWMTileEntityBlock;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class DWMTileEntityRenderer<T extends TileEntity> extends TileEntityRenderer<T> {
    private Model model;
    private ResourceLocation texture;

    public DWMTileEntityRenderer(TileEntityRendererDispatcher rendererDispatcherIn, Model model, ResourceLocation texture) {
        super(rendererDispatcherIn);
        this.model = model;
        this.texture = texture;
    }

    @Override
    public void render(T tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
        if (model == null) {
            DWMMain.LOGGER.error("Model is null");
            return;
        }
        if (texture == null) {
            DWMMain.LOGGER.error("Texture is null. Will use missing texture.");
            texture = new ResourceLocation("MISSINGNO");
        }
        matrixStack.push();
        matrixStack.translate(0.5d, 1.5d, 0.5d);
        matrixStack.rotate(Vector3f.YP.rotationDegrees(180.0f));
        matrixStack.rotate(Vector3f.XP.rotationDegrees(180.0f));
        matrixStack.rotate(Vector3f.YP.rotationDegrees(22.5F * tileEntity.getBlockState().get(DWMTileEntityBlock.ROTATION)));
        IVertexBuilder vertexBuilder = buffer.getBuffer(RenderType.getEntityTranslucent(getTexture()));
        model.render(matrixStack, vertexBuilder, combinedLight, combinedOverlay, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.pop();
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setTexture(ResourceLocation texture) {
        this.texture = texture;
    }

    public Model getModel() {
        return model;
    }

    public ResourceLocation getTexture() {
        return texture;
    }
}
