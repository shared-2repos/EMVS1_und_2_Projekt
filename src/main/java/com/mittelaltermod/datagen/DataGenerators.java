package com.mittelaltermod.datagen;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.mittelaltermod.MittelalterMod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = MittelalterMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
                DataGenerator generator = event.getGenerator(); // generate files
                PackOutput packOutput = generator.getPackOutput(); // output files
                ExistingFileHelper existingFileHelper = event.getExistingFileHelper(); // chek if files already exists
                CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

                // generates the block loot tabel
                generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new,
                                                LootContextParamSets.BLOCK)),
                                lookupProvider));

                BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider,
                                MittelalterMod.MODID,
                                existingFileHelper);
                generator.addProvider(event.includeServer(), blockTagsProvider);

                generator.addProvider(event.includeServer(), new ModDatapackEntries(packOutput, lookupProvider));

        }
}
