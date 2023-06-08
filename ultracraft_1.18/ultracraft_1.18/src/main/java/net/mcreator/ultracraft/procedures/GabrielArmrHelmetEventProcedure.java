package net.mcreator.ultracraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GabrielArmrHelmetEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0, (false), (false)));
		if (!entity.isOnGround()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5, (false), (false)));
		}
		if (entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LEVITATION);
		}
		if (entity.getPersistentData().getDouble("ModNameGab") == 0) {
			entity.getPersistentData().putDouble("ModNameGab", 70);
		} else {
			entity.getPersistentData().putDouble("ModNameGab", (entity.getPersistentData().getDouble("ModNameGab") - 1));
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
			if (entity.getPersistentData().getDouble("ModNameGab") == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultracraft:gab_fuck")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultracraft:gab_fuck")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
