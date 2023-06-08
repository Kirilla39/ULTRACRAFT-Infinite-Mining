
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ultracraft.entity.SomethingWickedEntity;
import net.mcreator.ultracraft.entity.RailbulletExplEntity;
import net.mcreator.ultracraft.entity.RailbulletEntity;
import net.mcreator.ultracraft.entity.MinosPrimeEntity;
import net.mcreator.ultracraft.entity.HealBulletEntity;
import net.mcreator.ultracraft.entity.BulletTextureEntity;
import net.mcreator.ultracraft.entity.BulletEntity;
import net.mcreator.ultracraft.UltracraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UltracraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, UltracraftMod.MODID);
	public static final RegistryObject<EntityType<SomethingWickedEntity>> SOMETHING_WICKED = register("something_wicked",
			EntityType.Builder.<SomethingWickedEntity>of(SomethingWickedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SomethingWickedEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<MinosPrimeEntity>> MINOS_PRIME = register("minos_prime",
			EntityType.Builder.<MinosPrimeEntity>of(MinosPrimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinosPrimeEntity::new)

					.sized(0.7999999999999999f, 2f));
	public static final RegistryObject<EntityType<BulletTextureEntity>> BULLET_TEXTURE = register("projectile_bullet_texture",
			EntityType.Builder.<BulletTextureEntity>of(BulletTextureEntity::new, MobCategory.MISC).setCustomClientFactory(BulletTextureEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RailbulletEntity>> RAILBULLET = register("projectile_railbullet",
			EntityType.Builder.<RailbulletEntity>of(RailbulletEntity::new, MobCategory.MISC).setCustomClientFactory(RailbulletEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BulletEntity>> BULLET = register("projectile_bullet",
			EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).setCustomClientFactory(BulletEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HealBulletEntity>> HEAL_BULLET = register("projectile_heal_bullet",
			EntityType.Builder.<HealBulletEntity>of(HealBulletEntity::new, MobCategory.MISC).setCustomClientFactory(HealBulletEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RailbulletExplEntity>> RAILBULLET_EXPL = register("projectile_railbullet_expl",
			EntityType.Builder.<RailbulletExplEntity>of(RailbulletExplEntity::new, MobCategory.MISC).setCustomClientFactory(RailbulletExplEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SomethingWickedEntity.init();
			MinosPrimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SOMETHING_WICKED.get(), SomethingWickedEntity.createAttributes().build());
		event.put(MINOS_PRIME.get(), MinosPrimeEntity.createAttributes().build());
	}
}
