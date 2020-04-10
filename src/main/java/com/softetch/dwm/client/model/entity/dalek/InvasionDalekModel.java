package com.softetch.dwm.client.model.entity.dalek;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.common.entity.dalek.InvasionDalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class InvasionDalekModel extends EntityModel<InvasionDalekEntity> {
	private final RendererModel plunger;
	private final RendererModel gunstick;
	private final RendererModel neck;
	private final RendererModel eyestalk;
	private final RendererModel head;
	private final RendererModel skirt;
	private final RendererModel frontslope;
	private final RendererModel weaponsBelt;
	private final RendererModel ears;

	public InvasionDalekModel() {
		textureWidth = 128;
		textureHeight = 128;

		plunger = new RendererModel(this);
		plunger.setRotationPoint(-4.0F, 10.0F, -5.5F);
		plunger.cubeList.add(new ModelBox(plunger, 38, 65, -1.0F, -1.0F, -6.5F, 2, 2, 1, 0.0F, false));
		plunger.cubeList.add(new ModelBox(plunger, 0, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

		gunstick = new RendererModel(this);
		gunstick.setRotationPoint(4.0F, 10.0F, -5.5F);
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.25F, -0.5F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.75F, -0.5F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.75F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.5F, -5.75F, 1, 1, 6, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.25F, -5.0F, 1, 1, 4, 0.0F, false));

		neck = new RendererModel(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 0, -2.0F, -15.0F, -4.25F, 4, 2, 2, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.75F, -20.5F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -1.75F, -20.5F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -20.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -20.5F, -0.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -20.0F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -1.75F, -20.5F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.75F, -20.5F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -20.0F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -20.0F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -20.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -20.5F, -0.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 38, 65, -3.5F, -19.5F, -2.5F, 7, 3, 7, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -20.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -18.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -20.0F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -16.5F, -3.5F, 9, 1, 9, 0.0F, false));

		eyestalk = new RendererModel(this);
		eyestalk.setRotationPoint(0.0F, 0.0F, -2.5F);
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 102, 8, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, 0.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, -0.5F, -1.0F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, -1.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 43, 102, -0.5F, -0.5F, -5.55F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, -0.5F, 0.0F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -3.5F, 1, 1, 0, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 1.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -0.5F, -4.5F, 8, 3, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.5F, -0.5F, -4.0F, 9, 3, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -1.0F, -4.0F, 7, 2, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -1.0F, -3.5F, 8, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -1.5F, -3.5F, 6, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -1.5F, -3.0F, 7, 2, 6, 0.0F, false));

		skirt = new RendererModel(this);
		skirt.setRotationPoint(0.0F, 24.0F, 0.0F);
		skirt.cubeList.add(new ModelBox(skirt, 38, 65, -5.5F, -3.0F, -7.5F, 11, 3, 14, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 38, 65, -5.0F, -3.0F, -8.0F, 10, 3, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -5.0F, -12.0F, -2.0F, 10, 9, 8, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -3.0F, -6.0F, -6.0F, 6, 3, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -5.0F, -6.0F, 9, 2, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -9.0F, -4.0F, 9, 6, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -12.0F, -3.0F, 9, 6, 4, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -11.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -11.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -11.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -11.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -11.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -11.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -11.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -11.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -11.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -11.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -9.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -9.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -9.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -7.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -9.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -9.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -9.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -9.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -9.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -9.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -9.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -7.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -7.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -7.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -7.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -7.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -7.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -5.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -5.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -5.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -5.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -5.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -5.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -7.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -7.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -7.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -5.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -5.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -5.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -5.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -0.75F, -2.5F, 5.0F, 1, 1, 2, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 108, 11, -1.75F, -3.5F, 4.75F, 3, 3, 2, 0.0F, false));

		frontslope = new RendererModel(this);
		frontslope.setRotationPoint(0.0F, -2.0F, -7.0F);
		setRotationAngle(frontslope, -0.3927F, 0.0F, 0.0F);
		skirt.addChild(frontslope);
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 0, -3.0F, -10.8478F, -0.7654F, 6, 10, 2, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 0, -4.5F, -10.8478F, -0.2654F, 9, 10, 2, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -3.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -3.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -3.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -5.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -7.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -9.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -3.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -5.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -7.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -9.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -9.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -7.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -5.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -3.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -3.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -5.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -7.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -9.3478F, -1.2654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -5.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -7.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -9.3478F, -0.7654F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -9.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -7.8478F, 0.2346F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -5.8478F, 0.2346F, 1, 1, 1, 0.0F, false));

		weaponsBelt = new RendererModel(this);
		weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.5F, -16.0F, -4.5F, 11, 1, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.5F, -13.0F, -4.5F, 11, 1, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 88, 8, -5.0F, -15.0F, -4.0F, 10, 2, 9, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, -4.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, -2.75F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, -1.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, 0.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, 1.75F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, 3.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 3.75F, -15.5F, 4.75F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 4.0F, -15.5F, 4.75F, 1, 3, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 2.5F, -15.5F, 4.75F, 1, 3, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, 1.0F, -15.5F, 4.75F, 1, 3, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 88, 8, -4.0F, -15.0F, -3.0F, 8, 2, 9, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -0.5F, -15.5F, 4.75F, 1, 3, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -2.0F, -15.5F, 4.75F, 1, 3, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -3.5F, -15.5F, 4.75F, 1, 3, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.0F, -15.5F, 5.75F, 1, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, 4.75F, 1, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, 3.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, 1.75F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, 0.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, -1.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, -2.75F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.75F, -15.5F, -4.25F, 2, 3, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 102, 8, -5.0F, -15.0F, -5.5F, 2, 2, 2, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 102, 8, 3.0F, -15.0F, -5.5F, 2, 2, 2, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, 1.0F, 1.0F);
		ears.cubeList.add(new ModelBox(ears, 9, 30, 3.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 9, 30, -4.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(InvasionDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GlStateManager.pushMatrix();
		float scaleFactor = 1.3f;
		GlStateManager.scalef(scaleFactor, scaleFactor, scaleFactor);
		GlStateManager.translatef(0.0f, 1.0f - scaleFactor, 0.0f);
		plunger.render(scale);
		gunstick.render(scale);
		neck.render(scale);
		eyestalk.render(scale);
		head.render(scale);
		skirt.render(scale);
		weaponsBelt.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.enableBlend();
		GlStateManager.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		GlStateManager.color4f(2.0f, 2.0f, 2.0f, 0.8f);
		ears.render(scale);
		GlStateManager.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}