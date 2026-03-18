// src/main/java/com/mittelaltermod/item/ModItems.java
package com.mittelaltermod.item;

import com.mittelaltermod.MittelalterMod;
import com.mittelaltermod.block.ModBlocks;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        MittelalterMod.MODID);

        // Weapons
        public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_sword"))
                                        .sword(ToolMaterial.IRON, 2.5F, -2.8F)));

        public static final RegistryObject<Item> WOOD_LONG_SWORD = ITEMS.register("wood_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("wood_long_sword"))
                                        .sword(ToolMaterial.WOOD, 4F, -2.5F)));

        public static final RegistryObject<Item> COPPER_LONG_SWORD = ITEMS.register("copper_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("copper_long_sword"))
                                        .sword(ToolMaterial.COPPER, 3.5F, -2.4F)));

        public static final RegistryObject<Item> STONE_LONG_SWORD = ITEMS.register("stone_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("stone_long_sword"))
                                        .sword(ToolMaterial.STONE, 4.5F, -2.6F)));

        public static final RegistryObject<Item> IRON_LONG_SWORD = ITEMS.register("iron_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("iron_long_sword"))
                                        .sword(ToolMaterial.IRON, 5F, -2.6F)));

        public static final RegistryObject<Item> SILVER_LONGSWORD = ITEMS.register("silver_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_long_sword"))
                                        .sword(ModToolMaterials.SILVER,6F,-2.6F)
        ));

        public static final RegistryObject<Item> GOLD_LONG_SWORD = ITEMS.register("gold_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("gold_long_sword"))
                                        .sword(ToolMaterial.GOLD, 6.5F, -3F)));

        public static final RegistryObject<Item> DIAMOND_LONG_SWORD = ITEMS.register("diamond_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("diamond_long_sword"))
                                        .sword(ToolMaterial.DIAMOND, 5.5F, -3F)));

        public static final RegistryObject<Item> NETHERITE_LONG_SWORD = ITEMS.register("netherite_long_sword",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("netherite_long_sword"))
                                        .sword(ToolMaterial.NETHERITE, 8.5F, -3F)));

        public static final RegistryObject<Item> WOOD_HALBERT = ITEMS.register("wood_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("wood_halbert"))
                                        .axe(ToolMaterial.WOOD, 7F, -2.5F)));

        public static final RegistryObject<Item> COPPER_HALBERT = ITEMS.register("copper_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("copper_halbert"))
                                        .axe(ToolMaterial.COPPER, 7F, -2.4F)));

        public static final RegistryObject<Item> STONE_HALBERT = ITEMS.register("stone_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("stone_halbert"))
                                        .axe(ToolMaterial.STONE, 7F, -2.6F)));

        public static final RegistryObject<Item> IRON_HALBERT = ITEMS.register("iron_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("iron_halbert"))
                                        .axe(ToolMaterial.IRON, 8F, -2.6F)));

        public static final RegistryObject<Item> SILVER_HALBERT = ITEMS.register("silver_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_halbert"))
                                        .axe(ModToolMaterials.SILVER, 9F, -2.6F)
                        )
        );

        public static final RegistryObject<Item> GOLD_HALBERT = ITEMS.register("gold_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("gold_halbert"))
                                        .axe(ToolMaterial.GOLD, 11F, -3F)));

        public static final RegistryObject<Item> DIAMOND_HALBERT = ITEMS.register("diamond_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("diamond_halbert"))
                                        .axe(ToolMaterial.DIAMOND, 9F, -3F)));

        public static final RegistryObject<Item> NETHERITE_HALBERT = ITEMS.register("netherite_halbert",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("netherite_halbert"))
                                        .axe(ToolMaterial.NETHERITE, 9F, -3F)));

        // ingrediens/materials

        public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_nugget"))));

        public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("cloth"))));

        public static final RegistryObject<Item> LEAD = ITEMS.register("lead",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("lead"))));

        public static final RegistryObject<Item> CARBON = ITEMS.register("carbon",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("carbon"))));

        public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_ingot"))));

        public static final RegistryObject<Item> SILVER_INGOT_RAW = ITEMS.register("silver_ingot_raw",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_ingot_raw"))));

        public static final RegistryObject<Item> FAT = ITEMS.register("fat",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("fat"))));

        // Other

        public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_coin"))));

        public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("gold_coin"))));

        public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bronze_coin"))));

        // Food

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

        // Block items
        public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",
                        () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties()
                                        .setId(ITEMS.key("silver_block"))));

        public static final RegistryObject<Item> CASTLE_BRICK_ITEM = ITEMS.register("castle_brick",
                        () -> new BlockItem(ModBlocks.CASTLE_BRICK.get(), new Item.Properties()
                                        .setId(ITEMS.key("castle_brick"))));

        public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore",
                        () -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties()
                                        .setId(ITEMS.key("silver_ore"))));

        // Armors
        // light Armor

        public static final RegistryObject<Item> CLOTH_ARMOR_HELMET = ITEMS.register("cloth_armor_helmet",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("cloth_armor_helmet"))
                                        .humanoidArmor(ModArmorMaterials.CLOTH, ArmorType.HELMET)));

        public static final RegistryObject<Item> CLOTH_ARMOR_CHESTPLATE = ITEMS.register("cloth_armor_chestplate",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("cloth_armor_chestplate"))
                                        .humanoidArmor(ModArmorMaterials.CLOTH, ArmorType.CHESTPLATE)));

        public static final RegistryObject<Item> CLOTH_ARMOR_BOOTS = ITEMS.register("cloth_armor_boots",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("cloth_armor_boots"))
                                        .humanoidArmor(ModArmorMaterials.CLOTH, ArmorType.BOOTS)));

        public static final RegistryObject<Item> CLOTH_ARMOR_LEGGINGS = ITEMS.register("cloth_armor_leggings",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("cloth_armor_leggings"))
                                        .humanoidArmor(ModArmorMaterials.CLOTH, ArmorType.LEGGINGS)));

        // medium Armor

        public static final RegistryObject<Item> LEAD_ARMOR_HELMET = ITEMS.register("lead_armor_helmet",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("lead_armor_helmet"))
                                        .humanoidArmor(ModArmorMaterials.LEAD, ArmorType.HELMET)));

        public static final RegistryObject<Item> LEAD_ARMOR_CHESTPLATE = ITEMS.register("lead_armor_chestplate",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("lead_armor_chestplate"))
                                        .humanoidArmor(ModArmorMaterials.LEAD, ArmorType.CHESTPLATE)));

        public static final RegistryObject<Item> LEAD_ARMOR_BOOTS = ITEMS.register("lead_armor_boots",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("lead_armor_boots"))
                                        .humanoidArmor(ModArmorMaterials.LEAD, ArmorType.BOOTS)));

        public static final RegistryObject<Item> LEAD_ARMOR_LEGGINGS = ITEMS.register("lead_armor_leggings",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("lead_armor_leggings"))
                                        .humanoidArmor(ModArmorMaterials.LEAD, ArmorType.LEGGINGS)));

        // normal armor

        public static final RegistryObject<Item> SILVER_ARMOR_HELMET = ITEMS.register("silver_armor_helmet",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_armor_helmet"))
                                        .humanoidArmor(ModArmorMaterials.SILVER, ArmorType.HELMET)));

        public static final RegistryObject<Item> SILVER_ARMOR_CHESTPLATE = ITEMS.register("silver_armor_chestplate",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_armor_chestplate"))
                                        .humanoidArmor(ModArmorMaterials.SILVER, ArmorType.CHESTPLATE)));

        public static final RegistryObject<Item> SILVER_ARMOR_LEGGINGS = ITEMS.register("silver_armor_leggings",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_armor_leggings"))
                                        .humanoidArmor(ModArmorMaterials.SILVER, ArmorType.LEGGINGS)));

        public static final RegistryObject<Item> SILVER_ARMOR_BOOTS = ITEMS.register("silver_armor_boots",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("silver_armor_boots"))
                                        .humanoidArmor(ModArmorMaterials.SILVER, ArmorType.BOOTS)));

        // heavy Armor

        public static final RegistryObject<Item> BRONZE_ARMOR_HELMET = ITEMS.register("bronze_armor_helmet",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bronze_armor_helmet"))
                                        .humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.HELMET)));

        public static final RegistryObject<Item> BRONZE_ARMOR_CHESTPLATE = ITEMS.register("bronze_armor_chestplate",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bronze_armor_chestplate"))
                                        .humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.CHESTPLATE)));

        public static final RegistryObject<Item> BRONZE_ARMOR_LEGGINGS = ITEMS.register("bronze_armor_leggings",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bronze_armor_leggings"))
                                        .humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.LEGGINGS)));

        public static final RegistryObject<Item> BRONZE_ARMOR_BOOTS = ITEMS.register("bronze_armor_boots",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("bronze_armor_boots"))
                                        .humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.BOOTS)));

        // jagernougt Armor

        public static final RegistryObject<Item> ROYALE_ARMOR_HELMET = ITEMS.register("royale_armor_helmet",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("royale_armor_helmet"))
                                        .humanoidArmor(ModArmorMaterials.ROYALE, ArmorType.HELMET)));

        public static final RegistryObject<Item> ROYALE_ARMOR_CHESTPLATE = ITEMS.register("royale_armor_chestplate",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("royale_armor_chestplate"))
                                        .humanoidArmor(ModArmorMaterials.ROYALE, ArmorType.CHESTPLATE)));

        public static final RegistryObject<Item> ROYALE_ARMOR_LEGGINGS = ITEMS.register("royale_armor_leggings",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("royale_armor_leggings"))
                                        .humanoidArmor(ModArmorMaterials.ROYALE, ArmorType.LEGGINGS)));

        public static final RegistryObject<Item> ROYALE_ARMOR_BOOTS = ITEMS.register("royale_armor_boots",
                        () -> new Item(new Item.Properties()
                                        .setId(ITEMS.key("royale_armor_boots"))
                                        .humanoidArmor(ModArmorMaterials.ROYALE, ArmorType.BOOTS)));

}