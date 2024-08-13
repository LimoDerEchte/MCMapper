package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;
import com.cactusteam.mcmapper.type.Bool;

public class BoolTag extends BaseTag {
    public Bool value;

    public BoolTag(String id) {
        super(id, TagType.CUSTOM, false, "");
        this.value = Bool.UNSET;
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return value != Bool.UNSET;
    }

    @Override
    public String toCommandNbt() {
        return value == Bool.TRUE ? "1b" : "0b";
    }
}