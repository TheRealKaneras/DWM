package com.softetch.dwm.client.model.entity.dalek;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.common.entity.dalek.GuardDalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class GuardDalekModel extends EntityModel<GuardDalekEntity> {
	private final RendererModel plunger;
	private final RendererModel gunstick;
	private final RendererModel neck;
	private final RendererModel midsection;
	private final RendererModel head;
	private final RendererModel eyestalk;
	private final RendererModel balls;
	private final RendererModel frontslope;
	private final RendererModel skirtPanels;
	private final RendererModel ears;

	public GuardDalekModel() {
		textureWidth = 128;
		textureHeight = 128;

		plunger = new RendererModel(this);
		plunger.setRotationPoint(-3.5F, 11.0F, -5.5F);
		plunger.cubeList.add(new ModelBox(plunger, 111, 64, -1.0F, -1.0F, -6.5F, 2, 2, 1, 0.0F, false));
		plunger.cubeList.add(new ModelBox(plunger, 96, 64, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

		gunstick = new RendererModel(this);
		gunstick.setRotationPoint(3.5F, 11.0F, -5.45F);
		gunstick.cubeList.add(new ModelBox(gunstick, 80, 65, -0.25F, -0.5F, -5.05F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 80, 65, -0.75F, -0.5F, -5.05F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 80, 65, -0.5F, -0.75F, -5.05F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 80, 65, -0.5F, -0.25F, -5.05F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 64, 64, -0.5F, -0.5F, -5.8F, 1, 1, 6, 0.0F, false));

		neck = new RendererModel(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 32, -2.0F, -19.5F, -3.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, 1.0F, -19.5F, -3.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, 3.0F, -19.0F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, 3.0F, -19.5F, -1.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, -1.75F, -19.5F, 4.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, 0.75F, -19.5F, 4.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, -4.0F, -19.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 32, -4.0F, -19.5F, -1.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 44, -3.5F, -18.5F, -2.5F, 7, 3, 7, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 42, 32, -4.5F, -19.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 44, 43, -4.25F, -17.5F, -3.25F, 8, 1, 8, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 81, 32, -4.5F, -15.5F, -3.5F, 9, 1, 9, 0.0F, false));

		midsection = new RendererModel(this);
		midsection.setRotationPoint(0.0F, 24.0F, 0.0F);
		midsection.cubeList.add(new ModelBox(midsection, 0, 64, -5.5F, -15.0F, -4.5F, 11, 1, 11, 0.0F, false));
		midsection.cubeList.add(new ModelBox(midsection, 0, 77, -5.0F, -14.0F, -4.0F, 10, 2, 10, 0.0F, false));
		midsection.cubeList.add(new ModelBox(midsection, 41, 79, -5.5F, -12.0F, -4.5F, 11, 1, 11, 0.0F, false));
		midsection.cubeList.add(new ModelBox(midsection, 40, 64, 2.5F, -14.0F, -5.5F, 2, 2, 2, 0.0F, false));
		midsection.cubeList.add(new ModelBox(midsection, 49, 64, -4.5F, -14.0F, -5.5F, 2, 2, 2, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 27, 0, -4.0F, -22.5F, -3.5F, 8, 3, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 27, 13, -4.5F, -22.5F, -3.0F, 9, 3, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 66, 17, -3.5F, -23.0F, -3.0F, 7, 2, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 96, 17, -4.0F, -23.0F, -2.5F, 8, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -23.5F, -2.5F, 6, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 9, -3.5F, -23.5F, -2.0F, 7, 2, 6, 0.0F, false));

		eyestalk = new RendererModel(this);
		eyestalk.setRotationPoint(0.0F, -23.0F, -2.5F);
		head.addChild(eyestalk);
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 0, -0.5F, -1.0F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 0, -0.5F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 0, -0.5F, -1.0F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 0, -0.5F, -1.0F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 0, -0.5F, -1.0F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 69, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 87, 1, 0.0F, -0.5F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 87, 1, 0.0F, -0.5F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 87, 1, 0.0F, -0.5F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 87, 1, 0.0F, -0.5F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 87, 1, 0.0F, -0.5F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 83, 8, 0.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 88, 5, -0.5F, -1.0F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 93, 8, -1.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 88, 8, -0.5F, -0.5F, -5.55F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 88, 12, -0.5F, 0.0F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 91, 1, -1.0F, -0.5F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 91, 1, -1.0F, -0.5F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 91, 1, -1.0F, -0.5F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 91, 1, -1.0F, -0.5F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 91, 1, -1.0F, -0.5F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 2, -0.5F, 0.0F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 2, -0.5F, 0.0F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 2, -0.5F, 0.0F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 2, -0.5F, 0.0F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 89, 2, -0.5F, 0.0F, -3.5F, 1, 1, 0, 0.0F, false));

		balls = new RendererModel(this);
		balls.setRotationPoint(0.0F, 24.0F, 0.0F);
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -10.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -10.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -10.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -10.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -10.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -10.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -10.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -4.25F, -10.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -1.75F, -10.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 0.75F, -10.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 3.25F, -10.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -10.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -8.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -8.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -6.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -4.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -8.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -8.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -6.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -8.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -8.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 3.25F, -8.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 0.75F, -8.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -1.75F, -8.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -4.25F, -8.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -8.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -8.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -6.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -6.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -6.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -6.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -4.25F, -6.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -1.75F, -6.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -4.25F, -4.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -4.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -4.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -4.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -4.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -4.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -4.0F, 0.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -5.25F, -4.0F, 1.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -6.0F, 3.25F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 3.25F, -6.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 0.75F, -6.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 4.25F, -6.0F, 4.75F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 3.25F, -4.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, 0.75F, -4.0F, 5.5F, 1, 1, 1, 0.0F, false));
		balls.cubeList.add(new ModelBox(balls, 0, 97, -1.75F, -4.0F, 5.5F, 1, 1, 1, 0.0F, false));

		frontslope = new RendererModel(this);
		frontslope.setRotationPoint(0.0F, -2.0F, -7.0F);
		balls.addChild(frontslope);
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -4.75F, -2.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 3.75F, -2.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 3.75F, -4.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 3.75F, -6.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 3.75F, -8.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 2.25F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 2.25F, -6.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 2.25F, -4.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 2.25F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 1.5F, -8.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -0.5F, -8.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 1.5F, -6.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -0.5F, -6.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 1.5F, -4.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -0.5F, -4.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, 1.5F, -2.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -0.5F, -2.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -2.5F, -2.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -2.5F, -4.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -2.5F, -6.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -2.5F, -8.0F, 2.5F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -3.25F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -3.25F, -6.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -3.25F, -4.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -3.25F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -4.75F, -4.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -4.75F, -6.0F, 4.75F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 97, -4.75F, -8.0F, 4.75F, 1, 1, 1, 0.0F, false));

		skirtPanels = new RendererModel(this);
		skirtPanels.setRotationPoint(0.0F, 24.0F, 0.0F);
		skirtPanels.cubeList.add(new ModelBox(skirtPanels, 0, 109, -4.5F, -2.0F, -5.5F, 9, 2, 2, 0.0F, false));
		skirtPanels.cubeList.add(new ModelBox(skirtPanels, 0, 114, -5.75F, -2.0F, -4.0F, 11, 2, 11, 0.0F, false));
		skirtPanels.cubeList.add(new ModelBox(skirtPanels, 114, 117, -3.0F, -11.0F, -4.25F, 6, 10, 2, 0.0F, false));
		skirtPanels.cubeList.add(new ModelBox(skirtPanels, 90, 117, -4.5F, -11.0F, -2.5F, 9, 9, 2, 0.0F, false));
		skirtPanels.cubeList.add(new ModelBox(skirtPanels, 53, 112, -5.0F, -11.0F, -0.75F, 10, 9, 7, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, 24.0F, 0.0F);
		ears.cubeList.add(new ModelBox(ears, 1, 20, 3.5F, -23.5F, 0.5F, 1, 1, 1, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 6, 19, -4.5F, -23.5F, 0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(GuardDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GlStateManager.pushMatrix();
		float scaleFactor = 1.5f;
		GlStateManager.scalef(scaleFactor, scaleFactor, scaleFactor);
		GlStateManager.translatef(0.0f, 1.0f - scaleFactor, 0.0f);
		plunger.render(scale);
		gunstick.render(scale);
		neck.render(scale);
		midsection.render(scale);
		head.render(scale);
		balls.render(scale);
		skirtPanels.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.enableBlend();
		GlStateManager.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		GlStateManager.color4f(2.0f, 2.0f, 2.0f, 0.8f);
		ears.render(scale);
		GlStateManager.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
	}

	@Override
	public void setRotationAngles(GuardDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eyestalk.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eyestalk.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.gunstick.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.ears.rotateAngleY = this.head.rotateAngleY;
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}