package com.dragonminezaddons.transformations.effect;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class GodKiEffect extends MobEffect {
    public GodKiEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x0066FF);
        addAttributeModifier(
                Attributes.ATTACK_DAMAGE,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "god_ki_attack"),
                0.5,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "god_ki_speed"),
                0.2,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        addAttributeModifier(
                Attributes.MAX_HEALTH,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "god_ki_health"),
                10.0,
                AttributeModifier.Operation.ADD_VALUE);
    }
}
