package com.dragonminezaddons.relics;

import com.dragonminezaddons.relics.init.BlockInit;
import com.dragonminezaddons.relics.init.EffectInit;
import com.dragonminezaddons.relics.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DragonMineZRelics.MOD_ID)
public class DragonMineZRelics {
    public static final String MOD_ID = "dmz_relics";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DragonMineZRelics(IEventBus modEventBus) {
        BlockInit.BLOCKS.register(modEventBus);
        EffectInit.MOB_EFFECTS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        LOGGER.info("[DragonMineZ: Dragon Relics] Loaded successfully.");
    }
}
