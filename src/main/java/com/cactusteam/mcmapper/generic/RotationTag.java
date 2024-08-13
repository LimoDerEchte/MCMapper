package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

public class RotationTag extends BaseTag {
    public String yaw, pitch;

    public RotationTag(String id) {
        super(id, TagType.CUSTOM, false, "");
        this.yaw = "";
        this.pitch = "";
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return !yaw.isEmpty() || !pitch.isEmpty();
    }

    @Override
    public String toCommandNbt() {
        return "[" +
                (yaw.isEmpty() ? "0" : yaw) + "F," +
                (pitch.isEmpty() ? "0" : pitch) + "F]";
    }
}