package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.type.TagType;
import com.cactusteam.mcmapper.type.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextTag extends BaseTag {
    public final List<TextEntry> sections = new ArrayList<>();

    public TextTag(String id) {
        this(id, false);
    }

    public TextTag(String id, boolean alwaysInclude) {
        super(id, TagType.CUSTOM, alwaysInclude, "");
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return alwaysInclude || !sections.isEmpty();
    }

    @Override
    public String toCommandNbt() {
        return "'[%s]'".formatted(sections.stream().map(TextEntry::createTag).collect(Collectors.joining(",")));
    }

    public static class TextEntry {
        public Bool bold, italic, underline, strikethrough, obfuscated;
        public String font, color, value, type;

        public TextEntry(String value) {
            this(value, "text");
        }

        public TextEntry(String value, String type) {
            this.value = value;
            this.type = type;
            this.bold = Bool.UNSET;
            this.italic = Bool.UNSET;
            this.underline = Bool.UNSET;
            this.strikethrough = Bool.UNSET;
            this.obfuscated = Bool.UNSET;
        }

        private String createTag() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"%s\":\"%s\"".formatted(type, value));
            addTag(sb, "font", font);
            addTag(sb, "color", color);
            addBoolTag(sb, "bold", bold);
            addBoolTag(sb, "italic", italic);
            addBoolTag(sb, "underlined", underline);
            addBoolTag(sb, "strikethrough", strikethrough);
            addBoolTag(sb, "obfuscated", obfuscated);
            addAdditional(sb);
            sb.append("}");
            return sb.toString();
        }

        protected void addBoolTag(StringBuilder sb, String key, Bool value) {
            if(value == Bool.UNSET)
                return;
            sb.append(",\"%s\":%s".formatted(key, value == Bool.TRUE ? "true" : "false"));
        }

        protected void addTag(StringBuilder sb, String key, String value) {
            if(value == null)
                return;
            sb.append(",\"%s\":\"%s\"".formatted(key, value));
        }

        protected void addAdditional(StringBuilder sb) {}
    }

    public static class TranslateEntry extends TextEntry {
        public String fallback;
        public List<String> with;

        public TranslateEntry(String value) {
            super(value, "translate");
            this.with = new ArrayList<>();
        }

        @Override
        protected void addAdditional(StringBuilder sb) {
            addTag(sb, "fallback", fallback);
            if(!with.isEmpty())
                sb.append(",\"%s\":[%s]".formatted("with", with.stream().map(e -> '\n' + e + "\n").collect(Collectors.joining(","))));
        }
    }
}