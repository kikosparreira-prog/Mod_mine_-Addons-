package com.dragonminezaddons.relics.effect;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class DragonPowerEffect extends MobEffect {
    public DragonPowerEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x00FF88);
        addAttributeModifier(
                Attributes.ATTACK_DAMAGE,
                ResourceLocation.fromNamespaceAndPath("dmz_relics", "dragon_power_attack"),
                0.75,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        addAttributeModifier(
                Attributes.MAX_HEALTH,
                ResourceLocation.fromNamespaceAndPath("dmz_relics", "dragon_power_health"),
                20.0,
                AttributeModifier.Operation.ADD_VALUE);
        addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                ResourceLocation.fromNamespaceAndPath("dmz_relics", "dragon_power_speed"),
                0.3,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        addAttributeModifier(
                Attributes.ARMOR,
                ResourceLocation.fromNamespaceAndPath("dmz_relics", "dragon_power_armor"),
                10.0,
                AttributeModifier.Operation.ADD_VALUE);
    }
}
