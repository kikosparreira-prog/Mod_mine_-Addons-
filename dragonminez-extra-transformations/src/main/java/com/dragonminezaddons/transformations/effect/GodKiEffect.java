package com.dragonminezaddons.transformations.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class GodKiEffect extends MobEffect {

    public GodKiEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x00AAFF);
        addAttributeModifier(Attributes.ATTACK_DAMAGE,
                "a1b2c3d4-1111-2222-3333-000000000001", 0.5,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.MOVEMENT_SPEED,
                "a1b2c3d4-1111-2222-3333-000000000002", 0.2,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.MAX_HEALTH,
                "a1b2c3d4-1111-2222-3333-000000000003", 10.0,
                AttributeModifier.Operation.ADDITION);
    }
}
