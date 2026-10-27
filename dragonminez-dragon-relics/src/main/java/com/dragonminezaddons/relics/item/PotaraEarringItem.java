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

public class PotaraEarringItem extends Item {
    public enum Side { LEFT, RIGHT }

    private final Side side;

    public PotaraEarringItem(Side side, Properties properties) {
        super(properties);
        this.side = side;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            player.addEffect(new MobEffectInstance(EffectInit.DRAGON_POWER, 2400, 1));
            player.sendSystemMessage(Component.literal(
                "[Potara] The earring glows with divine power!").withStyle(ChatFormatting.YELLOW));
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Side: " + side.name())
                .withStyle(side == Side.LEFT ? ChatFormatting.GOLD : ChatFormatting.LIGHT_PURPLE));
        tooltip.add(Component.literal("Wear both earrings to unlock full potential.")
                .withStyle(ChatFormatting.GRAY));
    }
}
