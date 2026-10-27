package com.dragonminezaddons.techniques;

import com.dragonminezaddons.techniques.init.BlockInit;
import com.dragonminezaddons.techniques.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DragonMineZTechniques.MOD_ID)
public class DragonMineZTechniques {

    public static final String MOD_ID = "dmz_techniques";

    public DragonMineZTechniques() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
    }
}
