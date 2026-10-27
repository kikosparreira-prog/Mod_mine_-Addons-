package com.dragonminezaddons.kiblasts.init;

import com.dragonminezaddons.kiblasts.KiBlastsMod;
import com.dragonminezaddons.kiblasts.item.KiBlastItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, KiBlastsMod.MOD_ID);

    public static final RegistryObject<Item> KI_BLAST =
        ITEMS.register("ki_blast", () -> new KiBlastItem(8.0f, 5.0f, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SUPER_KI_BLAST =
        ITEMS.register("super_ki_blast", () -> new KiBlastItem(16.0f, 8.0f, new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> KAMEHAMEHA_CHARGE =
        ITEMS.register("kamehameha_charge", () -> new KiBlastItem(30.0f, 12.0f, new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> FINAL_FLASH_CHARGE =
        ITEMS.register("final_flash_charge", () -> new KiBlastItem(50.0f, 15.0f, new Item.Properties().stacksTo(2)));
}
