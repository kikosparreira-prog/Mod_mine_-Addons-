package com.dragonminezaddons.scouter.init;

import com.dragonminezaddons.scouter.ScouterMod;
import com.dragonminezaddons.scouter.item.ScouterItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, ScouterMod.MOD_ID);

    public static final RegistryObject<Item> GREEN_SCOUTER =
        ITEMS.register("green_scouter", () -> new ScouterItem(10, new Item.Properties().stacksTo(1).durability(200)));
    public static final RegistryObject<Item> RED_SCOUTER =
        ITEMS.register("red_scouter", () -> new ScouterItem(20, new Item.Properties().stacksTo(1).durability(400)));
    public static final RegistryObject<Item> BLUE_SCOUTER =
        ITEMS.register("blue_scouter", () -> new ScouterItem(30, new Item.Properties().stacksTo(1).durability(800)));
}
