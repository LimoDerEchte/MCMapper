package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

public class MotionTag extends BaseTag {
    public String x, y, z;

    public MotionTag(String id, TagType type) {
        super(id, type, false, "");
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
                (x.contains(".") ? x : x + ".0") + "," +
                (y.contains(".") ? y : y + ".0") + "," +
                (z.contains(".") ? z : z + ".0") + "]";
    }
}
