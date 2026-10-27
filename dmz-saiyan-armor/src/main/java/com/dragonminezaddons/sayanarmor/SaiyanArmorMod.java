package com.dragonminezaddons.sayanarmor;

import com.dragonminezaddons.sayanarmor.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SaiyanArmorMod.MOD_ID)
public class SaiyanArmorMod {
    public static final String MOD_ID = "dmz_saiyan_armor";
    public SaiyanArmorMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
    }
}
