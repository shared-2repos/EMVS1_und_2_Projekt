// src/main/java/com/mittelaltermod/item/ModItems.java
package com.mittelaltermod.item;

import com.mittelaltermod.MittelalterMod;
import com.mittelaltermod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            MittelalterMod.MODID);

    // Register your items here
    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("silver_coin"))));

    public static final RegistryObject<Item> BREAD_LOAF = ITEMS.register("bread_loaf",
            () -> new BreadLoafItem(new Item.Properties()

                    .setId(ITEMS.key("bread_loaf"))
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.6f)
                            .build())));

    // Block items
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",
            () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties()
                    .setId(ITEMS.key("silver_block"))));

    public static final RegistryObject<Item> CASTLE_BRICK_ITEM = ITEMS.register("castle_brick",
            () -> new BlockItem(ModBlocks.CASTLE_BRICK.get(), new Item.Properties()
                    .setId(ITEMS.key("castle_brick"))));
}