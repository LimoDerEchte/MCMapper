package com.cactusteam.mcmapper.generic;

import com.cactusteam.mcmapper.tag.ArrayTag;
import com.cactusteam.mcmapper.tag.TagType;

public class UUIDTag extends ArrayTag<Integer> {

    public UUIDTag(String id) {
        super(id, TagType.CUSTOM, "I");
        for (int i = 0; i < 4; i++)
            entries.add(0);
    }
}