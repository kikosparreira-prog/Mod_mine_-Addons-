package com.dragonminezaddons.relics;

import com.dragonminezaddons.relics.init.BlockInit;
import com.dragonminezaddons.relics.init.EffectInit;
import com.dragonminezaddons.relics.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DragonMineZRelics.MOD_ID)
public class DragonMineZRelics {

    public static final String MOD_ID = "dmz_relics";

    public DragonMineZRelics() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(modEventBus);
        EffectInit.MOB_EFFECTS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
    }
}
