package com.softetch.dwm.client.model.entity.dalek;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.common.entity.dalek.SkaroDalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class SkaroDalekModel extends EntityModel<SkaroDalekEntity> {
	private final RendererModel gunstick;
	private final RendererModel plunger;
	private final RendererModel weaponsBelt;
	private final RendererModel neck;
	private final RendererModel eyestalk;
	private final RendererModel head;
	private final RendererModel skirt;
	private final RendererModel frontslope;
	private final RendererModel ears;

	public SkaroDalekModel() {
		textureWidth = 128;
		textureHeight = 128;

		gunstick = new RendererModel(this);
		gunstick.setRotationPoint(3.5F, 11.0F, -5.5F);
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.25F, -0.5F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.75F, -0.5F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.75F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.5F, -5.75F, 1, 1, 6, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.25F, -5.0F, 1, 1, 4, 0.0F, false));

		plunger = new RendererModel(this);
		plunger.setRotationPoint(-3.5F, 11.0F, -5.5F);
		plunger.cubeList.add(new ModelBox(plunger, 38, 65, -1.0F, -1.0F, -6.5F, 2, 2, 1, 0.0F, false));
		plunger.cubeList.add(new ModelBox(plunger, 0, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

		weaponsBelt = new RendererModel(this);
		weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.5F, -15.0F, -4.5F, 11, 1, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 64, 33, -5.0F, -14.0F, -4.0F, 10, 2, 10, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.5F, -12.0F, -4.5F, 11, 1, 11, 0.0F, false));

		neck = new RendererModel(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.75F, -19.5F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -1.75F, -19.5F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.5F, -0.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.0F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -1.75F, -19.5F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.75F, -19.5F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.0F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.0F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.5F, -0.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 38, 65, -3.5F, -18.5F, -2.5F, 7, 3, 7, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -19.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -17.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.0F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -15.5F, -3.5F, 9, 1, 9, 0.0F, false));

		eyestalk = new RendererModel(this);
		eyestalk.setRotationPoint(0.0F, 1.0F, -2.5F);
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
		eyestalk.cubeList.add(new ModelBox(eyestalk, 34, 98, -0.5F, -0.5F, -5.55F, 1, 1, 1, 0.0F, false));
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
		head.setRotationPoint(0.0F, 4.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -2.5F, -4.5F, 8, 3, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.5F, -2.5F, -4.0F, 9, 3, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -3.0F, -4.0F, 7, 2, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -3.0F, -3.5F, 8, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -3.5F, -3.5F, 6, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -3.5F, -3.0F, 7, 2, 6, 0.0F, false));

		skirt = new RendererModel(this);
		skirt.setRotationPoint(0.0F, 24.0F, 0.0F);
		skirt.cubeList.add(new ModelBox(skirt, 102, 8, 2.5F, -14.0F, -5.5F, 2, 2, 2, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 38, 65, -5.5F, -2.0F, -7.5F, 11, 2, 14, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 38, 65, -5.0F, -2.0F, -8.0F, 10, 2, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -5.0F, -11.0F, -2.0F, 10, 9, 8, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -3.0F, -5.0F, -6.0F, 6, 3, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -4.0F, -6.0F, 9, 2, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -8.0F, -4.0F, 9, 6, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -11.0F, -3.0F, 9, 6, 4, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -10.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -10.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -10.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -10.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -10.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -10.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -8.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -8.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -8.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -6.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -8.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -8.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -8.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -6.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -6.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -6.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -6.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -4.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -4.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -4.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -6.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 102, 8, -4.5F, -14.0F, -5.5F, 2, 2, 2, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -4.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));

		frontslope = new RendererModel(this);
		frontslope.setRotationPoint(0.0F, -2.0F, -7.0F);
		setRotationAngle(frontslope, -0.3927F, 0.0F, 0.0F);
		skirt.addChild(frontslope);
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 0, -3.0F, -9.9239F, -0.3827F, 6, 10, 2, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 0, -4.5F, -9.9239F, 0.1173F, 9, 10, 2, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -2.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -2.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -2.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -4.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -6.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -8.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -2.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -4.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -6.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -8.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -8.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -6.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -4.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -2.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -2.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -4.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -6.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -8.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -4.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -6.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -8.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -8.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -6.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -4.9239F, 0.6173F, 1, 1, 1, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, 4.0F, 1.0F);
		ears.cubeList.add(new ModelBox(ears, 9, 30, 3.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 9, 30, -4.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(SkaroDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GlStateManager.pushMatrix();
		float scaleFactor = 1.3f;
		GlStateManager.scalef(scaleFactor, scaleFactor, scaleFactor);
		GlStateManager.translatef(0.0f, 1.0f - scaleFactor, 0.0f);
		gunstick.render(scale);
		plunger.render(scale);
		weaponsBelt.render(scale);
		neck.render(scale);
		eyestalk.render(scale);
		head.render(scale);
		skirt.render(scale);
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
	public void setRotationAngles(SkaroDalekEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eyestalk.rotateAngleY = this.head.rotateAngleY;
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