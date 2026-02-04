
package com.mittelaltermod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BreadLoafItem extends Item {

    public BreadLoafItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide() && entity instanceof Player player) {
            if (level.random.nextFloat() < 0.2f) {

                player.addEffect(new MobEffectInstance(
                        MobEffects.NAUSEA,
                        2000,
                        100));
            }
        }
        return super.finishUsingItem(stack, level, entity);
    }
}
