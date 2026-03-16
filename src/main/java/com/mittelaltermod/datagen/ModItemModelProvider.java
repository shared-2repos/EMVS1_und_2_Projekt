package com.mittelaltermod.datagen;

import java.util.function.BiConsumer;

import com.mittelaltermod.item.ModItems;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.Identifier;

public class ModItemModelProvider extends ItemModelGenerators {

    public ModItemModelProvider(ItemModelOutput p_375677_, BiConsumer<Identifier, ModelInstance> p_377569_) {
        super(p_375677_, p_377569_);
    }

    @Override
    public void run() {
        this.generateFlatItem(ModItems.BREAD_LOAF, ModelTemplates.FLAT_ITEM);
        super.run();
    }

}
