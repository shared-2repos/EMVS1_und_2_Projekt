package com.mittelaltermod.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.mittelaltermod.MittelalterMod;
import com.mittelaltermod.ModBlockTags;
import com.mittelaltermod.block.ModBlocks;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider, String modId,
            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MittelalterMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider p_256380_) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILVER_ORE.get());
    }

}
