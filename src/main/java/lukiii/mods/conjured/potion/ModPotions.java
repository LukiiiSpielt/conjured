package lukiii.mods.conjured.potion;

import lukiii.mods.conjured.Conjured;
import lukiii.mods.conjured.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

        public static final RegistryEntry<Potion> HAUNTED_POTION = registerPotion("haunted_potion",
                new Potion(new StatusEffectInstance(ModEffects.HAUNTED, 3600, 0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Conjured.MOD_ID, name), potion);
    }

    public static void registerPotions(){

    }
}
