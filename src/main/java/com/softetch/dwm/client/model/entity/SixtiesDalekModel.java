package com.softetch.dwm.client.model.entity;

import com.softetch.dwm.common.entity.SixtiesDalekEntity;
import net.minecraft.client.renderer.model.ModelBox;

/**
 * The entity model for sixties daleks
 */
public class SixtiesDalekModel extends BaseDalekModel<SixtiesDalekEntity> {

	/**
	 * Set up all the parts of the model as renderable boxes
	 */
	public SixtiesDalekModel() {
		super(256,256);
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 59, -5.0F, -18.5F, -4.75F, 10, 2, 10, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 112, 32, -5.5F, -18.75F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 52, 49, -5.0F, -16.25F, -5.0F, 10, 3, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 49, 65, -5.5F, -14.0F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 107, 49, -5.5F, -16.5F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 50, 32, 4.5F, -15.5F, -5.75F, 1, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 50, 32, -5.5F, -15.5F, -5.75F, 1, 1, 12, 0.0F, false));
	}


}