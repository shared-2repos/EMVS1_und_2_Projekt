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
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
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
        generateItemWithExistingParrent(ModItems.SILVER_SWORD.get(), Items.WOODEN_SWORD);
        generateFlatItem(ModItems.BREAD_LOAF, ModelTemplates.FLAT_ITEM);

        super.run();
    }

    public ModItemModelGenerator(
            ItemModelOutput itemModelOutput,
            BiConsumer<Identifier, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    private Identifier createFlatItemModel(
            final Item item,
            final Item textureItem,
            final String suffix,
            final ModelTemplate modelTemplate) {
        return modelTemplate.create(
                ModelLocationUtils.getModelLocation(item, suffix),
                TextureMapping.layer0(TextureMapping.getItemTexture(textureItem, suffix)),
                modelOutput);
    }

    private void generateFlatItem(final Item item, final ModelTemplate modelTemplate, final Identifier texture) {
        final var model = modelTemplate.create(item, TextureMapping.layer0(texture), modelOutput);
        itemModelOutput.accept(item, ItemModelUtils.plainModel(model));
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
