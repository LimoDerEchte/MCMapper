package com.cactusteam.mcmapper.specific.entity;

import com.cactusteam.mcmapper.tag.CompoundTag;

import java.util.List;

public class Item extends CompoundTag {

    public Item(String itemId) {
        super(itemId, false, List.of(

        ));
    }
}
