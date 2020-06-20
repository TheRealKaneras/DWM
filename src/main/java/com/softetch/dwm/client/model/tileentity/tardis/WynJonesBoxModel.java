package com.softetch.dwm.client.model.tileentity.tardis;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;

public class WynJonesBoxModel extends AbstractTardisExteriorModel {
	private final ModelRenderer BaseRoof;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bb_main;
	private final ModelRenderer bb_main2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bb_main3;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bb_main4;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer leftDoor;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer rightDoor;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer Posts;
	private final ModelRenderer Post;
	private final ModelRenderer Post2;
	private final ModelRenderer Post3;
	private final ModelRenderer Post4;

	public WynJonesBoxModel() {
		textureWidth = 128;
		textureHeight = 128;

		BaseRoof = new ModelRenderer(this);
		BaseRoof.setRotationPoint(0.0F, 24.0F, 0.0F);
		BaseRoof.setTextureOffset(0, 0).addBox(-11.0F, -2.0F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-10.0F, -2.1F, -10.0F, 20.0F, 1.0F, 20.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-9.0F, -35.9F, -9.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-8.0F, -36.7F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-7.0F, -37.3F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-6.5F, -37.4F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-6.0F, -37.5F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-5.5F, -37.6F, -5.5F, 11.0F, 1.0F, 11.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-5.0F, -37.7F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-4.5F, -37.8F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-4.0F, -37.9F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-3.5F, -38.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-3.0F, -38.1F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-2.5F, -38.2F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		BaseRoof.setTextureOffset(0, 0).addBox(-2.0F, -38.3F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		BaseRoof.setTextureOffset(99, 90).addBox(-1.5F, -38.8F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		BaseRoof.setTextureOffset(65, 120).addBox(-1.0F, -41.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		BaseRoof.setTextureOffset(102, 90).addBox(-1.0F, -39.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		BaseRoof.setTextureOffset(102, 90).addBox(-1.0F, -43.2F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		BaseRoof.setTextureOffset(67, 116).addBox(-0.5F, -42.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		BaseRoof.setTextureOffset(96, 91).addBox(-1.5F, -42.3F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-2.0F, -36.4F, -0.6F);
		BaseRoof.addChild(bone16);
		setRotationAngle(bone16, 0.0F, -0.7854F, 0.0F);
		bone16.setTextureOffset(102, 90).addBox(0.2828F, -5.1F, -1.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -36.4F, 1.4F);
		BaseRoof.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
		bone17.setTextureOffset(102, 90).addBox(-0.4243F, -5.1F, -1.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-0.5F, -36.4F, 2.2F);
		BaseRoof.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.7854F, 0.0F);
		bone18.setTextureOffset(102, 90).addBox(0.2828F, -5.1F, -1.2F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(1.5F, -36.4F, 0.2F);
		BaseRoof.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.7854F, 0.0F);
		bone19.setTextureOffset(102, 90).addBox(-0.2828F, -5.1F, -1.2F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(30, 32).addBox(-9.0F, -34.3F, -10.5F, 18.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 42).addBox(-9.0F, -33.3F, -9.0F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 39).addBox(-9.0F, -33.6F, -9.2F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 36).addBox(-9.0F, -33.9F, -9.4F, 18.0F, 2.0F, 1.0F, 0.0F, false);

		bb_main2 = new ModelRenderer(this);
		bb_main2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bb_main2, 0.0F, -1.5708F, 0.0F);
		bb_main2.setTextureOffset(30, 32).addBox(-9.0F, -34.3F, -10.5F, 18.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main2.setTextureOffset(30, 42).addBox(-9.0F, -33.3F, -9.0F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(30, 39).addBox(-9.0F, -33.6F, -9.2F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(30, 36).addBox(-9.0F, -33.9F, -9.4F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(18, 52).addBox(-8.0F, -31.7F, -8.8F, 16.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(66, 8).addBox(-6.5F, -24.1F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(15, 66).addBox(-6.5F, -17.6F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(15, 71).addBox(-6.5F, -11.1F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(0, 24).addBox(-7.0F, -29.6F, -8.5F, 14.0F, 25.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(24, 54).addBox(-1.5F, -30.6F, -8.8F, 3.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(40, 52).addBox(-0.5F, -31.6F, -8.9F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(17, 48).addBox(-8.5F, -30.6F, -8.8F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(32, 53).addBox(6.5F, -30.6F, -8.8F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main2.setTextureOffset(17, 76).addBox(-8.5F, -4.6F, -8.8F, 17.0F, 3.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.0F, -25.8F, -7.7F);
		bb_main2.addChild(bone4);
		setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
		bone4.setTextureOffset(8, 104).addBox(-12.0F, -1.1364F, -1.4364F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(0, 95).addBox(-12.0F, -3.1163F, -3.4163F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(62, 60).addBox(-12.0F, 1.5506F, 1.2506F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(62, 56).addBox(-12.0F, 6.1468F, 5.8468F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(56, 52).addBox(-12.0F, 10.743F, 10.443F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(0, 95).addBox(-12.0F, 0.8435F, 0.5435F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(65, 48).addBox(-12.0F, 5.4397F, 5.1397F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(62, 58).addBox(-12.0F, 10.0359F, 9.7359F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(56, 54).addBox(-12.0F, 14.6321F, 14.3321F, 14.0F, 1.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(4.3F, -24.8F, -7.7F);
		bb_main2.addChild(bone5);
		setRotationAngle(bone5, -0.7854F, 0.0F, 1.5708F);
		bone5.setTextureOffset(0, 95).addBox(-5.5F, 4.874F, 4.574F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(10, 113).addBox(-4.8F, -1.9141F, -2.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(30, 26).addBox(0.8F, -1.9142F, -2.2143F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(0, 95).addBox(-4.8F, 3.7427F, 3.4426F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(30, 24).addBox(0.8F, 3.7427F, 3.4426F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.6F, -24.8F, -7.7F);
		bb_main2.addChild(bone6);
		setRotationAngle(bone6, -0.7854F, 0.0F, 1.5708F);
		bone6.setTextureOffset(0, 95).addBox(-5.5F, 4.874F, 4.574F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(30, 28).addBox(0.8F, 0.4191F, 0.1191F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(0, 95).addBox(-5.5F, 6.076F, 5.7761F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(30, 29).addBox(0.8F, 6.076F, 5.776F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(0, 95).addBox(-5.5F, 0.4192F, 0.1192F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main3 = new ModelRenderer(this);
		bb_main3.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bb_main3, 0.0F, 3.1416F, 0.0F);
		bb_main3.setTextureOffset(30, 32).addBox(-9.0F, -34.3F, -10.5F, 18.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main3.setTextureOffset(30, 42).addBox(-9.0F, -33.3F, -9.0F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(30, 39).addBox(-9.0F, -33.6F, -9.2F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(30, 36).addBox(-9.0F, -33.9F, -9.4F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(18, 52).addBox(-8.0F, -31.7F, -8.8F, 16.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(66, 8).addBox(-6.5F, -24.1F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(15, 66).addBox(-6.5F, -17.6F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(15, 71).addBox(-6.5F, -11.1F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(0, 24).addBox(-7.0F, -29.6F, -8.5F, 14.0F, 25.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(24, 54).addBox(-1.5F, -30.6F, -8.8F, 3.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(40, 52).addBox(-0.5F, -31.6F, -8.9F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(17, 49).addBox(-8.5F, -30.6F, -8.8F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(32, 53).addBox(6.5F, -30.6F, -8.8F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main3.setTextureOffset(17, 76).addBox(-8.5F, -4.6F, -8.8F, 17.0F, 3.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.0F, -25.8F, -7.7F);
		bb_main3.addChild(bone7);
		setRotationAngle(bone7, -0.7854F, 0.0F, 0.0F);
		bone7.setTextureOffset(8, 104).addBox(-12.0F, -1.1364F, -1.4364F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(0, 95).addBox(-12.0F, -3.1163F, -3.4163F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(62, 60).addBox(-12.0F, 1.5506F, 1.2506F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(62, 56).addBox(-12.0F, 6.1468F, 5.8468F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(56, 52).addBox(-12.0F, 10.743F, 10.443F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(0, 95).addBox(-12.0F, 0.8435F, 0.5435F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(65, 48).addBox(-12.0F, 5.4397F, 5.1397F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(62, 58).addBox(-12.0F, 10.0359F, 9.7359F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(56, 54).addBox(-12.0F, 14.6321F, 14.3321F, 14.0F, 1.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(4.3F, -24.8F, -7.7F);
		bb_main3.addChild(bone8);
		setRotationAngle(bone8, -0.7854F, 0.0F, 1.5708F);
		bone8.setTextureOffset(0, 95).addBox(-5.5F, 4.874F, 4.574F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(10, 113).addBox(-4.8F, -1.9141F, -2.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(30, 26).addBox(0.8F, -1.9142F, -2.2143F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(0, 95).addBox(-4.8F, 3.7427F, 3.4426F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(30, 24).addBox(0.8F, 3.7427F, 3.4426F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.6F, -24.8F, -7.7F);
		bb_main3.addChild(bone9);
		setRotationAngle(bone9, -0.7854F, 0.0F, 1.5708F);
		bone9.setTextureOffset(0, 95).addBox(-5.5F, 4.874F, 4.574F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(30, 28).addBox(0.8F, 0.4191F, 0.1191F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(0, 95).addBox(-5.5F, 6.076F, 5.7761F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(30, 29).addBox(0.8F, 6.076F, 5.776F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(0, 95).addBox(-5.5F, 0.4192F, 0.1192F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main4 = new ModelRenderer(this);
		bb_main4.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bb_main4, 0.0F, 1.5708F, 0.0F);
		bb_main4.setTextureOffset(30, 32).addBox(-9.0F, -34.3F, -10.5F, 18.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main4.setTextureOffset(30, 42).addBox(-9.0F, -33.3F, -9.0F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(30, 39).addBox(-9.0F, -33.6F, -9.2F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(30, 36).addBox(-9.0F, -33.9F, -9.4F, 18.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(18, 52).addBox(-8.0F, -31.7F, -8.8F, 16.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(66, 8).addBox(-6.5F, -24.1F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(15, 66).addBox(-6.5F, -17.6F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(15, 71).addBox(-6.5F, -11.1F, -8.8F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(0, 24).addBox(-7.0F, -29.6F, -8.5F, 14.0F, 25.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(24, 54).addBox(-1.5F, -30.6F, -8.8F, 3.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(40, 52).addBox(-0.5F, -31.6F, -8.9F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(18, 50).addBox(-8.5F, -30.6F, -8.8F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(32, 53).addBox(6.5F, -30.6F, -8.8F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		bb_main4.setTextureOffset(17, 76).addBox(-8.5F, -4.6F, -8.8F, 17.0F, 3.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(5.0F, -25.8F, -7.7F);
		bb_main4.addChild(bone10);
		setRotationAngle(bone10, -0.7854F, 0.0F, 0.0F);
		bone10.setTextureOffset(8, 104).addBox(-12.0F, -1.1364F, -1.4364F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(0, 95).addBox(-12.0F, -3.1163F, -3.4163F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(62, 60).addBox(-12.0F, 1.5506F, 1.2506F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(62, 56).addBox(-12.0F, 6.1468F, 5.8468F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(56, 52).addBox(-12.0F, 10.743F, 10.443F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(0, 95).addBox(-12.0F, 0.8435F, 0.5435F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(65, 48).addBox(-12.0F, 5.4397F, 5.1397F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(62, 58).addBox(-12.0F, 10.0359F, 9.7359F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(56, 54).addBox(-12.0F, 14.6321F, 14.3321F, 14.0F, 1.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(4.3F, -24.8F, -7.7F);
		bb_main4.addChild(bone11);
		setRotationAngle(bone11, -0.7854F, 0.0F, 1.5708F);
		bone11.setTextureOffset(0, 95).addBox(-5.5F, 4.874F, 4.574F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(10, 113).addBox(-4.8F, -1.9141F, -2.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(30, 26).addBox(0.8F, -1.9142F, -2.2143F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(0, 95).addBox(-4.8F, 3.7427F, 3.4426F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(30, 24).addBox(0.8F, 3.7427F, 3.4426F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(2.6F, -24.8F, -7.7F);
		bb_main4.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 1.5708F);
		bone12.setTextureOffset(0, 95).addBox(-5.5F, 4.874F, 4.574F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(30, 28).addBox(0.8F, 0.4191F, 0.1191F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(0, 95).addBox(-5.5F, 6.076F, 5.7761F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(30, 29).addBox(0.8F, 6.076F, 5.776F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(0, 95).addBox(-5.5F, 0.4192F, 0.1192F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		leftDoor = new ModelRenderer(this);
		leftDoor.setRotationPoint(8.0F, 21.0F, -9.0F);
		leftDoor.setTextureOffset(0, 24).addBox(-8.0F, -26.6F, 0.5F, 7.0F, 25.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(15, 66).addBox(-6.5F, -14.6F, 0.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(15, 71).addBox(-6.5F, -8.1F, 0.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(17, 76).addBox(-8.5F, -1.6F, 0.2F, 9.0F, 3.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(24, 52).addBox(-1.5F, -27.6F, 0.2F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(66, 8).addBox(-6.5F, -21.1F, 0.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(19, 50).addBox(-7.5F, -27.6F, 0.2F, 1.0F, 26.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(18, 52).addBox(-8.0F, -28.7F, 0.2F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 126).addBox(-7.0F, -15.2F, -0.3F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 126).addBox(-7.7F, -17.6F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-5.4F, -21.8F, 1.3F);
		leftDoor.addChild(bone3);
		setRotationAngle(bone3, -0.7854F, 0.0F, 1.5708F);
		bone3.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(30, 28).addBox(0.8F, 0.4191F, 0.1191F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(0, 95).addBox(-5.5F, 0.4192F, 0.1192F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.7F, -21.8F, 1.3F);
		leftDoor.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 1.5708F);
		bone2.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(10, 113).addBox(-4.8F, -1.9141F, -2.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(30, 26).addBox(0.8F, -1.9142F, -2.2143F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.0F, -22.8F, 1.3F);
		leftDoor.addChild(bone);
		setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
		bone.setTextureOffset(8, 104).addBox(-4.0F, -1.1364F, -1.4364F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 95).addBox(-4.0F, -3.1163F, -3.4163F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(62, 60).addBox(-4.0F, 1.5506F, 1.2506F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(62, 56).addBox(-4.0F, 6.1468F, 5.8468F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(56, 52).addBox(-4.0F, 10.743F, 10.443F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 95).addBox(-4.0F, 0.8435F, 0.5435F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(65, 48).addBox(-4.0F, 5.4397F, 5.1397F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(62, 58).addBox(-4.0F, 10.0359F, 9.7359F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(56, 54).addBox(-4.0F, 14.6321F, 14.3321F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		rightDoor = new ModelRenderer(this);
		rightDoor.setRotationPoint(-8.0F, 21.0F, -9.0F);
		rightDoor.setTextureOffset(0, 24).addBox(0.0F, -26.6F, 0.5F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(96, 106).addBox(0.0F, -20.6F, 0.7F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 42).addBox(0.0F, -13.6F, 0.5F, 7.0F, 12.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(15, 66).addBox(1.5F, -14.6F, 0.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(15, 71).addBox(1.5F, -8.1F, 0.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(17, 76).addBox(-0.5F, -1.6F, 0.2F, 9.0F, 3.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(19, 54).addBox(6.5F, -27.6F, 0.2F, 1.0F, 26.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(66, 8).addBox(1.5F, -21.1F, 0.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(18, 50).addBox(-0.5F, -27.6F, 0.2F, 2.0F, 26.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(18, 52).addBox(0.0F, -28.7F, 0.2F, 9.0F, 2.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 126).addBox(1.8F, -17.8F, 0.2F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(40, 52).addBox(7.5F, -28.6F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(2.6F, -21.8F, 1.3F);
		rightDoor.addChild(bone13);
		setRotationAngle(bone13, -0.7854F, 0.0F, 1.5708F);
		bone13.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(30, 28).addBox(7.8F, 0.4191F, 0.1191F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(30, 28).addBox(0.8F, 0.3485F, 0.0485F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(0, 95).addBox(-5.5F, 0.4192F, 0.1192F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(4.3F, -21.8F, 1.3F);
		rightDoor.addChild(bone14);
		setRotationAngle(bone14, -0.7854F, 0.0F, 1.5708F);
		bone14.setTextureOffset(0, 95).addBox(-5.5F, -0.7121F, -1.0121F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(10, 113).addBox(-4.8F, -1.9141F, -2.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(30, 26).addBox(7.8F, -1.9142F, -2.2143F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(30, 26).addBox(0.8F, -1.8434F, -2.1435F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(5.0F, -22.8F, 1.3F);
		rightDoor.addChild(bone15);
		setRotationAngle(bone15, -0.7854F, 0.0F, 0.0F);
		bone15.setTextureOffset(8, 104).addBox(-4.0F, -1.1364F, -1.4364F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(0, 95).addBox(-4.0F, -3.1163F, -3.4163F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(62, 60).addBox(-4.0F, 1.6213F, 1.3213F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(62, 56).addBox(-4.0F, 6.1468F, 5.8468F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(56, 52).addBox(-4.0F, 10.743F, 10.443F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(0, 95).addBox(-4.0F, 0.8435F, 0.5435F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(65, 48).addBox(-4.0F, 5.369F, 5.069F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(62, 58).addBox(-4.0F, 10.0359F, 9.7359F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(56, 54).addBox(-4.0F, 14.6321F, 14.3321F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Posts = new ModelRenderer(this);
		Posts.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Post = new ModelRenderer(this);
		Post.setRotationPoint(-9.0F, -2.0F, -9.0F);
		Posts.addChild(Post);
		Post.setTextureOffset(32, 74).addBox(-1.0F, -2.1F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(18, 54).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(8, 77).addBox(-0.8F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(4, 77).addBox(-0.8F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(18, 54).addBox(-0.2F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(76, 65).addBox(-0.2F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(76, 62).addBox(-0.5F, -33.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(18, 47).addBox(-0.1F, -3.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(32, 74).addBox(-0.5F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Post.setTextureOffset(19, 43).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(76, 34).addBox(-0.5F, -30.4F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(76, 32).addBox(-0.5F, -33.1F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(18, 47).addBox(-0.5F, -2.8F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(20, 50).addBox(-0.5F, -30.4F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(76, 17).addBox(-0.5F, -33.1F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(22, 27).addBox(-0.5F, -29.4F, -1.0F, 1.0F, 27.0F, 2.0F, 0.0F, false);
		Post.setTextureOffset(66, 10).addBox(-0.5F, -32.8F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Post.setTextureOffset(20, 20).addBox(-1.0F, -29.4F, -0.5F, 2.0F, 27.0F, 1.0F, 0.0F, false);
		Post.setTextureOffset(20, 44).addBox(-1.0F, -32.8F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Post2 = new ModelRenderer(this);
		Post2.setRotationPoint(0.0F, 0.0F, 18.0F);
		Post.addChild(Post2);
		Post2.setTextureOffset(20, 44).addBox(-1.0F, -2.1F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(18, 51).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(75, 41).addBox(-0.8F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(75, 15).addBox(-0.8F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(75, 13).addBox(-0.2F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(74, 71).addBox(-0.2F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(74, 69).addBox(-0.5F, -33.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(19, 55).addBox(-0.1F, -3.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(17, 47).addBox(-0.5F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Post2.setTextureOffset(19, 55).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(74, 37).addBox(-0.5F, -30.4F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(74, 28).addBox(-0.5F, -33.1F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(18, 51).addBox(-0.5F, -2.8F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(74, 24).addBox(-0.5F, -30.4F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(74, 10).addBox(-0.5F, -33.1F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(20, 20).addBox(-0.5F, -29.4F, -1.0F, 1.0F, 27.0F, 2.0F, 0.0F, false);
		Post2.setTextureOffset(16, 5).addBox(-0.5F, -32.8F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Post2.setTextureOffset(22, 27).addBox(-1.0F, -29.4F, -0.5F, 2.0F, 27.0F, 1.0F, 0.0F, false);
		Post2.setTextureOffset(67, 44).addBox(-1.0F, -32.8F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Post3 = new ModelRenderer(this);
		Post3.setRotationPoint(18.0F, 0.0F, 18.0F);
		Post.addChild(Post3);
		Post3.setTextureOffset(18, 52).addBox(-1.0F, -2.1F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(16, 49).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(73, 64).addBox(-0.8F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(73, 46).addBox(-0.8F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(73, 44).addBox(-0.2F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(73, 35).addBox(-0.2F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(73, 33).addBox(-0.5F, -33.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(17, 53).addBox(-0.1F, -3.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(16, 54).addBox(-0.5F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Post3.setTextureOffset(16, 49).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(73, 18).addBox(-0.5F, -30.4F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(72, 62).addBox(-0.5F, -33.1F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(21, 57).addBox(-0.5F, -2.8F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(72, 16).addBox(-0.5F, -30.4F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(72, 12).addBox(-0.5F, -33.1F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(31, 49).addBox(-0.5F, -29.4F, -1.0F, 1.0F, 27.0F, 2.0F, 0.0F, false);
		Post3.setTextureOffset(16, 0).addBox(-0.5F, -32.8F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Post3.setTextureOffset(20, 20).addBox(-1.0F, -29.4F, -0.5F, 2.0F, 27.0F, 1.0F, 0.0F, false);
		Post3.setTextureOffset(66, 15).addBox(-1.0F, -32.8F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Post4 = new ModelRenderer(this);
		Post4.setRotationPoint(18.0F, 0.0F, 0.0F);
		Post.addChild(Post4);
		Post4.setTextureOffset(18, 52).addBox(-1.0F, -2.1F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(20, 60).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(24, 41).addBox(-0.8F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(71, 29).addBox(-0.8F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(23, 38).addBox(-0.2F, -30.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(71, 25).addBox(-0.2F, -33.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(71, 14).addBox(-0.5F, -33.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(20, 52).addBox(-0.1F, -3.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(18, 52).addBox(-0.5F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Post4.setTextureOffset(20, 52).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(70, 10).addBox(-0.5F, -30.4F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(68, 65).addBox(-0.5F, -33.1F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(20, 60).addBox(-0.5F, -2.8F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(21, 40).addBox(-0.5F, -30.4F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(18, 14).addBox(-0.5F, -33.1F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(20, 20).addBox(-0.5F, -29.4F, -1.0F, 1.0F, 27.0F, 2.0F, 0.0F, false);
		Post4.setTextureOffset(14, 14).addBox(-0.5F, -32.8F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Post4.setTextureOffset(22, 27).addBox(-1.0F, -29.4F, -0.5F, 2.0F, 27.0F, 1.0F, 0.0F, false);
		Post4.setTextureOffset(16, 10).addBox(-1.0F, -32.8F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		BaseRoof.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main2.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main3.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main4.render(matrixStack, buffer, packedLight, packedOverlay);
		leftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		rightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Posts.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public ModelRenderer getLeftDoor() {
		return leftDoor;
	}

	@Override
	public ModelRenderer getRightDoor() {
		return rightDoor;
	}

	@Override
	protected float getMaximumAngle() {
		return 0.95f;
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}