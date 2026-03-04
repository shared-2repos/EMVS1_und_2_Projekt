package com.mittelaltermod.entity;

import com.mittelaltermod.MittelalterMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MittelalterMod.MODID);

    public static final RegistryObject<EntityType<FireArrowEntity>> FIRE_ARROW =
        ENTITIES.register("fire_arrow",
            () -> EntityType.Builder.<FireArrowEntity>of(FireArrowEntity::new, MobCategory.MISC)
                .sized(0.5F, 0.5F)
                .clientTrackingRange(4)
                .updateInterval(20)
                .build(ResourceKey.create(
                    Registries.ENTITY_TYPE,
                    Identifier.parse(MittelalterMod.MODID + ":" + "fire_arrow")
                ))
        );
}