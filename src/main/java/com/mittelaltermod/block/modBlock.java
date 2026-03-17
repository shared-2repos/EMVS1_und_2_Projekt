package com.mittelaltermod.block;

import java.util.function.Function;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class modBlock {
    public static final Block SILVER_BLOCK = register(
            "silver_block",
            null, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)

    );

    private static Block register(ResourceKey<Block> p_309992_, Function<BlockBehaviour.Properties, Block> p_365267_,
            BlockBehaviour.Properties p_360839_) {
        Block block = p_365267_.apply(p_360839_.setId(p_309992_));
        return Registry.register(BuiltInRegistries.BLOCK, p_309992_, block);
    }

    private static ResourceKey<Block> mittelaltermodBlockId(String p_360731_) {
        return ResourceKey.create(Registries.BLOCK, Identifier.withDefaultNamespace(p_360731_));
    }

    private static Block register(String p_362355_, Function<BlockBehaviour.Properties, Block> p_369791_,
            BlockBehaviour.Properties p_370078_) {
        return register(mittelaltermodBlockId(p_362355_), p_369791_, p_370078_);
    }
}
