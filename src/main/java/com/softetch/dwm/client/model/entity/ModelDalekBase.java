//Made with Blockbench
//Paste this code into your mod.
package com.softetch.dwm.client.model.entity;

import com.softetch.dwm.common.entity.BaseDalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.IHasHead;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * The base model for all daleks
 */
@OnlyIn(Dist.CLIENT)
public class ModelDalekBase extends EntityModel<BaseDalekEntity> implements IHasHead {
    private final RendererModel body;
    private final RendererModel weaponsBelt;
    private final RendererModel neck;
    private final RendererModel head;
    private final RendererModel eyestalk;

    /**
     * Set up all parts of the dalek as renderable boxes
     */
    public ModelDalekBase() {
        textureWidth = 128;
        textureHeight = 128;

        body = new RendererModel(this);
        body.setRotationPoint(0.0F, 23.5F, 0.0F);
        body.cubeList.add(new ModelBox(body, 0, 0, -7.5F, -0.5F, -7.5F, 15, 1, 15, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 0, 16, -7.0F, -5.5F, -6.5F, 14, 5, 14, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 0, 35, -6.5F, -9.5F, -5.5F, 13, 4, 13, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 44, 23, -6.0F, -13.5F, -4.5F, 12, 4, 12, 0.0F, false));

        weaponsBelt = new RendererModel(this);
        weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);
        weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 39, 39, -6.5F, -17.0F, -5.0F, 13, 3, 13, 0.0F, false));
        weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 5, 3.0F, -16.0F, -9.0F, 1, 1, 4, 0.0F, false));
        weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -4.0F, -16.0F, -9.0F, 1, 1, 4, 0.0F, false));
        weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 6, 0, -4.5F, -16.5F, -10.0F, 2, 2, 1, 0.0F, false));

        neck = new RendererModel(this);
        neck.setRotationPoint(0.0F, 24.0F, 0.0F);
        neck.cubeList.add(new ModelBox(neck, 28, 66, -4.0F, -21.0F, -2.5F, 8, 4, 8, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 60, 60, -5.0F, -18.0F, -3.5F, 10, 1, 10, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 30, 55, -5.0F, -20.0F, -3.5F, 10, 1, 10, 0.0F, false));

        head = new RendererModel(this);
        head.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 45, 0, -5.5F, -24.0F, -4.0F, 11, 3, 11, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 52, -5.0F, -26.0F, -3.5F, 10, 2, 10, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 64, -4.5F, -27.0F, -3.0F, 9, 1, 9, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 5, -5.0F, -28.0F, 0.0F, 1, 2, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 4.0F, -28.0F, 0.0F, 1, 2, 1, 0.0F, false));

        eyestalk = new RendererModel(this);
        eyestalk.setRotationPoint(0.0F, 24.0F, 0.0F);
        eyestalk.cubeList.add(new ModelBox(eyestalk, 53, 14, -0.5F, -25.0F, -10.0F, 1, 1, 7, 0.0F, false));
        eyestalk.cubeList.add(new ModelBox(eyestalk, 6, 6, -1.0F, -25.5F, -11.0F, 2, 2, 1, 0.0F, false));
    }

    /**
     * Render the dalek model
     * @param dalekEntity - the entity being rendered
     * @param originX - where the entity is being rendered on the x axis, relative to the player
     * @param originY - where the entity is being rendered on the y axis, relative to the player
     * @param originZ - where the entity is being rendered on the z axis, relative to the player
     * @param entityYaw - where the entity is looking on the horizontal axis
     * @param entityPitch - where the entity is looking on the vertical axis
     * @param scale - the relative scale of the entity
     */
    @Override
    public void render(BaseDalekEntity dalekEntity, float originX, float originY, float originZ, float entityYaw, float entityPitch, float scale) {
        super.render(dalekEntity, originX, originY, originZ, entityYaw, entityPitch, scale);
        body.render(scale);
        weaponsBelt.render(scale);
        neck.render(scale);
        head.render(scale);
        eyestalk.render(scale);
    }

    /**
     * Getter for the head of the model
     * @return the head box
     */
    @Override
    public RendererModel func_205072_a() {
        return head;
    }

}