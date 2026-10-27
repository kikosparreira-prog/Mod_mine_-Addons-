package com.dragonminezaddons.capsulecorp.init;

import com.dragonminezaddons.capsulecorp.CapsuleCorpMod;
import com.dragonminezaddons.capsulecorp.item.CapsuleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CapsuleCorpMod.MOD_ID);

    public static final RegistryObject<Item> IRON_CAPSULE =
        ITEMS.register("iron_capsule", () -> new CapsuleItem(Items.IRON_INGOT, 8, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLD_CAPSULE =
        ITEMS.register("gold_capsule", () -> new CapsuleItem(Items.GOLD_INGOT, 4, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DIAMOND_CAPSULE =
        ITEMS.register("diamond_capsule", () -> new CapsuleItem(Items.DIAMOND, 2, new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> NETHERITE_CAPSULE =
        ITEMS.register("netherite_capsule", () -> new CapsuleItem(Items.NETHERITE_INGOT, 1, new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> FOOD_CAPSULE =
        ITEMS.register("food_capsule", () -> new CapsuleItem(Items.COOKED_BEEF, 16, new Item.Properties().stacksTo(16)));
}
