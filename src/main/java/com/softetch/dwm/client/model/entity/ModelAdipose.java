package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;

/**
 * The model for adipose
 */
public class ModelAdipose extends EntityModel<AdiposeEntity> {
	private RendererModel bipedBody;
	private RendererModel bipedRightArm;
	private RendererModel bipedLeftArm;
	private RendererModel bipedRightLeg;
	private RendererModel bipedLeftLeg;

	/**
	 * Set up all the parts of the model as renderable boxes
	 */
	public ModelAdipose() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new RendererModel(this);
		bipedBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -2.5F, -6.0F, -0.5F, 4, 5, 2, 0.0F, false));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 8, -2.0F, -5.0F, -0.55F, 1, 1, 1, 0.0F, false));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 5, 8, 0.0F, -5.0F, -0.55F, 1, 1, 1, 0.0F, false));

		bipedLeftArm = new RendererModel(this);
		bipedLeftArm.setRotationPoint(-2.0F, 20.0F, 0.5F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 14, 4, -1.0F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		bipedRightLeg = new RendererModel(this);
		bipedRightLeg.setRotationPoint(0.5F, 23.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 19, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bipedLeftLeg = new RendererModel(this);
		bipedLeftLeg.setRotationPoint(-1.5F, 23.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 14, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bipedRightArm = new RendererModel(this);
		bipedRightArm.setRotationPoint(1.5F, 20.0F, 0.5F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 19, 4, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
	}

	/**
	 * Render each part of the model
	 * @param entityIn Entity being rendered by this model
	 * @param limbSwing A value to determine the limb swing
	 * @param limbSwingAmount the amount limbs should be swung
	 * @param ageInTicks how old the entity is in ticks (20 ticks per second)
	 * @param netHeadYaw horizontal rotation of the head
	 * @param headPitch vertical rotation of the head
	 * @param scale The relative scale of the entity
	 */
	public void render(AdiposeEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		GlStateManager.pushMatrix();
		this.bipedBody.render(scale);
		this.bipedRightArm.render(scale);
		this.bipedLeftArm.render(scale);
		this.bipedRightLeg.render(scale);
		this.bipedLeftLeg.render(scale);
		GlStateManager.popMatrix();
	}

	/**
	 * update rotation values on the model.
	 * @param entityIn Entity being rendered by this model
	 * @param limbSwing A value to determine the limb swing
	 * @param limbSwingAmount the amount limbs should be swung
	 * @param ageInTicks how old the entity is in ticks (20 ticks per second)
	 * @param netHeadYaw horizontal rotation of the head
	 * @param headPitch vertical rotation of the head
	 * @param scaleFactor The relative scale of the entity
	 */
	public void setRotationAngles(AdiposeEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {

		this.bipedBody.rotateAngleY = 0.0F;

		this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
		this.bipedRightArm.rotateAngleZ = 0.0F;
		this.bipedLeftArm.rotateAngleZ = 0.0F;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.bipedRightLeg.rotateAngleY = 0.0F;
		this.bipedLeftLeg.rotateAngleY = 0.0F;
		this.bipedRightLeg.rotateAngleZ = 0.0F;
		this.bipedLeftLeg.rotateAngleZ = 0.0F;

		this.bipedRightArm.rotateAngleY = 0.0F;
		this.bipedRightArm.rotateAngleZ = 0.0F;

		if (this.swingProgress > 0.0F) {
			float f1 = this.swingProgress;
			this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;

			this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
		}

		this.bipedBody.rotateAngleX = 0.0F;

		this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

	}

}