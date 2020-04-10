package com.softetch.dwm.client.model.entity.projectile;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;

public class LaserModel extends Model {
	private final RendererModel bb_main;

	public LaserModel() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new RendererModel(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));
	}

	public void renderLaser(float scale) {
		bb_main.render(scale);
	}
}