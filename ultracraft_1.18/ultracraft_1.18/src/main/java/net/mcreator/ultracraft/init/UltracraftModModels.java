
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ultracraft.client.model.Modelv2_body;
import net.mcreator.ultracraft.client.model.Modelv1_legs;
import net.mcreator.ultracraft.client.model.Modelv1_head;
import net.mcreator.ultracraft.client.model.Modelv1_body;
import net.mcreator.ultracraft.client.model.Modelswordsmachine_legs;
import net.mcreator.ultracraft.client.model.Modelswordsmachine_head;
import net.mcreator.ultracraft.client.model.Modelswordsmachine_body;
import net.mcreator.ultracraft.client.model.Modelsomething_wicked;
import net.mcreator.ultracraft.client.model.Modelminos_prime_legs;
import net.mcreator.ultracraft.client.model.Modelminos_prime_head;
import net.mcreator.ultracraft.client.model.Modelminos_prime_boss;
import net.mcreator.ultracraft.client.model.Modelminos_prime_body;
import net.mcreator.ultracraft.client.model.Modelmindflayer_legs;
import net.mcreator.ultracraft.client.model.Modelmindflayer_head;
import net.mcreator.ultracraft.client.model.Modelmindflayer_body;
import net.mcreator.ultracraft.client.model.Modelgabriel_legs;
import net.mcreator.ultracraft.client.model.Modelgabriel_head;
import net.mcreator.ultracraft.client.model.Modelgabriel_body;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UltracraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelv1_body.LAYER_LOCATION, Modelv1_body::createBodyLayer);
		event.registerLayerDefinition(Modelminos_prime_legs.LAYER_LOCATION, Modelminos_prime_legs::createBodyLayer);
		event.registerLayerDefinition(Modelsomething_wicked.LAYER_LOCATION, Modelsomething_wicked::createBodyLayer);
		event.registerLayerDefinition(Modelgabriel_legs.LAYER_LOCATION, Modelgabriel_legs::createBodyLayer);
		event.registerLayerDefinition(Modelswordsmachine_legs.LAYER_LOCATION, Modelswordsmachine_legs::createBodyLayer);
		event.registerLayerDefinition(Modelmindflayer_body.LAYER_LOCATION, Modelmindflayer_body::createBodyLayer);
		event.registerLayerDefinition(Modelmindflayer_legs.LAYER_LOCATION, Modelmindflayer_legs::createBodyLayer);
		event.registerLayerDefinition(Modelmindflayer_head.LAYER_LOCATION, Modelmindflayer_head::createBodyLayer);
		event.registerLayerDefinition(Modelminos_prime_body.LAYER_LOCATION, Modelminos_prime_body::createBodyLayer);
		event.registerLayerDefinition(Modelv1_legs.LAYER_LOCATION, Modelv1_legs::createBodyLayer);
		event.registerLayerDefinition(Modelswordsmachine_head.LAYER_LOCATION, Modelswordsmachine_head::createBodyLayer);
		event.registerLayerDefinition(Modelv2_body.LAYER_LOCATION, Modelv2_body::createBodyLayer);
		event.registerLayerDefinition(Modelminos_prime_head.LAYER_LOCATION, Modelminos_prime_head::createBodyLayer);
		event.registerLayerDefinition(Modelswordsmachine_body.LAYER_LOCATION, Modelswordsmachine_body::createBodyLayer);
		event.registerLayerDefinition(Modelminos_prime_boss.LAYER_LOCATION, Modelminos_prime_boss::createBodyLayer);
		event.registerLayerDefinition(Modelgabriel_body.LAYER_LOCATION, Modelgabriel_body::createBodyLayer);
		event.registerLayerDefinition(Modelgabriel_head.LAYER_LOCATION, Modelgabriel_head::createBodyLayer);
		event.registerLayerDefinition(Modelv1_head.LAYER_LOCATION, Modelv1_head::createBodyLayer);
	}
}
