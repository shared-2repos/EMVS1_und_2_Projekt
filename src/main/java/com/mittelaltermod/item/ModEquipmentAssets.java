package com.mittelaltermod.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.resources.Identifier;

public class ModEquipmentAssets {

        public static final ResourceKey<EquipmentAsset> CLOTH = ResourceKey.create(EquipmentAssets.ROOT_ID,
                        Identifier.fromNamespaceAndPath("mittelaltermod", "cloth"));

        public static final ResourceKey<EquipmentAsset> LEAD = ResourceKey.create(EquipmentAssets.ROOT_ID,
                        Identifier.fromNamespaceAndPath("mittelaltermod", "lead"));

        public static final ResourceKey<EquipmentAsset> SILVER = ResourceKey.create(EquipmentAssets.ROOT_ID,
                        Identifier.fromNamespaceAndPath("mittelaltermod", "silver"));

        public static final ResourceKey<EquipmentAsset> BRONZE = ResourceKey.create(EquipmentAssets.ROOT_ID,
                        Identifier.fromNamespaceAndPath("mittelaltermod", "bronze"));

        public static final ResourceKey<EquipmentAsset> ROYALE = ResourceKey.create(EquipmentAssets.ROOT_ID,
                        Identifier.fromNamespaceAndPath("mittelaltermod", "royale"));
}
