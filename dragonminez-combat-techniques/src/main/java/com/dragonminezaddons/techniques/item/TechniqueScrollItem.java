package com.dragonminezaddons.techniques.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class TechniqueScrollItem extends Item {
    private final String techniqueName;

    public TechniqueScrollItem(String techniqueName, Properties properties) {
        super(properties);
        this.techniqueName = techniqueName;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal(
                "[DragonMineZ Techniques] Learned: " + techniqueName.replace("_", " ")
                    .toUpperCase()).withStyle(ChatFormatting.AQUA));
            if (!player.getAbilities().instabuild) stack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Technique: " + techniqueName.replace("_", " "))
                .withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.literal("Right-click to learn this technique.")
                .withStyle(ChatFormatting.GRAY));
    }

    public String getTechniqueName() {
        return techniqueName;
    }
}
