package com.dragonminezaddons.majinarts.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class MajinRageEffect extends MobEffect {
    public MajinRageEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF69B4);
        addAttributeModifier(Attributes.ATTACK_DAMAGE,
            "b2c3d4e5-2222-3333-4444-000000000001", 0.8,
            AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.MAX_HEALTH,
            "b2c3d4e5-2222-3333-4444-000000000002", 20.0,
            AttributeModifier.Operation.ADDITION);
    }
}
