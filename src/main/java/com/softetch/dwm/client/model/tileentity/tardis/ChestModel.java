package com.softetch.dwm.client.model.tileentity.tardis;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ChestModel extends AbstractTardisExteriorModel {
	private final ModelRenderer base;
	private final ModelRenderer lid;

	public ChestModel() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.setTextureOffset(0, 19).addBox(-7.0F, -10.0F, -7.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);

		lid = new ModelRenderer(this);
		lid.setRotationPoint(0.0F, 14.0F, 7.0F);
		lid.setTextureOffset(0, 0).addBox(-7.0F, -4.0F, -14.0F, 14.0F, 4.0F, 14.0F, 0.0F, false);
		lid.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -15.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		base.render(matrixStack, buffer, packedLight, packedOverlay);
		lid.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void doorRotation(TardisTileEntity.DoorState doorState, float progression) {
		float angle = progression * 1.35f;
		this.lid.rotateAngleX = -angle;
	}
}