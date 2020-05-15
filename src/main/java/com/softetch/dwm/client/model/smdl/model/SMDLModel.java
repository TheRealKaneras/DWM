package com.softetch.dwm.client.model.smdl.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.client.model.smdl.animation.Animation;
import com.softetch.dwm.client.model.smdl.animation.EntityAnimation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SMDLModel extends Model {
    private int texture_width;
    private int texture_height;
    private Group[] groups;
    private final List<Animation> animations = new ArrayList<>();

    private HashMap<String, ModelRenderer> modelRenderers;

    public SMDLModel() {
        super(RenderType::getEntitySolid);
    }

    public void init() {
        textureWidth = texture_width;
        textureHeight = texture_height;
        modelRenderers = new HashMap<>();

        Arrays.stream(groups).forEach(this::initGroup);
    }

    private void initGroup(Group group) {
        if (!modelRenderers.containsKey(group.getName()) && group.shouldRender()) {
            modelRenderers.put(group.getName(), createModelRenderer(group, null));
        }
    }

    private ModelRenderer createModelRenderer(Group group, Group parent) {
        ModelRenderer renderer = new ModelRenderer(this);
        renderer.setRotationPoint(group.getOrigin()[0], group.getOrigin()[1], group.getOrigin()[2]);
        if (parent != null) {
            modelRenderers.get(parent.getName()).addChild(renderer);
        }
        renderer.rotateAngleX = group.getRotation()[0];
        renderer.rotateAngleY = group.getRotation()[1];
        renderer.rotateAngleZ = group.getRotation()[2];

        if (group.getCubes() != null && group.getCubes().length > 0) {
            for (Cube cube : group.getCubes()) {
                addBox(renderer, cube);
            }
        }

        modelRenderers.put(group.getName(), renderer);
        if (group.getChildren() != null && group.getChildren().length > 0) {
            for (Group child : group.getChildren()) {
                createModelRenderer(child, group);
            }
        }
        return renderer;
    }

    private void addBox(ModelRenderer renderer, Cube cube) {
        int[] texCoord = cube.getUVOffset();
        float[] pos = cube.getPosition();
        int[] size = cube.getSize();
        renderer.setTextureOffset(texCoord[0], texCoord[1]).addBox(pos[0], pos[1], pos[2], size[0], size[1], size[2], cube.getInflate(), cube.shouldMirror());
    }



    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        //TODO: Play animations
        Arrays.stream(groups).filter(Group::shouldRender).forEach(group -> modelRenderers.get(group.getName()).render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha));
    }

    public void playAnimation(Animation animation) {
        animations.add(animation);
    }

    @Override
    public String toString() {
        return "SMDLModel{" +
                "texture_width=" + texture_width +
                ", texture_height=" + texture_height +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
