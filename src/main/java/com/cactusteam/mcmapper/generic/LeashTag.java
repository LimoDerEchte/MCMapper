package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

public class LeashTag extends BaseTag {
    public String x, y, z;
    public String a, b, c, d;

    public LeashTag(String id) {
        super(id, TagType.CUSTOM, false, "");
        this.x = "";
        this.y = "";
        this.z = "";
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    @Override
    public boolean shouldIncludeInCommand() {
        return (!x.isEmpty() && !y.isEmpty() && !z.isEmpty()) ||
                (!a.isEmpty() && !b.isEmpty() && !c.isEmpty() && !d.isEmpty());
    }

    @Override
    public String toCommandNbt() {
        if(!a.isEmpty() && !b.isEmpty() && !c.isEmpty() && !d.isEmpty())
            return "{UUID:[I;%s,%s,%s,%s]}".formatted(a, b, c, d);
        else
            return "{X:%s,Y:%s,Z:%s}".formatted(x, y, z);
    }
}