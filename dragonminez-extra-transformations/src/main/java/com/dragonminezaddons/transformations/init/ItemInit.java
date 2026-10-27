package com.dragonminezaddons.transformations.init;

import com.dragonminezaddons.transformations.ExtraTransformations;
import com.dragonminezaddons.transformations.item.TransformationItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ExtraTransformations.MOD_ID);

    public static final DeferredItem<Item> GOD_KI_CRYSTAL =
            ITEMS.registerSimpleItem("god_ki_crystal",
                    new Item.Properties().stacksTo(16));

    public static final DeferredItem<Item> ULTRA_INSTINCT_FRAGMENT =
            ITEMS.registerSimpleItem("ultra_instinct_fragment",
                    new Item.Properties().stacksTo(16));

    public static final DeferredItem<Item> SSJ4_AWAKENING_STONE =
            ITEMS.registerSimpleItem("ssj4_awakening_stone",
                    new Item.Properties().stacksTo(8));

    public static final DeferredItem<Item> SSGSS_CATALYST =
            ITEMS.registerSimpleItem("ssgss_catalyst",
                    new Item.Properties().stacksTo(8));

    public static final DeferredItem<TransformationItem> TRANSFORMATION_SCROLL =
            ITEMS.register("transformation_scroll",
                    () -> new TransformationItem(new Item.Properties().stacksTo(1)));
}
