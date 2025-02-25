package lukiii.mods.conjured.entity;

import lukiii.mods.conjured.Conjured;
import lukiii.mods.conjured.entity.custom.GhostEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<GhostEntity> GHOST = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Conjured.MOD_ID, "ghost"),
            EntityType.Builder.create(GhostEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.6F, 1.95F).build());


    public static void registerModEntities() {
        FabricDefaultAttributeRegistry.register(GHOST, GhostEntity.createGhostAttributes());
    }
}
