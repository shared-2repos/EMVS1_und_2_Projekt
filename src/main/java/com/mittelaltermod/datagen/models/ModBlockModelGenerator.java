package com.mittelaltermod.datagen.models;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.mittelaltermod.block.ModBlocks;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

public class ModBlockModelGenerator extends BlockModelGenerators {
    private static final Field SUFFIX = ObfuscationReflectionHelper.findField(ModelTemplate.class, "suffix");

    private void createCube(final Block block, final Block textureBlock, final String textureSuffix) {
        final var textureMapping = TextureMapping.cube(
                TextureMapping.getBlockTexture(textureBlock, textureSuffix));

        final var model = plainVariant(ModelTemplates.CUBE_ALL.create(block, textureMapping, modelOutput));

        blockStateOutput.accept(createSimpleBlock(block, model));
    }

    @Override
    public void run() {
        createTrivialCube(ModBlocks.CASTLE_BRICK.get());
        super.run();
    }

    public ModBlockModelGenerator(
            final Consumer<BlockModelDefinitionGenerator> blockStateOutput,
            final ItemModelOutput itemModelOutput,
            final BiConsumer<Identifier, ModelInstance> modelOutput) {
        super(blockStateOutput, itemModelOutput, modelOutput);
    }

    private static ModelTemplate existingParent(final Block parent) {
        return new ModelTemplate(
                Optional.of(ModelLocationUtils.getModelLocation(parent)),
                Optional.empty());
    }

    private static ModelTemplate existingParent(final Block parent, final String parentSuffix,
            final String templateSuffix) {
        return new ModelTemplate(
                Optional.of(ModelLocationUtils.getModelLocation(parent, parentSuffix)),
                Optional.of(templateSuffix));
    }

    @SuppressWarnings("unchecked")
    private static String getSuffix(final ModelTemplate modelTemplate) {
        try {
            return ((Optional<String>) SUFFIX.get(modelTemplate)).orElse("");
        } catch (final IllegalAccessException e) {
            throw new RuntimeException("Failed to get suffix for ModelTemplate", e);
        }
    }

    private static PropertyDispatch<VariantMutator> getDispatch(final String fieldName) {
        return Objects.requireNonNull(
                ObfuscationReflectionHelper.getPrivateValue(BlockModelGenerators.class, null, fieldName));
    }
}
