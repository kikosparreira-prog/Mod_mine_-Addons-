package com.frisgui36.dmzcomborank;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ComboEvents {

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        LivingEntity victim = event.getEntity();
        if (victim.level().isClientSide) {
            return;
        }
        float amount = event.getAmount();
        if (amount <= 0.0F) {
            return;
        }

        if (victim instanceof ServerPlayer hurtPlayer && ComboConfig.RESET_ON_DAMAGE.get()) {
            if (ComboTracker.reset(hurtPlayer.getUUID())) {
                notifyLost(hurtPlayer);
            }
        }

        Entity source = event.getSource().getEntity();
        if (!(source instanceof ServerPlayer attacker) || attacker == victim || victim instanceof ArmorStand) {
            return;
        }

        long now = attacker.level().getGameTime();
        ComboRank before = ComboRank.forStreak(ComboTracker.currentStreak(attacker.getUUID(), now));
        double bonus = before.bonus(ComboConfig.MAX_DAMAGE_BONUS.get());
        if (bonus > 0.0D) {
            event.setAmount((float) (amount * (1.0D + bonus)));
        }

        int streak = ComboTracker.registerHit(attacker.getUUID(), now);
        ComboRank after = ComboRank.forStreak(streak);
        double afterBonus = after.bonus(ComboConfig.MAX_DAMAGE_BONUS.get());
        int percent = (int) Math.round(afterBonus * 100.0D);

        if (after.ordinal() > before.ordinal()) {
            attacker.level().playSound(null, attacker.getX(), attacker.getY(), attacker.getZ(),
                    SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS, 0.5F, 1.4F);
            attacker.displayClientMessage(
                    Component.translatable("message.dmzcomborank.rank_up", after.label(), percent), true);
        } else if (ComboConfig.SHOW_ACTIONBAR.get() && after != ComboRank.NONE) {
            attacker.displayClientMessage(
                    Component.translatable("message.dmzcomborank.combo", streak, after.label(), percent), true);
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END || !(event.player instanceof ServerPlayer player)) {
            return;
        }
        if (player.tickCount % 10 != 0) {
            return;
        }
        if (ComboTracker.expire(player.getUUID(), player.level().getGameTime())) {
            notifyLost(player);
        }
    }

    @SubscribeEvent
    public void onLivingDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            ComboTracker.reset(player.getUUID());
        }
    }

    @SubscribeEvent
    public void onLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        ComboTracker.remove(event.getEntity().getUUID());
    }

    private static void notifyLost(ServerPlayer player) {
        if (ComboConfig.SHOW_ACTIONBAR.get()) {
            player.displayClientMessage(Component.translatable("message.dmzcomborank.lost"), true);
        }
    }
}
