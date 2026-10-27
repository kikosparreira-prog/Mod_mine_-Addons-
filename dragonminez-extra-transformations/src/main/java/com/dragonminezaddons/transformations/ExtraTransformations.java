package com.dragonminezaddons.transformations;

import com.dragonminezaddons.transformations.init.EffectInit;
import com.dragonminezaddons.transformations.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ExtraTransformations.MOD_ID)
public class ExtraTransformations {
    public static final String MOD_ID = "dmz_transformations";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtraTransformations(IEventBus modEventBus) {
        ItemInit.ITEMS.register(modEventBus);
        EffectInit.MOB_EFFECTS.register(modEventBus);
        LOGGER.info("[DragonMineZ: Extra Transformations] Loaded successfully.");
    }
}
