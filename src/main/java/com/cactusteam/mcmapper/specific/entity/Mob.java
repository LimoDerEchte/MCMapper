package com.cactusteam.mcmapper.specific.entity;

import com.cactusteam.mcmapper.generic.BoolTag;
import com.cactusteam.mcmapper.generic.LeashTag;
import com.cactusteam.mcmapper.generic.TimePeriodTag;
import com.cactusteam.mcmapper.tag.BaseTag;
import com.cactusteam.mcmapper.tag.TagType;

import java.util.List;

public class Mob extends Entity {

    public Mob(String id, boolean alwaysInclude) {
        super(id, alwaysInclude);
        tags.addAll(List.of(
                new BaseTag("FallDistance", TagType.FLOAT),
                new TimePeriodTag("PortalCooldown"),
                new TimePeriodTag("HurtTime"),
                new TimePeriodTag("DeathTime"),
                new BaseTag("DeathLootTable", TagType.STRING),
                new BoolTag("LeftHanded"),
                new BaseTag("Team", TagType.STRING),
                new LeashTag("Leash"),
                new BoolTag("FallFlying"),
                // TODO: ActiveEffects
                new BoolTag("PersistenceRequired"),
                new BoolTag("NoAI"),
                new BoolTag("CanPickUpLoot"),
                // TODO: Equipment (Hands & Armor)
                new BaseTag("AbsorptionAmount", TagType.FLOAT),
                new BaseTag("Health", TagType.FLOAT),
                new BaseTag("SleepingX", TagType.INT),
                new BaseTag("SleepingY", TagType.INT),
                new BaseTag("SleepingZ", TagType.INT)
        ));
    }
}
