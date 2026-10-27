package com.dragonminezaddons.androidchips;

import com.dragonminezaddons.androidchips.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AndroidChipsMod.MOD_ID)
public class AndroidChipsMod {
    public static final String MOD_ID = "dmz_android_chips";
    public AndroidChipsMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
