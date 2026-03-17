package com.mittelaltermod.worldgen;

import java.util.List;

import com.mittelaltermod.MittelalterMod;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class ModPlacedFeatures {

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeature = context.lookup(Registries.CONFIGURED_FEATURE);
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE,
                Identifier.fromNamespaceAndPath(MittelalterMod.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
            Holder<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
