package com.dragonminezaddons.transformations.init;

import com.dragonminezaddons.transformations.ExtraTransformations;
import com.dragonminezaddons.transformations.effect.GodKiEffect;
import com.dragonminezaddons.transformations.effect.UltraInstinctEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExtraTransformations.MOD_ID);

    public static final RegistryObject<MobEffect> GOD_KI_BOOST =
            MOB_EFFECTS.register("god_ki_boost", GodKiEffect::new);

    public static final RegistryObject<MobEffect> ULTRA_INSTINCT_STATE =
            MOB_EFFECTS.register("ultra_instinct_state", UltraInstinctEffect::new);
}
