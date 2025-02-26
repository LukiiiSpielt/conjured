package lukiii.mods.conjured.effect;

import lukiii.mods.conjured.entity.ModEntities;
import lukiii.mods.conjured.entity.custom.GhostEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class HauntedEffect extends StatusEffect {
    protected HauntedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().isClient && entity.getWorld() instanceof ServerWorld serverWorld) {
            if (entity.getRandom().nextFloat() < 0.0025 * (amplifier + 1)) {
                BlockPos spawnPos = entity.getBlockPos().add(
                        entity.getRandom().nextBetween(-5, 5),
                        0,
                        entity.getRandom().nextBetween(-5, 5)
                );

                GhostEntity ghost = new GhostEntity(ModEntities.GHOST, serverWorld);
                ghost.refreshPositionAndAngles(spawnPos, 0, 0);
                serverWorld.spawnEntity(ghost);
            }
        }
        return super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true; // Effekt wird bei jedem Tick angewendet
    }
}
