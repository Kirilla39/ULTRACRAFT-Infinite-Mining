
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ultracraft.client.renderer.SomethingWickedRenderer;
import net.mcreator.ultracraft.client.renderer.MinosPrimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UltracraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UltracraftModEntities.SOMETHING_WICKED.get(), SomethingWickedRenderer::new);
		event.registerEntityRenderer(UltracraftModEntities.MINOS_PRIME.get(), MinosPrimeRenderer::new);
		event.registerEntityRenderer(UltracraftModEntities.BULLET_TEXTURE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(UltracraftModEntities.RAILBULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(UltracraftModEntities.BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(UltracraftModEntities.HEAL_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(UltracraftModEntities.RAILBULLET_EXPL.get(), ThrownItemRenderer::new);
	}
}
