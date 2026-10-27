package com.dragonminezaddons.techniques.init;

import com.dragonminezaddons.techniques.DragonMineZTechniques;
import com.dragonminezaddons.techniques.block.TrainingDummyBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DragonMineZTechniques.MOD_ID);

    public static final RegistryObject<Block> TRAINING_DUMMY = BLOCKS.register("training_dummy",
            () -> new TrainingDummyBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(3.0f, 6.0f)));
}
