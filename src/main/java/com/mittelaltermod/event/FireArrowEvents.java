package com.mittelaltermod.event;

import com.mittelaltermod.item.ModItems;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.event.entity.living.LivingGetProjectileEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mittelaltermod")
public class FireArrowEvents {

    // Step 1: detect when player shoots Fire Arrow and set the arrow entity to be "fire"
    @SubscribeEvent
    public static void onGetProjectile(LivingGetProjectileEvent event) {
        ItemStack stack = event.getProjectileItemStack();
        if (stack.is(ModItems.FIRE_ARROW.get())) {
            event.setProjectileItemStack(stack);

            // Forge 1.21: schedule arrow fire flag
            event.getEntity().getPersistentData().putBoolean("FireArrowNextShot", true);
        }
    }

    // Step 2: detect when arrow impacts
    @SubscribeEvent
    public static void onProjectileImpact(ProjectileImpactEvent event) {
        Projectile proj = event.getProjectile();
        if (!(proj instanceof Arrow arrow)) return;

        Level level = arrow.level();

        // Check if the arrow should be on fire
        if (arrow.getOwner() instanceof LivingEntity shooter) {
			boolean fireFlag = shooter.getPersistentData().getBoolean("FireArrowNextShot").orElse(false);
			if (fireFlag) {
				arrow.setRemainingFireTicks(100); // ~5 seconds

				// reset flag
				shooter.getPersistentData().putBoolean("FireArrowNextShot", false);
			}
		}

        // ignite entities
        if (event.getRayTraceResult() instanceof EntityHitResult hit) {
            if (hit.getEntity() instanceof LivingEntity entity) {
                entity.setRemainingFireTicks(100);
            }
        }

        // ignite block at impact
        if (event.getRayTraceResult() instanceof BlockHitResult blockHit) {
            var pos = blockHit.getBlockPos().relative(blockHit.getDirection());
            if (level.isEmptyBlock(pos)) {
                level.setBlock(pos, net.minecraft.world.level.block.Blocks.FIRE.defaultBlockState(), 3);
            }
        }
    }
}