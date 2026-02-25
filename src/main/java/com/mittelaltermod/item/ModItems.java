// src/main/java/com/mittelaltermod/item/ModItems.java
package com.mittelaltermod.item;

import com.mittelaltermod.MittelalterMod;
import com.mittelaltermod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import com.mittelaltermod.ModItemTags;
import com.mittelaltermod.ModBlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        MittelalterMod.MODID);

        // Register your items here

        public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_coin"))));

        public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bronze_coin"))));

        public static final RegistryObject<Item> FAT = ITEMS.register("fat",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("fat"))));

        public static final RegistryObject<Item> BREAD_LOAF = ITEMS.register("bread_loaf",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bread_loaf"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(5)
                                                        .saturationModifier(0.6f)
                                                        .build())));

        public static final RegistryObject<Item> CHICKEN_SOUP = ITEMS.register("chicken_soup",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("chicken_soup"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(7)
                                                        .saturationModifier(0.5f)
                                                        .build())));

        public static final RegistryObject<Item> VEGAN_SOUP = ITEMS.register("vegan_soup",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("vegan_soup"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(6)
                                                        .saturationModifier(0.35f)
                                                        .build())));

        public static final RegistryObject<Item> GULAS_SOUP = ITEMS.register("gulas_soup",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("gulas_soup"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(7)
                                                        .saturationModifier(0.8f)
                                                        .build())));

        public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("cheese"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(3)
                                                        .saturationModifier(0.2f)
                                                        .build())));

        public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("fried_egg"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(6)
                                                        .saturationModifier(0.3f)
                                                        .build())));

        public static final RegistryObject<Item> STEW = ITEMS.register("stew",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("stew"))
                                        .food(new FoodProperties.Builder()
                                                        .nutrition(12)
                                                        .saturationModifier(1.1f)
                                                        .build())));

        public record ToolMaterial(TagKey<Block> incorrectBlocksForDrops, int durability, float speed,
                        float attackDamageBonus, int enchantmentValue, TagKey<Item> repairItems) {
                public static final ToolMaterial SILBER = new ToolMaterial(ModBlockTags.SILVER_ORES, 59, 2.0F, 0.0F, 15,
                                ModItemTags.SILVER_TOOL_MATERIALS);
        };

        // Block items
        public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",
                        () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties()
                                        .setId(ITEMS.key("silver_block"))));

        public static final RegistryObject<Item> CASTLE_BRICK_ITEM = ITEMS.register("castle_brick",
                        () -> new BlockItem(ModBlocks.CASTLE_BRICK.get(), new Item.Properties()
                                        .setId(ITEMS.key("castle_brick"))));

        public static final RegistryObject<Item> SILVER_ORES = ITEMS.register("silver_ores",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_ores"))));
}