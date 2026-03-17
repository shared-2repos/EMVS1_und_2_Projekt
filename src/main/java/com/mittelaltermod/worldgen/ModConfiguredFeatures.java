package com.mittelaltermod.worldgen;

import com.mittelaltermod.MittelalterMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class ModConfiguredFeatures {

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(MittelalterMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>>
}
