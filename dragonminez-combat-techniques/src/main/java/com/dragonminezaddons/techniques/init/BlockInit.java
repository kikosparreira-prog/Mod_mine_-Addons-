package com.dragonminezaddons.techniques.init;

import com.dragonminezaddons.techniques.DragonMineZTechniques;
import com.dragonminezaddons.techniques.block.TrainingDummyBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DragonMineZTechniques.MOD_ID);

    public static final DeferredBlock<TrainingDummyBlock> TRAINING_DUMMY =
            BLOCKS.register("training_dummy",
                    () -> new TrainingDummyBlock(BlockBehaviour.Properties.of()
                            .strength(3.0f, 6.0f)
                            .sound(SoundType.WOOD)
                            .noOcclusion()));
}
