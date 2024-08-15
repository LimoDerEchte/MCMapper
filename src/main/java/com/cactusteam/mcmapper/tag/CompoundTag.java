package com.cactusteam.mcmapper.tag;

import com.cactusteam.mcmapper.generic.CustomNbtTag;

import java.util.ArrayList;
import java.util.List;

public class CompoundTag extends BaseTag {
    public final ArrayList<BaseTag> tags;

    public CompoundTag(String id, boolean alwaysInclude, List<BaseTag> tags) {
        super(id, TagType.COMPOUND, alwaysInclude, "");
        this.tags = new ArrayList<>(tags);
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return alwaysInclude || tags.stream().anyMatch(BaseTag::shouldIncludeInCommand);
    }

    @Override
    public String toCommandNbt() {
        return "{%s}".formatted(String.join(",", tags.stream().filter(BaseTag::shouldIncludeInCommand).map(tag -> {
            if(tag instanceof CustomNbtTag)
                return tag.toCommandNbt();
            return "%s:%s".formatted(tag.id, tag.toCommandNbt());
        }).toList()));
    }
}