package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

public class TimePeriodTag extends BaseTag {
    public boolean isInSeconds;

    public TimePeriodTag(String id) {
        this(id, false);
    }

    public TimePeriodTag(String id, boolean alwaysInclude) {
        super(id, TagType.CUSTOM, alwaysInclude, "");
    }

    @Override
    public String toCommandNbt() {
        return isInSeconds ? String.valueOf(Integer.parseInt(value) * 20) : value;
    }
}