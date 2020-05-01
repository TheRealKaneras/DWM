package com.softetch.dwm.client.model.tileentity.tardis;// Made with Blockbench 3.5.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;

public class NewberyBoxBModel extends AbstractTardisExteriorModel {
	private final ModelRenderer lamp;
	private final ModelRenderer box;
	private final ModelRenderer windowsBACK;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone11;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer windowsRIGHT;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer windowsLEFT;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer rightDoor;
	private final ModelRenderer windowsDOORLEFT;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer leftDoor;
	private final ModelRenderer windowsDOORLEFT2;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;

	public NewberyBoxBModel() {
		textureWidth = 512;
		textureHeight = 512;

		lamp = new ModelRenderer(this);
		lamp.setRotationPoint(0.0F, 24.0F, 0.0F);
		lamp.setTextureOffset(161, 164).addBox(-0.5F, -43.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		box = new ModelRenderer(this);
		box.setRotationPoint(0.0F, 24.0F, 0.0F);
		box.setTextureOffset(0, 487).addBox(-12.0F, -1.0F, -12.0F, 24.0F, 1.0F, 24.0F, 0.0F, false);
		box.setTextureOffset(413, 331).addBox(-11.0F, -37.0F, -11.0F, 3.0F, 36.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(106, 366).addBox(-10.0F, -38.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(106, 366).addBox(-10.0F, -38.0F, 8.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(106, 366).addBox(8.0F, -38.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(106, 366).addBox(8.0F, -38.0F, 8.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(413, 331).addBox(8.0F, -37.0F, -11.0F, 3.0F, 36.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(413, 331).addBox(-11.0F, -37.0F, 8.0F, 3.0F, 36.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(413, 331).addBox(8.0F, -37.0F, 8.0F, 3.0F, 36.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-8.0F, -2.5F, 8.0F, 16.0F, 2.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -2.5F, -8.0F, 1.0F, 2.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -2.5F, -8.0F, 1.0F, 2.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(479, 489).addBox(-8.0F, -24.0F, 7.75F, 16.0F, 23.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(479, 489).addBox(7.75F, -24.0F, -8.0F, 1.0F, 23.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(479, 489).addBox(-8.75F, -24.0F, -8.0F, 1.0F, 23.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(205, 489).addBox(-8.0F, -32.0F, 7.75F, 16.0F, 8.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(205, 489).addBox(7.75F, -32.0F, -8.0F, 1.0F, 8.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(205, 489).addBox(-8.75F, -32.0F, -8.0F, 1.0F, 8.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(6.5F, -32.0F, 8.0F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -32.0F, -8.5F, 1.0F, 31.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -32.0F, -8.5F, 1.0F, 31.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-8.5F, -32.0F, 8.0F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -32.0F, 6.5F, 1.0F, 31.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -32.0F, 6.5F, 1.0F, 31.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-0.5F, -32.0F, 8.0F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -32.0F, -1.5F, 1.0F, 31.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -32.0F, -1.5F, 1.0F, 31.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-1.5F, -32.0F, 8.0F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -32.0F, -0.5F, 1.0F, 31.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -32.0F, -0.5F, 1.0F, 31.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(509, 480).addBox(-0.5F, -32.5F, 8.5F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(509, 480).addBox(8.5F, -32.5F, -0.5F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(509, 480).addBox(-9.5F, -32.5F, -0.5F, 1.0F, 32.0F, 1.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -10.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -10.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-8.0F, -17.5F, 8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -17.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -17.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-8.0F, -25.0F, 8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -25.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -25.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-8.0F, -32.5F, 8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(8.0F, -32.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(0, 0).addBox(-9.0F, -32.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(0, 0).addBox(-9.5F, -37.0F, -9.5F, 19.0F, 3.0F, 19.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-9.0F, -38.5F, -9.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-7.0F, -38.7F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-5.0F, -38.9F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-8.0F, -38.6F, -8.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-6.0F, -38.8F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-4.0F, -39.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-3.0F, -39.1F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		box.setTextureOffset(441, 0).addBox(-2.0F, -40.5F, -2.0F, 4.0F, 2.9F, 4.0F, 0.0F, false);
		box.setTextureOffset(305, 234).addBox(0.5F, -43.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(305, 234).addBox(-1.5F, -43.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(305, 234).addBox(-1.5F, -43.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(305, 234).addBox(0.5F, -43.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(305, 234).addBox(-1.5F, -43.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-8.5F, -38.55F, -8.5F, 17.0F, 2.0F, 17.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-6.5F, -38.75F, -6.5F, 13.0F, 2.0F, 13.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-4.5F, -38.95F, -4.5F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-7.5F, -38.65F, -7.5F, 15.0F, 2.0F, 15.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-5.5F, -38.85F, -5.5F, 11.0F, 2.0F, 11.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-3.5F, -39.05F, -3.5F, 7.0F, 2.0F, 7.0F, 0.0F, false);
		box.setTextureOffset(48, 231).addBox(-2.5F, -39.15F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-9.5F, -32.5F, 9.0F, 19.0F, 0.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-9.5F, -32.5F, -12.5F, 19.0F, 0.0F, 4.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(9.5F, -32.5F, -9.5F, 3.0F, 0.0F, 19.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-12.5F, -32.5F, -9.5F, 4.0F, 0.0F, 19.0F, 0.0F, true);
		box.setTextureOffset(45, 336).addBox(-9.5F, -34.5F, 11.0F, 19.0F, 2.0F, 0.0F, 0.0F, false);
		box.setTextureOffset(45, 336).addBox(-9.5F, -34.5F, -11.5F, 19.0F, 2.0F, 0.0F, 0.0F, false);
		box.setTextureOffset(45, 336).addBox(11.5F, -34.5F, -9.5F, 0.0F, 2.0F, 19.0F, 0.0F, false);
		box.setTextureOffset(45, 336).addBox(-11.5F, -34.5F, -9.5F, 0.0F, 2.0F, 19.0F, 0.0F, true);
		box.setTextureOffset(503, 0).addBox(7.5F, -34.5F, 9.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(7.5F, -34.5F, -12.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(9.5F, -34.5F, -9.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-12.5F, -34.5F, -9.5F, 4.0F, 2.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(503, 0).addBox(-9.5F, -34.5F, 9.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-9.5F, -34.5F, -12.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(9.5F, -34.5F, 7.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-12.5F, -34.5F, 7.5F, 4.0F, 2.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(503, 0).addBox(-9.5F, -34.5F, 9.0F, 19.0F, 0.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-9.5F, -34.5F, -12.5F, 19.0F, 0.0F, 4.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(9.5F, -34.5F, -9.5F, 3.0F, 0.0F, 19.0F, 0.0F, false);
		box.setTextureOffset(503, 0).addBox(-12.5F, -34.5F, -9.5F, 4.0F, 0.0F, 19.0F, 0.0F, true);

		windowsBACK = new ModelRenderer(this);
		windowsBACK.setRotationPoint(0.0F, -25.0F, 9.0F);
		box.addChild(windowsBACK);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		windowsBACK.addChild(bone);
		setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(6.5F, 0.0F, 0.0F);
		windowsBACK.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
		bone4.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.5F, 0.0F, 0.0F);
		windowsBACK.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -0.7854F, 0.0F);
		bone5.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.5F, 0.0F, 0.0F);
		windowsBACK.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.7854F, 0.0F);
		bone9.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-6.5F, 0.0F, 0.0F);
		windowsBACK.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.7854F, 0.0F);
		bone10.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.166F, 0.0F, 0.0F);
		windowsBACK.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -0.7854F, 0.0F);
		bone6.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.166F, 0.0F, 0.0F);
		windowsBACK.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.7854F, 0.0F);
		bone8.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.833F, 0.0F, 0.0F);
		windowsBACK.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -0.7854F, 0.0F);
		bone7.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-4.833F, 0.0F, 0.0F);
		windowsBACK.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -0.7854F, 0.0F);
		bone11.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -3.25F, 0.0F);
		windowsBACK.addChild(bone3);
		setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
		bone3.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.0F, -6.5F, 0.0F);
		windowsBACK.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.setTextureOffset(0, 256).addBox(-4.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		windowsRIGHT = new ModelRenderer(this);
		windowsRIGHT.setRotationPoint(-9.0F, -25.0F, 0.0F);
		box.addChild(windowsRIGHT);
		setRotationAngle(windowsRIGHT, 0.0F, -1.5708F, 0.0F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(6.5F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
		bone13.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(1.5F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.7854F, 0.0F);
		bone14.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.5F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone15);
		setRotationAngle(bone15, 0.0F, -0.7854F, 0.0F);
		bone15.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-6.5F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone16);
		setRotationAngle(bone16, 0.0F, -0.7854F, 0.0F);
		bone16.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(3.166F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
		bone17.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-3.166F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -0.7854F, 0.0F);
		bone18.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(4.833F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.7854F, 0.0F);
		bone19.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-4.833F, 0.0F, 0.0F);
		windowsRIGHT.addChild(bone20);
		setRotationAngle(bone20, 0.0F, -0.7854F, 0.0F);
		bone20.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -3.25F, 0.0F);
		windowsRIGHT.addChild(bone21);
		setRotationAngle(bone21, -0.7854F, 0.0F, 0.0F);
		bone21.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-4.0F, -6.5F, 0.0F);
		windowsRIGHT.addChild(bone22);
		setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
		bone22.setTextureOffset(0, 256).addBox(-4.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		windowsLEFT = new ModelRenderer(this);
		windowsLEFT.setRotationPoint(9.0F, -25.0F, 0.0F);
		box.addChild(windowsLEFT);
		setRotationAngle(windowsLEFT, 0.0F, 1.5708F, 0.0F);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone23);
		setRotationAngle(bone23, -0.7854F, 0.0F, 0.0F);
		bone23.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(6.5F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone24);
		setRotationAngle(bone24, 0.0F, -0.7854F, 0.0F);
		bone24.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(1.5F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone25);
		setRotationAngle(bone25, 0.0F, -0.7854F, 0.0F);
		bone25.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.5F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.7854F, 0.0F);
		bone26.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-6.5F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone27);
		setRotationAngle(bone27, 0.0F, -0.7854F, 0.0F);
		bone27.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(3.166F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone28);
		setRotationAngle(bone28, 0.0F, -0.7854F, 0.0F);
		bone28.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.166F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -0.7854F, 0.0F);
		bone29.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(4.833F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone30);
		setRotationAngle(bone30, 0.0F, -0.7854F, 0.0F);
		bone30.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-4.833F, 0.0F, 0.0F);
		windowsLEFT.addChild(bone31);
		setRotationAngle(bone31, 0.0F, -0.7854F, 0.0F);
		bone31.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, -3.25F, 0.0F);
		windowsLEFT.addChild(bone32);
		setRotationAngle(bone32, -0.7854F, 0.0F, 0.0F);
		bone32.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-4.0F, -6.5F, 0.0F);
		windowsLEFT.addChild(bone33);
		setRotationAngle(bone33, -0.7854F, 0.0F, 0.0F);
		bone33.setTextureOffset(0, 256).addBox(-4.0F, 0.0F, -1.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);

		rightDoor = new ModelRenderer(this);
		rightDoor.setRotationPoint(-8.0F, 23.0F, -8.0F);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -1.5F, -1.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -9.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(6.5F, -31.5F, -1.0F, 2.0F, 32.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(509, 480).addBox(7.5F, -31.5F, -1.5F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(479, 489).addBox(0.0F, -16.0F, -0.75F, 8.0F, 16.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(160, 505).addBox(0.0F, -23.0F, -0.75F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -24.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -31.5F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(205, 489).addBox(0.0F, -31.0F, -0.75F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.5F, -31.0F, -1.0F, 2.0F, 31.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -16.5F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		windowsDOORLEFT = new ModelRenderer(this);
		windowsDOORLEFT.setRotationPoint(8.0F, -24.0F, -1.0F);
		rightDoor.addChild(windowsDOORLEFT);
		setRotationAngle(windowsDOORLEFT, 0.0F, 3.1416F, 0.0F);
		

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone34);
		setRotationAngle(bone34, -0.7854F, 0.0F, 0.0F);
		bone34.setTextureOffset(0, 256).addBox(0.0F, 0.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(6.5F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone35);
		setRotationAngle(bone35, 0.0F, -0.7854F, 0.0F);
		bone35.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(1.5F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone36);
		setRotationAngle(bone36, 0.0F, -0.7854F, 0.0F);
		bone36.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-1.5F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone37);
		setRotationAngle(bone37, 0.0F, -0.7854F, 0.0F);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-6.5F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone38);
		setRotationAngle(bone38, 0.0F, -0.7854F, 0.0F);
		

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(3.166F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -0.7854F, 0.0F);
		bone39.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-3.166F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone40);
		setRotationAngle(bone40, 0.0F, -0.7854F, 0.0F);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(4.833F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone41);
		setRotationAngle(bone41, 0.0F, -0.7854F, 0.0F);
		bone41.setTextureOffset(0, 256).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-4.833F, 0.0F, 0.0F);
		windowsDOORLEFT.addChild(bone42);
		setRotationAngle(bone42, 0.0F, -0.7854F, 0.0F);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, -3.25F, 0.0F);
		windowsDOORLEFT.addChild(bone43);
		setRotationAngle(bone43, -0.7854F, 0.0F, 0.0F);
		bone43.setTextureOffset(0, 256).addBox(0.0F, 0.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-4.0F, -6.5F, 0.0F);
		windowsDOORLEFT.addChild(bone44);
		setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
		bone44.setTextureOffset(0, 256).addBox(4.0F, 0.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leftDoor = new ModelRenderer(this);
		leftDoor.setRotationPoint(8.0F, 23.0F, -8.0F);
		leftDoor.setTextureOffset(0, 0).addBox(-8.0F, -1.5F, -1.0F, 8.0F, 2.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 0).addBox(-8.0F, -9.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 0).addBox(-8.5F, -31.0F, -1.0F, 2.0F, 31.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(479, 489).addBox(-8.0F, -23.0F, -0.75F, 8.0F, 23.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 0).addBox(-8.0F, -24.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 0).addBox(-8.5F, -31.5F, -1.0F, 9.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(205, 489).addBox(-8.0F, -31.0F, -0.75F, 8.0F, 8.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 0).addBox(-1.5F, -31.0F, -1.0F, 2.0F, 31.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 0).addBox(-8.0F, -16.5F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(174, 21).addBox(-7.0F, -22.0F, -1.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(174, 21).addBox(-7.5F, -16.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		windowsDOORLEFT2 = new ModelRenderer(this);
		windowsDOORLEFT2.setRotationPoint(-8.0F, -24.0F, -1.0F);
		leftDoor.addChild(windowsDOORLEFT2);
		setRotationAngle(windowsDOORLEFT2, 0.0F, -3.1416F, 0.0F);
		

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone45);
		setRotationAngle(bone45, -0.7854F, 0.0F, 0.0F);
		bone45.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-6.5F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 0.7854F, 0.0F);
		bone46.setTextureOffset(0, 256).addBox(0.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-1.5F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.7854F, 0.0F);
		bone47.setTextureOffset(0, 256).addBox(0.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(1.5F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.7854F, 0.0F);
		

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(6.5F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.7854F, 0.0F);
		

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-3.166F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.7854F, 0.0F);
		bone50.setTextureOffset(0, 256).addBox(0.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(3.166F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.7854F, 0.0F);
		

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-4.833F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.7854F, 0.0F);
		bone52.setTextureOffset(0, 256).addBox(0.0F, -7.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(4.833F, 0.0F, 0.0F);
		windowsDOORLEFT2.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 0.7854F, 0.0F);
		

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, -3.25F, 0.0F);
		windowsDOORLEFT2.addChild(bone54);
		setRotationAngle(bone54, -0.7854F, 0.0F, 0.0F);
		bone54.setTextureOffset(0, 256).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(4.0F, -6.5F, 0.0F);
		windowsDOORLEFT2.addChild(bone55);
		setRotationAngle(bone55, -0.7854F, 0.0F, 0.0F);
		bone55.setTextureOffset(0, 256).addBox(-12.0F, 0.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		lamp.render(matrixStack, buffer, packedLight, packedOverlay, 2.0f, 2.0f, 2.0f, 0.5f);
		box.render(matrixStack, buffer, packedLight, packedOverlay);
		rightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		leftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public ModelRenderer getLeftDoor() {
		return leftDoor;
	}

	@Override
	public ModelRenderer getRightDoor() {
		return rightDoor;
	}
}