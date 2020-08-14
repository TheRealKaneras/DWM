package com.softetch.dwm.client.model.tileentity.tardis.box;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FirstDoctorBoxModel extends AbstractTardisExteriorModel {
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer post;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer post2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer post3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer post4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone15;
	private final ModelRenderer leftDoor;
	private final ModelRenderer window3_1;
	private final ModelRenderer window2_1;
	private final ModelRenderer Window1_1;
	private final ModelRenderer rightDoor;
	private final ModelRenderer bone3;
	private final ModelRenderer Window1_2;
	private final ModelRenderer window2_2;
	private final ModelRenderer window3_2;
	private final ModelRenderer bone18;
	private final ModelRenderer Main;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer Main2;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer side_windows;
	private final ModelRenderer bone26;
	private final ModelRenderer bone25;
	private final ModelRenderer Main3;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer Main4;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone19;
	private final ModelRenderer bb_main;

	public FirstDoctorBoxModel() {
		textureWidth = 96;
		textureHeight = 96;

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 11.9F, -5.5F);
		setRotationAngle(bone9, 0.0F, -0.7854F, 0.0F);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -0.5F, -6.3F);
		setRotationAngle(bone10, -0.7854F, 0.0F, 0.0F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.5F, -6.3F);
		setRotationAngle(bone11, -0.7854F, 0.0F, 0.0F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-2.7F, 6.9F, -5.2F);
		setRotationAngle(bone12, 0.3491F, 0.0F, 0.0F);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-2.7F, 6.4F, -5.2F);
		setRotationAngle(bone13, -0.7854F, 0.0F, 0.0F);
		

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(1.2F, 4.6272F, -5.1728F);
		setRotationAngle(bone14, 0.0F, -0.7854F, 0.0F);
		

		post = new ModelRenderer(this);
		post.setRotationPoint(-5.5F, 23.0F, -7.0F);
		post.setTextureOffset(0, 0).addBox(-1.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-0.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 0.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-1.2F, -25.5F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-1.2F, -25.5F, 12.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(11.2F, -25.5F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(11.2F, -25.5F, 12.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 1.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.8F, -12.5F, 0.7F);
		post.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.7854F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.2F, -12.5F, 0.9F);
		post.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.7854F, 0.0F);
		

		post2 = new ModelRenderer(this);
		post2.setRotationPoint(6.5F, 23.0F, -7.0F);
		post2.setTextureOffset(0, 0).addBox(-1.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-0.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 0.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 1.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.8F, -12.5F, 0.7F);
		post2.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.7854F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.2F, -12.5F, 0.9F);
		post2.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.7854F, 0.0F);
		

		post3 = new ModelRenderer(this);
		post3.setRotationPoint(6.5F, 23.0F, 5.0F);
		post3.setTextureOffset(0, 0).addBox(-1.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-0.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 0.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 1.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.8F, -12.5F, 0.7F);
		post3.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.7854F, 0.0F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.2F, -12.5F, 0.9F);
		post3.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.7854F, 0.0F);
		

		post4 = new ModelRenderer(this);
		post4.setRotationPoint(-5.5F, 23.0F, 5.0F);
		post4.setTextureOffset(0, 0).addBox(-1.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-0.5F, -24.6F, 0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 0.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-1.4F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.1F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-0.6F, -24.6F, 0.9F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(0, 0).addBox(-1.0F, -24.6F, 1.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.8F, -12.5F, 0.7F);
		post4.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.7854F, 0.0F);
		

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-0.2F, -12.5F, 0.9F);
		post4.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.7854F, 0.0F);
		

		leftDoor = new ModelRenderer(this);
		leftDoor.setRotationPoint(5.0F, 14.0F, -6.0F);
		leftDoor.setTextureOffset(0, 0).addBox(-4.0F, 3.9F, 0.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, 7.9F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, 3.9F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-0.7F, 3.9F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-0.7F, -1.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, 2.9F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, -1.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-4.0F, -1.1F, 0.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, -2.1F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-4.0F, -6.1F, 0.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(82, 54).addBox(-2.85F, -4.6F, 0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, -6.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-0.7F, -6.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, -7.1F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-0.7F, -11.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, -11.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.0F, -12.1F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(42, 88).addBox(-4.7F, -11.1F, 0.25F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		window3_1 = new ModelRenderer(this);
		window3_1.setRotationPoint(-9.0F, -7.1F, 0.3F);
		leftDoor.addChild(window3_1);
		setRotationAngle(window3_1, 0.3491F, 0.0F, 0.0F);
		window3_1.setTextureOffset(38, 48).addBox(4.7F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		window2_1 = new ModelRenderer(this);
		window2_1.setRotationPoint(-0.8F, -8.6357F, 0.7766F);
		leftDoor.addChild(window2_1);
		setRotationAngle(window2_1, 0.0F, -0.7854F, 0.0F);
		window2_1.setTextureOffset(38, 48).addBox(-0.4293F, -2.7F, -0.5707F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_1.setTextureOffset(38, 48).addBox(-2.7627F, -2.7F, 1.7627F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_1.setTextureOffset(38, 48).addBox(-1.9849F, -2.7F, 0.9849F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_1.setTextureOffset(38, 48).addBox(-1.2071F, -2.7F, 0.2071F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Window1_1 = new ModelRenderer(this);
		Window1_1.setRotationPoint(-9.0F, -7.4F, 0.4F);
		leftDoor.addChild(Window1_1);
		setRotationAngle(Window1_1, 0.7854F, 0.0F, 0.0F);
		Window1_1.setTextureOffset(38, 48).addBox(4.7F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_1.setTextureOffset(38, 48).addBox(4.7F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_1.setTextureOffset(38, 48).addBox(4.7F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		rightDoor = new ModelRenderer(this);
		rightDoor.setRotationPoint(-5.0F, 14.0F, -6.0F);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -7.1F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(83, 44).addBox(0.1F, -6.0F, 0.35F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.3F, -6.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(4.0F, -6.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(4.0F, -11.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -12.1F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.3F, -11.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(42, 88).addBox(0.0F, -11.1F, 0.25F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -1.1F, 0.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, -2.1F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(4.0F, -1.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(4.0F, 3.9F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, 2.9F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, 7.9F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.0F, 3.9F, 0.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.3F, 3.9F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.3F, -1.1F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(66, 65).addBox(-0.35F, -2.475F, 0.15F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(66, 64).addBox(0.05F, -6.375F, 0.15F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(66, 65).addBox(1.05F, -6.775F, 0.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(66, 65).addBox(3.65F, -5.775F, 0.15F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.25F, -2.1F, 0.7F);
		rightDoor.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
		bone3.setTextureOffset(0, 0).addBox(-0.75F, -10.0F, -0.5F, 1.0F, 21.0F, 1.0F, 0.0F, false);

		Window1_2 = new ModelRenderer(this);
		Window1_2.setRotationPoint(1.0F, -7.4F, 0.4F);
		rightDoor.addChild(Window1_2);
		setRotationAngle(Window1_2, 0.7854F, 0.0F, 0.0F);
		Window1_2.setTextureOffset(38, 48).addBox(-0.3F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_2.setTextureOffset(68, 65).addBox(-0.3F, 3.518F, -3.9771F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_2.setTextureOffset(38, 48).addBox(-0.3F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_2.setTextureOffset(68, 65).addBox(-0.3F, 0.6896F, -1.1487F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_2.setTextureOffset(68, 65).addBox(-0.3F, 3.5534F, -4.0125F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Window1_2.setTextureOffset(38, 48).addBox(-0.3F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		window2_2 = new ModelRenderer(this);
		window2_2.setRotationPoint(9.2F, -8.6357F, 0.7766F);
		rightDoor.addChild(window2_2);
		setRotationAngle(window2_2, 0.0F, -0.7854F, 0.0F);
		window2_2.setTextureOffset(38, 48).addBox(-4.177F, -2.7F, 3.177F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_2.setTextureOffset(68, 65).addBox(-4.177F, 2.525F, 3.177F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_2.setTextureOffset(38, 48).addBox(-5.7326F, -2.7F, 4.7326F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_2.setTextureOffset(38, 48).addBox(-4.9548F, -2.7F, 3.9548F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_2.setTextureOffset(38, 48).addBox(-6.5104F, -2.7F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		window2_2.setTextureOffset(68, 65).addBox(-6.5104F, 2.525F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		window3_2 = new ModelRenderer(this);
		window3_2.setRotationPoint(1.0F, -7.1F, 0.3F);
		rightDoor.addChild(window3_2);
		setRotationAngle(window3_2, 0.3491F, 0.0F, 0.0F);
		window3_2.setTextureOffset(38, 48).addBox(-0.3F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(4.3F, -1.6F, 0.3F);
		rightDoor.addChild(bone18);
		bone18.setTextureOffset(91, 28).addBox(-0.6036F, -0.5876F, -0.34F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Main = new ModelRenderer(this);
		Main.setRotationPoint(-4.0F, 6.9F, -5.7F);
		Main.setTextureOffset(59, 94).addBox(-2.0F, -7.0F, -1.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(8.0F, -7.0F, -1.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-2.0F, -9.25F, -0.9F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-1.0F, -6.35F, -0.7F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -0.6F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-1.0F, -5.75F, -0.5F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -1.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(4.0F, -7.7F, -0.9F);
		Main.addChild(bone16);
		setRotationAngle(bone16, 0.3491F, 0.0F, 0.0F);
		bone16.setTextureOffset(0, 0).addBox(-6.0F, 0.3457F, -0.8078F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(4.0F, -7.3F, -0.9F);
		Main.addChild(bone17);
		setRotationAngle(bone17, -0.3491F, 0.0F, 0.0F);
		bone17.setTextureOffset(0, 0).addBox(-6.0F, 0.5337F, -0.1238F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		Main2 = new ModelRenderer(this);
		Main2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Main2, 0.0F, -1.5708F, 0.0F);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -2.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(1.0F, -6.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(1.0F, -11.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(1.0F, -16.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -6.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -11.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -16.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -7.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -12.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -17.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -23.1F, -6.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(59, 94).addBox(-6.0F, -24.1F, -7.2F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.0F, -24.1F, -7.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-6.0F, -26.35F, -6.6F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -23.45F, -6.4F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, -6.3F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.0F, -22.85F, -6.2F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-6.0F, -24.1F, -7.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.3F, -21.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.3F, -21.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -21.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.3F, -16.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.3F, -16.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -16.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.3F, -11.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.3F, -11.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -11.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.3F, -6.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.3F, -6.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.25F, -12.1F, -5.3F);
		Main2.addChild(bone21);
		setRotationAngle(bone21, 0.0F, -0.7854F, 0.0F);
		bone21.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main2.addChild(bone22);
		setRotationAngle(bone22, 0.3491F, 0.0F, 0.0F);
		bone22.setTextureOffset(0, 0).addBox(-6.0F, 0.3457F, -0.8078F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main2.addChild(bone23);
		setRotationAngle(bone23, -0.3491F, 0.0F, 0.0F);
		bone23.setTextureOffset(0, 0).addBox(-6.0F, 0.5337F, -0.1238F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main2.addChild(bone24);
		setRotationAngle(bone24, 0.3491F, 0.0F, 0.0F);
		bone24.setTextureOffset(38, 48).addBox(4.7F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone24.setTextureOffset(38, 48).addBox(-0.3F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		side_windows = new ModelRenderer(this);
		side_windows.setRotationPoint(0.0F, -19.0F, -5.625F);
		Main2.addChild(side_windows);
		side_windows.setTextureOffset(42, 88).addBox(0.3F, -2.1F, -0.125F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		side_windows.setTextureOffset(42, 88).addBox(-5.0F, -2.1F, -0.125F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(4.2F, 0.3643F, 0.4016F);
		side_windows.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.7854F, 0.0F);
		bone26.setTextureOffset(38, 48).addBox(-0.4293F, -2.7F, -0.5707F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-4.177F, -2.7F, 3.177F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-2.7627F, -2.7F, 1.7627F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-1.9849F, -2.7F, 0.9849F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-5.7326F, -2.7F, 4.7326F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-1.2071F, -2.7F, 0.2071F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-4.9548F, -2.7F, 3.9548F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(38, 48).addBox(-6.5104F, -2.7F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-4.0F, 1.6F, 0.025F);
		side_windows.addChild(bone25);
		setRotationAngle(bone25, 0.7854F, 0.0F, 0.0F);
		bone25.setTextureOffset(38, 48).addBox(4.7F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(38, 48).addBox(4.7F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(38, 48).addBox(4.7F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(38, 48).addBox(-0.3F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(38, 48).addBox(-0.3F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(38, 48).addBox(-0.3F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		Main3 = new ModelRenderer(this);
		Main3.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Main3, 0.0F, 3.1416F, 0.0F);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -2.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(42, 88).addBox(-5.0F, -21.1F, -5.75F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(1.0F, -6.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(1.0F, -11.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(1.0F, -16.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -6.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -11.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -16.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -7.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -12.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -17.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -23.1F, -6.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(59, 94).addBox(-6.0F, -24.1F, -7.2F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(4.0F, -24.1F, -7.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-6.0F, -26.35F, -6.6F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -23.45F, -6.4F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, -6.3F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.0F, -22.85F, -6.2F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-6.0F, -24.1F, -7.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.3F, -21.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(4.3F, -21.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -21.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.3F, -16.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(4.3F, -16.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -16.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.3F, -11.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(4.3F, -11.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -11.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.3F, -6.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(4.3F, -6.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(42, 88).addBox(0.3F, -21.1F, -5.75F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.25F, -12.1F, -5.3F);
		Main3.addChild(bone27);
		setRotationAngle(bone27, 0.0F, -0.7854F, 0.0F);
		bone27.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main3.addChild(bone28);
		setRotationAngle(bone28, 0.3491F, 0.0F, 0.0F);
		bone28.setTextureOffset(0, 0).addBox(-6.0F, 0.3457F, -0.8078F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main3.addChild(bone29);
		setRotationAngle(bone29, -0.3491F, 0.0F, 0.0F);
		bone29.setTextureOffset(0, 0).addBox(-6.0F, 0.5337F, -0.1238F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main3.addChild(bone30);
		setRotationAngle(bone30, 0.3491F, 0.0F, 0.0F);
		bone30.setTextureOffset(38, 48).addBox(4.7F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(38, 48).addBox(-0.3F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-4.0F, -17.4F, -5.6F);
		Main3.addChild(bone31);
		setRotationAngle(bone31, 0.7854F, 0.0F, 0.0F);
		bone31.setTextureOffset(38, 48).addBox(4.7F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(38, 48).addBox(4.7F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(38, 48).addBox(4.7F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(38, 48).addBox(-0.3F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(38, 48).addBox(-0.3F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(38, 48).addBox(-0.3F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(4.2F, -18.6357F, -5.2234F);
		Main3.addChild(bone32);
		setRotationAngle(bone32, 0.0F, -0.7854F, 0.0F);
		bone32.setTextureOffset(38, 48).addBox(-0.4293F, -2.7F, -0.5707F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-4.177F, -2.7F, 3.177F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-2.7627F, -2.7F, 1.7627F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-1.9849F, -2.7F, 0.9849F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-5.7326F, -2.7F, 4.7326F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-1.2071F, -2.7F, 0.2071F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-4.9548F, -2.7F, 3.9548F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(38, 48).addBox(-6.5104F, -2.7F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Main4 = new ModelRenderer(this);
		Main4.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Main4, 0.0F, 1.5708F, 0.0F);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -2.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(42, 89).addBox(-5.0F, -20.9F, -5.75F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(1.0F, -6.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(1.0F, -11.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(1.0F, -16.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -6.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -11.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -16.1F, -5.7F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -7.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -12.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -17.1F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -23.1F, -6.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(59, 94).addBox(-6.0F, -24.1F, -7.2F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.0F, -24.1F, -7.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-6.0F, -26.35F, -6.6F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -23.45F, -6.4F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, -6.3F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.0F, -22.85F, -6.2F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-6.0F, -24.1F, -7.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.3F, -21.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.3F, -21.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -21.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.3F, -16.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.3F, -16.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -16.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.3F, -11.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.3F, -11.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -11.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.3F, -6.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.3F, -6.1F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(42, 89).addBox(0.3F, -20.9F, -5.75F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.25F, -12.1F, -5.3F);
		Main4.addChild(bone33);
		setRotationAngle(bone33, 0.0F, -0.7854F, 0.0F);
		bone33.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main4.addChild(bone34);
		setRotationAngle(bone34, 0.3491F, 0.0F, 0.0F);
		bone34.setTextureOffset(0, 0).addBox(-6.0F, 0.3457F, -0.8078F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main4.addChild(bone35);
		setRotationAngle(bone35, -0.3491F, 0.0F, 0.0F);
		bone35.setTextureOffset(0, 0).addBox(-6.0F, 0.5337F, -0.1238F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main4.addChild(bone36);
		setRotationAngle(bone36, 0.3491F, 0.0F, 0.0F);
		bone36.setTextureOffset(38, 48).addBox(4.7F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone36.setTextureOffset(38, 48).addBox(-0.3F, -0.2621F, -0.1818F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-4.0F, -17.4F, -5.6F);
		Main4.addChild(bone37);
		setRotationAngle(bone37, 0.7854F, 0.0F, 0.0F);
		bone37.setTextureOffset(38, 48).addBox(4.7F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(38, 48).addBox(4.7F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(38, 48).addBox(4.7F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(38, 48).addBox(-0.3F, -0.1943F, -0.2648F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(38, 48).addBox(-0.3F, -2.8106F, 2.3515F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(38, 48).addBox(-0.3F, -1.5378F, 1.0787F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(4.2F, -18.6357F, -5.2234F);
		Main4.addChild(bone38);
		setRotationAngle(bone38, 0.0F, -0.7854F, 0.0F);
		bone38.setTextureOffset(38, 48).addBox(-0.4293F, -2.7F, -0.5707F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-4.177F, -2.7F, 3.177F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-2.7627F, -2.7F, 1.7627F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-1.9849F, -2.7F, 0.9849F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-5.7326F, -2.7F, 4.7326F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-1.2071F, -2.7F, 0.2071F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-4.9548F, -2.7F, 3.9548F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(38, 48).addBox(-6.5104F, -2.7F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -3.55F, 0.0F);
		setRotationAngle(bone19, 0.0F, 0.7854F, 0.0F);
		bone19.setTextureOffset(79, 21).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone19.setTextureOffset(87, 20).addBox(-1.0F, 0.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-7.5F, -1.0F, -7.5F, 15.0F, 1.0F, 15.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -1.1F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(11, 25).addBox(-6.0F, -26.9F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 15).addBox(-0.5F, -29.51F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(81, 25).addBox(-0.5F, -28.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		super.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(matrixStack, buffer, packedLight, packedOverlay);
		bone10.render(matrixStack, buffer, packedLight, packedOverlay);
		bone11.render(matrixStack, buffer, packedLight, packedOverlay);
		bone12.render(matrixStack, buffer, packedLight, packedOverlay);
		bone13.render(matrixStack, buffer, packedLight, packedOverlay);
		bone14.render(matrixStack, buffer, packedLight, packedOverlay);
		post.render(matrixStack, buffer, packedLight, packedOverlay);
		post2.render(matrixStack, buffer, packedLight, packedOverlay);
		post3.render(matrixStack, buffer, packedLight, packedOverlay);
		post4.render(matrixStack, buffer, packedLight, packedOverlay);
		leftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		rightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Main.render(matrixStack, buffer, packedLight, packedOverlay);
		Main2.render(matrixStack, buffer, packedLight, packedOverlay);
		Main3.render(matrixStack, buffer, packedLight, packedOverlay);
		Main4.render(matrixStack, buffer, packedLight, packedOverlay);
		bone19.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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
	protected float getScale() {
		return 1.4f;
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}