package com.softetch.dwm.client.model.entity.dalek;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.dalek.InvasionDalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class InvasionDalekModel extends EntityModel<InvasionDalekEntity> {
	private final ModelRenderer plunger;
	private final ModelRenderer gunstick;
	private final ModelRenderer neck;
	private final ModelRenderer eyestalk;
	private final ModelRenderer head;
	private final ModelRenderer skirt;
	private final ModelRenderer frontslope;
	private final ModelRenderer weaponsBelt;
	private final ModelRenderer ears;

	public InvasionDalekModel() {
		textureWidth = 128;
		textureHeight = 128;

		plunger = new ModelRenderer(this);
		plunger.setRotationPoint(-4.0F, 10.0F, -5.5F);
		plunger.setTextureOffset(38, 65).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		plunger.setTextureOffset(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		gunstick = new ModelRenderer(this);
		gunstick.setRotationPoint(4.0F, 10.0F, -5.5F);
		gunstick.setTextureOffset(0, 0).addBox(-0.25F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		gunstick.setTextureOffset(0, 0).addBox(-0.75F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		gunstick.setTextureOffset(0, 0).addBox(-0.5F, -0.75F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		gunstick.setTextureOffset(0, 0).addBox(-0.5F, -0.5F, -5.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		gunstick.setTextureOffset(0, 0).addBox(-0.5F, -0.25F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.setTextureOffset(0, 0).addBox(-2.0F, -15.0F, -4.25F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(0.75F, -20.5F, -3.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-1.75F, -20.5F, -3.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(3.25F, -20.5F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(3.25F, -20.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(3.25F, -20.0F, -3.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-1.75F, -20.5F, 4.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(0.75F, -20.5F, 4.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(3.25F, -20.0F, 4.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-4.25F, -20.0F, -3.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-4.25F, -20.5F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-4.25F, -20.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(38, 65).addBox(-3.5F, -19.5F, -2.5F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		neck.setTextureOffset(92, 8).addBox(-4.5F, -20.5F, -3.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		neck.setTextureOffset(92, 8).addBox(-4.5F, -18.5F, -3.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-4.25F, -20.0F, 4.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		neck.setTextureOffset(92, 8).addBox(-4.5F, -16.5F, -3.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);

		eyestalk = new ModelRenderer(this);
		eyestalk.setRotationPoint(0.0F, 0.0F, -2.5F);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, -1.0F, -3.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, -1.0F, -2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(102, 8).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(0.0F, -0.5F, -3.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(0.0F, -0.5F, -3.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(0.0F, -0.5F, -2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(0.0F, -0.5F, -2.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(60, 71).addBox(0.0F, -0.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		eyestalk.setTextureOffset(60, 71).addBox(-0.5F, -1.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		eyestalk.setTextureOffset(60, 71).addBox(-1.0F, -0.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		eyestalk.setTextureOffset(43, 102).addBox(-0.5F, -0.5F, -5.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		eyestalk.setTextureOffset(60, 71).addBox(-0.5F, 0.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-1.0F, -0.5F, -2.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-1.0F, -0.5F, -2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-1.0F, -0.5F, -3.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-1.0F, -0.5F, -3.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, 0.0F, -2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, 0.0F, -3.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		eyestalk.setTextureOffset(92, 107).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 1.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -0.5F, -4.5F, 8.0F, 3.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.5F, -0.5F, -4.0F, 9.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -3.5F, 8.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -3.5F, 6.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.5F, -1.5F, -3.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);

		skirt = new ModelRenderer(this);
		skirt.setRotationPoint(0.0F, 24.0F, 0.0F);
		skirt.setTextureOffset(38, 65).addBox(-5.5F, -3.0F, -7.5F, 11.0F, 3.0F, 14.0F, 0.0F, false);
		skirt.setTextureOffset(38, 65).addBox(-5.0F, -3.0F, -8.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(0, 0).addBox(-5.0F, -12.0F, -2.0F, 10.0F, 9.0F, 8.0F, 0.0F, false);
		skirt.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -6.0F, 6.0F, 3.0F, 9.0F, 0.0F, false);
		skirt.setTextureOffset(0, 0).addBox(-4.5F, -5.0F, -6.0F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		skirt.setTextureOffset(0, 0).addBox(-4.5F, -9.0F, -4.0F, 9.0F, 6.0F, 9.0F, 0.0F, false);
		skirt.setTextureOffset(0, 0).addBox(-4.5F, -12.0F, -3.0F, 9.0F, 6.0F, 4.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -11.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -11.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -11.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -11.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -11.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-4.5F, -11.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-2.0F, -11.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(0.5F, -11.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(3.0F, -11.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -11.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -9.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -9.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -9.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -7.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -9.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(3.0F, -9.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(0.5F, -9.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-2.0F, -9.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-4.5F, -9.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -9.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -9.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -7.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -7.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -7.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -7.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-4.5F, -7.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-2.0F, -7.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-4.5F, -5.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -5.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -5.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -5.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -5.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-5.5F, -5.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -7.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(3.0F, -7.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(0.5F, -7.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(4.5F, -5.0F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(3.0F, -5.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(0.5F, -5.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(92, 107).addBox(-2.0F, -5.0F, 5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skirt.setTextureOffset(0, 0).addBox(-0.75F, -2.5F, 5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		skirt.setTextureOffset(108, 11).addBox(-1.75F, -3.5F, 4.75F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		frontslope = new ModelRenderer(this);
		frontslope.setRotationPoint(0.0F, -2.0F, -7.0F);
		skirt.addChild(frontslope);
		setRotationAngle(frontslope, -0.3927F, 0.0F, 0.0F);
		frontslope.setTextureOffset(0, 0).addBox(-3.0F, -10.8478F, -0.7654F, 6.0F, 10.0F, 2.0F, 0.0F, false);
		frontslope.setTextureOffset(0, 0).addBox(-4.5F, -10.8478F, -0.2654F, 9.0F, 10.0F, 2.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-4.25F, -3.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-5.0F, -3.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(4.0F, -3.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(4.0F, -5.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(4.0F, -7.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(4.0F, -9.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(3.25F, -3.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(3.25F, -5.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(3.25F, -7.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(3.25F, -9.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(1.0F, -9.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(1.0F, -7.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(1.0F, -5.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(1.0F, -3.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-1.75F, -3.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-1.75F, -5.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-1.75F, -7.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-1.75F, -9.3478F, -1.2654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-4.25F, -5.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-4.25F, -7.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-4.25F, -9.3478F, -0.7654F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-5.0F, -9.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-5.0F, -7.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		frontslope.setTextureOffset(92, 107).addBox(-5.0F, -5.8478F, 0.2346F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		weaponsBelt = new ModelRenderer(this);
		weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.5F, -16.0F, -4.5F, 11.0F, 1.0F, 11.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.5F, -13.0F, -4.5F, 11.0F, 1.0F, 11.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(88, 8).addBox(-5.0F, -15.0F, -4.0F, 10.0F, 2.0F, 9.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, -4.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, -2.75F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, -1.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, 0.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, 1.75F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, 3.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(3.75F, -15.5F, 4.75F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(4.0F, -15.5F, 4.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(2.5F, -15.5F, 4.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(1.0F, -15.5F, 4.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(88, 8).addBox(-4.0F, -15.0F, -3.0F, 8.0F, 2.0F, 9.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-0.5F, -15.5F, 4.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-2.0F, -15.5F, 4.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-3.5F, -15.5F, 4.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.0F, -15.5F, 5.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, 4.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, 3.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, 1.75F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, 0.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, -1.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, -2.75F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(0, 0).addBox(-5.75F, -15.5F, -4.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(102, 8).addBox(-5.0F, -15.0F, -5.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		weaponsBelt.setTextureOffset(102, 8).addBox(3.0F, -15.0F, -5.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 1.0F, 1.0F);
		ears.setTextureOffset(9, 30).addBox(3.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.setTextureOffset(9, 30).addBox(-4.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(InvasionDalekEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eyestalk.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.eyestalk.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.gunstick.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.ears.rotateAngleY = this.head.rotateAngleY;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.push();
		float scaleFactor = 1.3f;
		matrixStack.scale(scaleFactor, scaleFactor, scaleFactor);
		matrixStack.translate(0.0f, 1.0f - scaleFactor, 0.0f);
		plunger.render(matrixStack, buffer, packedLight, packedOverlay);
		gunstick.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		eyestalk.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		skirt.render(matrixStack, buffer, packedLight, packedOverlay);
		weaponsBelt.render(matrixStack, buffer, packedLight, packedOverlay);
		ears.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}