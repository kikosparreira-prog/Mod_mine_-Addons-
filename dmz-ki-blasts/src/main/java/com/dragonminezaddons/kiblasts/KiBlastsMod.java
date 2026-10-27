package com.dragonminezaddons.kiblasts;

import com.dragonminezaddons.kiblasts.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KiBlastsMod.MOD_ID)
public class KiBlastsMod {
    public static final String MOD_ID = "dmz_ki_blasts";
    public KiBlastsMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
