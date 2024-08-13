package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

public class TicksTag extends BaseTag {
    public boolean isInSeconds;

    public TicksTag(String id, boolean alwaysInclude) {
        super(id, TagType.CUSTOM, alwaysInclude, "");
    }

    @Override
    public String toCommandNbt() {
        return isInSeconds ? String.valueOf(Integer.parseInt(value) * 20) : value;
    }
}