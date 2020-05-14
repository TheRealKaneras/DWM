package com.softetch.dwm.client.model.smdl;

import java.util.Arrays;

public class Group {
    private String name;
    private String parent;
    private float[] origin;
    private float[] rotation;
    private Group[] children;
    private Cube[] cubes;
    private boolean render;

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }

    public float[] getOrigin() {
        return origin;
    }

    public float[] getRotation() {
        return rotation;
    }

    public Group[] getChildren() {
        return children;
    }

    public Cube[] getCubes() {
        return cubes;
    }

    public boolean shouldRender() {
        return render;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", parent='" + parent + '\'' +
                ", origin=" + Arrays.toString(origin) +
                ", rotation=" + Arrays.toString(rotation) +
                ", children=" + Arrays.toString(children) +
                ", cubes=" + Arrays.toString(cubes) +
                ", render=" + render +
                '}';
    }
}
