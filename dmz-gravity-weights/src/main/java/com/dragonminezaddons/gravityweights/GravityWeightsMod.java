package com.dragonminezaddons.gravityweights;

import com.dragonminezaddons.gravityweights.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GravityWeightsMod.MOD_ID)
public class GravityWeightsMod {
    public static final String MOD_ID = "dmz_gravity_weights";
    public GravityWeightsMod() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
