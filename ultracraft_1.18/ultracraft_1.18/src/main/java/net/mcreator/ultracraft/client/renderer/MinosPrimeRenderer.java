
package net.mcreator.ultracraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ultracraft.entity.MinosPrimeEntity;
import net.mcreator.ultracraft.client.model.Modelminos_prime_boss;

public class MinosPrimeRenderer extends MobRenderer<MinosPrimeEntity, Modelminos_prime_boss<MinosPrimeEntity>> {
	public MinosPrimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminos_prime_boss(context.bakeLayer(Modelminos_prime_boss.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinosPrimeEntity entity) {
		return new ResourceLocation("ultracraft:textures/entities/minos_prime_boss.png");
	}
}
