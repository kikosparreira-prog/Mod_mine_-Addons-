package com.dragonminezaddons.relics.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class DragonPowerEffect extends MobEffect {

    public DragonPowerEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF6600);
        addAttributeModifier(Attributes.ATTACK_DAMAGE,
                "c3d4e5f6-1111-2222-3333-000000000001", 0.75,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.MAX_HEALTH,
                "c3d4e5f6-1111-2222-3333-000000000002", 20.0,
                AttributeModifier.Operation.ADDITION);
        addAttributeModifier(Attributes.MOVEMENT_SPEED,
                "c3d4e5f6-1111-2222-3333-000000000003", 0.3,
                AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.ARMOR,
                "c3d4e5f6-1111-2222-3333-000000000004", 10.0,
                AttributeModifier.Operation.ADDITION);
    }
}
