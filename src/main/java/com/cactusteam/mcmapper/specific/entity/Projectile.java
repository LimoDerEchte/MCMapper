package com.cactusteam.mcmapper.specific.entity;

import com.cactusteam.mcmapper.generic.ItemTag;
import com.cactusteam.mcmapper.generic.UUIDTag;

import java.util.List;

public class Projectile extends Entity {

    public Projectile(String mobId) {
        super(mobId);
        tags.addAll(List.of(
                new UUIDTag("Owner"),
                new ItemTag("Item")
        ));
    }
}
