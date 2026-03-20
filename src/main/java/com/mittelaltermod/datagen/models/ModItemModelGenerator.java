package com.mittelaltermod.datagen.models;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.BiConsumer;

import com.mittelaltermod.item.ModItems;
import com.mittelaltermod.util.RegistryUtil;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemModelGenerator extends ItemModelGenerators {

    private static final Field ITEM_INFOS = ObfuscationReflectionHelper.findField(
            ModelProvider.ItemInfoCollector.class,
            "itemInfos");

    private static final Field COPIES = ObfuscationReflectionHelper.findField(
            ModelProvider.ItemInfoCollector.class,
            "copies");

    @Override
    public void run() {

        generateFlatItem(ModItems.SILVER_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.WOOD_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.COPPER_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.STONE_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.IRON_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.SILVER_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.GOLD_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.DIAMOND_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.NETHERITE_LONG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        generateFlatItem(ModItems.WOOD_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.COPPER_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.STONE_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.IRON_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.SILVER_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.GOLD_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.DIAMOND_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItems.NETHERITE_HALBERT.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        generateFlatItem(ModItems.BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.BRONZE_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.SILVER_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.CLOTH.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.LEAD.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.SILVER_INGOT.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.SILVER_INGOT_RAW.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.FAT.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.SILVER_COIN.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.GOLD_COIN.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.BRONZE_COIN.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.BREAD_LOAF.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.CHICKEN_SOUP.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.VEGAN_SOUP.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.GULAS_SOUP.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.CHEESE.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.FRIED_EGG.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.STEW.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.CLOTH_ARMOR_HELMET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.CLOTH_ARMOR_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.CLOTH_ARMOR_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.CLOTH_ARMOR_BOOTS.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.LEAD_ARMOR_HELMET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.LEAD_ARMOR_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.LEAD_ARMOR_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.LEAD_ARMOR_BOOTS.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.SILVER_ARMOR_HELMET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.SILVER_ARMOR_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.SILVER_ARMOR_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.SILVER_ARMOR_BOOTS.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.BRONZE_ARMOR_HELMET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.BRONZE_ARMOR_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.BRONZE_ARMOR_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.BRONZE_ARMOR_BOOTS.get(), ModelTemplates.FLAT_ITEM);

        generateFlatItem(ModItems.ROYALE_ARMOR_HELMET.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.ROYALE_ARMOR_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.ROYALE_ARMOR_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.ROYALE_ARMOR_BOOTS.get(), ModelTemplates.FLAT_ITEM);

        super.run();
    }

    public ModItemModelGenerator(
            ItemModelOutput itemModelOutput,
            BiConsumer<Identifier, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    private void generateItemWithExistingParent(final Item item, final Item parent) {
        itemModelOutput.accept(item, ItemModelUtils.plainModel(ModelLocationUtils.getModelLocation(parent)));
    }

    private void generateDefaultBlockModels() {
        if (!(itemModelOutput instanceof final ModelProvider.ItemInfoCollector itemInfoCollector)) {
            return;
        }

        final Map<Item, ClientItem> itemInfos;
        final Map<Item, Item> copies;

        try {
            @SuppressWarnings("unchecked")
            final var itemInfosMap = (Map<Item, ClientItem>) ITEM_INFOS.get(itemInfoCollector);
            @SuppressWarnings("unchecked")
            final var copiesMap = (Map<Item, Item>) COPIES.get(itemInfoCollector);

            itemInfos = itemInfosMap;
            copies = copiesMap;
        } catch (final IllegalAccessException e) {
            throw new RuntimeException("Failed to get ItemInfoCollector fields", e);
        }

        RegistryUtil.getModRegistryEntriesStream(ForgeRegistries.ITEMS).forEach(item -> {
            if (!copies.containsKey(item)) {
                if (item instanceof final BlockItem blockItem && !itemInfos.containsKey(blockItem)) {
                    final var modelLocation = ModelLocationUtils.getModelLocation(blockItem.getBlock());
                    itemInfoCollector.accept(blockItem, ItemModelUtils.plainModel(modelLocation));
                }
            }
        });
    }
}
