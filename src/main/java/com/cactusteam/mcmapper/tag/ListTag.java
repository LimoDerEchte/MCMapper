package com.cactusteam.mcmapper.tag;

import com.cactusteam.mcmapper.type.TagType;

import java.util.List;

public class ListTag extends BaseTag {
    public final List<CompoundTag> tags;

    public ListTag(String id, boolean alwaysInclude, List<CompoundTag> tags) {
        super(id, TagType.LIST, alwaysInclude, "");
        this.tags = tags;
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return alwaysInclude || tags.stream().anyMatch(BaseTag::shouldIncludeInCommand);
    }

    @Override
    public String toCommandNbt() {
        return "{%s}".formatted(String.join(",", tags.stream().filter(BaseTag::shouldIncludeInCommand).map(BaseTag::toCommandNbt).toList()));
    }
}