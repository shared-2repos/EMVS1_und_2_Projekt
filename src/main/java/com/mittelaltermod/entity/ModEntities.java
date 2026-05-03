package com.mittelaltermod.entity;

import com.mittelaltermod.MittelalterMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<net.minecraft.world.entity.EntityType<?>> ENTITY_TYPES = 
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MittelalterMod.MODID);

    // Entity registration for 1.21.11 requires different API
    // TODO: Research and implement proper 1.21.11 entity registration
}
