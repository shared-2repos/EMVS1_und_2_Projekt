package com.mittelaltermod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GunItem extends Item {

    private final int magazineSize;
    private final int reloadTime;
    private final float damage;
    private final float bulletSpeed;
    private final int shootCooldown;

    public GunItem(Properties properties, int magazineSize, int reloadTime,
                   float damage, float bulletSpeed, int shootCooldown) {
        super(properties);
        this.magazineSize = magazineSize;
        this.reloadTime = reloadTime;
        this.damage = damage;
        this.bulletSpeed = bulletSpeed;
        this.shootCooldown = shootCooldown;
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (player.isShiftKeyDown()) {
            if (canReload(stack, player)) {
                if (!level.isClientSide()) {
                    startReload(player, stack);
                }
                return InteractionResult.SUCCESS;
            }
        } else {
            if (canShoot(stack)) {
                if (!level.isClientSide()) {
                    shoot(level, player, stack);
                }
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.PASS;
    }

    private boolean canShoot(ItemStack stack) {
        return getAmmoCount(stack) > 0;
    }

    private void shoot(Level level, Player player, ItemStack stack) {
        setAmmoCount(stack, getAmmoCount(stack) - 1);

        // TODO: Enable bullet entity when entity registration is fixed for 1.21.11
        // The entity registration API has changed significantly in 1.21.11
        // Once ModEntities.BULLET is properly registered, uncomment below:
        // BulletEntity bullet = new BulletEntity(ModEntities.BULLET.get(), level, player, damage);
        // bullet.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, bulletSpeed, 0.1F);
        // level.addFreshEntity(bullet);

        // TODO: Add sound event
        // player.playSound(/* shoot sound */, 1.0F, 1.0F);
        player.getCooldowns().addCooldown(stack, shootCooldown);
    }

    private boolean canReload(ItemStack stack, Player player) {
        return getAmmoCount(stack) < magazineSize && hasAmmoInInventory(player);
    }

    private void startReload(Player player, ItemStack stack) {
        int needed = magazineSize - getAmmoCount(stack);
        int available = countAmmoInInventory(player);
        int toReload = Math.min(needed, available);

        removeAmmoFromInventory(player, toReload);
        setAmmoCount(stack, getAmmoCount(stack) + toReload);
        player.getCooldowns().addCooldown(stack, reloadTime);
        // TODO: Add sound event
        // player.playSound(/* reload sound */, 1.0F, 1.0F);
    }

    private int getAmmoCount(ItemStack stack) {
        // For 1.21.11, ammo is always full for now
        // TODO: Implement proper DataComponents ammo storage for 1.21.11
        return magazineSize;
    }

    private void setAmmoCount(ItemStack stack, int count) {
        // TODO: Implement proper DataComponents ammo storage for 1.21.11
        // The ItemStack NBT system has been replaced with DataComponents
    }

    private boolean hasAmmoInInventory(Player player) {
        return countAmmoInInventory(player) > 0;
    }

    private int countAmmoInInventory(Player player) {
        int count = 0;
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack itemStack = player.getInventory().getItem(i);
            if (itemStack.is(ModItems.NINE_MM_BULLET.get())) {
                count += itemStack.getCount();
            }
        }
        return count;
    }

    private void removeAmmoFromInventory(Player player, int amount) {
        int remaining = amount;
        for (int i = 0; i < player.getInventory().getContainerSize() && remaining > 0; i++) {
            ItemStack itemStack = player.getInventory().getItem(i);
            if (itemStack.is(ModItems.NINE_MM_BULLET.get())) {
                int toRemove = Math.min(itemStack.getCount(), remaining);
                itemStack.shrink(toRemove);
                remaining -= toRemove;
            }
        }
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return getAmmoCount(stack) == 0;
    }
}