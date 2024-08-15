package com.cactusteam.mcmapper.tag;

import java.util.List;

public class ArrayTag<T> extends BaseTag {
    private final String typeIdentifier;
    public final List<T> entries;

    public ArrayTag(String id, TagType type, String typeIdentifier) {
        this(id, type, typeIdentifier, false, List.of());
    }

    public ArrayTag(String id, TagType type, String typeIdentifier, boolean alwaysInclude, List<T> entries) {
        super(id, type, alwaysInclude, "");
        this.typeIdentifier = typeIdentifier;
        this.entries = entries;
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return alwaysInclude || !entries.isEmpty();
    }

    @Override
    public String toCommandNbt() {
        return typeIdentifier.isEmpty() ? "[%s]".formatted(String.join(",", entries.stream().map(String::valueOf).toList())) :
        "[%s;%s]".formatted(typeIdentifier, String.join(",", entries.stream().map(String::valueOf).toList()));
    }
}