package com.dragonminezaddons.relics.item;

import com.dragonminezaddons.relics.init.EffectInit;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class EnhancedSenzuBeanItem extends Item {
    public EnhancedSenzuBeanItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);
        if (!level.isClientSide()) {
            entity.setHealth(entity.getMaxHealth());
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 3));
            entity.addEffect(new MobEffectInstance(EffectInit.DRAGON_POWER, 600, 0));
        }
        return result;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Fully restores health and grants temporary buffs.")
                .withStyle(net.minecraft.ChatFormatting.GREEN));
    }
}
