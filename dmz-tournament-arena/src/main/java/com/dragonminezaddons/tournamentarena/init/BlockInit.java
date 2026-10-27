package com.dragonminezaddons.tournamentarena.init;

import com.dragonminezaddons.tournamentarena.TournamentArenaMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, TournamentArenaMod.MOD_ID);

    public static final RegistryObject<Block> ARENA_FLOOR =
        BLOCKS.register("arena_floor", () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE).strength(3.0f, 6.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARENA_WALL =
        BLOCKS.register("arena_wall", () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE).strength(4.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARENA_PILLAR =
        BLOCKS.register("arena_pillar", () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.QUARTZ).strength(5.0f, 10.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
}
