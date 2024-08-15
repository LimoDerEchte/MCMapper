package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.type.TagType;

public class CustomNbtTag extends BaseTag {

    public CustomNbtTag() {
        super("Custom Nbt", TagType.STRING, false, "");
    }

    @Override
    public String toCommandNbt() {
        return value;
    }
}