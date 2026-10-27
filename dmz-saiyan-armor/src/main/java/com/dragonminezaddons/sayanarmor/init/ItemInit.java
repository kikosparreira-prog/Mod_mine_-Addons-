package com.dragonminezaddons.sayanarmor.init;

import com.dragonminezaddons.sayanarmor.SaiyanArmorMod;
import com.dragonminezaddons.sayanarmor.item.SaiyanArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, SaiyanArmorMod.MOD_ID);

    public static final RegistryObject<Item> SAIYAN_HELMET =
        ITEMS.register("saiyan_helmet", () -> new SaiyanArmorItem(
            SaiyanArmorItem.SAIYAN_ARMOR, ArmorItem.Type.HELMET,
            new Item.Properties().stacksTo(1).durability(660)));
    public static final RegistryObject<Item> SAIYAN_CHESTPLATE =
        ITEMS.register("saiyan_chestplate", () -> new SaiyanArmorItem(
            SaiyanArmorItem.SAIYAN_ARMOR, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().stacksTo(1).durability(960)));
    public static final RegistryObject<Item> SAIYAN_LEGGINGS =
        ITEMS.register("saiyan_leggings", () -> new SaiyanArmorItem(
            SaiyanArmorItem.SAIYAN_ARMOR, ArmorItem.Type.LEGGINGS,
            new Item.Properties().stacksTo(1).durability(900)));
    public static final RegistryObject<Item> SAIYAN_BOOTS =
        ITEMS.register("saiyan_boots", () -> new SaiyanArmorItem(
            SaiyanArmorItem.SAIYAN_ARMOR, ArmorItem.Type.BOOTS,
            new Item.Properties().stacksTo(1).durability(780)));

    public static final RegistryObject<Item> FRIEZA_HELMET =
        ITEMS.register("frieza_helmet", () -> new SaiyanArmorItem(
            SaiyanArmorItem.FRIEZA_ARMOR, ArmorItem.Type.HELMET,
            new Item.Properties().stacksTo(1).durability(720)));
    public static final RegistryObject<Item> FRIEZA_CHESTPLATE =
        ITEMS.register("frieza_chestplate", () -> new SaiyanArmorItem(
            SaiyanArmorItem.FRIEZA_ARMOR, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().stacksTo(1).durability(1020)));
    public static final RegistryObject<Item> FRIEZA_LEGGINGS =
        ITEMS.register("frieza_leggings", () -> new SaiyanArmorItem(
            SaiyanArmorItem.FRIEZA_ARMOR, ArmorItem.Type.LEGGINGS,
            new Item.Properties().stacksTo(1).durability(960)));
    public static final RegistryObject<Item> FRIEZA_BOOTS =
        ITEMS.register("frieza_boots", () -> new SaiyanArmorItem(
            SaiyanArmorItem.FRIEZA_ARMOR, ArmorItem.Type.BOOTS,
            new Item.Properties().stacksTo(1).durability(840)));
}
