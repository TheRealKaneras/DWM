package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class AdiposeModel extends EntityModel<AdiposeEntity> {
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightArm;

	public AdiposeModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-2.5F, -6.0F, -0.5F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 8).addBox(-2.0F, -5.0F, -0.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(5, 8).addBox(0.0F, -5.0F, -0.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-2.0F, 20.0F, 0.5F);
		leftArm.setTextureOffset(14, 4).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(0.5F, 23.0F, 0.0F);
		rightLeg.setTextureOffset(19, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(-1.5F, 23.0F, 0.0F);
		leftLeg.setTextureOffset(14, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(1.5F, 20.0F, 0.5F);
		rightArm.setTextureOffset(19, 4).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(AdiposeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.body.rotateAngleY = 0.0F;

		this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
		this.rightArm.rotateAngleZ = 0.0F;
		this.leftArm.rotateAngleZ = 0.0F;
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg.rotateAngleY = 0.0F;
		this.leftLeg.rotateAngleY = 0.0F;
		this.rightLeg.rotateAngleZ = 0.0F;
		this.leftLeg.rotateAngleZ = 0.0F;

		this.rightArm.rotateAngleY = 0.0F;
		this.rightArm.rotateAngleZ = 0.0F;

		if (this.swingProgress > 0.0F) {
			float f1 = this.swingProgress;
			this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;

			this.rightArm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
			this.rightArm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
			this.leftArm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
			this.leftArm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
			this.rightArm.rotateAngleY += this.body.rotateAngleY;
			this.leftArm.rotateAngleY += this.body.rotateAngleY;
			this.leftArm.rotateAngleX += this.body.rotateAngleY;
		}

		this.body.rotateAngleX = 0.0F;

		this.rightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.leftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.rightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		this.leftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}