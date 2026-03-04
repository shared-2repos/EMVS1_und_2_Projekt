package com.mittelaltermod;

import net.minecraft.tags.TagKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> SILVER_ORES = bind("silver_ores");
    public static final TagKey<Item> SILVER_TOOL_MATERIALS = bind("silver_tool_materials");
    public static final TagKey<Item> REPAIRS_SILVER_ARMOR = bind("repairs_silver_armor");

    private ModItemTags() {
    }

    private static TagKey<Item> bind(String p_203855_) {
        return TagKey.create(Registries.ITEM, Identifier.withDefaultNamespace(p_203855_));
    }

    public static TagKey<Item> create(String namepsace, String path) {
        return create(Identifier.fromNamespaceAndPath(namepsace, path));
    }

    public static TagKey<Item> create(Identifier name) {
        return TagKey.create(Registries.ITEM, name);
    }
}
