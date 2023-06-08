
package net.mcreator.ultracraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ultracraft.entity.SomethingWickedEntity;
import net.mcreator.ultracraft.client.model.Modelsomething_wicked;

public class SomethingWickedRenderer extends MobRenderer<SomethingWickedEntity, Modelsomething_wicked<SomethingWickedEntity>> {
	public SomethingWickedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsomething_wicked(context.bakeLayer(Modelsomething_wicked.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SomethingWickedEntity entity) {
		return new ResourceLocation("ultracraft:textures/entities/someting_wicked.png");
	}
}
