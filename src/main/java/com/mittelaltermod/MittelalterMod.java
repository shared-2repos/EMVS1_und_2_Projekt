package com.mittelaltermod;

import org.slf4j.Logger;
import com.mittelaltermod.block.ModBlocks;
import com.mittelaltermod.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MittelalterMod.MODID)
public final class MittelalterMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mittelaltermod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Create a Deferred Register to hold CreativeModeTabs which will all be
    // registered under the "mittelaltermod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "mittelaltermod:mittelalter_tab" for our
    // medieval items
    public static final RegistryObject<CreativeModeTab> MITTELALTER_TAB = CREATIVE_MODE_TABS.register("mittelalter_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.SILVER_COIN.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Add items to our custom tab
                        // Weapons
                        // Swords
                        output.accept(ModItems.SILVER_SWORD.get());
                        output.accept(ModItems.WOOD_LONG_SWORD.get());
                        output.accept(ModItems.COPPER_LONG_SWORD.get());
                        output.accept(ModItems.IRON_LONG_SWORD.get());
                        output.accept(ModItems.GOLD_LONG_SWORD.get());
                        output.accept(ModItems.DIAMOND_LONG_SWORD.get());
                        output.accept(ModItems.NETHERITE_LONG_SWORD.get());

                        // Halbert
                        output.accept(ModItems.WOOD_HALBERT.get());
                        output.accept(ModItems.COPPER_HALBERT.get());
                        output.accept(ModItems.IRON_HALBERT.get());
                        output.accept(ModItems.GOLD_HALBERT.get());
                        output.accept(ModItems.DIAMOND_HALBERT.get());
                        output.accept(ModItems.NETHERITE_HALBERT.get());
                        // Other
                        output.accept(ModItems.SILVER_COIN.get());
                        output.accept(ModItems.GOLD_COIN.get());
                        output.accept(ModItems.BRONZE_COIN.get());
                        output.accept(ModItems.FAT.get());
                        // Food
                        output.accept(ModItems.BREAD_LOAF.get());
                        output.accept(ModItems.CHICKEN_SOUP.get());
                        output.accept(ModItems.VEGAN_SOUP.get());
                        output.accept(ModItems.GULAS_SOUP.get());
                        output.accept(ModItems.CHEESE.get());
                        output.accept(ModItems.FRIED_EGG.get());
                        output.accept(ModItems.STEW.get());
                        // Bloks
                        output.accept(ModItems.SILVER_BLOCK_ITEM.get());
                        output.accept(ModItems.CASTLE_BRICK_ITEM.get());
                        output.accept(ModItems.SILVER_ORES.get());
                        // Armor
                        // light
                        output.accept(ModItems.CLOTH_ARMOR_BOOTS.get());
                        output.accept(ModItems.CLOTH_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.CLOTH_ARMOR_HELMET.get());
                        output.accept(ModItems.CLOTH_ARMOR_LEGGINGS.get());
                        // medium
                        output.accept(ModItems.LEAD_ARMOR_BOOTS.get());
                        output.accept(ModItems.LEAD_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.LEAD_ARMOR_HELMET.get());
                        output.accept(ModItems.LEAD_ARMOR_LEGGINGS.get());
                        // normal
                        output.accept(ModItems.SILVER_ARMOR_BOOTS.get());
                        output.accept(ModItems.SILVER_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.SILVER_ARMOR_HELMET.get());
                        output.accept(ModItems.SILVER_ARMOR_LEGGINGS.get());
                        // heavy
                        output.accept(ModItems.BRONZE_ARMOR_BOOTS.get());
                        output.accept(ModItems.BRONZE_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.BRONZE_ARMOR_HELMET.get());
                        output.accept(ModItems.BRONZE_ARMOR_LEGGINGS.get());
                        // jougernought
                        output.accept(ModItems.ROYALE_ARMOR_BOOTS.get());
                        output.accept(ModItems.ROYALE_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.ROYALE_ARMOR_HELMET.get());
                        output.accept(ModItems.ROYALE_ARMOR_LEGGINGS.get());
                        // Add more items here as you create them
                    }).build());

    public MittelalterMod(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();

        LOGGER.info("=== MITTELALTER MOD CONSTRUCTOR START ===");

        FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);

        // Register the Deferred Registers from our separate classes
        LOGGER.info("Registering ModBlocks...");
        ModBlocks.BLOCKS.register(modBusGroup);

        LOGGER.info("Registering ModItems...");
        ModItems.ITEMS.register(modBusGroup);

        LOGGER.info("Registering CreativeModeTabs...");
        CREATIVE_MODE_TABS.register(modBusGroup);

        // Register items to vanilla creative tabs
        BuildCreativeModeTabContentsEvent.BUS.addListener(MittelalterMod::addCreative);

        // Register our mod's ForgeConfigSpec
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        LOGGER.info("Total items in ModItems.ITEMS: {}", ModItems.ITEMS.getEntries().size());
        LOGGER.info("=== MITTELALTER MOD CONSTRUCTOR END ===");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("=== COMMON SETUP START ===");
        LOGGER.info("HELLO FROM COMMON SETUP - Mittelalter Mod initialized!");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));

        // Log our registered items with their IDs
        LOGGER.info("=== OUR REGISTERED ITEMS ===");
        for (var entry : ModItems.ITEMS.getEntries()) {
            LOGGER.info("Item: {} -> {}", entry.getId(), entry.get());
        }

        LOGGER.info("=== COMMON SETUP END ===");
    }

    // Add items to vanilla creative tabs
    private static void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.SILVER_BLOCK_ITEM);
            event.accept(ModItems.CASTLE_BRICK_ITEM);
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SILVER_COIN);
            event.accept(ModItems.BRONZE_COIN);
            event.accept(ModItems.GOLD_COIN);
            event.accept(ModItems.FAT);
        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.GULAS_SOUP);
            event.accept(ModItems.VEGAN_SOUP);
            event.accept(ModItems.CHICKEN_SOUP);
            event.accept(ModItems.BREAD_LOAF);
            event.accept(ModItems.CHEESE);
            event.accept(ModItems.FRIED_EGG);
            event.accept(ModItems.STEW);

        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.SILVER_SWORD);
            event.accept(ModItems.WOOD_LONG_SWORD);
            event.accept(ModItems.COPPER_LONG_SWORD);
            event.accept(ModItems.IRON_LONG_SWORD);
            event.accept(ModItems.GOLD_LONG_SWORD);
            event.accept(ModItems.DIAMOND_LONG_SWORD);
            event.accept(ModItems.NETHERITE_LONG_SWORD);
            event.accept(ModItems.WOOD_HALBERT);
            event.accept(ModItems.COPPER_HALBERT);
            event.accept(ModItems.IRON_HALBERT);
            event.accept(ModItems.GOLD_HALBERT);
            event.accept(ModItems.DIAMOND_HALBERT);
            event.accept(ModItems.NETHERITE_HALBERT);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods
    // in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP - Mittelalter Mod client initialized!");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}