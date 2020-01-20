package com.softetch.dwm.client.model.entity.projectile;

import com.softetch.dwm.common.entity.projectile.LaserEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class LaserModel extends EntityModel<LaserEntity> {
	private final RendererModel bb_main;

	public LaserModel() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new RendererModel(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(LaserEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		bb_main.render(scale);
	}

	public void render(float scale) {
		bb_main.render(scale);
	}
}