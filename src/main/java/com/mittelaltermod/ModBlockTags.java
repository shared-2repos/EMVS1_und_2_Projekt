package com.mittelaltermod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ModBlockTags {
    public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = create("incorrect_for_silver_tool");
    public static final TagKey<Block> SILVER_ORES = create("silver_ores");

    private ModBlockTags() {
    }

    private static TagKey<Block> create(String p_203847_) {
        return TagKey.create(Registries.BLOCK, Identifier.withDefaultNamespace(p_203847_));
    }

    public static TagKey<Block> create(String namepsace, String path) {
        return create(Identifier.fromNamespaceAndPath(namepsace, path));
    }

    public static TagKey<Block> create(Identifier name) {
        return TagKey.create(Registries.BLOCK, name);
    }
}