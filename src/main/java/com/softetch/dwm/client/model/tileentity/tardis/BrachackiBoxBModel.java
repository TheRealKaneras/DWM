package com.softetch.dwm.client.model.tileentity.tardis;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BrachackiBoxBModel extends AbstractTardisExteriorModel {
	private final ModelRenderer lamp;
	private final ModelRenderer box;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;
	private final ModelRenderer bone8;
	private final ModelRenderer bone6;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone16;
	private final ModelRenderer bone11;
	private final ModelRenderer bone13;
	private final ModelRenderer bone12;
	private final ModelRenderer bone37;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone19;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone21;
	private final ModelRenderer bone20;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone22;
	private final ModelRenderer bone25;
	private final ModelRenderer bone27;
	private final ModelRenderer bone26;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer rightDoor;
	private final ModelRenderer bone41;
	private final ModelRenderer bone3;
	private final ModelRenderer bone39;
	private final ModelRenderer bone36;
	private final ModelRenderer bone42;
	private final ModelRenderer bone40;
	private final ModelRenderer bone38;
	private final ModelRenderer leftDoor;
	private final ModelRenderer bone35;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;

	public BrachackiBoxBModel() {
		textureWidth = 512;
		textureHeight = 512;

		lamp = new ModelRenderer(this);
		lamp.setRotationPoint(-8.0F, 16.0F, 8.0F);
		lamp.setTextureOffset(428, 260).addBox(7.0F, -32.7F, -9.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		box = new ModelRenderer(this);
		box.setRotationPoint(0.0F, 24.0F, 0.0F);
		box.setTextureOffset(332, 257).addBox(-10.0F, -0.05F, -10.0F, 20.0F, 0.0F, 20.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.5F, -37.0F, -8.5F, 17.0F, 1.0F, 17.0F, 0.0F, false);
		box.setTextureOffset(148, 293).addBox(-7.5F, -36.1F, -7.5F, 15.0F, 3.0F, 15.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-7.0F, -37.15F, -7.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-8.0F, -37.05F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-6.5F, -37.2F, -6.5F, 13.0F, 3.0F, 13.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-7.5F, -37.1F, -7.5F, 15.0F, 1.0F, 15.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-6.0F, -37.25F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-5.5F, -37.3F, -5.5F, 11.0F, 3.0F, 11.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-5.0F, -37.35F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-4.5F, -37.4F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-4.0F, -37.45F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-3.5F, -37.5F, -3.5F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-2.5F, -37.6F, -2.5F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-3.0F, -37.55F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-1.5F, -37.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(276, 59).addBox(-1.0F, -41.2F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(276, 59).addBox(0.25F, -40.7F, -1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(276, 59).addBox(0.25F, -40.7F, 0.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(276, 59).addBox(-1.25F, -40.7F, -1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(276, 59).addBox(-1.25F, -40.7F, 0.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(99, 438).addBox(-1.5F, -40.9F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-2.0F, -37.65F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(8.0F, -36.0F, -9.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(8.0F, -36.0F, 7.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-8.5F, -36.0F, -9.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(8.0F, -36.0F, -9.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(8.0F, -36.0F, 7.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-8.5F, -36.0F, 7.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.5F, -36.0F, -9.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.5F, -36.0F, 7.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.0F, -36.0F, -9.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.0F, -36.0F, -9.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.5F, -36.0F, -9.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.5F, -36.0F, 7.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.5F, -36.0F, -8.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.5F, -36.0F, 8.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.0F, -36.0F, 8.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.0F, -36.0F, 8.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.5F, -36.0F, -8.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.5F, -36.0F, 8.0F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.5F, -36.0F, -9.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.0F, -36.0F, -9.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.0F, -36.0F, 7.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(7.5F, -36.0F, 7.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.0F, -36.0F, -9.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(157, 100).addBox(-9.0F, -36.0F, 7.5F, 1.0F, 36.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(6.0F, -32.0F, 7.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -32.3F, -7.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -32.3F, -7.0F, 1.0F, 32.0F, 1.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -3.0F, 7.0F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -3.3F, -6.0F, 1.0F, 3.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -3.3F, -6.0F, 1.0F, 3.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -10.0F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -10.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -10.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -10.5F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -10.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -10.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -17.0F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -17.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -17.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -17.5F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -17.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -17.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -24.0F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -24.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -24.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -24.5F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -24.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -24.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -32.0F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -32.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -32.3F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(345, 233).addBox(-7.0F, -33.0F, 7.2F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(-7.0F, -33.0F, -8.2F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(1.0F, -32.7F, -8.45F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(-2.0F, -32.7F, -8.45F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(7.45F, -33.3F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(-8.45F, -33.3F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-7.0F, -33.3F, 7.4F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-7.0F, -33.3F, -8.4F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.65F, -33.6F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.65F, -33.6F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, true);
		box.setTextureOffset(345, 233).addBox(-7.0F, -33.6F, 7.6F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(-7.0F, -33.6F, -8.6F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(7.85F, -33.9F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(-8.85F, -33.9F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, true);
		box.setTextureOffset(321, 334).addBox(-8.0F, -33.0F, 8.0F, 16.0F, 0.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-8.0F, -33.0F, -10.0F, 16.0F, 0.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(8.0F, -33.3F, -8.0F, 2.0F, 0.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-10.0F, -33.3F, -8.0F, 2.0F, 0.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(321, 334).addBox(6.0F, -35.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(6.0F, -35.0F, -10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(8.0F, -35.3F, -8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-10.0F, -35.3F, -8.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(145, 290).addBox(-6.0F, -35.0F, 9.2F, 12.0F, 2.0F, 0.0F, 0.0F, false);
		box.setTextureOffset(145, 290).addBox(-6.0F, -35.0F, -9.2F, 12.0F, 2.0F, 0.0F, 0.0F, false);
		box.setTextureOffset(44, 376).addBox(9.2F, -35.3F, -6.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(44, 376).addBox(-9.2F, -35.3F, -6.0F, 0.0F, 2.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(321, 334).addBox(-8.0F, -35.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-8.0F, -35.0F, -10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(8.0F, -35.3F, 6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-10.0F, -35.3F, 6.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(321, 334).addBox(-8.0F, -35.0F, 8.0F, 16.0F, 0.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-8.0F, -35.0F, -10.0F, 16.0F, 0.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(8.0F, -35.3F, -8.0F, 2.0F, 0.0F, 16.0F, 0.0F, false);
		box.setTextureOffset(321, 334).addBox(-10.0F, -35.3F, -8.0F, 2.0F, 0.0F, 16.0F, 0.0F, true);
		box.setTextureOffset(345, 233).addBox(-7.0F, -23.0F, 6.6F, 14.0F, 20.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(347, 223).addBox(6.85F, -23.3F, -6.0F, 1.0F, 20.0F, 13.0F, 0.0F, false);
		box.setTextureOffset(347, 223).addBox(7.35F, -1.0F, -7.0F, 0.85F, 1.0F, 14.0F, 0.0F, false);
		box.setTextureOffset(347, 223).addBox(-8.2F, -1.0F, -7.0F, 0.85F, 1.0F, 14.0F, 0.0F, true);
		box.setTextureOffset(345, 222).addBox(-7.85F, -23.3F, -6.0F, 1.0F, 20.0F, 13.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-6.0F, -31.5F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -31.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -31.8F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(428, 260).addBox(-6.0F, -30.5F, 6.7F, 12.0F, 6.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(428, 260).addBox(6.95F, -30.8F, -6.0F, 1.0F, 6.0F, 12.0F, 0.0F, false);
		box.setTextureOffset(428, 260).addBox(-7.95F, -30.8F, -6.0F, 1.0F, 6.0F, 12.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-0.75F, -30.5F, 7.0F, 2.0F, 28.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -30.8F, -1.25F, 1.0F, 28.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -30.8F, -1.25F, 1.0F, 28.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(345, 233).addBox(-0.5F, -32.0F, 7.2F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(7.45F, -32.3F, -0.5F, 1.0F, 28.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(345, 233).addBox(-8.45F, -32.3F, -0.5F, 1.0F, 32.0F, 1.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-1.25F, -30.5F, 7.0F, 2.0F, 28.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -30.8F, -0.75F, 1.0F, 28.0F, 2.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -30.8F, -0.75F, 1.0F, 28.0F, 2.0F, 0.0F, true);
		box.setTextureOffset(0, 1).addBox(-7.0F, -32.0F, 7.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(7.25F, -32.3F, 6.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(0, 1).addBox(-8.25F, -32.3F, 6.0F, 1.0F, 32.0F, 1.0F, 0.0F, true);
		box.setTextureOffset(374, 54).addBox(-7.0F, -32.0F, 5.0F, 14.0F, 32.0F, 1.0F, 0.0F, false);
		box.setTextureOffset(374, 54).addBox(6.0F, -32.0F, -2.0F, 1.0F, 32.0F, 7.0F, 0.0F, false);
		box.setTextureOffset(374, 54).addBox(-7.0F, -32.0F, -2.0F, 1.0F, 32.0F, 7.0F, 0.0F, false);
		box.setTextureOffset(374, 54).addBox(-7.0F, -33.0F, -8.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -31.5F, 8.0F);
		box.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.setTextureOffset(24, 312).addBox(-6.0F, 0.7071F, -0.2929F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -28.5F, 8.0F);
		box.addChild(bone4);
		setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
		bone4.setTextureOffset(24, 312).addBox(-6.0F, 0.7071F, -0.2929F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(2.83F, -28.5F, 8.0F);
		box.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.7854F, 0.0F);
		bone7.setTextureOffset(24, 312).addBox(0.0F, -2.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(6.0F, -25.5F, 8.0F);
		box.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.7854F, 0.0F);
		bone5.setTextureOffset(24, 312).addBox(0.0F, -5.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(4.41F, -28.5F, 8.0F);
		box.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.7854F, 0.0F);
		bone8.setTextureOffset(24, 312).addBox(0.0F, -2.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(1.25F, -28.5F, 8.0F);
		box.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.7854F, 0.0F);
		bone6.setTextureOffset(24, 312).addBox(0.0F, -2.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-4.41F, -28.5F, 8.0F);
		box.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.7854F, 0.0F);
		bone9.setTextureOffset(24, 312).addBox(0.0F, -2.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-2.83F, -28.5F, 8.0F);
		box.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
		bone10.setTextureOffset(24, 312).addBox(0.0F, -2.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-8.0F, -31.5F, 0.0F);
		box.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.7854F);
		bone16.setTextureOffset(24, 312).addBox(-0.6718F, 0.3182F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.25F, -28.5F, 8.0F);
		box.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.7854F, 0.0F);
		bone11.setTextureOffset(24, 312).addBox(0.0F, -2.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-8.0F, -25.5F, 6.0F);
		box.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.7854F, 0.0F);
		bone13.setTextureOffset(24, 312).addBox(-0.1768F, -5.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-6.0F, -25.5F, 8.0F);
		box.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.7854F, 0.0F);
		bone12.setTextureOffset(24, 312).addBox(0.0F, -5.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -25.5F, 8.0F);
		box.addChild(bone37);
		setRotationAngle(bone37, -0.7854F, 0.0F, 0.0F);
		bone37.setTextureOffset(24, 312).addBox(-6.0F, 0.7071F, -0.2929F, 12.0F, 1.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-8.0F, -28.5F, 1.25F);
		box.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.7854F, 0.0F);
		bone14.setTextureOffset(24, 312).addBox(-0.1768F, -2.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-8.0F, -25.5F, 0.0F);
		box.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.7854F);
		bone15.setTextureOffset(24, 312).addBox(-0.6718F, 0.3182F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-8.0F, -28.5F, -6.0F);
		box.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.7854F, 0.0F);
		bone19.setTextureOffset(24, 312).addBox(-0.1768F, -2.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-8.0F, -28.5F, 0.0F);
		box.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, -0.7854F);
		bone17.setTextureOffset(24, 312).addBox(-0.6718F, 0.3182F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-8.0F, -28.5F, -1.25F);
		box.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.7854F, 0.0F);
		bone18.setTextureOffset(24, 312).addBox(-0.1768F, -2.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-8.0F, -25.5F, -2.83F);
		box.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.7854F, 0.0F);
		bone21.setTextureOffset(24, 312).addBox(-0.1768F, -5.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-8.0F, -25.5F, 2.83F);
		box.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.7854F, 0.0F);
		bone20.setTextureOffset(24, 312).addBox(-0.1768F, -5.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(8.0F, -25.5F, 6.0F);
		box.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.7854F, 0.0F);
		bone23.setTextureOffset(24, 312).addBox(-0.8232F, -5.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(8.0F, -28.5F, 1.25F);
		box.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.7854F, 0.0F);
		bone24.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-8.0F, -25.5F, -4.41F);
		box.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.7854F, 0.0F);
		bone22.setTextureOffset(24, 312).addBox(-0.1768F, -5.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(8.0F, -28.5F, -1.25F);
		box.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.7854F, 0.0F);
		bone25.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(8.0F, -28.5F, 2.83F);
		box.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.7854F, 0.0F);
		bone27.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(8.0F, -28.5F, -6.0F);
		box.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.7854F, 0.0F);
		bone26.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(8.0F, -28.5F, -2.83F);
		box.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.7854F, 0.0F);
		bone28.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(8.0F, -28.5F, -4.41F);
		box.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.7854F, 0.0F);
		bone29.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(8.0F, -28.5F, 4.41F);
		box.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.7854F, 0.0F);
		bone30.setTextureOffset(24, 312).addBox(-0.8232F, -2.3F, -0.8232F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-8.0F, -25.5F, 4.41F);
		box.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.7854F, 0.0F);
		bone31.setTextureOffset(24, 312).addBox(-0.1768F, -5.3F, -0.1768F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(8.0F, -25.5F, 0.0F);
		box.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -0.7854F);
		bone32.setTextureOffset(24, 312).addBox(-1.3182F, -0.3282F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(8.0F, -28.5F, 0.0F);
		box.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -0.7854F);
		bone33.setTextureOffset(24, 312).addBox(-1.3182F, -0.3282F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(8.0F, -31.5F, 0.0F);
		box.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, -0.7854F);
		bone34.setTextureOffset(24, 312).addBox(-1.3182F, -0.3282F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		rightDoor = new ModelRenderer(this);
		rightDoor.setRotationPoint(-7.0F, 23.0F, -7.0F);
		rightDoor.setTextureOffset(0, 1).addBox(0.0F, -31.0F, -1.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -2.0F, -1.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -9.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -16.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -23.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -31.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -30.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -23.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -16.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(345, 233).addBox(1.0F, -16.9F, -0.8F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(345, 233).addBox(1.0F, -22.6F, -0.8F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(345, 233).addBox(5.35F, -22.0F, -0.8F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(345, 233).addBox(0.4F, -22.0F, -0.8F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(1.0F, -9.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(0, 1).addBox(5.75F, -29.5F, -1.0F, 1.0F, 28.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(428, 260).addBox(1.0F, -29.5F, -0.7F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(345, 233).addBox(6.5F, -31.0F, -1.2F, 1.0F, 32.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(345, 233).addBox(1.0F, -16.0F, -0.6F, 6.0F, 14.0F, 1.0F, 0.0F, false);
		rightDoor.setTextureOffset(386, 66).addBox(1.0F, -22.0F, -0.6F, 6.0F, 6.0F, 1.0F, 0.0F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(2.59F, -27.5F, -1.0F);
		rightDoor.addChild(bone41);
		setRotationAngle(bone41, 0.0F, -0.7854F, 0.0F);
		bone41.setTextureOffset(24, 312).addBox(0.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(7.0F, -24.5F, -1.0F);
		rightDoor.addChild(bone3);
		setRotationAngle(bone3, 0.7854F, 0.0F, 0.0F);
		bone3.setTextureOffset(24, 312).addBox(-6.0F, 0.7071F, -0.7071F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(5.75F, -27.5F, -1.0F);
		rightDoor.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -0.7854F, 0.0F);
		bone39.setTextureOffset(24, 312).addBox(0.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(7.0F, -27.5F, -1.0F);
		rightDoor.addChild(bone36);
		setRotationAngle(bone36, 0.7854F, 0.0F, 0.0F);
		bone36.setTextureOffset(24, 312).addBox(-6.0F, 0.7071F, -0.7071F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(1.0F, -24.5F, -1.0F);
		rightDoor.addChild(bone42);
		setRotationAngle(bone42, 0.0F, -0.7854F, 0.0F);
		bone42.setTextureOffset(24, 312).addBox(0.0F, -5.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(4.17F, -27.5F, -1.0F);
		rightDoor.addChild(bone40);
		setRotationAngle(bone40, 0.0F, -0.7854F, 0.0F);
		bone40.setTextureOffset(24, 312).addBox(0.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(7.0F, -30.5F, -1.0F);
		rightDoor.addChild(bone38);
		setRotationAngle(bone38, 0.7854F, 0.0F, 0.0F);
		bone38.setTextureOffset(24, 312).addBox(-6.0F, 0.7071F, -0.7071F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		leftDoor = new ModelRenderer(this);
		leftDoor.setRotationPoint(7.0F, 23.0F, -7.0F);
		leftDoor.setTextureOffset(100, 357).addBox(-6.25F, -16.25F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftDoor.setTextureOffset(0, 1).addBox(-1.0F, -31.0F, -1.0F, 1.0F, 32.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -2.0F, -1.0F, 6.0F, 3.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -9.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -16.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -23.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -31.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -30.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -23.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -16.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -9.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(0, 1).addBox(-6.75F, -29.5F, -1.0F, 1.0F, 28.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(428, 260).addBox(-6.5F, -29.5F, -0.7F, 6.0F, 6.0F, 1.0F, 0.0F, true);
		leftDoor.setTextureOffset(345, 233).addBox(-6.5F, -22.0F, -0.6F, 6.0F, 20.0F, 1.0F, 0.0F, true);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-2.59F, -27.5F, -1.0F);
		leftDoor.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.7854F, 0.0F);
		bone35.setTextureOffset(24, 312).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-7.0F, -24.5F, -1.0F);
		leftDoor.addChild(bone43);
		setRotationAngle(bone43, 0.7854F, 0.0F, 0.0F);
		bone43.setTextureOffset(24, 312).addBox(1.0F, 0.7071F, -0.7071F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-5.75F, -27.5F, -1.0F);
		leftDoor.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.7854F, 0.0F);
		bone44.setTextureOffset(24, 312).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-7.0F, -27.5F, -1.0F);
		leftDoor.addChild(bone45);
		setRotationAngle(bone45, 0.7854F, 0.0F, 0.0F);
		bone45.setTextureOffset(24, 312).addBox(0.5F, 0.7071F, -0.7071F, 6.0F, 1.0F, 1.0F, 0.0F, true);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-1.0F, -24.5F, -1.0F);
		leftDoor.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 0.7854F, 0.0F);
		bone46.setTextureOffset(24, 312).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-4.17F, -27.5F, -1.0F);
		leftDoor.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.7854F, 0.0F);
		bone47.setTextureOffset(24, 312).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-7.0F, -30.5F, -1.0F);
		leftDoor.addChild(bone48);
		setRotationAngle(bone48, 0.7854F, 0.0F, 0.0F);
		bone48.setTextureOffset(24, 312).addBox(0.5F, 0.7071F, -0.7071F, 6.0F, 1.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		lamp.render(matrixStack, buffer, packedLight, packedOverlay);
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