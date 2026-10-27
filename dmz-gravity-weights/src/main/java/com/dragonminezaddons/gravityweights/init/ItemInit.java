package com.dragonminezaddons.gravityweights.init;

import com.dragonminezaddons.gravityweights.GravityWeightsMod;
import com.dragonminezaddons.gravityweights.item.WeightItem;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, GravityWeightsMod.MOD_ID);

    public static final RegistryObject<Item> LIGHT_WEIGHTS =
        ITEMS.register("light_weights", () -> new WeightItem(1, 0, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEDIUM_WEIGHTS =
        ITEMS.register("medium_weights", () -> new WeightItem(2, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEAVY_WEIGHTS =
        ITEMS.register("heavy_weights", () -> new WeightItem(3, 2, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ULTRA_WEIGHTS =
        ITEMS.register("ultra_weights", () -> new WeightItem(4, 3, new Item.Properties().stacksTo(1)));
}
