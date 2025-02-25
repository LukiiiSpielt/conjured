package lukiii.mods.client.entity;

import lukiii.mods.conjured.entity.custom.GhostEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.Frustum;

public class GhostEntityRenderer extends EntityRenderer<GhostEntity> {

    public GhostEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(GhostEntity entity) {
        return null;
    }

    @Override
    public boolean shouldRender(GhostEntity entity, Frustum frustum, double x, double y, double z) {
        return false;


    }
}
