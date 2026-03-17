package com.mittelaltermod.datagen.models.model;

import java.util.Optional;

import com.mittelaltermod.MittelalterMod;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

public class ModModelTemplate {

    private static ModelTemplate createModItem(final String model, final TextureSlot... requiredSlots) {
        return new ModelTemplate(
                Optional.of(Identifier.fromNamespaceAndPath(MittelalterMod.MODID, "item/" + model)),
                Optional.empty(),
                requiredSlots);
    }

    private static ModelTemplate createModItem(final String model, final String suffix,
            final TextureSlot... requiredSlots) {
        return new ModelTemplate(
                Optional.of(Identifier.fromNamespaceAndPath(MittelalterMod.MODID, "item/" + model)),
                Optional.of(suffix),
                requiredSlots);
    }

    private static ModelTemplate createMod(final String model, final String suffix,
            final TextureSlot... requiredSlots) {
        return new ModelTemplate(
                Optional.of(Identifier.fromNamespaceAndPath(MittelalterMod.MODID, "block/" + model)),
                Optional.of(suffix),
                requiredSlots);
    }
}
