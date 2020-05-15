package com.softetch.dwm.client.model.smdl.animation;

import java.util.Map;

public class EntityAnimation {
    public Map<String, String> expressions;

    public EntityAnimation(Map<String, String> expressions) {
        this.expressions = expressions;
    }

    public Map<String, String> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        return "EntityAnimation{" +
                "expressions=" + expressions +
                '}';
    }
}
