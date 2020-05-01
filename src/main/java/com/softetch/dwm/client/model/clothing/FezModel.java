package com.softetch.dwm.client.model.clothing;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;

import java.awt.*;

public class FezModel extends BipedModel<PlayerEntity> {
	private final ModelRenderer sides;
	private final ModelRenderer string;

	private final Color color;

	public FezModel(Color color) {
		super(1.0f);
		this.color = color;

		textureWidth = 32;
		textureHeight = 32;

		sides = new ModelRenderer(this);
		sides.setRotationPoint(0.0F, 0.0F, 0.0F);
		sides.setTextureOffset(0, 0).addBox(-4.25F, -14.0F, -3.5F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		sides.setTextureOffset(0, 0).addBox(-4.25F, -13.0F, -3.75F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		sides.setTextureOffset(8, 9).addBox(-4.25F, -13.0F, 3.75F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		sides.setTextureOffset(0, 2).addBox(3.25F, -13.0F, -3.5F, 1.0F, 5.0F, 8.0F, 0.0F, false);
		sides.setTextureOffset(0, 2).addBox(-4.5F, -13.0F, -3.5F, 1.0F, 5.0F, 8.0F, 0.0F, false);

		string = new ModelRenderer(this);
		string.setRotationPoint(0.0F, 0.0F, 0.0F);
		string.setTextureOffset(0, 30).addBox(-1.0F, -15F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		string.setTextureOffset(0, 28).addBox(3.75F, -15F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(PlayerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.sides.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.sides.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.string.rotateAngleY = this.sides.rotateAngleY;
		this.string.rotateAngleX = this.sides.rotateAngleX;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		sides.render(matrixStack, buffer, packedLight, packedOverlay, color.getRed(), color.getGreen(), color.getBlue(), 1.0f);
		string.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}