package com.dragonminezaddons.tournamentarena.init;

import com.dragonminezaddons.tournamentarena.TournamentArenaMod;
import com.dragonminezaddons.tournamentarena.item.TrophyItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TournamentArenaMod.MOD_ID);

    public static final RegistryObject<Item> ARENA_FLOOR_ITEM =
        ITEMS.register("arena_floor", () -> new BlockItem(BlockInit.ARENA_FLOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ARENA_WALL_ITEM =
        ITEMS.register("arena_wall", () -> new BlockItem(BlockInit.ARENA_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ARENA_PILLAR_ITEM =
        ITEMS.register("arena_pillar", () -> new BlockItem(BlockInit.ARENA_PILLAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_TROPHY =
        ITEMS.register("gold_trophy", () -> new TrophyItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WORLD_MARTIAL_ARTS_BELT =
        ITEMS.register("world_martial_arts_belt", () -> new TrophyItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TOURNAMENT_MEDALLION =
        ITEMS.register("tournament_medallion", () -> new Item(new Item.Properties().stacksTo(4)));
}
