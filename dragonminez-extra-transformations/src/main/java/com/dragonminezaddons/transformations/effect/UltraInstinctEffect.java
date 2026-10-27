package com.dragonminezaddons.transformations.effect;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class UltraInstinctEffect extends MobEffect {
    public UltraInstinctEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xCCCCFF);
        addAttributeModifier(
                Attributes.ATTACK_DAMAGE,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "ui_attack"),
                1.0,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "ui_speed"),
                0.4,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        addAttributeModifier(
                Attributes.ARMOR,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "ui_armor"),
                8.0,
                AttributeModifier.Operation.ADD_VALUE);
        addAttributeModifier(
                Attributes.ATTACK_SPEED,
                ResourceLocation.fromNamespaceAndPath("dmz_transformations", "ui_attack_speed"),
                0.5,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
