package com.mittelaltermod.item;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class ModArmorMaterials {

        public static final ArmorMaterial CLOTH

        public static final ArmorMaterial LEAD

        public static final ArmorMaterial SILVER = new ArmorMaterial(8, makeDefense(1, 3, 6, 3, 8), 12,
                        SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.REPAIRS_GOLD_ARMOR, EquipmentAssets.GOLD);

        public static final ArmorMaterial BRONZE§

        public static final ArmorMaterial CARBON

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