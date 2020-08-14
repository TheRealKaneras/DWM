package com.softetch.dwm.client.model.tileentity.tardis.box;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class JalmBoxModel extends AbstractTardisExteriorModel {
	private final ModelRenderer leftDoor;
	private final ModelRenderer rightDoor;
	private final ModelRenderer bone;
	private final ModelRenderer side2;
	private final ModelRenderer side3;
	private final ModelRenderer side4;
	private final ModelRenderer lamp;
	private final ModelRenderer bb_main;

	public JalmBoxModel() {
		textureWidth = 64;
		textureHeight = 64;

		leftDoor = new ModelRenderer(this);
		leftDoor.setRotationPoint(7.0F, 8.0F, -8.0F);
		leftDoor.setTextureOffset(42, 0).addBox(-7.5F, -15.0F, -0.5F, 8.0F, 30.0F, 1.0F, 0.0F, false);

		rightDoor = new ModelRenderer(this);
		rightDoor.setRotationPoint(-8.0F, 8.0F, -8.0F);
		rightDoor.setTextureOffset(34, 0).addBox(-0.5F, -15.0F, -0.5F, 8.0F, 30.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.5F, 6.0F, 2.5F);
		bone.setTextureOffset(25, 0).addBox(10.0F, -15.0F, -13.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(25, 0).addBox(10.0F, -15.0F, 5.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(25, 0).addBox(-8.0F, -15.0F, -13.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(25, 0).addBox(-8.0F, -15.0F, 5.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);

		side2 = new ModelRenderer(this);
		side2.setRotationPoint(6.5F, 0.25F, 3.0F);
		setRotationAngle(side2, 0.0F, -1.5708F, 0.0F);
		side2.setTextureOffset(0, 0).addBox(-11.5F, -7.25F, -1.0F, 16.0F, 30.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(0, 34).addBox(-11.5F, -9.25F, -4.0F, 16.0F, 3.0F, 3.0F, 0.0F, false);

		side3 = new ModelRenderer(this);
		side3.setRotationPoint(-11.5F, 0.25F, 2.0F);
		setRotationAngle(side3, 0.0F, 1.5708F, 0.0F);
		side3.setTextureOffset(0, 0).addBox(-5.5F, -7.25F, 3.0F, 16.0F, 30.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(0, 34).addBox(-5.5F, -9.25F, 0.0F, 16.0F, 3.0F, 3.0F, 0.0F, false);

		side4 = new ModelRenderer(this);
		side4.setRotationPoint(-2.5F, 0.25F, 11.0F);
		setRotationAngle(side4, 0.0F, 3.1416F, 0.0F);
		side4.setTextureOffset(0, 0).addBox(-10.0F, -7.25F, 3.5F, 16.0F, 30.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(0, 34).addBox(-10.0F, -9.25F, 0.5F, 16.0F, 3.0F, 3.0F, 0.0F, false);

		lamp = new ModelRenderer(this);
		lamp.setRotationPoint(-1.5F, -13.5F, 0.0F);
		lamp.setTextureOffset(0, 43).addBox(-0.5F, 1.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		lamp.setTextureOffset(0, 53).addBox(0.0F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		lamp.setTextureOffset(0, 43).addBox(-0.5F, -1.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 43).addBox(-11.0F, -1.0F, -11.0F, 21.0F, 1.0F, 21.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 34).addBox(-8.5F, -33.0F, -11.5F, 16.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 43).addBox(-10.0F, -34.0F, -10.0F, 19.0F, 1.0F, 19.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 43).addBox(-9.5F, -35.0F, -9.5F, 18.0F, 1.0F, 18.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 43).addBox(-9.0F, -35.5F, -9.0F, 17.0F, 1.0F, 17.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		super.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		rightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		side2.render(matrixStack, buffer, packedLight, packedOverlay);
		side3.render(matrixStack, buffer, packedLight, packedOverlay);
		side4.render(matrixStack, buffer, packedLight, packedOverlay);
		lamp.render(matrixStack, buffer, packedLight, packedOverlay);
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