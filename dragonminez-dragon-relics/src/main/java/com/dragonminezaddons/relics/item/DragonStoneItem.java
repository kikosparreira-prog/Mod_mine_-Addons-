package com.dragonminezaddons.relics.item;

import com.dragonminezaddons.relics.init.EffectInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class DragonStoneItem extends Item {
    public DragonStoneItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            player.addEffect(new MobEffectInstance(EffectInit.DRAGON_POWER, 3600, 2));
            player.sendSystemMessage(Component.literal(
                "[Dragon Stone] Shenron's power flows through you!")
                .withStyle(ChatFormatting.GREEN));
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("A fragment of Shenron's power.")
                .withStyle(ChatFormatting.DARK_GREEN));
        tooltip.add(Component.literal("Collect 7 to summon the Dragon.")
                .withStyle(ChatFormatting.GRAY));
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
