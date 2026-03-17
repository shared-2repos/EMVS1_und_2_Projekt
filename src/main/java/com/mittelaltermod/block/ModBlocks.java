// src/main/java/com/mittelaltermod/block/ModBlocks.java
package com.mittelaltermod.block;

import com.mittelaltermod.MittelalterMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MittelalterMod.MODID);

    // Register your blocks here
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .setId(BLOCKS.key("silver_block"))
                    .mapColor(MapColor.METAL)
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CASTLE_BRICK = BLOCKS.register("castle_brick",
            () -> new Block(BlockBehaviour.Properties.of()
                    .setId(BLOCKS.key("castle_brick"))
                    .mapColor(MapColor.STONE)
                    .strength(2.0f)));

    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .setId(BLOCKS.key("silver_ore"))
                    .mapColor(MapColor.METAL)
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()));
}