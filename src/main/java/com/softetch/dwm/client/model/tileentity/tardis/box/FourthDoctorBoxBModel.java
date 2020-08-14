package com.softetch.dwm.client.model.tileentity.tardis.box;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FourthDoctorBoxBModel extends AbstractTardisExteriorModel {
	private final ModelRenderer Main;
	private final ModelRenderer leftDoor;
	private final ModelRenderer upslant1;
	private final ModelRenderer slant1;
	private final ModelRenderer rightDoor;
	private final ModelRenderer bone33;
	private final ModelRenderer slant2;
	private final ModelRenderer upslant2;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer Main2;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer Main3;
	private final ModelRenderer bone3;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer Main4;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
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
	private final ModelRenderer bone37;
	private final ModelRenderer bb_main;

	public FourthDoctorBoxBModel() {
		textureWidth = 32;
		textureHeight = 32;

		Main = new ModelRenderer(this);
		Main.setRotationPoint(0.0F, 24.0F, 0.0F);
		Main.setTextureOffset(0, 0).addBox(-5.5F, -22.8F, -6.3F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -6.7F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(7, 20).addBox(0.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		Main.setTextureOffset(7, 20).addBox(-5.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 14).addBox(-6.0F, -23.7F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 14).addBox(-6.0F, -23.3F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(5.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 2).addBox(5.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 0).addBox(-6.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 2).addBox(-6.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 14).addBox(-5.0F, -22.3F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main.setTextureOffset(0, 14).addBox(-5.0F, -23.7F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);

		leftDoor = new ModelRenderer(this);
		leftDoor.setRotationPoint(5.1F, -12.0F, -5.8F);
		Main.addChild(leftDoor);
		leftDoor.setTextureOffset(11, 6).addBox(-0.9F, 5.9F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(7, 10).addBox(-5.1F, 9.9F, -0.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(9, 6).addBox(-5.1F, 5.9F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.1F, 4.9F, -0.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(12, 7).addBox(-5.1F, 0.9F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 0).addBox(-5.1F, -0.1F, -0.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(11, 5).addBox(-0.9F, 0.9F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(13, 3).addBox(-0.9F, -4.1F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(8, 1).addBox(-5.1F, -4.1F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(1, 21).addBox(-5.2F, -3.5F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(13, 4).addBox(-4.1F, -4.1F, 0.2F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(9, 3).addBox(-4.1F, 0.9F, 0.2F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(12, 10).addBox(-4.1F, 5.9F, 0.2F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(8, 0).addBox(-5.1F, -5.1F, -0.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(27, 6).addBox(-1.0F, -9.1F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(13, 0).addBox(-5.1F, -11.1F, -0.1F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(13, 0).addBox(-5.1F, -9.1F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(22, 15).addBox(-4.925F, -9.175F, 0.25F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		upslant1 = new ModelRenderer(this);
		upslant1.setRotationPoint(-0.9F, -6.6357F, 0.5766F);
		leftDoor.addChild(upslant1);
		setRotationAngle(upslant1, 0.0F, -0.7854F, 0.0F);
		upslant1.setTextureOffset(0, 0).addBox(-0.3939F, -2.5F, -0.2525F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-0.4293F, 2.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-0.4293F, 7.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-0.4293F, 12.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-2.6213F, -2.5F, 1.9042F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-2.692F, 2.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-2.692F, 7.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-2.692F, 12.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-1.8435F, -2.5F, 1.1971F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant1.setTextureOffset(0, 0).addBox(-1.1364F, -2.5F, 0.4899F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		slant1 = new ModelRenderer(this);
		slant1.setRotationPoint(-9.1F, -5.4F, 0.2F);
		leftDoor.addChild(slant1);
		setRotationAngle(slant1, 0.7854F, 0.0F, 0.0F);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 0.1416F, -0.2471F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant1.setTextureOffset(0, 0).addBox(4.7F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		rightDoor = new ModelRenderer(this);
		rightDoor.setRotationPoint(-5.1F, -12.0F, -5.7F);
		Main.addChild(rightDoor);
		rightDoor.setTextureOffset(17, 6).addBox(-0.6F, 9.9F, -0.2F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(19, 0).addBox(4.1F, 5.9F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(14, 0).addBox(-0.6F, 4.9F, -0.2F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(11, 6).addBox(4.1F, 0.9F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.6F, -0.1F, -0.2F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.2F, -0.5F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(1.2F, -4.8F, -0.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(3.8F, -3.8F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(0.2F, -4.4F, -0.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(11, 6).addBox(4.1F, -4.1F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.6F, -5.1F, -0.2F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 0).addBox(-0.6F, -11.1F, -0.2F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 9).addBox(4.1F, -9.1F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(11, 27).addBox(1.0F, -4.1F, 0.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(13, 4).addBox(0.1F, 0.9F, 0.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(2, 4).addBox(0.1F, 5.9F, 0.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(11, 6).addBox(-0.1F, -4.1F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(17, 6).addBox(-0.1F, 0.9F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(17, 10).addBox(-0.1F, 5.9F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 9).addBox(0.0F, -9.1F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(22, 15).addBox(0.175F, -9.175F, 0.15F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(5.35F, -0.1F, 0.4F);
		rightDoor.addChild(bone33);
		setRotationAngle(bone33, 0.0F, -0.7854F, 0.0F);
		bone33.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		slant2 = new ModelRenderer(this);
		slant2.setRotationPoint(1.1F, -5.4F, 0.1F);
		rightDoor.addChild(slant2);
		setRotationAngle(slant2, 0.7854F, 0.0F, 0.0F);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 0.0709F, -0.3178F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 3.3766F, -3.6589F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 0.9901F, -1.2724F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		slant2.setTextureOffset(0, 0).addBox(-0.3F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		upslant2 = new ModelRenderer(this);
		upslant2.setRotationPoint(9.3F, -6.6357F, 0.4766F);
		rightDoor.addChild(upslant2);
		setRotationAngle(upslant2, 0.0F, -0.7854F, 0.0F);
		upslant2.setTextureOffset(0, 0).addBox(-4.0002F, -2.5F, 3.3537F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-4.1062F, 2.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-4.3007F, 2.5F, 3.4775F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-4.1062F, 7.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-4.1062F, 12.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-5.4497F, -2.5F, 4.8033F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-4.7426F, -2.5F, 4.0962F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-6.1922F, -2.5F, 5.5458F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-6.369F, 2.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-6.1392F, 2.5F, 5.316F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-6.369F, 7.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		upslant2.setTextureOffset(0, 0).addBox(-6.369F, 12.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main.addChild(bone34);
		setRotationAngle(bone34, 0.3491F, 0.0F, 0.0F);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main.addChild(bone35);
		setRotationAngle(bone35, -0.3491F, 0.0F, 0.0F);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main.addChild(bone36);
		setRotationAngle(bone36, 0.3491F, 0.0F, 0.0F);
		

		Main2 = new ModelRenderer(this);
		Main2.setRotationPoint(0.2F, 24.0F, 0.0F);
		setRotationAngle(Main2, 0.0F, -1.5708F, 0.0F);
		Main2.setTextureOffset(0, 9).addBox(-5.5F, -2.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(22, 15).addBox(-4.925F, -21.175F, -5.55F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(2, 4).addBox(1.0F, -6.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(14, 15).addBox(1.0F, -11.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(17, 1).addBox(1.0F, -16.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(10, 8).addBox(-5.0F, -6.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(16, 9).addBox(-5.0F, -11.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(2, 4).addBox(-5.0F, -16.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 10).addBox(-5.5F, -7.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 7).addBox(-5.5F, -12.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 7).addBox(-5.5F, -17.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -5.9F, 11.0F, 2.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.5F, -22.8F, -6.3F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -6.7F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(7, 20).addBox(0.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		Main2.setTextureOffset(7, 20).addBox(-5.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 14).addBox(-6.0F, -23.7F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 14).addBox(-6.0F, -23.3F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(5.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 2).addBox(5.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-6.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 2).addBox(-6.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 14).addBox(-5.0F, -22.3F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 14).addBox(-5.0F, -23.7F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.1F, -21.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.1F, -21.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -21.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.2F, -16.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.2F, -16.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -16.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.2F, -11.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.2F, -11.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -11.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-5.2F, -6.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(4.2F, -6.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main2.setTextureOffset(22, 15).addBox(0.175F, -21.175F, -5.55F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.25F, -12.1F, -5.3F);
		Main2.addChild(bone21);
		setRotationAngle(bone21, 0.0F, -0.7854F, 0.0F);
		bone21.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main2.addChild(bone22);
		setRotationAngle(bone22, 0.3491F, 0.0F, 0.0F);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main2.addChild(bone23);
		setRotationAngle(bone23, -0.3491F, 0.0F, 0.0F);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main2.addChild(bone24);
		setRotationAngle(bone24, 0.3491F, 0.0F, 0.0F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-4.0F, -17.4F, -5.6F);
		Main2.addChild(bone25);
		setRotationAngle(bone25, 0.7854F, 0.0F, 0.0F);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 0.1416F, -0.2471F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(4.7F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 0.0709F, -0.3178F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(-0.3F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(4.2F, -18.6357F, -5.2234F);
		Main2.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.7854F, 0.0F);
		bone26.setTextureOffset(0, 0).addBox(-0.3939F, -2.5F, -0.2525F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-0.4293F, 2.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-0.4293F, 7.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-0.4293F, 12.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-4.0002F, -2.5F, 3.3537F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-4.1062F, 2.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-4.1062F, 7.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-4.1062F, 12.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-2.6213F, -2.5F, 1.9042F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-2.692F, 2.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-2.692F, 7.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-2.692F, 12.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-1.8435F, -2.5F, 1.1971F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-5.4497F, -2.5F, 4.8033F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-1.1364F, -2.5F, 0.4899F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-4.7426F, -2.5F, 4.0962F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-6.1922F, -2.5F, 5.5458F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-6.369F, 2.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-6.369F, 7.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(-6.369F, 12.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Main3 = new ModelRenderer(this);
		Main3.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Main3, 0.0F, 3.1416F, 0.0F);
		Main3.setTextureOffset(0, 17).addBox(-5.5F, -2.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(22, 15).addBox(-4.925F, -21.175F, -5.55F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(1.0F, -6.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(1.0F, -11.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(11, 5).addBox(1.0F, -16.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(22, 8).addBox(-5.0F, -6.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(3, 8).addBox(-5.0F, -11.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(9, 0).addBox(-5.0F, -16.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 12).addBox(-5.5F, -7.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 4).addBox(-5.5F, -12.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 11).addBox(-5.5F, -17.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -5.9F, 11.0F, 2.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.5F, -22.8F, -6.3F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -6.7F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(7, 20).addBox(0.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		Main3.setTextureOffset(7, 20).addBox(-5.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 14).addBox(-6.0F, -23.7F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 14).addBox(-6.0F, -23.3F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(5.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 2).addBox(5.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-6.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 2).addBox(-6.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 14).addBox(-5.0F, -22.3F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 14).addBox(-5.0F, -23.7F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.1F, -21.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(19, 4).addBox(4.1F, -21.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(15, 4).addBox(-1.0F, -21.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-5.2F, -16.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(4.2F, -16.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -16.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(9, 5).addBox(-5.2F, -11.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(9, 5).addBox(4.2F, -11.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -11.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(11, 7).addBox(-5.2F, -6.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(11, 7).addBox(4.2F, -6.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main3.setTextureOffset(22, 15).addBox(0.175F, -21.175F, -5.55F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.25F, -12.1F, -5.3F);
		Main3.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
		bone3.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main3.addChild(bone16);
		setRotationAngle(bone16, 0.3491F, 0.0F, 0.0F);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main3.addChild(bone17);
		setRotationAngle(bone17, -0.3491F, 0.0F, 0.0F);
		

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main3.addChild(bone18);
		setRotationAngle(bone18, 0.3491F, 0.0F, 0.0F);
		

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-4.0F, -17.4F, -5.6F);
		Main3.addChild(bone19);
		setRotationAngle(bone19, 0.7854F, 0.0F, 0.0F);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 0.1416F, -0.2471F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(4.7F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 0.0709F, -0.3178F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(-0.3F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(4.2F, -18.6357F, -5.2234F);
		Main3.addChild(bone20);
		setRotationAngle(bone20, 0.0F, -0.7854F, 0.0F);
		bone20.setTextureOffset(0, 0).addBox(-0.3939F, -2.5F, -0.2525F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-0.4293F, 2.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-0.4293F, 7.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-0.4293F, 12.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-4.0002F, -2.5F, 3.3537F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-4.1062F, 2.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-4.1062F, 7.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-4.1062F, 12.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-2.6213F, -2.5F, 1.9042F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-2.692F, 2.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-2.692F, 7.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-2.692F, 12.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-1.8435F, -2.5F, 1.1971F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-5.4497F, -2.5F, 4.8033F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-1.1364F, -2.5F, 0.4899F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-4.7426F, -2.5F, 4.0962F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-6.1922F, -2.5F, 5.5458F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-6.369F, 2.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-6.369F, 7.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(-6.369F, 12.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Main4 = new ModelRenderer(this);
		Main4.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Main4, 0.0F, 1.5708F, 0.0F);
		Main4.setTextureOffset(6, 7).addBox(-5.5F, -2.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(22, 15).addBox(-4.925F, -21.175F, -5.55F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(22, 5).addBox(1.0F, -6.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(10, 5).addBox(1.0F, -11.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(1.0F, -16.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(11, 3).addBox(-5.0F, -6.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(2, 7).addBox(-5.0F, -11.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 23).addBox(-5.0F, -16.1F, -5.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 5).addBox(-5.5F, -7.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 10).addBox(-5.5F, -12.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(8, 9).addBox(-5.5F, -17.1F, -5.9F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -5.9F, 11.0F, 2.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.5F, -22.8F, -6.3F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.5F, -23.1F, -6.7F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(7, 20).addBox(0.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		Main4.setTextureOffset(7, 20).addBox(-5.0F, -23.5F, -7.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 14).addBox(-6.0F, -23.7F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 14).addBox(-6.0F, -23.3F, -7.4F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(5.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 2).addBox(5.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-6.0F, -23.7F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 2).addBox(-6.0F, -23.3F, -7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 14).addBox(-5.0F, -22.3F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 14).addBox(-5.0F, -23.7F, -7.55F, 10.0F, 0.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.1F, -21.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.1F, -21.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(12, 6).addBox(-1.0F, -21.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(7, 6).addBox(-5.2F, -16.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.2F, -16.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -16.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.2F, -11.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.2F, -11.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -11.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-5.2F, -6.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(4.2F, -6.1F, -5.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(0, 0).addBox(-1.0F, -6.1F, -5.9F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Main4.setTextureOffset(22, 15).addBox(0.175F, -21.175F, -5.55F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.25F, -12.1F, -5.3F);
		Main4.addChild(bone27);
		setRotationAngle(bone27, 0.0F, -0.7854F, 0.0F);
		bone27.setTextureOffset(0, 0).addBox(-0.75F, -11.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -24.8F, -6.6F);
		Main4.addChild(bone28);
		setRotationAngle(bone28, 0.3491F, 0.0F, 0.0F);
		

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -24.4F, -6.6F);
		Main4.addChild(bone29);
		setRotationAngle(bone29, -0.3491F, 0.0F, 0.0F);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-4.0F, -17.1F, -5.7F);
		Main4.addChild(bone30);
		setRotationAngle(bone30, 0.3491F, 0.0F, 0.0F);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-4.0F, -17.4F, -5.6F);
		Main4.addChild(bone31);
		setRotationAngle(bone31, 0.7854F, 0.0F, 0.0F);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 0.1416F, -0.2471F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(4.7F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 0.0709F, -0.3178F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 3.571F, -3.8887F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 7.1066F, -7.4243F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 10.6598F, -10.9775F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, -2.6692F, 2.5636F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 0.7603F, -1.078F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 4.2958F, -4.6135F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, 7.8314F, -8.1491F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(-0.3F, -1.255F, 1.1494F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(4.2F, -18.6357F, -5.2234F);
		Main4.addChild(bone32);
		setRotationAngle(bone32, 0.0F, -0.7854F, 0.0F);
		bone32.setTextureOffset(0, 0).addBox(-0.3939F, -2.5F, -0.2525F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-0.4293F, 2.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-0.4293F, 7.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-0.4293F, 12.5F, -0.4293F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-4.0002F, -2.5F, 3.3537F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-4.1062F, 2.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-4.1062F, 7.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-4.1062F, 12.5F, 3.2477F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-2.6213F, -2.5F, 1.9042F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-2.692F, 2.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-2.692F, 7.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-2.692F, 12.5F, 1.8335F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-1.8435F, -2.5F, 1.1971F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-5.4497F, -2.5F, 4.8033F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-1.1364F, -2.5F, 0.4899F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-4.7426F, -2.5F, 4.0962F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-6.1922F, -2.5F, 5.5458F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-6.369F, 2.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-6.369F, 7.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(-6.369F, 12.5F, 5.5104F, 1.0F, 4.0F, 1.0F, 0.0F, false);

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
		post.setTextureOffset(19, 0).addBox(-1.5F, -24.04F, 0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-1.0F, -24.04F, 0.0F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-1.4F, -24.04F, 0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-1.2F, -1.04F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-1.2F, -1.04F, 12.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(11.2F, -1.04F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(11.2F, -1.04F, 12.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-1.4F, -24.04F, 0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-0.6F, -24.04F, 0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post.setTextureOffset(19, 0).addBox(-0.6F, -24.04F, 0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);

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
		post2.setTextureOffset(19, 0).addBox(-0.5F, -24.04F, 0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(19, 0).addBox(-1.0F, -24.04F, 0.0F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(19, 0).addBox(-1.4F, -24.04F, 0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(19, 0).addBox(-1.4F, -24.04F, 0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(19, 0).addBox(-0.6F, -24.04F, 0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post2.setTextureOffset(19, 0).addBox(-0.6F, -24.04F, 0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);

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
		post3.setTextureOffset(19, 0).addBox(-0.5F, -24.04F, 0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(19, 0).addBox(-1.4F, -24.04F, 0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(19, 0).addBox(-0.6F, -24.04F, 0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(19, 0).addBox(-0.6F, -24.04F, 0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post3.setTextureOffset(19, 0).addBox(-1.0F, -24.04F, 1.0F, 1.0F, 24.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.8F, -12.5F, 0.7F);
		post3.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.7854F, 0.0F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.2F, -12.5F, 0.9F);
		post3.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.7854F, 0.0F);
		

		post4 = new ModelRenderer(this);
		post4.setRotationPoint(-6.0F, 15.55F, 6.0F);
		setRotationAngle(post4, 0.0F, -1.5708F, 0.0F);
		post4.setTextureOffset(19, 0).addBox(0.0F, -16.59F, -0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(19, 0).addBox(-0.9F, -16.59F, -0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(19, 0).addBox(-0.9F, -16.59F, -0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(19, 0).addBox(-0.1F, -16.59F, -0.9F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(19, 0).addBox(-0.1F, -16.59F, -0.1F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		post4.setTextureOffset(19, 0).addBox(-0.5F, -16.59F, 0.0F, 1.0F, 24.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.3F, -5.05F, -0.3F);
		post4.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.7854F, 0.0F);
		

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.3F, -5.05F, -0.1F);
		post4.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.7854F, 0.0F);
		

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -3.2F, 0.0F);
		setRotationAngle(bone37, 0.0F, -0.7854F, 0.0F);
		bone37.setTextureOffset(24, 27).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, -7.5F, 8.0F, 1.0F, 15.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -1.04F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -25.3F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 9).addBox(-1.5F, -26.8F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.5F, -1.3F, -6.5F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.5F, -25.35F, -5.5F, 11.0F, 3.0F, 11.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -25.4F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-4.5F, -25.45F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -25.5F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.5F, -25.55F, -3.5F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -25.6F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.5F, -25.65F, -2.5F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -25.7F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-7.5F, -1.0F, -7.5F, 7.0F, 1.0F, 15.0F, 0.0F, true);
		bb_main.setTextureOffset(20, 28).addBox(-0.5F, -28.6F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		super.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Main.render(matrixStack, buffer, packedLight, packedOverlay);
		Main2.render(matrixStack, buffer, packedLight, packedOverlay);
		Main3.render(matrixStack, buffer, packedLight, packedOverlay);
		Main4.render(matrixStack, buffer, packedLight, packedOverlay);
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
		bone37.render(matrixStack, buffer, packedLight, packedOverlay);
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