package com.dragonminezaddons.tournamentarena;

import com.dragonminezaddons.tournamentarena.init.BlockInit;
import com.dragonminezaddons.tournamentarena.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TournamentArenaMod.MOD_ID)
public class TournamentArenaMod {
    public static final String MOD_ID = "dmz_tournament_arena";
    public TournamentArenaMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
}
