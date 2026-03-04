package com.mittelaltermod.item;

import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo.Map;

import com.google.common.collect.Maps;

import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;

public enum ModArmorMatreials implements ArmorMaterials {
    ArmorMaterial SILVER = new ArmorMaterial(8, makeDefense(), 0, null, 0, 0, null, null)
};

 private static Map<ArmorType, Integer> makeDefense(int p_396353_, int p_395360_, int p_393033_, int p_393582_, int p_396462_) {
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
                p_396462_
            )
        );
    }
