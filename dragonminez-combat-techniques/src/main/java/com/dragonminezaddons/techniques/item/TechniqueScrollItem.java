package com.dragonminezaddons.techniques.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TechniqueScrollItem extends Item {

    private final String techniqueName;

    public TechniqueScrollItem(String techniqueName, Properties properties) {
        super(properties);
        this.techniqueName = techniqueName;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal(
                    "[DragonMineZ] Learned: " + techniqueName.replace("_", " ").toUpperCase())
                    .withStyle(ChatFormatting.AQUA));
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
