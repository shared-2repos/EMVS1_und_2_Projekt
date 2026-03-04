package com.mittelaltermod.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.core.ResourceLocation;

public class ModEquipmentAsset {
    public static final ResourceKey<EquipmentAsset> CARBON = ResourceKey.create(EquipmentAssets.ROOT_ID,
            new ResourceLocation.fromNamespaceAndPath("mittelaltermod", "carbon"));
}
