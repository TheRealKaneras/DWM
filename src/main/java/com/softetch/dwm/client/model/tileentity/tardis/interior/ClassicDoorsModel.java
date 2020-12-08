package com.softetch.dwm.client.model.tileentity.tardis.interior;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.client.model.tileentity.DoorModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ClassicDoorsModel extends DoorModel {
	private final ModelRenderer frame;
	private final ModelRenderer Door1;
	private final ModelRenderer frame2;
	private final ModelRenderer Door2;
	private final ModelRenderer bone;

	public ClassicDoorsModel() {
		super(RenderType::getEntityTranslucentCull);
		textureWidth = 32;
		textureHeight = 32;

		frame = new ModelRenderer(this);
		frame.setRotationPoint(-13.0F, -5.0F, -8.0F);
		frame.setTextureOffset(10, 0).addBox(-10.0F, 26.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		frame.setTextureOffset(10, 0).addBox(-11.0F, -3.0F, 0.0F, 1.0F, 32.0F, 2.0F, 0.0F, false);
		frame.setTextureOffset(10, 0).addBox(-10.0F, 15.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		frame.setTextureOffset(10, 0).addBox(-10.0F, 5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		frame.setTextureOffset(10, 0).addBox(-10.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Door1 = new ModelRenderer(this);
		Door1.setRotationPoint(-9.0F, 29.0F, 1.0F);
		frame.addChild(Door1);
		Door1.setTextureOffset(0, 22).addBox(3.0F, -20.5F, 0.2F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		Door1.setTextureOffset(26, 16).addBox(-1.0F, -19.0F, -0.8F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Door1.setTextureOffset(19, 0).addBox(-1.0F, -8.0F, -0.8F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Door1.setTextureOffset(26, 26).addBox(-1.0F, -29.0F, -0.8F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Door1.setTextureOffset(0, 22).addBox(3.0F, -10.0F, 0.2F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		Door1.setTextureOffset(20, 25).addBox(5.0F, -8.0F, -0.8F, 5.0F, 5.0F, 1.0F, 0.0F, true);
		Door1.setTextureOffset(20, 25).addBox(5.0F, -29.0F, -0.8F, 5.0F, 5.0F, 1.0F, 0.0F, true);
		Door1.setTextureOffset(20, 25).addBox(5.0F, -18.5F, -0.8F, 5.0F, 5.0F, 1.0F, 0.0F, true);
		Door1.setTextureOffset(0, 22).addBox(3.0F, -31.0F, 0.2F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		Door1.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -0.8F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Door1.setTextureOffset(0, 0).addBox(3.0F, -12.0F, -0.8F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		Door1.setTextureOffset(0, 0).addBox(3.0F, -22.0F, -0.8F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		Door1.setTextureOffset(0, 0).addBox(3.0F, -32.0F, -0.8F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Door1.setTextureOffset(10, 0).addBox(12.0F, -32.0F, -0.8F, 2.0F, 32.0F, 9.0F, 0.0F, false);
		Door1.setTextureOffset(10, 0).addBox(1.0F, -32.0F, -0.8F, 2.0F, 32.0F, 9.0F, 0.0F, false);

		frame2 = new ModelRenderer(this);
		frame2.setRotationPoint(-3.0F, 21.0F, -8.0F);
		setRotationAngle(frame2, 0.0F, 0.0F, -3.1416F);
		frame2.setTextureOffset(10, 0).addBox(-10.0F, 26.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		frame2.setTextureOffset(10, 0).addBox(-11.0F, -3.0F, 0.0F, 1.0F, 32.0F, 2.0F, 0.0F, false);
		frame2.setTextureOffset(10, 0).addBox(-10.0F, 15.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		frame2.setTextureOffset(10, 0).addBox(-10.0F, 5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		frame2.setTextureOffset(10, 0).addBox(-10.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Door2 = new ModelRenderer(this);
		Door2.setRotationPoint(-9.0F, 29.0F, 1.0F);
		frame2.addChild(Door2);
		Door2.setTextureOffset(24, 14).addBox(-1.0F, -19.0F, -0.8F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Door2.setTextureOffset(19, 0).addBox(-1.0F, -8.0F, -0.8F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Door2.setTextureOffset(26, 25).addBox(-1.0F, -29.0F, -0.8F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Door2.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -0.8F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Door2.setTextureOffset(0, 0).addBox(3.0F, -12.0F, -0.8F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		Door2.setTextureOffset(0, 0).addBox(3.0F, -22.0F, -0.8F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		Door2.setTextureOffset(0, 0).addBox(3.0F, -32.0F, -0.8F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Door2.setTextureOffset(10, 0).addBox(12.0F, -32.0F, -0.8F, 2.0F, 32.0F, 9.0F, 0.0F, false);
		Door2.setTextureOffset(10, 0).addBox(1.0F, -32.0F, -0.8F, 2.0F, 32.0F, 9.0F, 0.0F, false);
		Door2.setTextureOffset(20, 25).addBox(5.0F, -8.0F, -0.8F, 5.0F, 5.0F, 1.0F, 0.0F, true);
		Door2.setTextureOffset(20, 25).addBox(5.0F, -18.5F, -0.8F, 5.0F, 5.0F, 1.0F, 0.0F, true);
		Door2.setTextureOffset(20, 25).addBox(5.0F, -29.0F, -0.8F, 5.0F, 5.0F, 1.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.5F, -16.0F, 0.5F);
		Door2.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -3.1416F);
		bone.setTextureOffset(0, 22).addBox(-4.5F, -4.5F, -0.3F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 22).addBox(-4.5F, -15.0F, -0.3F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 22).addBox(-4.5F, 6.0F, -0.3F, 9.0F, 9.0F, 1.0F, 0.0F, false);
	}

	protected ModelRenderer getRightDoor() {
		return Door1;
	}

	protected ModelRenderer getLeftDoor() {
		return Door2;
	}

	/**
	 * Get the maximum angle to rotate the doors by
	 * @return The maximum door rotation in radians
	 */
	protected float getMaximumAngle() { return (float) Math.toRadians(120.0D); }

	@Override
	protected boolean inverse() {
		return false;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		frame.render(matrixStack, buffer, packedLight, packedOverlay);
		frame2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}