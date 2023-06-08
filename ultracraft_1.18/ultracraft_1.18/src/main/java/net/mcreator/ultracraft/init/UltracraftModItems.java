
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ultracraft.item.V2MorphItem;
import net.mcreator.ultracraft.item.V2Item;
import net.mcreator.ultracraft.item.V1MorphItem;
import net.mcreator.ultracraft.item.V1Item;
import net.mcreator.ultracraft.item.SwordsmachineTundraMorphItem;
import net.mcreator.ultracraft.item.SwordsmachineTundraArmrItem;
import net.mcreator.ultracraft.item.SwordsmachineMorphItem;
import net.mcreator.ultracraft.item.SwordsmachineEnragedMorphItem;
import net.mcreator.ultracraft.item.SwordsmachineEnragedArmrItem;
import net.mcreator.ultracraft.item.SwordsmachineArmrItem;
import net.mcreator.ultracraft.item.ShotgunPumpChargeItem;
import net.mcreator.ultracraft.item.ShotgunCoreEjectItem;
import net.mcreator.ultracraft.item.RocketLauncherFreezeItem;
import net.mcreator.ultracraft.item.RevolverPiercerItem;
import net.mcreator.ultracraft.item.RevolverMarksmanItem;
import net.mcreator.ultracraft.item.RailcannonScrewdriverItem;
import net.mcreator.ultracraft.item.RailcannonMaliciousItem;
import net.mcreator.ultracraft.item.RailcannonElectricItem;
import net.mcreator.ultracraft.item.RailbulletItem;
import net.mcreator.ultracraft.item.RailbulletExplItem;
import net.mcreator.ultracraft.item.NailgunOverheatItem;
import net.mcreator.ultracraft.item.NailgunAttractorItem;
import net.mcreator.ultracraft.item.MotorSwordTundraItem;
import net.mcreator.ultracraft.item.MotorSwordTundraFrontItem;
import net.mcreator.ultracraft.item.MotorSwordItem;
import net.mcreator.ultracraft.item.MotorSwordFrontItem;
import net.mcreator.ultracraft.item.MotorSwordEnragedItem;
import net.mcreator.ultracraft.item.MotorSwordEnragedFrontItem;
import net.mcreator.ultracraft.item.MinosPrimeArmrItem;
import net.mcreator.ultracraft.item.MinosMorphItem;
import net.mcreator.ultracraft.item.MindflayerMorphItem;
import net.mcreator.ultracraft.item.MindflayerEnragedMorphItem;
import net.mcreator.ultracraft.item.MindflayerEnragedArmrItem;
import net.mcreator.ultracraft.item.MindflayerArmrItem;
import net.mcreator.ultracraft.item.IconItem;
import net.mcreator.ultracraft.item.HealBulletItem;
import net.mcreator.ultracraft.item.GabrielMorphItem;
import net.mcreator.ultracraft.item.GabrielEnragedMorphItem;
import net.mcreator.ultracraft.item.GabrielEnragedArmrItem;
import net.mcreator.ultracraft.item.GabrielArmrItem;
import net.mcreator.ultracraft.item.BulletTextureItem;
import net.mcreator.ultracraft.item.BulletItemItem;
import net.mcreator.ultracraft.item.BulletItem;
import net.mcreator.ultracraft.item.BlackMarketMorphItem;
import net.mcreator.ultracraft.item.BlackMarketItem;
import net.mcreator.ultracraft.UltracraftMod;

public class UltracraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UltracraftMod.MODID);
	public static final RegistryObject<Item> V_1_MORPH = REGISTRY.register("v_1_morph", () -> new V1MorphItem());
	public static final RegistryObject<Item> V_2_MORPH = REGISTRY.register("v_2_morph", () -> new V2MorphItem());
	public static final RegistryObject<Item> SWORDSMACHINE_MORPH = REGISTRY.register("swordsmachine_morph", () -> new SwordsmachineMorphItem());
	public static final RegistryObject<Item> SWORDSMACHINE_ENRAGED_MORPH = REGISTRY.register("swordsmachine_enraged_morph",
			() -> new SwordsmachineEnragedMorphItem());
	public static final RegistryObject<Item> SWORDSMACHINE_TUNDRA_MORPH = REGISTRY.register("swordsmachine_tundra_morph",
			() -> new SwordsmachineTundraMorphItem());
	public static final RegistryObject<Item> MINDFLAYER_MORPH = REGISTRY.register("mindflayer_morph", () -> new MindflayerMorphItem());
	public static final RegistryObject<Item> MINDFLAYER_ENRAGED_MORPH = REGISTRY.register("mindflayer_enraged_morph",
			() -> new MindflayerEnragedMorphItem());
	public static final RegistryObject<Item> MINOS_MORPH = REGISTRY.register("minos_morph", () -> new MinosMorphItem());
	public static final RegistryObject<Item> GABRIEL_MORPH = REGISTRY.register("gabriel_morph", () -> new GabrielMorphItem());
	public static final RegistryObject<Item> GABRIEL_ENRAGED_MORPH = REGISTRY.register("gabriel_enraged_morph", () -> new GabrielEnragedMorphItem());
	public static final RegistryObject<Item> BLACK_MARKET_MORPH = REGISTRY.register("black_market_morph", () -> new BlackMarketMorphItem());
	public static final RegistryObject<Item> BLUE_SKULL = block(UltracraftModBlocks.BLUE_SKULL, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> BLUE_ALTAR = block(UltracraftModBlocks.BLUE_ALTAR, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> RED_SKULL = block(UltracraftModBlocks.RED_SKULL, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> RED_ALTAR = block(UltracraftModBlocks.RED_ALTAR, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> REVOLVER_PIERCER = REGISTRY.register("revolver_piercer", () -> new RevolverPiercerItem());
	public static final RegistryObject<Item> REVOLVER_MARKSMAN = REGISTRY.register("revolver_marksman", () -> new RevolverMarksmanItem());
	public static final RegistryObject<Item> SHOTGUN_CORE_EJECT = REGISTRY.register("shotgun_core_eject", () -> new ShotgunCoreEjectItem());
	public static final RegistryObject<Item> SHOTGUN_PUMP_CHARGE = REGISTRY.register("shotgun_pump_charge", () -> new ShotgunPumpChargeItem());
	public static final RegistryObject<Item> RAILCANNON_ELECTRIC = REGISTRY.register("railcannon_electric", () -> new RailcannonElectricItem());
	public static final RegistryObject<Item> RAILCANNON_MALICIOUS = REGISTRY.register("railcannon_malicious", () -> new RailcannonMaliciousItem());
	public static final RegistryObject<Item> RAILCANNON_SCREWDRIVER = REGISTRY.register("railcannon_screwdriver",
			() -> new RailcannonScrewdriverItem());
	public static final RegistryObject<Item> NAILGUN_ATTRACTOR = REGISTRY.register("nailgun_attractor", () -> new NailgunAttractorItem());
	public static final RegistryObject<Item> NAILGUN_OVERHEAT = REGISTRY.register("nailgun_overheat", () -> new NailgunOverheatItem());
	public static final RegistryObject<Item> ROCKET_LAUNCHER_FREEZE = REGISTRY.register("rocket_launcher_freeze",
			() -> new RocketLauncherFreezeItem());
	public static final RegistryObject<Item> MOTOR_SWORD = REGISTRY.register("motor_sword", () -> new MotorSwordItem());
	public static final RegistryObject<Item> MOTOR_SWORD_ENRAGED = REGISTRY.register("motor_sword_enraged", () -> new MotorSwordEnragedItem());
	public static final RegistryObject<Item> MOTOR_SWORD_TUNDRA = REGISTRY.register("motor_sword_tundra", () -> new MotorSwordTundraItem());
	public static final RegistryObject<Item> TERMINAL_LOWER = block(UltracraftModBlocks.TERMINAL_LOWER, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> TERMINAL_MIDDLE = block(UltracraftModBlocks.TERMINAL_MIDDLE, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> TERMINAL_UPPER = block(UltracraftModBlocks.TERMINAL_UPPER, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> CERBERUS = block(UltracraftModBlocks.CERBERUS, UltracraftModTabs.TAB_ULTRACRAFT);
	public static final RegistryObject<Item> SOMETHING_WICKED = REGISTRY.register("something_wicked_spawn_egg",
			() -> new ForgeSpawnEggItem(UltracraftModEntities.SOMETHING_WICKED, -16777216, -16777216,
					new Item.Properties().tab(UltracraftModTabs.TAB_ULTRACRAFT)));
	public static final RegistryObject<Item> MINOS_PRIME = REGISTRY.register("minos_prime_spawn_egg",
			() -> new ForgeSpawnEggItem(UltracraftModEntities.MINOS_PRIME, -1, -6710785,
					new Item.Properties().tab(UltracraftModTabs.TAB_ULTRACRAFT)));
	public static final RegistryObject<Item> V_1_HELMET = REGISTRY.register("v_1_helmet", () -> new V1Item.Helmet());
	public static final RegistryObject<Item> V_1_CHESTPLATE = REGISTRY.register("v_1_chestplate", () -> new V1Item.Chestplate());
	public static final RegistryObject<Item> V_1_LEGGINGS = REGISTRY.register("v_1_leggings", () -> new V1Item.Leggings());
	public static final RegistryObject<Item> BULLET_ITEM = REGISTRY.register("bullet_item", () -> new BulletItemItem());
	public static final RegistryObject<Item> V_2_HELMET = REGISTRY.register("v_2_helmet", () -> new V2Item.Helmet());
	public static final RegistryObject<Item> V_2_CHESTPLATE = REGISTRY.register("v_2_chestplate", () -> new V2Item.Chestplate());
	public static final RegistryObject<Item> V_2_LEGGINGS = REGISTRY.register("v_2_leggings", () -> new V2Item.Leggings());
	public static final RegistryObject<Item> MINOS_PRIME_ARMR_HELMET = REGISTRY.register("minos_prime_armr_helmet",
			() -> new MinosPrimeArmrItem.Helmet());
	public static final RegistryObject<Item> MINOS_PRIME_ARMR_CHESTPLATE = REGISTRY.register("minos_prime_armr_chestplate",
			() -> new MinosPrimeArmrItem.Chestplate());
	public static final RegistryObject<Item> MINOS_PRIME_ARMR_LEGGINGS = REGISTRY.register("minos_prime_armr_leggings",
			() -> new MinosPrimeArmrItem.Leggings());
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new IconItem());
	public static final RegistryObject<Item> BLUE_ALTAR_P = block(UltracraftModBlocks.BLUE_ALTAR_P, null);
	public static final RegistryObject<Item> RED_ALTAR_P = block(UltracraftModBlocks.RED_ALTAR_P, null);
	public static final RegistryObject<Item> BULLET_TEXTURE = REGISTRY.register("bullet_texture", () -> new BulletTextureItem());
	public static final RegistryObject<Item> RAILBULLET = REGISTRY.register("railbullet", () -> new RailbulletItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> BLACK_MARKET_HELMET = REGISTRY.register("black_market_helmet", () -> new BlackMarketItem.Helmet());
	public static final RegistryObject<Item> BLACK_MARKET_CHESTPLATE = REGISTRY.register("black_market_chestplate",
			() -> new BlackMarketItem.Chestplate());
	public static final RegistryObject<Item> BLACK_MARKET_LEGGINGS = REGISTRY.register("black_market_leggings", () -> new BlackMarketItem.Leggings());
	public static final RegistryObject<Item> HEAL_BULLET = REGISTRY.register("heal_bullet", () -> new HealBulletItem());
	public static final RegistryObject<Item> MINDFLAYER_ARMR_HELMET = REGISTRY.register("mindflayer_armr_helmet",
			() -> new MindflayerArmrItem.Helmet());
	public static final RegistryObject<Item> MINDFLAYER_ARMR_CHESTPLATE = REGISTRY.register("mindflayer_armr_chestplate",
			() -> new MindflayerArmrItem.Chestplate());
	public static final RegistryObject<Item> MINDFLAYER_ARMR_LEGGINGS = REGISTRY.register("mindflayer_armr_leggings",
			() -> new MindflayerArmrItem.Leggings());
	public static final RegistryObject<Item> SWORDSMACHINE_ARMR_HELMET = REGISTRY.register("swordsmachine_armr_helmet",
			() -> new SwordsmachineArmrItem.Helmet());
	public static final RegistryObject<Item> SWORDSMACHINE_ARMR_CHESTPLATE = REGISTRY.register("swordsmachine_armr_chestplate",
			() -> new SwordsmachineArmrItem.Chestplate());
	public static final RegistryObject<Item> SWORDSMACHINE_ARMR_LEGGINGS = REGISTRY.register("swordsmachine_armr_leggings",
			() -> new SwordsmachineArmrItem.Leggings());
	public static final RegistryObject<Item> SWORDSMACHINE_ENRAGED_ARMR_HELMET = REGISTRY.register("swordsmachine_enraged_armr_helmet",
			() -> new SwordsmachineEnragedArmrItem.Helmet());
	public static final RegistryObject<Item> SWORDSMACHINE_ENRAGED_ARMR_CHESTPLATE = REGISTRY.register("swordsmachine_enraged_armr_chestplate",
			() -> new SwordsmachineEnragedArmrItem.Chestplate());
	public static final RegistryObject<Item> SWORDSMACHINE_ENRAGED_ARMR_LEGGINGS = REGISTRY.register("swordsmachine_enraged_armr_leggings",
			() -> new SwordsmachineEnragedArmrItem.Leggings());
	public static final RegistryObject<Item> MINDFLAYER_ENRAGED_ARMR_HELMET = REGISTRY.register("mindflayer_enraged_armr_helmet",
			() -> new MindflayerEnragedArmrItem.Helmet());
	public static final RegistryObject<Item> MINDFLAYER_ENRAGED_ARMR_CHESTPLATE = REGISTRY.register("mindflayer_enraged_armr_chestplate",
			() -> new MindflayerEnragedArmrItem.Chestplate());
	public static final RegistryObject<Item> MINDFLAYER_ENRAGED_ARMR_LEGGINGS = REGISTRY.register("mindflayer_enraged_armr_leggings",
			() -> new MindflayerEnragedArmrItem.Leggings());
	public static final RegistryObject<Item> SWORDSMACHINE_TUNDRA_ARMR_HELMET = REGISTRY.register("swordsmachine_tundra_armr_helmet",
			() -> new SwordsmachineTundraArmrItem.Helmet());
	public static final RegistryObject<Item> SWORDSMACHINE_TUNDRA_ARMR_CHESTPLATE = REGISTRY.register("swordsmachine_tundra_armr_chestplate",
			() -> new SwordsmachineTundraArmrItem.Chestplate());
	public static final RegistryObject<Item> SWORDSMACHINE_TUNDRA_ARMR_LEGGINGS = REGISTRY.register("swordsmachine_tundra_armr_leggings",
			() -> new SwordsmachineTundraArmrItem.Leggings());
	public static final RegistryObject<Item> MOTOR_SWORD_FRONT = REGISTRY.register("motor_sword_front", () -> new MotorSwordFrontItem());
	public static final RegistryObject<Item> MOTOR_SWORD_ENRAGED_FRONT = REGISTRY.register("motor_sword_enraged_front",
			() -> new MotorSwordEnragedFrontItem());
	public static final RegistryObject<Item> MOTOR_SWORD_TUNDRA_FRONT = REGISTRY.register("motor_sword_tundra_front",
			() -> new MotorSwordTundraFrontItem());
	public static final RegistryObject<Item> RAILBULLET_EXPL = REGISTRY.register("railbullet_expl", () -> new RailbulletExplItem());
	public static final RegistryObject<Item> GABRIEL_ARMR_HELMET = REGISTRY.register("gabriel_armr_helmet", () -> new GabrielArmrItem.Helmet());
	public static final RegistryObject<Item> GABRIEL_ARMR_CHESTPLATE = REGISTRY.register("gabriel_armr_chestplate",
			() -> new GabrielArmrItem.Chestplate());
	public static final RegistryObject<Item> GABRIEL_ARMR_LEGGINGS = REGISTRY.register("gabriel_armr_leggings", () -> new GabrielArmrItem.Leggings());
	public static final RegistryObject<Item> GABRIEL_ENRAGED_ARMR_HELMET = REGISTRY.register("gabriel_enraged_armr_helmet",
			() -> new GabrielEnragedArmrItem.Helmet());
	public static final RegistryObject<Item> GABRIEL_ENRAGED_ARMR_CHESTPLATE = REGISTRY.register("gabriel_enraged_armr_chestplate",
			() -> new GabrielEnragedArmrItem.Chestplate());
	public static final RegistryObject<Item> GABRIEL_ENRAGED_ARMR_LEGGINGS = REGISTRY.register("gabriel_enraged_armr_leggings",
			() -> new GabrielEnragedArmrItem.Leggings());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
