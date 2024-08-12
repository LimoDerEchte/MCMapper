package com.cactusteam.mcmapper.tag;

import java.util.List;

public class ArrayTag<T> extends BaseTag {
    private final List<T> entries;

    public ArrayTag(String id, TagType type, boolean alwaysInclude, List<T> entries) {
        super(id, type, alwaysInclude, "");
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