package com.mittelaltermod.item;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class ModArmorMatreials {

    ArmorMaterials MODARMORMATERIALS = new ArmorMaterials() {
        ArmorMaterial SILVER = new ArmorMaterial(8, makeDefense(1, 3, 6, 3, 8), 12, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F,
                0.0F, ItemTags.REPAIRS_GOLD_ARMOR, EquipmentAssets.GOLD);
    };

    private static Map<ArmorType, Integer> makeDefense(int p_396353_, int p_395360_, int p_393033_, int p_393582_,
            int p_396462_) {
        return Maps.newEnumMap(
                Map.of(
                        ArmorType.BOOTS,
                        p_396353_,
                        ArmorType.LEGGINGS,
                        p_395360_,
                        ArmorType.CHESTPLATE,
                        p_393033_,
                        ArmorType.HELMET,
                        p_393582_,
                        ArmorType.BODY,
                        p_396462_));
    }
}