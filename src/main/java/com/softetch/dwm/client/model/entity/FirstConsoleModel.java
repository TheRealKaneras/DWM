package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.common.entity.ConsoleEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FirstConsoleModel extends EntityModel<ConsoleEntity> {
	private final ModelRenderer Base;
	private final ModelRenderer bone4;
	private final ModelRenderer CORNER;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone31;
	private final ModelRenderer bone26;
	private final ModelRenderer bone25;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer CORNER2;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer Panel1;
	private final ModelRenderer bone;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer Panel2;
	private final ModelRenderer bone8;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer Panel3;
	private final ModelRenderer bone9;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer Panel4;
	private final ModelRenderer bone10;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer Panel5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer Panel6;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer time_rotor;
	private final ModelRenderer Time_middle;
	private final ModelRenderer rotor6;
	private final ModelRenderer rotor5;
	private final ModelRenderer rotor4;
	private final ModelRenderer rotor3;
	private final ModelRenderer rotor2;
	private final ModelRenderer rotor;

	public FirstConsoleModel() {
		textureWidth = 40;
		textureHeight = 40;

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, 29.0F, 0.0F);
		Base.setTextureOffset(0, 0).addBox(-6.0F, -31.0F, -5.0F, 12.0F, 11.0F, 10.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.5F, -7.0F, 0.0F);
		Base.addChild(bone4);
		bone4.setTextureOffset(0, 0).addBox(-12.5F, -19.0F, -1.0F, 25.0F, 20.0F, 2.0F, 0.0F, false);

		CORNER = new ModelRenderer(this);
		CORNER.setRotationPoint(0.0F, -5.0F, 0.0F);
		Base.addChild(CORNER);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.5F, 5.0F, 0.0F);
		CORNER.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 3.1416F, 0.0F);
		

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone32.addChild(bone33);
		

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone33.addChild(bone34);
		setRotationAngle(bone34, -0.6981F, 0.0F, 0.0F);
		bone34.setTextureOffset(0, 0).addBox(-5.5F, -6.0963F, -4.3567F, 11.0F, 5.0F, 1.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone32.addChild(bone35);
		setRotationAngle(bone35, 0.0F, -1.0472F, 0.0F);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone35.addChild(bone36);
		setRotationAngle(bone36, -0.6981F, 0.0F, 0.0F);
		bone36.setTextureOffset(0, 0).addBox(-5.7464F, -5.8564F, -4.6426F, 11.0F, 5.0F, 1.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone32.addChild(bone37);
		setRotationAngle(bone37, 0.0F, -2.0944F, 0.0F);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.4598F, -2.4F, -8.9696F);
		bone37.addChild(bone38);
		setRotationAngle(bone38, -0.6981F, 0.0F, 0.0F);
		bone38.setTextureOffset(0, 0).addBox(-6.2F, -6.1963F, -4.3567F, 11.0F, 5.0F, 1.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 5.0F, 0.0F);
		CORNER.addChild(bone31);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(bone26);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone26.addChild(bone25);
		setRotationAngle(bone25, -0.6981F, 0.0F, 0.0F);
		bone25.setTextureOffset(0, 0).addBox(-5.5F, -6.0963F, -4.3567F, 11.0F, 5.0F, 1.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(bone27);
		setRotationAngle(bone27, 0.0F, -1.0472F, 0.0F);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone27.addChild(bone28);
		setRotationAngle(bone28, -0.6981F, 0.0F, 0.0F);
		bone28.setTextureOffset(0, 0).addBox(-5.7464F, -5.8564F, -4.6426F, 11.0F, 5.0F, 1.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -2.0944F, 0.0F);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.4598F, -2.4F, -8.9696F);
		bone29.addChild(bone30);
		setRotationAngle(bone30, -0.6981F, 0.0F, 0.0F);
		bone30.setTextureOffset(0, 0).addBox(-6.1866F, -6.3397F, -4.1857F, 11.0F, 5.0F, 1.0F, 0.0F, false);

		CORNER2 = new ModelRenderer(this);
		CORNER2.setRotationPoint(0.0F, -25.0F, 0.0F);
		Base.addChild(CORNER2);
		setRotationAngle(CORNER2, 0.0F, 3.1416F, -3.1416F);
		

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.5F, 5.0F, 0.0F);
		CORNER2.addChild(bone39);
		setRotationAngle(bone39, 0.0F, 3.1416F, 0.0F);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone39.addChild(bone40);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone40.addChild(bone41);
		setRotationAngle(bone41, -0.6981F, 0.0F, 0.0F);
		bone41.setTextureOffset(0, 0).addBox(-5.5F, -6.0963F, -4.3567F, 11.0F, 7.0F, 3.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone39.addChild(bone42);
		setRotationAngle(bone42, 0.0F, -1.0472F, 0.0F);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone42.addChild(bone43);
		setRotationAngle(bone43, -0.6981F, 0.0F, 0.0F);
		bone43.setTextureOffset(0, 0).addBox(-5.7464F, -5.8564F, -4.6426F, 11.0F, 7.0F, 3.0F, 0.0F, false);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone39.addChild(bone44);
		setRotationAngle(bone44, 0.0F, -2.0944F, 0.0F);
		

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.4598F, -2.4F, -8.9696F);
		bone44.addChild(bone45);
		setRotationAngle(bone45, -0.6981F, 0.0F, 0.0F);
		bone45.setTextureOffset(0, 0).addBox(-6.2F, -6.1963F, -4.3567F, 11.0F, 7.0F, 3.0F, 0.0F, false);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, 5.0F, 0.0F);
		CORNER2.addChild(bone46);
		

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(bone47);
		

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone47.addChild(bone48);
		setRotationAngle(bone48, -0.6981F, 0.0F, 0.0F);
		bone48.setTextureOffset(0, 0).addBox(-5.5F, -6.0963F, -4.3567F, 11.0F, 7.0F, 3.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(bone49);
		setRotationAngle(bone49, 0.0F, -1.0472F, 0.0F);
		

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.5F, -2.4F, -8.3F);
		bone49.addChild(bone50);
		setRotationAngle(bone50, -0.6981F, 0.0F, 0.0F);
		bone50.setTextureOffset(0, 0).addBox(-5.7464F, -5.8564F, -4.6426F, 11.0F, 7.0F, 3.0F, 0.0F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(bone51);
		setRotationAngle(bone51, 0.0F, -2.0944F, 0.0F);
		

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.4598F, -2.4F, -8.9696F);
		bone51.addChild(bone52);
		setRotationAngle(bone52, -0.6981F, 0.0F, 0.0F);
		bone52.setTextureOffset(0, 0).addBox(-6.1866F, -6.3397F, -4.1857F, 11.0F, 7.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.5F, -7.0F, 0.0F);
		Base.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 1.5708F, 0.0F);
		bone7.setTextureOffset(0, 0).addBox(-8.5F, -19.0F, -4.0F, 17.0F, 20.0F, 8.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.5F, -7.0F, 0.0F);
		Base.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.5236F, 0.0F);
		bone6.setTextureOffset(0, 0).addBox(-8.5F, -19.0F, -4.0F, 17.0F, 20.0F, 8.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5F, -7.0F, 0.0F);
		Base.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -0.5236F, 0.0F);
		bone5.setTextureOffset(0, 0).addBox(-8.5F, -19.0F, -4.0F, 17.0F, 20.0F, 8.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.5F, -7.0F, 0.0F);
		Base.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 2.0944F, 0.0F);
		bone3.setTextureOffset(0, 0).addBox(-12.5F, -19.0F, -1.0F, 25.0F, 20.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, -7.0F, 0.0F);
		Base.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 1.0472F, 0.0F);
		bone2.setTextureOffset(0, 0).addBox(-12.5F, -19.0F, -1.0F, 25.0F, 20.0F, 2.0F, 0.0F, false);

		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(0.0F, 10.0F, 0.0F);
		Panel1.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -6.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Panel1.setTextureOffset(0, 0).addBox(-13.0F, -6.9F, -22.5F, 26.0F, 3.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -1.7143F, -13.7857F);
		Panel1.addChild(bone);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(4.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-5.0F, -9.0813F, 5.3386F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -7.0813F, 5.3386F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-11.0F, -6.0813F, -0.6614F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(4.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -8.0813F, -0.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -7.0813F, -6.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-11.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-3.0F, 12.0F, 7.0F);
		Panel1.addChild(bone23);
		setRotationAngle(bone23, 0.3491F, 0.0F, 0.1745F);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(4.5F, -22.5F, -7.5F);
		bone23.addChild(bone24);
		setRotationAngle(bone24, 0.0F, -0.5585F, 0.0F);
		bone24.setTextureOffset(0, 0).addBox(-1.4126F, -7.0525F, -14.234F, 3.0F, 4.0F, 20.0F, 0.0F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(Panel2, 0.0F, -1.0472F, 0.0F);
		Panel2.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -6.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Panel2.setTextureOffset(0, 0).addBox(-13.0F, -6.9F, -22.5F, 26.0F, 3.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -1.7143F, -13.7857F);
		Panel2.addChild(bone8);
		setRotationAngle(bone8, 0.2618F, 0.0F, 0.0F);
		bone8.setTextureOffset(0, 0).addBox(4.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-5.0F, -9.0813F, 5.3386F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-8.0F, -7.0813F, 5.3386F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-8.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-11.0F, -6.0813F, -0.6614F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(4.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-4.0F, -8.0813F, -0.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-4.0F, -7.0813F, -6.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-11.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-3.0F, 12.0F, 7.0F);
		Panel2.addChild(bone21);
		setRotationAngle(bone21, 0.3491F, 0.0F, 0.1745F);
		

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(4.5F, -22.5F, -7.5F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, -0.5585F, 0.0F);
		bone22.setTextureOffset(0, 0).addBox(-1.4126F, -7.0525F, -14.234F, 3.0F, 4.0F, 20.0F, 0.0F, false);

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(Panel3, 0.0F, -2.0944F, 0.0F);
		Panel3.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -6.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Panel3.setTextureOffset(0, 0).addBox(-13.0F, -6.9F, -22.5F, 26.0F, 3.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -1.7143F, -13.7857F);
		Panel3.addChild(bone9);
		setRotationAngle(bone9, 0.2618F, 0.0F, 0.0F);
		bone9.setTextureOffset(0, 0).addBox(4.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-5.0F, -9.0813F, 5.3386F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-8.0F, -7.0813F, 5.3386F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-8.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-11.0F, -6.0813F, -0.6614F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(4.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-4.0F, -8.0813F, -0.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-4.0F, -7.0813F, -6.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(-11.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.0F, 12.0F, 7.0F);
		Panel3.addChild(bone19);
		setRotationAngle(bone19, 0.3491F, 0.0F, 0.1745F);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(4.5F, -22.5F, -7.5F);
		bone19.addChild(bone20);
		setRotationAngle(bone20, 0.0F, -0.5585F, 0.0F);
		bone20.setTextureOffset(0, 0).addBox(-1.4126F, -7.0525F, -14.234F, 3.0F, 4.0F, 20.0F, 0.0F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(Panel4, 0.0F, 3.1416F, 0.0F);
		Panel4.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -6.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Panel4.setTextureOffset(0, 0).addBox(-13.0F, -6.9F, -22.5F, 26.0F, 3.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -1.7143F, -13.7857F);
		Panel4.addChild(bone10);
		setRotationAngle(bone10, 0.2618F, 0.0F, 0.0F);
		bone10.setTextureOffset(0, 0).addBox(4.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-5.0F, -9.0813F, 5.3386F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-8.0F, -7.0813F, 5.3386F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-8.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-11.0F, -6.0813F, -0.6614F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(4.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-4.0F, -8.0813F, -0.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-4.0F, -7.0813F, -6.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(-11.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-3.0F, 12.0F, 7.0F);
		Panel4.addChild(bone17);
		setRotationAngle(bone17, 0.3491F, 0.0F, 0.1745F);
		

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(4.5F, -22.5F, -7.5F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -0.5585F, 0.0F);
		bone18.setTextureOffset(0, 0).addBox(-1.4126F, -7.0525F, -14.234F, 3.0F, 4.0F, 20.0F, 0.0F, false);

		Panel5 = new ModelRenderer(this);
		Panel5.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(Panel5, 0.0F, 2.0944F, 0.0F);
		Panel5.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -6.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Panel5.setTextureOffset(0, 0).addBox(-13.0F, -6.9F, -22.5F, 26.0F, 3.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.7143F, -13.7857F);
		Panel5.addChild(bone11);
		setRotationAngle(bone11, 0.2618F, 0.0F, 0.0F);
		bone11.setTextureOffset(0, 0).addBox(4.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-5.0F, -9.0813F, 5.3386F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-8.0F, -7.0813F, 5.3386F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-8.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-10.9F, -6.0813F, -0.6614F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(4.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-4.0F, -8.0813F, -0.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-4.0F, -7.0813F, -6.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(-11.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.0F, 12.0F, 7.0F);
		Panel5.addChild(bone15);
		setRotationAngle(bone15, 0.3491F, 0.0F, 0.1745F);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(4.5F, -22.5F, -7.5F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, -0.5585F, 0.0F);
		bone16.setTextureOffset(0, 0).addBox(-1.4126F, -7.0525F, -14.234F, 3.0F, 4.0F, 20.0F, 0.0F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(Panel6, 0.0F, 1.0472F, 0.0F);
		Panel6.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -6.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Panel6.setTextureOffset(0, 0).addBox(-13.0F, -6.9F, -22.5F, 26.0F, 3.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -1.7143F, -13.7857F);
		Panel6.addChild(bone12);
		setRotationAngle(bone12, 0.2618F, 0.0F, 0.0F);
		bone12.setTextureOffset(0, 0).addBox(4.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-5.0F, -9.0813F, 5.3386F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-8.0F, -7.0813F, 5.3386F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-8.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-11.0F, -6.0813F, -0.6614F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(4.0F, -8.0813F, -0.6614F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-4.0F, -8.0813F, -0.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-4.0F, -7.0813F, -6.6614F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(-11.0F, -7.0813F, -6.6614F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-3.0F, 12.0F, 7.0F);
		Panel6.addChild(bone13);
		setRotationAngle(bone13, 0.3491F, 0.0F, 0.1745F);
		

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(4.5F, -22.5F, -7.5F);
		bone13.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.5585F, 0.0F);
		bone14.setTextureOffset(0, 0).addBox(-1.4126F, -7.0525F, -14.234F, 3.0F, 4.0F, 20.0F, 0.0F, false);

		time_rotor = new ModelRenderer(this);
		time_rotor.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Time_middle = new ModelRenderer(this);
		Time_middle.setRotationPoint(0.0F, -31.2676F, 0.2529F);
		time_rotor.addChild(Time_middle);
		Time_middle.setTextureOffset(0, 29).addBox(-0.5F, -3.7324F, 2.7471F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(2, 29).addBox(-4.0F, -3.7324F, -0.7529F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(0, 29).addBox(3.0F, -3.7324F, -0.7529F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(-1.5F, -0.7324F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(27, 33).addBox(-1.5F, 0.2676F, -0.2529F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(0.5F, -0.7324F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(27, 33).addBox(0.5F, 0.2676F, -0.2529F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-0.5F, 2.7676F, -0.9529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-1.2F, 2.0676F, -0.9529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(0.2F, 2.0676F, -0.9529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-0.5F, 2.0676F, -1.5529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-0.5F, 2.0676F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-1.5F, 1.6676F, 0.2471F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(0.5F, 1.6676F, 0.2471F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(0.5F, 1.6676F, -1.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-1.5F, 1.6676F, -1.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-0.5F, 1.6676F, -2.4529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(14, 38).addBox(-0.5F, 0.6676F, -2.3529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(14, 38).addBox(-0.5F, 0.6676F, 0.8471F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-0.5F, 1.6676F, 0.9471F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(-2.2F, 1.6676F, -0.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(10, 38).addBox(1.2F, 1.6676F, -0.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(-1.5F, -1.2324F, -0.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(0.5F, -1.2324F, -0.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(-1.5F, -2.0324F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(0.5F, -2.0324F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(-1.5F, -2.5324F, -0.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(0.5F, -2.5324F, -0.7529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(-1.5F, -3.3324F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(26, 34).addBox(-1.0F, -5.3324F, -0.2529F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(18, 39).addBox(-1.5F, -6.3324F, 0.2471F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Time_middle.setTextureOffset(6, 38).addBox(0.5F, -3.3324F, -0.2529F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(26, 34).addBox(1.0F, -5.3324F, -0.2529F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Time_middle.setTextureOffset(19, 38).addBox(0.5F, -6.3324F, 0.2471F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		rotor6 = new ModelRenderer(this);
		rotor6.setRotationPoint(0.0F, 0.0F, 0.0F);
		time_rotor.addChild(rotor6);
		setRotationAngle(rotor6, 0.0F, -1.0472F, 0.0F);
		rotor6.setTextureOffset(26, 27).addBox(-2.5F, -41.0F, 4.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);
		rotor6.setTextureOffset(26, 26).addBox(-1.5F, -38.0F, 2.6F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		rotor5 = new ModelRenderer(this);
		rotor5.setRotationPoint(0.0F, 0.0F, 0.0F);
		time_rotor.addChild(rotor5);
		setRotationAngle(rotor5, 0.0F, -2.0944F, 0.0F);
		rotor5.setTextureOffset(26, 27).addBox(-2.5F, -41.0F, 4.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);
		rotor5.setTextureOffset(26, 26).addBox(-1.5F, -38.0F, 2.6F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		rotor4 = new ModelRenderer(this);
		rotor4.setRotationPoint(0.0F, 0.0F, 0.0F);
		time_rotor.addChild(rotor4);
		setRotationAngle(rotor4, 0.0F, 3.1416F, 0.0F);
		rotor4.setTextureOffset(26, 27).addBox(-2.5F, -41.0F, 4.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);
		rotor4.setTextureOffset(26, 26).addBox(-1.5F, -38.0F, 2.6F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		rotor3 = new ModelRenderer(this);
		rotor3.setRotationPoint(0.0F, 0.0F, 0.0F);
		time_rotor.addChild(rotor3);
		setRotationAngle(rotor3, 0.0F, 2.0944F, 0.0F);
		rotor3.setTextureOffset(27, 27).addBox(-2.5F, -41.0F, 4.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);
		rotor3.setTextureOffset(26, 26).addBox(-1.5F, -38.0F, 2.6F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		rotor2 = new ModelRenderer(this);
		rotor2.setRotationPoint(0.0F, 0.0F, 0.0F);
		time_rotor.addChild(rotor2);
		setRotationAngle(rotor2, 0.0F, 1.0472F, 0.0F);
		rotor2.setTextureOffset(26, 26).addBox(-2.5F, -41.0F, 4.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);
		rotor2.setTextureOffset(26, 26).addBox(-1.5F, -38.0F, 2.6F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		rotor = new ModelRenderer(this);
		rotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		time_rotor.addChild(rotor);
		rotor.setTextureOffset(26, 27).addBox(-2.5F, -41.0F, 4.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);
		rotor.setTextureOffset(26, 26).addBox(-1.5F, -38.0F, 2.6F, 3.0F, 7.0F, 0.0F, 0.0F, false);
	}

	/**
	 * Sets this entity's model rotation angles
	 *
	 * @param entityIn
	 * @param limbSwing
	 * @param limbSwingAmount
	 * @param ageInTicks
	 * @param netHeadYaw
	 * @param headPitch
	 */
	@Override
	public void setRotationAngles(ConsoleEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Base.render(matrixStack, buffer, packedLight, packedOverlay);
		Panel1.render(matrixStack, buffer, packedLight, packedOverlay);
		Panel2.render(matrixStack, buffer, packedLight, packedOverlay);
		Panel3.render(matrixStack, buffer, packedLight, packedOverlay);
		Panel4.render(matrixStack, buffer, packedLight, packedOverlay);
		Panel5.render(matrixStack, buffer, packedLight, packedOverlay);
		Panel6.render(matrixStack, buffer, packedLight, packedOverlay);
		time_rotor.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}