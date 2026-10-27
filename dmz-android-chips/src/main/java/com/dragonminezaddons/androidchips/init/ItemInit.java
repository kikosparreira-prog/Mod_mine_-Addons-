package com.dragonminezaddons.androidchips.init;

import com.dragonminezaddons.androidchips.AndroidChipsMod;
import com.dragonminezaddons.androidchips.item.ChipItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, AndroidChipsMod.MOD_ID);

    public static final RegistryObject<Item> SPEED_CHIP =
        ITEMS.register("speed_chip", () -> new ChipItem(
            new MobEffectInstance[]{ new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 2) },
            new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> POWER_CHIP =
        ITEMS.register("power_chip", () -> new ChipItem(
            new MobEffectInstance[]{ new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 2) },
            new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> DEFENSE_CHIP =
        ITEMS.register("defense_chip", () -> new ChipItem(
            new MobEffectInstance[]{ new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 2) },
            new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> ANDROID_CORE_CHIP =
        ITEMS.register("android_core_chip", () -> new ChipItem(
            new MobEffectInstance[]{
                new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000, 2),
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 24000, 2),
                new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 24000, 1),
                new MobEffectInstance(MobEffects.REGENERATION, 24000, 1)
            }, new Item.Properties().stacksTo(2)));
}
