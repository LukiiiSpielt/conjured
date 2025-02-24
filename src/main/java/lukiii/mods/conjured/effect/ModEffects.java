package lukiii.mods.conjured.effect;

import lukiii.mods.conjured.Conjured;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> SPECTRAL_SIGHT = registerStatusEffect("spectral_sight",
            new SpectralSightEffect(StatusEffectCategory.NEUTRAL, 7442081));




    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Conjured.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {

    }
}
