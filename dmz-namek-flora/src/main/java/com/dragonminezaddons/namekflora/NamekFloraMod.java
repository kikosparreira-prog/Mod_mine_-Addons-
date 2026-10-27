package com.dragonminezaddons.namekflora;

import com.dragonminezaddons.namekflora.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NamekFloraMod.MOD_ID)
public class NamekFloraMod {
    public static final String MOD_ID = "dmz_namek_flora";
    public NamekFloraMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
