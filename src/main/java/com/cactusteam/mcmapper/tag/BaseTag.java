package com.cactusteam.mcmapper.tag;

public class BaseTag {
    public final boolean alwaysInclude;
    public final String id;
    public final TagType type;
    public String value = "";

    public BaseTag(String id, TagType type, boolean alwaysInclude, String initialValue) {
        this.id = id;
        this.type = type;
        this.alwaysInclude = alwaysInclude;
        this.value = initialValue;
    }

    public BaseTag(String id, TagType type) {
        this(id, type, false, "");
    }

    public boolean shouldIncludeInCommand() {
        return alwaysInclude || !value.isEmpty();
    }

    public String toCommandNbt() {
        switch (type) {
            case BYTE, SHORT, INT, LONG, DOUBLE, FLOAT, BOOLEAN -> {
                return value;
            }
            case STRING -> {
                return "\"%s\"".formatted(escape(value));
            }
            default -> throw new NotAvailableException("This shouldn't ever happen lol");
        }
    }

    protected String escape(String before) {
        return before.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static class NotAvailableException extends RuntimeException {
        public NotAvailableException(String message) {
            super(message);
        }
    }
}