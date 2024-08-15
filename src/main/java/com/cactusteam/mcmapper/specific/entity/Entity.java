package com.cactusteam.mcmapper.specific.entity;

import com.cactusteam.mcmapper.generic.*;
import com.cactusteam.mcmapper.tag.ArrayTag;
import com.cactusteam.mcmapper.tag.CompoundTag;
import com.cactusteam.mcmapper.tag.TagType;

import java.util.List;

public class Entity extends CompoundTag {

    public Entity(String id, boolean alwaysInclude) {
        super(id, alwaysInclude, List.of(
                new MotionTag("Motion"),
                new RotationTag("Rotation"),
                new TimePeriodTag("Fire"),
                new BoolTag("HasVisualFire"),
                new TimePeriodTag("Air"),
                new BoolTag("OnGround"),
                new BoolTag("NoGravity"),
                new BoolTag("Silent"),
                new BoolTag("Invulnerable"),
                new BoolTag("Glowing"),
                new BoolTag("CustomNameVisible"),
                new TextTag("CustomName"),
                new UUIDTag("UUID"),
                new ArrayTag<String>("Tags", TagType.STRING_ARR, ""),
                new CustomNbtTag()
        ));
    }
}