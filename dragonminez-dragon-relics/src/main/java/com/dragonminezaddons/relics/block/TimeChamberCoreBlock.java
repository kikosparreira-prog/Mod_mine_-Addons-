package com.dragonminezaddons.relics.block;

import com.dragonminezaddons.relics.init.EffectInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class TimeChamberCoreBlock extends Block {
    public TimeChamberCoreBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level,
                                               BlockPos pos, Player player,
                                               BlockHitResult hit) {
        if (!level.isClientSide()) {
            player.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 12000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 12000, 2));
            player.addEffect(new MobEffectInstance(EffectInit.DRAGON_POWER, 6000, 0));
            player.sendSystemMessage(Component.literal(
                "[Hyperbolic Time Chamber] You have entered the chamber. Time flows differently here...")
                .withStyle(ChatFormatting.LIGHT_PURPLE));
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }
}
