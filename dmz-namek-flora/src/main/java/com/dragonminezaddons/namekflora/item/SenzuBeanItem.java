package com.dragonminezaddons.namekflora.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SenzuBeanItem extends Item {
    public SenzuBeanItem(Properties props) { super(props); }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);
        if (!level.isClientSide && entity instanceof Player player) {
            player.setHealth(player.getMaxHealth());
            player.getFoodData().eat(20, 1.0f);
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 2));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3));
        }
        return result;
    }
}
