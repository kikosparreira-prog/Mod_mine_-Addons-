package com.dragonminezaddons.scouter;

import com.dragonminezaddons.scouter.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ScouterMod.MOD_ID)
public class ScouterMod {
    public static final String MOD_ID = "dmz_scouter";
    public ScouterMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
