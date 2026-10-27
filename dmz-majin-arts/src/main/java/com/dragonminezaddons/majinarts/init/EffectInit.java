package com.dragonminezaddons.majinarts.init;

import com.dragonminezaddons.majinarts.MajinArtsMod;
import com.dragonminezaddons.majinarts.effect.MajinRageEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {
    public static final DeferredRegister<MobEffect> EFFECTS =
        DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MajinArtsMod.MOD_ID);

    public static final RegistryObject<MobEffect> MAJIN_RAGE =
        EFFECTS.register("majin_rage", MajinRageEffect::new);
}
