package com.dragonminezaddons.transformations.init;

import com.dragonminezaddons.transformations.ExtraTransformations;
import com.dragonminezaddons.transformations.effect.GodKiEffect;
import com.dragonminezaddons.transformations.effect.UltraInstinctEffect;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EffectInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ExtraTransformations.MOD_ID);

    public static final DeferredHolder<MobEffect, GodKiEffect> GOD_KI_BOOST =
            MOB_EFFECTS.register("god_ki_boost", GodKiEffect::new);

    public static final DeferredHolder<MobEffect, UltraInstinctEffect> ULTRA_INSTINCT_STATE =
            MOB_EFFECTS.register("ultra_instinct_state", UltraInstinctEffect::new);
}
