package com.cactusteam.mcmapper;

import com.cactusteam.mcmapper.type.EntityType;

public class MCMapper {

    public static EntityType[] getEntityTypes() {
        return EntityType.values();
    }

    public static EntityType getEntityTypeById(String id) {
        return EntityType.fromId(id);
    }

    public static EntityType getEntityTypeByName(String name) {
        return EntityType.fromName(name);
    }
}
