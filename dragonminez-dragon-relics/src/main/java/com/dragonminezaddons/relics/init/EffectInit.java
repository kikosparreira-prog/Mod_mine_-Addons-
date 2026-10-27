package com.dragonminezaddons.relics.init;

import com.dragonminezaddons.relics.DragonMineZRelics;
import com.dragonminezaddons.relics.effect.DragonPowerEffect;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EffectInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, DragonMineZRelics.MOD_ID);

    public static final DeferredHolder<MobEffect, DragonPowerEffect> DRAGON_POWER =
            MOB_EFFECTS.register("dragon_power", DragonPowerEffect::new);
}
