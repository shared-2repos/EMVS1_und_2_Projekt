package com.mittelaltermod.entity;

import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.EntityHitResult;

public class FireArrowEntity extends Arrow {

    public FireArrowEntity(EntityType<? extends Arrow> type, Level level) {
        super(type, level);
    }

    public FireArrowEntity(Level level, LivingEntity shooter) {
        super(ModEntities.FIRE_ARROW.get(), level);
        this.setOwner(shooter);
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);

        if (result.getEntity() instanceof LivingEntity living) {
            living.igniteForTicks(100); // 5 seconds fire
        }
    }
}