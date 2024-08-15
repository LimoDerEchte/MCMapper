package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

public class Vector3ITag extends BaseTag {
    public String x, y, z;

    public Vector3ITag(String id) {
        super(id, TagType.CUSTOM, false, "");
        this.x = "";
        this.y = "";
        this.z = "";
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return !x.isEmpty() || !y.isEmpty() || !z.isEmpty();
    }

    @Override
    public String toCommandNbt() {
        return "[" +
                (x.isEmpty() ? "0" : x) + "," +
                (y.isEmpty() ? "0" : y) + "," +
                (z.isEmpty() ? "0" : z) + "]";
    }
}