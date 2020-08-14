package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.ClassicSilurianEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ClassicSilurianModel extends EntityModel<ClassicSilurianEntity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone11;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;

	public ClassicSilurianModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(36, 21).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.5F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 23).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 6.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(4, 29).addBox(2.0F, -6.5F, -5.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(2, 24).addBox(-3.0F, -10.0F, -5.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(8, 11).addBox(-6.0F, -8.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 4).addBox(-4.0F, -3.0F, -4.4F, 8.0F, 3.0F, 8.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.addChild(nose);
		nose.setTextureOffset(25, 2).addBox(-0.5F, -9.1F, -6.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.setTextureOffset(25, 2).addBox(-1.0F, -1.1F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(31, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(31, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(31, 46).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(31, 46).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.0678F, -5.0F, -5.5263F);
		nose.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
		bone.setTextureOffset(26, 9).addBox(-0.1201F, -4.0F, -0.2879F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -7.8F, -4.0F);
		nose.addChild(bone2);
		setRotationAngle(bone2, 0.0524F, 0.0F, 0.0F);
		bone2.setTextureOffset(6, 23).addBox(-0.5F, -1.6586F, -1.6928F, 1.0F, 2.0F, 10.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.1F, -1.0F, -4.2F);
		head.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.5236F, -0.2618F);
		bone3.setTextureOffset(3, 10).addBox(-1.6F, -2.827F, -1.4811F, 4.0F, 5.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.7F, -1.1F, -3.8F);
		head.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.5236F, 0.2618F);
		bone4.setTextureOffset(3, 10).addBox(-1.6F, -2.827F, -1.4811F, 4.0F, 5.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(2.1395F, -7.093F, -5.2175F);
		head.addChild(bone5);
		setRotationAngle(bone5, -0.7854F, 0.0F, -0.4363F);
		bone5.setTextureOffset(3, 10).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.1605F, -7.093F, -5.2175F);
		head.addChild(bone7);
		setRotationAngle(bone7, -0.7854F, 0.0F, 0.4363F);
		bone7.setTextureOffset(3, 10).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.8605F, -4.793F, -5.2175F);
		head.addChild(bone8);
		setRotationAngle(bone8, -0.7854F, 0.0F, -0.7854F);
		bone8.setTextureOffset(3, 10).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.1395F, -5.493F, -5.2175F);
		head.addChild(bone9);
		setRotationAngle(bone9, -0.7854F, 0.0F, 0.7854F);
		bone9.setTextureOffset(3, 10).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.3F, -5.0F);
		nose.addChild(bone11);
		setRotationAngle(bone11, -0.3491F, 0.0F, 0.0F);
		bone11.setTextureOffset(23, 11).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(5.0F, -5.0F, -1.5F);
		head.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -3.1416F);
		bone13.setTextureOffset(8, 11).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-2.5F, -6.0F, -4.9F);
		head.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 1.5708F);
		bone14.setTextureOffset(4, 29).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(ClassicSilurianEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}