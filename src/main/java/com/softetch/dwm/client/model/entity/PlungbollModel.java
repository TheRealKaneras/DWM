package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.PlungbollEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class PlungbollModel extends EntityModel<PlungbollEntity> {
	private final ModelRenderer fur;
	private final ModelRenderer fur2;
	private final ModelRenderer fur3;
	private final ModelRenderer fur4;
	private final ModelRenderer fur5;
	private final ModelRenderer fur6;
	private final ModelRenderer fur7;
	private final ModelRenderer fur8;
	private final ModelRenderer bb_main;

	public PlungbollModel() {
		textureWidth = 64;
		textureHeight = 64;

		fur = new ModelRenderer(this);
		fur.setRotationPoint(0.0455F, 15.0F, -0.0545F);
		fur.setTextureOffset(10, 51).addBox(1.0545F, -0.5F, -0.8455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(-3.0455F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(30, 48).addBox(-1.0455F, -0.5F, -0.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(30, 48).addBox(1.9545F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(-0.0455F, -0.5F, 2.2545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(-0.5455F, -0.5F, -2.0455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(-2.6455F, -0.5F, -0.2455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur.setTextureOffset(10, 51).addBox(0.9545F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur2 = new ModelRenderer(this);
		fur2.setRotationPoint(0.0455F, 23.0F, -0.0545F);
		fur2.setTextureOffset(10, 51).addBox(1.0545F, -0.5F, -0.8455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-3.0455F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-1.0455F, -0.5F, -0.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-0.0455F, -0.5F, 2.2545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-0.5455F, -0.5F, -2.0455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(-2.6455F, -0.5F, -0.2455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur2.setTextureOffset(10, 51).addBox(0.9545F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur3 = new ModelRenderer(this);
		fur3.setRotationPoint(4.0455F, 19.0F, -0.0545F);
		setRotationAngle(fur3, 0.0F, 0.0F, -1.5708F);
		fur3.setTextureOffset(30, 48).addBox(1.0545F, -0.5F, -0.8455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(-3.0455F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(-1.0455F, -0.5F, -0.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(20, 54).addBox(-2.0455F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(-0.0455F, -0.5F, 2.2545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(30, 48).addBox(-0.5455F, -0.5F, -2.0455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(-2.6455F, -0.5F, -0.2455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur3.setTextureOffset(10, 51).addBox(0.9545F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur4 = new ModelRenderer(this);
		fur4.setRotationPoint(-3.9545F, 19.0F, -0.0545F);
		setRotationAngle(fur4, 0.0F, 0.0F, -1.5708F);
		fur4.setTextureOffset(10, 51).addBox(1.0545F, -0.5F, -0.8455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-3.0455F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-1.0455F, -0.5F, -0.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-0.0455F, -0.5F, 2.2545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-0.5455F, -0.5F, -2.0455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(-2.6455F, -0.5F, -0.2455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur4.setTextureOffset(10, 51).addBox(0.9545F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur5 = new ModelRenderer(this);
		fur5.setRotationPoint(-0.0545F, 19.0F, 3.5455F);
		setRotationAngle(fur5, -1.5708F, 0.0F, -3.1416F);
		fur5.setTextureOffset(10, 51).addBox(1.0545F, -0.5F, -0.8455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-3.0455F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-1.0455F, -0.5F, -0.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-2.2455F, -0.5F, 2.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-0.7455F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-2.5455F, -0.5F, -2.6455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-2.0455F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-0.0455F, -0.5F, 2.2545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-0.5455F, -0.5F, -2.0455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(-2.6455F, -0.5F, -0.2455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, -1.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur5.setTextureOffset(10, 51).addBox(0.9545F, -0.5F, 0.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur6 = new ModelRenderer(this);
		fur6.setRotationPoint(-0.0545F, 19.0F, -3.4545F);
		setRotationAngle(fur6, -1.5708F, 0.0F, -3.1416F);
		fur6.setTextureOffset(10, 51).addBox(-2.2455F, -0.5F, 2.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur6.setTextureOffset(10, 51).addBox(1.6545F, -0.5F, -2.6455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur6.setTextureOffset(10, 51).addBox(-1.0455F, -0.5F, -2.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur7 = new ModelRenderer(this);
		fur7.setRotationPoint(-0.0545F, 19.0F, -3.4545F);
		setRotationAngle(fur7, -1.5708F, 0.0F, 1.5708F);
		fur7.setTextureOffset(10, 51).addBox(-1.0455F, -0.5F, -2.5455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(-2.7455F, -0.5F, -0.8455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(-2.2455F, -0.5F, 2.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(-0.7455F, -0.5F, 2.7545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(-2.5455F, -0.5F, -2.6455F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(-2.8455F, -0.5F, 2.1545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(1.9545F, -0.5F, 1.5545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(-0.0455F, -0.5F, 2.2545F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur7.setTextureOffset(10, 51).addBox(1.3545F, -0.5F, -2.4455F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		fur8 = new ModelRenderer(this);
		fur8.setRotationPoint(0.1333F, 19.0F, 3.5833F);
		setRotationAngle(fur8, -1.5708F, 0.0F, 1.5708F);
		fur8.setTextureOffset(10, 51).addBox(0.8667F, -0.5F, -0.8833F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-1.2333F, -0.5F, -2.5833F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-2.9333F, -0.5F, -0.8833F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-2.4333F, -0.5F, 2.5167F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-0.9333F, -0.5F, 2.7167F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-2.7333F, -0.5F, -2.6833F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-2.2333F, -0.5F, 1.5167F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(1.7667F, -0.5F, 1.5167F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(-0.2333F, -0.5F, 2.2167F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(1.1667F, -0.5F, -2.4833F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(1.7667F, -0.5F, -1.4833F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		fur8.setTextureOffset(10, 51).addBox(1.1667F, -0.5F, 0.5167F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(6, 6).addBox(-3.0F, -8.0F, -3.5F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-4.0F, -8.0F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(21, 21).addBox(-3.0F, -9.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 51).addBox(-3.0F, -8.0F, -2.5F, 6.0F, 6.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(21, 21).addBox(-3.0F, -2.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(3.0F, -8.0F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(17, 22).addBox(-3.0F, -8.0F, 2.5F, 6.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		fur.render(matrixStack, buffer, packedLight, packedOverlay);
		fur2.render(matrixStack, buffer, packedLight, packedOverlay);
		fur3.render(matrixStack, buffer, packedLight, packedOverlay);
		fur4.render(matrixStack, buffer, packedLight, packedOverlay);
		fur5.render(matrixStack, buffer, packedLight, packedOverlay);
		fur6.render(matrixStack, buffer, packedLight, packedOverlay);
		fur7.render(matrixStack, buffer, packedLight, packedOverlay);
		fur8.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	/**
	 * Sets this entity's model rotation angles
	 *
	 * @param entityIn
	 * @param limbSwing
	 * @param limbSwingAmount
	 * @param ageInTicks
	 * @param netHeadYaw
	 * @param headPitch
	 */
	@Override
	public void setRotationAngles(PlungbollEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}
}