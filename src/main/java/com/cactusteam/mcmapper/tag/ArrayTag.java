package com.cactusteam.mcmapper.tag;

import java.util.List;

public class ArrayTag<T> extends BaseTag {
    private final List<T> entries;

    public ArrayTag(String id, boolean alwaysInclude, List<T> entries) {
        super(id, TagType.LIST, alwaysInclude, "");
        this.entries = entries;
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return alwaysInclude || !entries.isEmpty();
    }

    @Override
    public String toCommandNbt() {
        return "[%s]".formatted(String.join(",", entries.stream().map(String::valueOf).toList()));
    }
}