package com.dragonminezaddons.relics.init;

import com.dragonminezaddons.relics.DragonMineZRelics;
import com.dragonminezaddons.relics.block.TimeChamberCoreBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DragonMineZRelics.MOD_ID);

    public static final RegistryObject<Block> TIME_CHAMBER_CORE = BLOCKS.register("time_chamber_core",
            () -> new TimeChamberCoreBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .strength(50.0f, 1200.0f)
                    .lightLevel(state -> 15)));
}
