package com.dragonminezaddons.spiritpower;

import com.dragonminezaddons.spiritpower.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SpiritPowerMod.MOD_ID)
public class SpiritPowerMod {
    public static final String MOD_ID = "dmz_spirit_power";
    public SpiritPowerMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
