package com.dragonminezaddons.relics.init;

import com.dragonminezaddons.relics.DragonMineZRelics;
import com.dragonminezaddons.relics.effect.DragonPowerEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DragonMineZRelics.MOD_ID);

    public static final RegistryObject<MobEffect> DRAGON_POWER =
            MOB_EFFECTS.register("dragon_power", DragonPowerEffect::new);
}
