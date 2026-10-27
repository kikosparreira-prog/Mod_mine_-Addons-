package com.dragonminezaddons.transformations;

import com.dragonminezaddons.transformations.init.EffectInit;
import com.dragonminezaddons.transformations.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraTransformations.MOD_ID)
public class ExtraTransformations {

    public static final String MOD_ID = "dmz_transformations";

    public ExtraTransformations() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(modEventBus);
        EffectInit.MOB_EFFECTS.register(modEventBus);
    }
}
