package com.softetch.dwm.client.model.entity;

import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.IHasArm;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * The model for adipose
 */
@OnlyIn(Dist.CLIENT)
public class ModelAdipose extends EntityModel<AdiposeEntity> {
	private final RendererModel body;
	private final RendererModel leftArm;
	private final RendererModel rightLeg;
	private final RendererModel leftLeg;
	private final RendererModel rightArm;

	/**
	 * Set up all parts of the adipose as renderable boxes
	 */
	public ModelAdipose() {
		textureWidth = 64;
		textureHeight = 64;

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -6.0F, -0.5F, 4, 5, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 8, -2.0F, -5.0F, -0.55F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 5, 8, 0.0F, -5.0F, -0.55F, 1, 1, 1, 0.0F, false));

		leftArm = new RendererModel(this);
		leftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 14, 4, -3.0F, -4.5F, 0.0F, 1, 2, 1, 0.0F, false));

		rightLeg = new RendererModel(this);
		rightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 19, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		leftLeg = new RendererModel(this);
		leftLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 14, 0, -2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		rightArm = new RendererModel(this);
		rightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 19, 4, 1.0F, -4.5F, 0.0F, 1, 2, 1, 0.0F, false));
	}

	/**
	 * Render the adipose model
	 *
	 * @param entity      - the entity being rendered
	 * @param originX     - where the entity is being rendered on the x axis, relative to the player
	 * @param originY     - where the entity is being rendered on the y axis, relative to the player
	 * @param originZ     - where the entity is being rendered on the z axis, relative to the player
	 * @param entityYaw   - where the entity is looking on the horizontal axis
	 * @param entityPitch - where the entity is looking on the vertical axis
	 * @param scale       - the relative scale of the entity
	 */
	@Override
	public void render(AdiposeEntity entity, float originX, float originY, float originZ, float entityYaw, float entityPitch, float scale) {
		body.render(scale);
		leftArm.render(scale);
		rightLeg.render(scale);
		leftLeg.render(scale);
		rightArm.render(scale);
	}

}