package com.mittelaltermod.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.phys.Vec3;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.phys.HitResult;

public class BulletEntity extends Projectile {
    
    private float damage = 5.0F;
    
    public BulletEntity(EntityType<? extends BulletEntity> type, Level level) {
        super(type, level);
    }
    
    public BulletEntity(EntityType<? extends BulletEntity> type, Level level, LivingEntity shooter) {
        super(type, level);
        this.setOwner(shooter);
    }
    
    public BulletEntity(EntityType<? extends BulletEntity> type, Level level, LivingEntity shooter, float damage) {
        super(type, level);
        this.setOwner(shooter);
        this.damage = damage;
    }
    
    public float getDamage() {
        return damage;
    }
    
    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
    }
    
    @Override
    public void tick() {
        super.tick();
        Vec3 movement = this.getDeltaMovement();
        this.setPos(this.getX() + movement.x, this.getY() + movement.y, this.getZ() + movement.z);
    }
    
    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide()) {
            if (hitResult.getType() == HitResult.Type.ENTITY) {
                Entity entity = ((net.minecraft.world.phys.EntityHitResult) hitResult).getEntity();
                if (entity instanceof LivingEntity livingEntity) {
                    livingEntity.hurt(this.damageSources().magic(), this.damage);
                }
            }
            this.discard();
        }
    }
}
