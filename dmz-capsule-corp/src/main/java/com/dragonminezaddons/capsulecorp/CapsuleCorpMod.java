package com.dragonminezaddons.capsulecorp;

import com.dragonminezaddons.capsulecorp.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CapsuleCorpMod.MOD_ID)
public class CapsuleCorpMod {
    public static final String MOD_ID = "dmz_capsule_corp";
    public CapsuleCorpMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
