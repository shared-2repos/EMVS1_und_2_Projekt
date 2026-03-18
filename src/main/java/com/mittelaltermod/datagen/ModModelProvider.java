package com.mittelaltermod.datagen;

import java.util.stream.Stream;

import com.mittelaltermod.util.RegistryUtil;
import com.mittelaltermod.datagen.models.ModBlockModelGenerator;
import com.mittelaltermod.datagen.models.ModItemModelGenerator;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(final PackOutput output) {
        super(output);
    }

    @Override
    protected Stream<Block> getKnownBlocks() {
        return RegistryUtil.getModRegistryEntriesStream(ForgeRegistries.BLOCKS);
    }

    @Override
    protected Stream<Item> getKnownItems() {
        return RegistryUtil.getModRegistryEntriesStream(ForgeRegistries.ITEMS);
    }

    @Override
    protected BlockModelGenerators getBlockModelGenerators(final BlockStateGeneratorCollector blocks,
            final ItemInfoCollector items, final SimpleModelCollector models) {
        return new ModBlockModelGenerator(blocks, items, models);
    }

    @Override
    protected ItemModelGenerators getItemModelGenerators(final ItemInfoCollector items,
            final SimpleModelCollector models) {
        return new ModItemModelGenerator(items, models);
    }
}
