package com.softetch.dwm.client.model.entity.dalek;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import com.softetch.dwm.common.entity.TimeWarDalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class TimeWarDalekModel extends EntityModel<TimeWarDalekEntity> {
	private final RendererModel body;
	private final RendererModel base;
	private final RendererModel balls;
	private final RendererModel weaponsBelt;
	private final RendererModel plunger;
	private final RendererModel gun;
	private final RendererModel neck;
	private final RendererModel eye;
	private final RendererModel head;
	private final RendererModel ears;

	public TimeWarDalekModel() {
		textureWidth = 256;
		textureHeight = 256;

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		base = new RendererModel(this);
		base.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(base);
		base.cubeList.add(new ModelBox(base, 0, 0, -7.0F, -1.0F, -5.0F, 14, 1, 5, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -7.5F, -1.0F, 0.0F, 15, 1, 6, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -6.0F, -1.0F, -6.5F, 12, 1, 2, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -3.0F, -1.0F, -7.25F, 6, 1, 2, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -6.5F, -1.0F, 5.5F, 13, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, -5.5F, -7.0F, -5.5F, 11, 6, 11, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, -5.0F, -13.0F, 5.0F, 10, 7, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, -6.0F, -6.0F, 5.0F, 12, 5, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, 5.25F, -7.0F, -2.5F, 1, 6, 8, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, 5.75F, -7.0F, 0.5F, 1, 6, 5, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, -6.75F, -7.0F, 0.5F, 1, 6, 5, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, -6.25F, -7.0F, -2.5F, 1, 6, 8, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 17, -2.5F, -7.0F, -6.0F, 5, 6, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 16, -5.0F, -13.0F, -4.5F, 10, 6, 10, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 16, 4.75F, -13.0F, -1.5F, 1, 6, 7, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 16, -5.75F, -13.0F, -1.5F, 1, 6, 7, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 16, -1.5F, -13.0F, -5.0F, 3, 6, 1, 0.0F, false));

		balls = new RendererModel(this);
		balls.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(balls);
		balls.cubeList.add(new ModelBox(balls, 48, 0, -2.25F, -3.5F, -6.5F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -5.0F, -3.5F, -6.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -5.0F, -6.5F, -6.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -2.25F, -6.5F, -6.5F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 0.25F, -6.5F, -6.5F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 3.0F, -6.5F, -6.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 2.25F, -12.5F, -5.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -1.0F, -12.5F, -5.5F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -4.25F, -12.5F, -5.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -4.25F, -9.5F, -5.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -1.0F, -9.5F, -5.5F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 2.25F, -9.5F, -5.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 0.25F, -3.5F, -6.5F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 3.0F, -3.5F, -6.0F, 2, 2, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -3.5F, -5.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -6.5F, -5.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -6.5F, -5.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.75F, -6.5F, -2.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -7.25F, -6.5F, 0.75F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -7.25F, -6.5F, 3.25F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -7.25F, -3.5F, 3.25F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -7.25F, -3.5F, 0.75F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.75F, -3.5F, -2.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -3.5F, -5.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -9.5F, -4.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.25F, -9.5F, -0.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.25F, -9.5F, 2.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.25F, -12.5F, 2.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.25F, -12.5F, -0.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -12.5F, -4.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -12.5F, -4.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.25F, -12.5F, -0.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.25F, -12.5F, 2.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.25F, -9.5F, 2.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -6.25F, -9.5F, -0.5F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -9.5F, -4.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.75F, -3.5F, -2.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 5.75F, -6.5F, -2.0F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 6.25F, -3.5F, 0.75F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 6.25F, -6.5F, 0.75F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 6.25F, -3.5F, 3.25F, 1, 2, 2, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 48, 0, 6.25F, -6.5F, 3.25F, 1, 2, 2, 0.0F, false));

		weaponsBelt = new RendererModel(this);
		weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 3.0F, -18.5F, -5.5F, 1, 2, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -1.5F, -18.5F, -5.5F, 3, 2, 0, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -4.0F, -18.5F, -5.5F, 1, 2, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 59, -5.0F, -18.5F, -4.75F, 10, 2, 10, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 112, 32, -5.5F, -18.75F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 52, 49, -5.0F, -16.0F, -5.0F, 10, 2, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 49, 65, -5.5F, -14.0F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 49, 65, 5.0F, -14.0F, -2.0F, 1, 1, 8, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 49, 65, -6.0F, -14.0F, -2.0F, 1, 1, 8, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 49, 65, -5.0F, -14.0F, -2.0F, 1, 1, 8, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 107, 49, -5.5F, -16.5F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.5F, -15.5F, -5.75F, 1, 1, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.5F, -15.5F, -5.75F, 1, 1, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, -2.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, -4.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, -0.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, 1.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, 3.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -3.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -1.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 0.5F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 2.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, 3.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, 1.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, -0.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, -2.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, -4.5F, 1, 4, 1, 0.0F, false));

		plunger = new RendererModel(this);
		plunger.setRotationPoint(-3.0F, 9.25F, -5.0F);
		plunger.cubeList.add(new ModelBox(plunger, 64, 0, -0.5F, -0.5F, -4.75F, 1, 1, 5, 0.0F, false));
		plunger.cubeList.add(new ModelBox(plunger, 66, 20, -1.0F, -1.0F, -5.75F, 2, 2, 1, 0.0F, false));

		gun = new RendererModel(this);
		gun.setRotationPoint(3.0F, 9.25F, -5.25F);
		gun.cubeList.add(new ModelBox(gun, 88, 0, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		neck = new RendererModel(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 84, 83, -4.0F, -23.25F, -3.75F, 8, 6, 8, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 98, -5.0F, -19.75F, -4.5F, 10, 1, 10, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 40, 98, -5.0F, -21.5F, -4.5F, 10, 1, 10, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 40, 98, -5.0F, -23.5F, -4.5F, 10, 1, 10, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, 1.0F, -22.75F, -4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, 3.5F, -22.75F, -4.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, 3.5F, -22.75F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, 1.0F, -22.75F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, -2.0F, -22.75F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, -4.75F, -22.75F, 1.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, -4.75F, -22.75F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, -4.75F, -22.75F, -1.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, 3.75F, -22.75F, -1.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, 3.75F, -22.75F, 1.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, -2.0F, -22.75F, -4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 74, 83, -4.5F, -22.75F, -4.0F, 1, 4, 1, 0.0F, false));

		eye = new RendererModel(this);
		eye.setRotationPoint(0.0F, -2.75F, 0.5F);
		eye.cubeList.add(new ModelBox(eye, 124, 0, -0.5F, -1.5F, -10.5F, 1, 1, 6, 0.0F, false));
		eye.cubeList.add(new ModelBox(eye, 191, 0, -1.5F, -2.5F, -10.25F, 3, 3, 1, 0.0F, false));
		eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -2.0F, -8.75F, 2, 2, 0, 0.0F, false));
		eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -2.0F, -8.25F, 2, 2, 0, 0.0F, false));
		eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -2.0F, -7.75F, 2, 2, 0, 0.0F, false));
		eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -2.0F, -7.25F, 2, 2, 0, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, -1.25F, 0.5F);
		head.cubeList.add(new ModelBox(head, 50, 148, -4.25F, -3.75F, -4.0F, 8, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 50, 148, -5.0F, -2.75F, -5.0F, 10, 1, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 4, 145, -5.5F, -2.0F, -5.5F, 11, 4, 11, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, -2.25F, 0.5F);
		ears.cubeList.add(new ModelBox(ears, 48, 116, 4.25F, -3.0F, -0.5F, 1, 2, 1, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 48, 116, -5.25F, -3.0F, -0.5F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(TimeWarDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		body.render(scale);
		weaponsBelt.render(scale);
		plunger.render(scale);
		gun.render(scale);
		neck.render(scale);
		eye.render(scale);
		head.render(scale);
		ears.render(scale);
	}

	@Override
	public void setRotationAngles(TimeWarDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eye.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eye.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.gun.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.ears.rotateAngleY = this.head.rotateAngleY;
	}
}