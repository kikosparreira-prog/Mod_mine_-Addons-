package com.dragonminezaddons.techniques.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class TrainingDummyBlock extends Block {
    private static final int TRAINING_COOLDOWN = 200;

    public TrainingDummyBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level,
                                               BlockPos pos, Player player,
                                               BlockHitResult hit) {
        if (!level.isClientSide()) {
            int xp = 1 + (int)(Math.random() * 3);
            player.giveExperiencePoints(xp);
            player.sendSystemMessage(Component.literal(
                "[Training] You trained with the dummy and gained " + xp + " XP!")
                .withStyle(ChatFormatting.GREEN));
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }
}
