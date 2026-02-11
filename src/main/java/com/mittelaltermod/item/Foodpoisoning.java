package com.mittelaltermod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mittelaltermod")

public class Foodpoisoning {
    @SubscribeEvent
    public static void onItemFinish(LivingEntityUseItemEvent.Finish event) {

        LivingEntity entity = event.getEntity();
        // checks for player
        if (!(entity instanceof Player player))
            return;
        // gets the affectet items
        if (event.getItem().getItem() == Items.BEEF ||
                event.getItem().getItem() == Items.PORKCHOP ||
                event.getItem().getItem() == Items.CHICKEN ||
                event.getItem().getItem() == Items.MUTTON ||
                event.getItem().getItem() == Items.RABBIT ||
                event.getItem().getItem() == ModItems.BREAD_LOAF.get()) {

            if (!player.level().isClientSide()) {

                if (player.level().random.nextFloat() < 0.2f) { // 0.2F = 20% chance

                    player.addEffect(new MobEffectInstance(
                            MobEffects.NAUSEA, // effect
                            2000, // 1s = 20 ticks
                            0 // amplifier (0 = level 1)
                    ));
                }
            }
        }
    }
}
