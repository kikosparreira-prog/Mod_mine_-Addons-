package com.dragonminezaddons.transformations.init;

import com.dragonminezaddons.transformations.ExtraTransformations;
import com.dragonminezaddons.transformations.item.TransformationItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraTransformations.MOD_ID);

    public static final RegistryObject<Item> GOD_KI_CRYSTAL =
            ITEMS.register("god_ki_crystal", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ULTRA_INSTINCT_FRAGMENT =
            ITEMS.register("ultra_instinct_fragment", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> SSJ4_AWAKENING_STONE =
            ITEMS.register("ssj4_awakening_stone", () -> new Item(new Item.Properties().stacksTo(8)));

    public static final RegistryObject<Item> SSGSS_CATALYST =
            ITEMS.register("ssgss_catalyst", () -> new Item(new Item.Properties().stacksTo(8)));

    public static final RegistryObject<Item> TRANSFORMATION_SCROLL =
            ITEMS.register("transformation_scroll", () -> new TransformationItem(new Item.Properties().stacksTo(1)));
}
