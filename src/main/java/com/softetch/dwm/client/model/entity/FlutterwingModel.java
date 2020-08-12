package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.FlutterwingEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class FlutterwingModel extends EntityModel<FlutterwingEntity> {
	private final ModelRenderer head;
	private final ModelRenderer rightEar;
	private final ModelRenderer leftEar;
	private final ModelRenderer body;
	private final ModelRenderer leftWing;
	private final ModelRenderer leftWingTip;
	private final ModelRenderer rightWing;
	private final ModelRenderer rightWingTip;

	public FlutterwingModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, 1.0F);
		head.setTextureOffset(24, 0).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightEar = new ModelRenderer(this);
		rightEar.setRotationPoint(0.0F, -4.0F, -1.0F);
		head.addChild(rightEar);
		rightEar.setTextureOffset(24, 16).addBox(-4.0F, -1.0F, 1.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		leftEar = new ModelRenderer(this);
		leftEar.setRotationPoint(0.0F, -4.0F, -1.0F);
		head.addChild(leftEar);
		leftEar.setTextureOffset(24, 16).addBox(1.0F, -1.0F, 1.0F, 3.0F, 4.0F, 1.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.5236F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, 4.0F, -3.0F, 6.0F, 17.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(24, 10).addBox(-2.0F, 21.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		leftWing = new ModelRenderer(this);
		leftWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leftWing);
		leftWing.setTextureOffset(0, 23).addBox(2.0F, 2.0F, 1.5F, 10.0F, 14.0F, 1.0F, 0.0F, true);
		leftWing.setTextureOffset(3, 38).addBox(3.0F, 16.0F, 1.0F, 8.0F, 2.0F, 1.0F, 0.0F, true);

		leftWingTip = new ModelRenderer(this);
		leftWingTip.setRotationPoint(12.0F, 1.0F, 1.5F);
		leftWing.addChild(leftWingTip);
		leftWingTip.setTextureOffset(22, 23).addBox(0.0F, 3.0F, 0.0F, 8.0F, 7.0F, 1.0F, 0.0F, true);
		leftWingTip.setTextureOffset(22, 23).addBox(0.0F, 10.0F, 0.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);

		rightWing = new ModelRenderer(this);
		rightWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rightWing);
		rightWing.setTextureOffset(0, 23).addBox(-12.0F, 2.0F, 1.5F, 10.0F, 14.0F, 1.0F, 0.0F, false);
		rightWing.setTextureOffset(3, 38).addBox(-11.0F, 16.0F, 1.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);

		rightWingTip = new ModelRenderer(this);
		rightWingTip.setRotationPoint(-12.0F, 1.0F, 1.5F);
		rightWing.addChild(rightWingTip);
		rightWingTip.setTextureOffset(22, 23).addBox(-8.0F, 3.0F, 0.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		rightWingTip.setTextureOffset(22, 23).addBox(-6.0F, 10.0F, 0.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(FlutterwingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if (entity.isHanging()) {
			this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
			this.head.rotateAngleY = (float)Math.PI - netHeadYaw * ((float)Math.PI / 180F);
			this.head.rotateAngleZ = (float)Math.PI;
			this.head.setRotationPoint(0.0F, 2.0F, 1.0F);
			this.rightWing.setRotationPoint(-3.0F, 0.0F, 3.0F);
			this.leftWing.setRotationPoint(3.0F, 0.0F, 3.0F);
			this.body.rotateAngleX = (float)Math.PI;
			this.rightWing.rotateAngleX = -0.15707964F;
			this.rightWing.rotateAngleY = -1.2566371F;
			this.rightWingTip.rotateAngleY = -1.7278761F;
			this.leftWing.rotateAngleX = this.rightWing.rotateAngleX;
			this.leftWing.rotateAngleY = -this.rightWing.rotateAngleY;
			this.leftWingTip.rotateAngleY = -this.rightWingTip.rotateAngleY;
		} else {
			this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
			this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
			this.head.rotateAngleZ = 0.0F;
			this.head.setRotationPoint(0.0F, 4.0F, 1.0F);
			this.rightWing.setRotationPoint(0.0F, 0.0F, 0.0F);
			this.leftWing.setRotationPoint(0.0F, 0.0F, 0.0F);
			this.body.rotateAngleX = ((float)Math.PI / 4F) + MathHelper.cos(ageInTicks * 0.1F) * 0.15F;
			this.body.rotateAngleY = 0.0F;
			this.rightWing.rotateAngleY = MathHelper.cos(ageInTicks * 1.3F) * (float)Math.PI * 0.25F;
			this.leftWing.rotateAngleY = -this.rightWing.rotateAngleY;
			this.rightWingTip.rotateAngleY = this.rightWing.rotateAngleY * 0.5F;
			this.leftWingTip.rotateAngleY = -this.rightWing.rotateAngleY * 0.5F;
		}	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}