package com.dragonminezaddons.namekflora.init;

import com.dragonminezaddons.namekflora.NamekFloraMod;
import com.dragonminezaddons.namekflora.item.NamekBerryItem;
import com.dragonminezaddons.namekflora.item.SenzuBeanItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, NamekFloraMod.MOD_ID);

    public static final RegistryObject<Item> NAMEK_BERRY =
        ITEMS.register("namek_berry", () -> new NamekBerryItem(new Item.Properties()
            .stacksTo(16).food(new net.minecraft.world.food.FoodProperties.Builder()
                .nutrition(4).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SENZU_BEAN =
        ITEMS.register("senzu_bean", () -> new SenzuBeanItem(new Item.Properties()
            .stacksTo(8).food(new net.minecraft.world.food.FoodProperties.Builder()
                .nutrition(8).saturationMod(1.2f).alwaysEat().build())));
    public static final RegistryObject<Item> NAMEK_SEED =
        ITEMS.register("namek_seed", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> NAMEK_LEAF =
        ITEMS.register("namek_leaf", () -> new Item(new Item.Properties().stacksTo(64)));
}
