package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.specific.item.Item;
import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.type.TagType;

public class ItemTag extends BaseTag {
    public Item item;

    public ItemTag(String id) {
        super(id, TagType.CUSTOM, false, "");
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return item.shouldIncludeInCommand();
    }

    @Override
    public String toCommandNbt() {
        return "{id:\"%s\",Count:1b,tag:{%s}}".formatted(item.id, item.toCommandNbt());
    }
}
