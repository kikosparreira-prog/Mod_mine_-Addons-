package com.dragonminezaddons.relics.init;

import com.dragonminezaddons.relics.DragonMineZRelics;
import com.dragonminezaddons.relics.block.TimeChamberCoreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DragonMineZRelics.MOD_ID);

    public static final DeferredBlock<TimeChamberCoreBlock> TIME_CHAMBER_CORE =
            BLOCKS.register("time_chamber_core",
                    () -> new TimeChamberCoreBlock(BlockBehaviour.Properties.of()
                            .strength(50.0f, 1200.0f)
                            .sound(SoundType.GLASS)
                            .lightLevel(state -> 15)
                            .noOcclusion()));
}
