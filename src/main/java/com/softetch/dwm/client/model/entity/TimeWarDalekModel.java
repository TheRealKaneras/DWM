package com.softetch.dwm.client.model.entity;

import com.softetch.dwm.common.entity.TimeWarDalekEntity;
import net.minecraft.client.renderer.model.ModelBox;

/**
 * The entity model for time war daleks
 */
public class TimeWarDalekModel extends BaseDalekModel<TimeWarDalekEntity> {
	/**
	 * Set up all the parts of the model as renderable boxes
	 */
	public TimeWarDalekModel() {
		super(256,256);
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 3.0F, -18.5F, -5.5F, 1, 2, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -1.5F, -18.5F, -5.5F, 3, 2, 0, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -4.0F, -18.5F, -5.5F, 1, 2, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 59, -5.0F, -18.5F, -4.75F, 10, 2, 10, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 112, 32, -5.5F, -18.75F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 52, 49, -5.0F, -16.0F, -5.0F, 10, 3, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 49, 65, -5.5F, -14.0F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 107, 49, -5.5F, -16.5F, -5.75F, 11, 1, 12, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.5F, -15.5F, -5.75F, 1, 1, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.5F, -15.5F, -5.75F, 1, 1, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, -2.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, -4.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, -0.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, 1.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, 3.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -5.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -3.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, -1.5F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 0.5F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 2.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, 5.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, 3.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, 1.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, -0.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, -2.5F, 1, 4, 1, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 40, 4.75F, -17.75F, -4.5F, 1, 4, 1, 0.0F, false));
	}


}