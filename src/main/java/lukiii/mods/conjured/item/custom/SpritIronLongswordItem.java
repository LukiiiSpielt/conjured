package lukiii.mods.conjured.item.custom;

import lukiii.mods.conjured.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SpritIronLongswordItem extends SwordItem {
    public SpritIronLongswordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    public boolean postHit (ItemStack stack, LivingEntity target, LivingEntity attacker) {

            target.addStatusEffect(new StatusEffectInstance(ModEffects.HAUNTED, 200, 0));



        return super.postHit(stack, target, attacker);
    }


}
