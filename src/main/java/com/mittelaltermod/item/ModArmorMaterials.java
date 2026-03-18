package com.mittelaltermod.item;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mittelaltermod.ModItemTags;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class ModArmorMaterials {
        // enchantment value cannnot be 0

        public static final ArmorMaterial CLOTH = new ArmorMaterial(4, makeDefense(0, 0, 0, 0, 1), 1,
                        SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ModItemTags.REPAIRS_CLOTH_ARMOR,
                        ModEquipmentAssets.CLOTH);

        public static final ArmorMaterial LEAD = new ArmorMaterial(6, makeDefense(1, 2, 3, 1, 10), 1,
                        SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
                        ModItemTags.REPAIRS_LEAD_ARMOR, ModEquipmentAssets.LEAD);

        public static final ArmorMaterial SILVER = new ArmorMaterial(15, makeDefense(1, 3, 6, 3, 8), 12,
                        SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ModItemTags.REPAIRS_SILVER_ARMOR,
                        ModEquipmentAssets.SILVER);

        public static final ArmorMaterial BRONZE = new ArmorMaterial(20, makeDefense(2, 4, 6, 2, 10), 10,
                        SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ModItemTags.REPAIRS_BRONZE_ARMOR,
                        ModEquipmentAssets.BRONZE);

        public static final ArmorMaterial ROYALE = new ArmorMaterial(37, makeDefense(3, 6, 8, 3, 20), 15,
                        SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ModItemTags.REPAIRS_ROYALE_ARMOR,
                        ModEquipmentAssets.ROYALE);

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