package com.dragonminezaddons.relics.item;

import com.dragonminezaddons.relics.init.EffectInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PotaraEarringItem extends Item {

    public enum Side { LEFT, RIGHT }

    private final Side side;

    public PotaraEarringItem(Side side, Properties properties) {
        super(properties);
        this.side = side;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            player.addEffect(new MobEffectInstance(EffectInit.DRAGON_POWER.get(), 2400, 1));
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
