package com.dragonminezaddons.spiritpower.init;

import com.dragonminezaddons.spiritpower.SpiritPowerMod;
import com.dragonminezaddons.spiritpower.item.SpiritOrbItem;
import com.dragonminezaddons.spiritpower.item.SpiritBombItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, SpiritPowerMod.MOD_ID);

    public static final RegistryObject<Item> SPIRIT_ORB =
        ITEMS.register("spirit_orb", () -> new SpiritOrbItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> CHARGED_SPIRIT_ORB =
        ITEMS.register("charged_spirit_orb", () -> new SpiritOrbItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SPIRIT_BOMB =
        ITEMS.register("spirit_bomb", () -> new SpiritBombItem(new Item.Properties().stacksTo(1)));
}
