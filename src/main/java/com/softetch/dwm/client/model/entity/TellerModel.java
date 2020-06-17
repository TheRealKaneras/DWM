package com.softetch.dwm.client.model.entity;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.TellerEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TellerModel extends EntityModel<TellerEntity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rightEye;
	private final ModelRenderer rightEyeArm;
	private final ModelRenderer rightEyeExtension;
	private final ModelRenderer leftEye;
	private final ModelRenderer leftEyeArm;
	private final ModelRenderer leftEyeExtension;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArmTop;
	private final ModelRenderer rightArmBottom;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArmTop;
	private final ModelRenderer leftArmBottom;
	private final ModelRenderer neck;

	public TellerModel() {
		textureWidth = 128;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(4.0F, 24.0F, -2.0F);
		body.setTextureOffset(16, 16).addBox(-8.0F, -24.0F, 0.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(39, 4).addBox(-4.0F, -7.75F, -3.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(45, 2).addBox(-4.0F, -7.5F, -3.25F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(45, 0).addBox(-4.0F, -7.25F, -3.75F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		rightEye = new ModelRenderer(this);
		rightEye.setRotationPoint(-4.0F, -5.0F, 0.0F);
		head.addChild(rightEye);
		rightEye.setTextureOffset(35, 35).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		rightEyeArm = new ModelRenderer(this);
		rightEyeArm.setRotationPoint(-1.25F, 1.0F, -0.5F);
		rightEye.addChild(rightEyeArm);
		rightEyeArm.setTextureOffset(0, 58).addBox(-3.25F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		rightEyeExtension = new ModelRenderer(this);
		rightEyeExtension.setRotationPoint(-1.75F, 0.0F, -2.0F);
		rightEyeArm.addChild(rightEyeExtension);
		rightEyeExtension.setTextureOffset(15, 35).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		rightEyeExtension.setTextureOffset(0, 42).addBox(-1.0F, 1.0F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		rightEyeExtension.setTextureOffset(0, 40).addBox(1.0F, -1.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightEyeExtension.setTextureOffset(0, 40).addBox(-2.0F, -1.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftEye = new ModelRenderer(this);
		leftEye.setRotationPoint(4.0F, -5.0F, 0.0F);
		head.addChild(leftEye);
		leftEye.setTextureOffset(35, 35).addBox(0.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		leftEyeArm = new ModelRenderer(this);
		leftEyeArm.setRotationPoint(1.75F, 1.0F, -0.5F);
		leftEye.addChild(leftEyeArm);
		leftEyeArm.setTextureOffset(0, 58).addBox(-1.25F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		leftEyeExtension = new ModelRenderer(this);
		leftEyeExtension.setRotationPoint(1.25F, 0.0F, -2.0F);
		leftEyeArm.addChild(leftEyeExtension);
		leftEyeExtension.setTextureOffset(15, 35).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		leftEyeExtension.setTextureOffset(0, 42).addBox(-1.0F, 1.0F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftEyeExtension.setTextureOffset(0, 40).addBox(1.0F, -1.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftEyeExtension.setTextureOffset(0, 40).addBox(-2.0F, -1.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		rightArmTop = new ModelRenderer(this);
		rightArmTop.setRotationPoint(-4.0F, -23.0F, 0.0F);
		rightArm.addChild(rightArmTop);
		setRotationAngle(rightArmTop, -0.7854F, 0.0F, 0.0F);
		rightArmTop.setTextureOffset(40, 16).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightArmBottom = new ModelRenderer(this);
		rightArmBottom.setRotationPoint(-7.0F, -19.5F, -3.5F);
		rightArm.addChild(rightArmBottom);
		setRotationAngle(rightArmBottom, -0.7854F, 0.0F, 0.0F);
		rightArmBottom.setTextureOffset(56, 16).addBox(-1.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		leftArmTop = new ModelRenderer(this);
		leftArmTop.setRotationPoint(4.0F, -23.0F, 0.0F);
		leftArm.addChild(leftArmTop);
		setRotationAngle(leftArmTop, -0.7854F, 0.0F, 0.0F);
		leftArmTop.setTextureOffset(40, 16).addBox(0.0F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftArmBottom = new ModelRenderer(this);
		leftArmBottom.setRotationPoint(7.0F, -19.5F, -3.5F);
		leftArm.addChild(leftArmBottom);
		setRotationAngle(leftArmBottom, -0.7854F, 0.0F, 0.0F);
		leftArmBottom.setTextureOffset(56, 16).addBox(-7.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, true);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.setTextureOffset(0, 49).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(TellerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		this.body.rotateAngleY = 0.0F;

		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg.rotateAngleY = 0.0F;
		this.leftLeg.rotateAngleY = 0.0F;
		this.rightLeg.rotateAngleZ = 0.0F;
		this.leftLeg.rotateAngleZ = 0.0F;

//		this.body.rotateAngleX = 0.0F;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}