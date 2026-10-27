package com.dragonminezaddons.gravityweights.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WeightItem extends Item {
    private final int slowness;
    private final int fatigue;

    public WeightItem(int slowness, int fatigue, Properties props) {
        super(props);
        this.slowness = slowness;
        this.fatigue = fatigue;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 6000, slowness - 1, false, true));
            if (fatigue > 0) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 6000, fatigue - 1, false, true));
            }
            player.displayClientMessage(
                net.minecraft.network.chat.Component.literal("Training with gravity weights..."), true);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
