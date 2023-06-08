
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UltracraftModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("ultracraft", "rev_charge_shoot"), new SoundEvent(new ResourceLocation("ultracraft", "rev_charge_shoot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "rev_shoot"), new SoundEvent(new ResourceLocation("ultracraft", "rev_shoot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "slide"), new SoundEvent(new ResourceLocation("ultracraft", "slide")));
		REGISTRY.put(new ResourceLocation("ultracraft", "railcannon_electric_shoot"),
				new SoundEvent(new ResourceLocation("ultracraft", "railcannon_electric_shoot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "shotgun_shoot"), new SoundEvent(new ResourceLocation("ultracraft", "shotgun_shoot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "core_eject"), new SoundEvent(new ResourceLocation("ultracraft", "core_eject")));
		REGISTRY.put(new ResourceLocation("ultracraft", "coin_flip"), new SoundEvent(new ResourceLocation("ultracraft", "coin_flip")));
		REGISTRY.put(new ResourceLocation("ultracraft", "nailgun_shot"), new SoundEvent(new ResourceLocation("ultracraft", "nailgun_shot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "nailgun_shot_overheat"),
				new SoundEvent(new ResourceLocation("ultracraft", "nailgun_shot_overheat")));
		REGISTRY.put(new ResourceLocation("ultracraft", "nailgun_spin"), new SoundEvent(new ResourceLocation("ultracraft", "nailgun_spin")));
		REGISTRY.put(new ResourceLocation("ultracraft", "shotgun_pump"), new SoundEvent(new ResourceLocation("ultracraft", "shotgun_pump")));
		REGISTRY.put(new ResourceLocation("ultracraft", "railcannon_red_shoot"),
				new SoundEvent(new ResourceLocation("ultracraft", "railcannon_red_shoot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "something_wicked"), new SoundEvent(new ResourceLocation("ultracraft", "something_wicked")));
		REGISTRY.put(new ResourceLocation("ultracraft", "rocket_launcher_shot"),
				new SoundEvent(new ResourceLocation("ultracraft", "rocket_launcher_shot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "rocket_launcher_freeze"),
				new SoundEvent(new ResourceLocation("ultracraft", "rocket_launcher_freeze")));
		REGISTRY.put(new ResourceLocation("ultracraft", "bonus_break"), new SoundEvent(new ResourceLocation("ultracraft", "bonus_break")));
		REGISTRY.put(new ResourceLocation("ultracraft", "railcannon_green_shoot"),
				new SoundEvent(new ResourceLocation("ultracraft", "railcannon_green_shoot")));
		REGISTRY.put(new ResourceLocation("ultracraft", "enrage"), new SoundEvent(new ResourceLocation("ultracraft", "enrage")));
		REGISTRY.put(new ResourceLocation("ultracraft", "chainsaw_swing"), new SoundEvent(new ResourceLocation("ultracraft", "chainsaw_swing")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_crush"), new SoundEvent(new ResourceLocation("ultracraft", "mp_crush")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_hurt"), new SoundEvent(new ResourceLocation("ultracraft", "mp_hurt")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_die"), new SoundEvent(new ResourceLocation("ultracraft", "mp_die")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_judgement"), new SoundEvent(new ResourceLocation("ultracraft", "mp_judgement")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_prepare"), new SoundEvent(new ResourceLocation("ultracraft", "mp_prepare")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_thyend"), new SoundEvent(new ResourceLocation("ultracraft", "mp_thyend")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_weak"), new SoundEvent(new ResourceLocation("ultracraft", "mp_weak")));
		REGISTRY.put(new ResourceLocation("ultracraft", "mp_death"), new SoundEvent(new ResourceLocation("ultracraft", "mp_death")));
		REGISTRY.put(new ResourceLocation("ultracraft", "gab_fuck"), new SoundEvent(new ResourceLocation("ultracraft", "gab_fuck")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
