package com.dragonminezaddons.relics.item;

import com.dragonminezaddons.relics.init.EffectInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnhancedSenzuBeanItem extends Item {

    public EnhancedSenzuBeanItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);
        if (!level.isClientSide && entity instanceof Player player) {
            player.setHealth(player.getMaxHealth());
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 3));
            player.addEffect(new MobEffectInstance(EffectInit.DRAGON_POWER.get(), 1200, 0));
        }
        return result;
    }
}
