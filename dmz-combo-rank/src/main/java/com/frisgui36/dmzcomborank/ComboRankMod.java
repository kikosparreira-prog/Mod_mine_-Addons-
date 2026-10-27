package com.frisgui36.dmzcomborank;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(ComboRankMod.MOD_ID)
public class ComboRankMod {

    public static final String MOD_ID = "dmzcomborank";

    public ComboRankMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ComboConfig.SPEC);
        MinecraftForge.EVENT_BUS.register(new ComboEvents());
    }
}
