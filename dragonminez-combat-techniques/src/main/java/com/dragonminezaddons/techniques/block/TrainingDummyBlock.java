package com.dragonminezaddons.techniques.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class TrainingDummyBlock extends Block {

    public TrainingDummyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                  InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            int xp = 1 + level.random.nextInt(3);
            player.giveExperiencePoints(xp);
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
