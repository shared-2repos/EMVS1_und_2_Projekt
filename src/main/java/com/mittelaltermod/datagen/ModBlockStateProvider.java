package com.mittelaltermod.datagen;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.mittelaltermod.block.ModBlocks;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.resources.Identifier;

public class ModBlockStateProvider extends BlockModelGenerators {

    public ModBlockStateProvider(Consumer<BlockModelDefinitionGenerator> p_378137_, ItemModelOutput p_378502_,
            BiConsumer<Identifier, ModelInstance> p_378240_) {
        super(p_378137_, p_378502_, p_378240_);
    }

    @Override
    public void run() {
        this.createTrivialBlock();
        ;
        super.run();
    }

}
