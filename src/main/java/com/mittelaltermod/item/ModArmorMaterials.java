package com.mittelaltermod.item;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;
import com.mittelaltermod.ModItemTags;

public class ModArmorMaterials {

        public static final ArmorMaterial CLOTH = new ArmorMaterial(4, makeDefense(0, 0, 0, 0, 0), 0,
                        SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ModItemTags.REPAIRS_CLOTH_ARMOR,
                        EquipmentAssets.CLOTH);

        public static final ArmorMaterial LEAD = new ArmorMaterial(6, makeDefense(1, 2, 3, 1, 10), 0,
                        SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
                        ModItemTags.REPAIRS_LEAD_ARMOR, EquipmentAssets.LEAD);

        public static final ArmorMaterial SILVER = new ArmorMaterial(15, makeDefense(1, 3, 6, 3, 8), 12,
                        SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ModItemTags.REPAIRS_SILVER_ARMOR,
                        EquipmentAssets.SILVER);

        public static final ArmorMaterial BRONZE = new ArmorMaterial(20, makeDefense(2, 4, 6, 2, 10), 10,
                        SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ModItemTags.REPAIRS_BRONZE_ARMOR,
                        EquipmentAssets.BRONZE);

        public static final ArmorMaterial CARBON = new ArmorMaterial(37, makeDefense(3, 6, 8, 3, 20), 15,
                        SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ModItemTags.REPAIRS_CARBON_ARMOR,
                        EquipmentAssets.CARBON);

        private static Map<ArmorType, Integer> makeDefense(int boots, int leggings, int chestplate, int helmet,
                        int body) {
                return Maps.newEnumMap(
                                Map.of(
                                                ArmorType.BOOTS, boots,
                                                ArmorType.LEGGINGS, leggings,
                                                ArmorType.CHESTPLATE, chestplate,
                                                ArmorType.HELMET, helmet,
                                                ArmorType.BODY, body));
        }
}