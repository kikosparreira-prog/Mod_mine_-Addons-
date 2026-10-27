package com.dragonminezaddons.spiritpower.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class SpiritBombItem extends Item {
    public SpiritBombItem(Properties props) { super(props); }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            var pos = player.position();
            var box = new AABB(pos.x - 8, pos.y - 4, pos.z - 8, pos.x + 8, pos.y + 4, pos.z + 8);
            List<LivingEntity> targets = level.getEntitiesOfClass(LivingEntity.class, box, e -> e != player);
            for (LivingEntity target : targets) {
                target.hurt(level.damageSources().playerAttack(player), 40.0f);
            }
            level.createExplosion(player, pos.x, pos.y, pos.z, 2.0f, false,
                Level.ExplosionInteraction.NONE);
            stack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public boolean isFoil(ItemStack stack) { return true; }
}
