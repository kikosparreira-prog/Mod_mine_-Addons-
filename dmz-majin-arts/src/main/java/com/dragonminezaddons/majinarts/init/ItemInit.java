package com.dragonminezaddons.majinarts.init;

import com.dragonminezaddons.majinarts.MajinArtsMod;
import com.dragonminezaddons.majinarts.item.MajinTabletItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MajinArtsMod.MOD_ID);

    public static final RegistryObject<Item> MAJIN_TABLET =
        ITEMS.register("majin_tablet", () -> new MajinTabletItem(new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> BABIDI_WAND =
        ITEMS.register("babidi_wand", () -> new MajinTabletItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINK_ENERGY_CRYSTAL =
        ITEMS.register("pink_energy_crystal", () -> new Item(new Item.Properties().stacksTo(16)));
}
