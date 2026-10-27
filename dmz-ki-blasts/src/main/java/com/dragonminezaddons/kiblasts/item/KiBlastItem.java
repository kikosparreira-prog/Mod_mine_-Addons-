package com.dragonminezaddons.kiblasts.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class KiBlastItem extends Item {
    private final float damage;
    private final float range;

    public KiBlastItem(float damage, float range, Properties props) {
        super(props);
        this.damage = damage;
        this.range = range;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            var result = player.pick(range, 1.0f, false);
            if (result.getType() == HitResult.Type.ENTITY) {
                var entityHit = (EntityHitResult) result;
                if (entityHit.getEntity() instanceof LivingEntity target) {
                    target.hurt(level.damageSources().playerAttack(player), damage);
                }
            }
            stack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
