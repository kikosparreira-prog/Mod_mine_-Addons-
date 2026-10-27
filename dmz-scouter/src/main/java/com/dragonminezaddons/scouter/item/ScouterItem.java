package com.dragonminezaddons.scouter.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.Comparator;
import java.util.List;

public class ScouterItem extends Item {
    private final double range;

    public ScouterItem(double range, Properties props) {
        super(props);
        this.range = range;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            var pos = player.position();
            var box = new AABB(pos.x - range, pos.y - range, pos.z - range,
                               pos.x + range, pos.y + range, pos.z + range);
            List<LivingEntity> targets = level.getEntitiesOfClass(LivingEntity.class, box,
                e -> e != player);
            targets.sort(Comparator.comparingDouble(e -> e.distanceToSqr(player)));
            if (!targets.isEmpty()) {
                LivingEntity target = targets.get(0);
                player.sendSystemMessage(Component.literal(
                    "§a[SCOUTER]§r Target: " + target.getName().getString() +
                    " | HP: " + String.format("%.1f", target.getHealth()) +
                    "/" + String.format("%.1f", target.getMaxHealth())));
                stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(
                    net.minecraft.world.entity.EquipmentSlot.MAINHAND));
            } else {
                player.sendSystemMessage(Component.literal("§a[SCOUTER]§r No targets in range."));
            }
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
