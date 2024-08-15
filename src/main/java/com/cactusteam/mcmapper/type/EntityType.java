package com.cactusteam.mcmapper.type;

import com.cactusteam.mcmapper.specific.entity.Entity;
import com.cactusteam.mcmapper.specific.entity.Mob;

public enum EntityType {
    ALLAY("Allay", "allay", new Mob("allay")),
    AREA_EFFECT_CLOUD("Area Effect Cloud", "area_effect_cloud", new Entity("area_effect_cloud")),
    ARMOR_STAND("Armor Stand", "armor_stand", new Mob("armor_stand")),
    ARMADILLO("Armadillo", "armadillo", new Mob("armadillo")),
    ARROW("Arrow", "arrow", new Entity("arrow")),
    AXOLOTL("Axolotl", "axolotl", new Mob("axolotl")),
    BAT("Bat", "bat", new Mob("bat")),
    BEE("Bee", "bee", new Mob("bee")),
    BLAZE("Blaze", "blaze", new Mob("blaze")),
    BLOCK_DISPLAY("Block Display", "block_display", new Entity("block_display")),
    BOAT("Boat", "boat", new Entity("boat")),
    BOGGED("Bogged", "bogged", new Mob("bogged")),
    BREEZE("Breeze", "breeze", new Mob("breeze")),
    BREEZE_WIND_CHARGE("Breeze Wind Charge", "breeze_wind_charge", new Entity("breeze_wind_charge")),
    CAMEL("Camel", "camel", new Mob("camel")),
    CAT("Cat", "cat", new Mob("cat")),
    CAVE_SPIDER("Cave Spider", "cave_spider", new Mob("cave_spider")),
    CHEST_BOAT("Chest Boat", "chest_boat", new Entity("chest_boat")),
    CHEST_MINECART("Chest Minecart", "chest_minecart", new Entity("chest_minecart")),
    CHICKEN("Chicken", "chicken", new Mob("chicken")),
    COD("Cod", "cod", new Mob("cod")),
    COMMAND_BLOCK_MINECART("Command Block Minecart", "command_block_minecart", new Entity("command_block_minecart")),
    COW("Cow", "cow", new Mob("cow")),
    CREEPER("Creeper", "creeper", new Mob("creeper")),
    DOLPHIN("Dolphin", "dolphin", new Mob("dolphin")),
    DONKEY("Donkey", "donkey", new Mob("donkey")),
    DRAGON_FIREBALL("Dragon Fireball", "dragon_fireball", new Entity("dragon_fireball")),
    DROWNED("Drowned", "drowned", new Mob("drowned")),
    EGG("Egg", "egg", new Mob("egg")),
    ELDER_GUARDIAN("Elder Guardian", "elder_guardian", new Mob("elder_guardian")),
    END_CRYSTAL("End Crystal", "end_crystal", new Entity("end_crystal")),
    ENDER_DRAGON("Ender Dragon", "ender_dragon", new Mob("ender_dragon")),
    ENDER_PEAR("Ender Pear", "ender_pear", new Entity("ender_pear")),
    ENDERMAN("Enderman", "enderman", new Mob("enderman")),
    ENDERMITE("Endermite", "endermite", new Mob("endermite")),
    EVOKER_FANGS("EVOKER_FANGS", "evoker_fangs", new Entity("evoker_fangs")),
    EVOKER("Evoker", "evoker", new Mob("evoker")),
    EXPERIENCE_BOTTLE("Experience Bottle", "experience_bottle", new Entity("experience_bottle")),
    EXPERIENCE_ORB("Experience Orb", "experience_orb", new Entity("experience_orb")),
    EYE_OF_ENDER("Eye of Ender", "eye_of_ender", new Entity("eye_of_ender")),
    FALLING_BLOCK("Falling Block", "falling_block", new Entity("falling_block")),
    FIREBALL("Fireball", "fireball", new Entity("fireball")),
    FIREWORK_ROCKET("Firework Rocket", "firework_rocket", new Entity("firework_rocket")),
    FISHING_BOBBER("Fishing Bobber", "fishing_bobber", new Entity("fishing_bobber")),
    FOX("Fox", "fox", new Mob("fox")),
    FROG("Frog", "frog", new Mob("frog")),
    FURNACE_MINECART("Furnace Minecart", "furnace_minecart", new Entity("furnace_minecart")),
    GHAST("Ghast", "ghast", new Mob("ghast")),
    GIANT("Giant", "giant", new Mob("giant")),
    GLOW_ITEM_FRAME("Glow Item Frame", "glow_item_frame", new Entity("glow_item_frame")),
    GLOW_SQUID("Glow Squid", "glow_squid", new Mob("glow_squid")),
    GOAT("Goat", "goat", new Mob("goat")),
    GUARDIAN("Guardian", "guardian", new Mob("guardian")),
    HOGLIN("Hoglin", "hoglin", new Mob("hoglin")),
    HORSE("Horse", "horse", new Mob("horse")),
    HOPPER_MINECART("Hopper Minecart", "hopper_minecart", new Entity("hopper_minecart")),
    HUSK("Husk", "husk", new Mob("husk")),
    ILLUSIONER("Illusioner", "illusioner", new Mob("illusioner")),
    INTERACTION("Interaction", "interaction", new Entity("interaction")),
    IRON_GOLEM("Iron Golem", "iron_golem", new Mob("iron_golem")),
    ITEM("Item", "item", new Entity("item")),
    ITEM_DISPLAY("Item Display", "item_display", new Entity("item_display")),
    ITEM_FRAME("Item Frame", "item_frame", new Entity("item_frame")),
    LEASH_KNOT("Leash Knot", "leash_knot", new Entity("leash_knot")),
    LIGHTNING_BOLT("Lightning Bolt", "lightning_bolt", new Entity("lightning_bolt")),
    LLAMA("Llama", "llama", new Mob("llama")),
    LLAMA_SPIT("Llama Spit", "llama_spit", new Entity("llama_spit")),
    MAGMA_CUBE("Magma Cube", "magma_cube", new Mob("magma_cube")),
    MARKER("Marker", "marker", new Entity("marker")),
    MINECART("Minecart", "minecart", new Entity("minecart")),
    MOOSHROOM("Mooshroom", "mooshroom", new Mob("mooshroom")),
    MULE("Mule", "mule", new Mob("mule")),
    OCELOT("Ocelot", "ocelot", new Mob("ocelot")),
    OMINOUS_ITEM_SPAWNER("Ominous Item Spawner", "ominous_item_spawner", new Entity("ominous_item_spawner")),
    PAINTING("Painting", "painting", new Entity("painting")),
    PANDA("Panda", "panda", new Mob("panda")),
    PARROT("Parrot", "parrot", new Mob("parrot")),
    PHANTOM("Phantom", "phantom", new Mob("phantom")),
    PIG("Pig", "pig", new Mob("pig")),
    PIGLIN("Piglin", "piglin", new Mob("piglin")),
    PIGLIN_BRUTE("Piglin Brute", "piglin_brute", new Mob("piglin_brute")),
    PILLAGER("Pillager", "pillager", new Mob("pillager")),
    POLAR_BEAR("Polar Bear", "polar_bear", new Mob("polar_bear")),
    POTION("Potion", "potion", new Entity("potion")),
    PUFFERFISH("Pufferfish", "pufferfish", new Mob("pufferfish")),
    RABBIT("Rabbit", "rabbit", new Mob("rabbit")),
    RAVAGER("Ravager", "ravager", new Mob("ravager")),
    SALMON("Salmon", "salmon", new Mob("salmon")),
    SHEEP("Sheep", "sheep", new Mob("sheep")),
    SHULKER("Shulker", "shulker", new Mob("shulker")),
    SHULKER_BULLET("Shulker Bullet", "shulker_bullet", new Entity("shulker_bullet")),
    SILVERFISH("Silverfish", "silverfish", new Mob("silverfish")),
    SKELETON("Skeleton", "skeleton", new Mob("skeleton")),
    SKELETON_HORSE("Skeleton Horse", "skeleton_horse", new Mob("skeleton_horse")),
    SLIME("Slime", "slime", new Mob("slime")),
    SMALL_FIREBALL("Small Fireball", "small_fireball", new Entity("small_fireball")),
    SNIFFER("Sniffer", "sniffer", new Mob("sniffer")),
    SNOWBALL("Snowball", "snowball", new Entity("snowball")),
    SNOW_GOLEM("Snow Golem", "snow_golem", new Mob("snow_golem")),
    SPAWNER_MINECART("Spawner Minecart", "spawner_minecart", new Entity("spawner_minecart")),
    SPECTRAL_ARROW("Spectral Arrow", "spectral_arrow", new Entity("spectral_arrow")),
    SPIDER("Spider", "spider", new Mob("spider")),
    SQUID("Squid", "squid", new Mob("squid")),
    STRAY("Stray", "stray", new Mob("stray")),
    STRIDER("Strider", "strider", new Mob("strider")),
    TADPOLE("Tadpole", "tadpole", new Mob("tadpole")),
    TEXT_DISPLAY("Text Display", "text_display", new Entity("text_display")),
    TNT("TNT", "tnt", new Entity("tnt")),
    TNT_MINECART("TNT Minecart", "tnt_minecart", new Entity("tnt_minecart")),
    TRADER_LLAMA("Trader Llama", "trader_llama", new Mob("trader_llama")),
    TRIDENT("Trident", "trident", new Entity("trident")),
    TROPICAL_FISH("Tropical Fish", "tropical_fish", new Mob("tropical_fish")),
    TURTLE("Turtle", "turtle", new Mob("turtle")),
    VEX("Vex", "vex", new Mob("vex")),
    VILLAGER("Villager", "villager", new Mob("villager")),
    VINDICATOR("Vindicator", "vindicator", new Mob("vindicator")),
    WARDEN("Warden", "warden", new Mob("warden")),
    WIND_CHARGE("Wind Charge", "wind_charge", new Mob("wind_charge")),
    WITCH("Witch", "witch", new Mob("witch")),
    WITHER_SKULL("Wither Skull", "wither_skull", new Entity("wither_skull")),
    WITHER_SKELETON("Wither Skeleton", "wither_skeleton", new Mob("wither_skeleton")),
    WOLF("Wolf", "wolf", new Mob("wolf")),
    ZOGLIN("Zoglin", "zoglin", new Mob("zoglin")),
    ZOMBIE("Zombie", "zombie", new Mob("zombie")),
    ZOMBIE_HORSE("Zombie Horse", "zombie_horse", new Mob("zombie_horse")),
    ZOMBIFIED_PIGLIN("Zombified Piglin", "zombified_piglin", new Mob("zombified_piglin")),
    ZOMBIE_VILLAGER("Zombie Villager", "zombie_villager", new Mob("zombie_villager")),

    ;
    private final String name;
    private final String id;
    private final Entity baseTag;

    EntityType(String name, String id, Entity baseTag) {
        this.name = name;
        this.id = id;
        this.baseTag = baseTag;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Entity getBaseTag() {
        return baseTag;
    }

    public EntityType fromId(String id) {
        for(EntityType type : EntityType.values())
            if(type.id.equals(id))
                return type;
        return null;
    }

    public EntityType fromName(String name) {
        for(EntityType type : EntityType.values())
            if(type.name.equals(name))
                return type;
        return null;
    }
}