package com.dragonminezaddons.techniques;

import com.dragonminezaddons.techniques.init.BlockInit;
import com.dragonminezaddons.techniques.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DragonMineZTechniques.MOD_ID)
public class DragonMineZTechniques {
    public static final String MOD_ID = "dmz_techniques";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DragonMineZTechniques(IEventBus modEventBus) {
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        LOGGER.info("[DragonMineZ: Combat Techniques] Loaded successfully.");
    }
}
