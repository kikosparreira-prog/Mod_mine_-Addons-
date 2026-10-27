package com.dragonminezaddons.majinarts;

import com.dragonminezaddons.majinarts.init.ItemInit;
import com.dragonminezaddons.majinarts.init.EffectInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MajinArtsMod.MOD_ID)
public class MajinArtsMod {
    public static final String MOD_ID = "dmz_majin_arts";
    public MajinArtsMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        EffectInit.EFFECTS.register(bus);
    }
}
