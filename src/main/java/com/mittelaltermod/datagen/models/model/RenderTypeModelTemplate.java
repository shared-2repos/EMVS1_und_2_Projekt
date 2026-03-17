package com.mittelaltermod.datagen.models.model;

import com.google.gson.JsonObject;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import java.util.Map;
import java.util.Optional;

public class RenderTypeModelTemplate extends BaseModelTemplate {
    private final Identifier renderTypeHint;

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    public RenderTypeModelTemplate(
            final Optional<Identifier> model,
            final Optional<String> suffix,
            final Identifier renderTypeHint,
            final TextureSlot... requiredSlots) {
        super(model, suffix, requiredSlots);
        this.renderTypeHint = renderTypeHint;
    }

    @Override
    protected JsonObject createModel(final Map<TextureSlot, Identifier> textureMap) {
        final var output = super.createModel(textureMap);

        output.addProperty("render_type", renderTypeHint.toString());

        return output;
    }
}