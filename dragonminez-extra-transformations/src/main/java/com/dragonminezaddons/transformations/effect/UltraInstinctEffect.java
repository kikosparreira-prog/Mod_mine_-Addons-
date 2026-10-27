package com.dragonminezaddons.transformations.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class UltraInstinctEffect extends MobEffect {

    public UltraInstinctEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFFFFFF);
        addAttributeModifier(Attributes.ATTACK_DAMAGE,
                "b2c3d4e5-1111-2222-3333-000000000001", 1.0,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.MOVEMENT_SPEED,
                "b2c3d4e5-1111-2222-3333-000000000002", 0.4,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.ARMOR,
                "b2c3d4e5-1111-2222-3333-000000000003", 8.0,
                AttributeModifier.Operation.ADDITION);
        addAttributeModifier(Attributes.ATTACK_SPEED,
                "b2c3d4e5-1111-2222-3333-000000000004", 0.5,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
