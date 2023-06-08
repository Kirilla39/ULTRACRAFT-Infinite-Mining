
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ultracraft.block.TerminalUpperBlock;
import net.mcreator.ultracraft.block.TerminalMiddleBlock;
import net.mcreator.ultracraft.block.TerminalLowerBlock;
import net.mcreator.ultracraft.block.RedSkullBlock;
import net.mcreator.ultracraft.block.RedAltarPBlock;
import net.mcreator.ultracraft.block.RedAltarBlock;
import net.mcreator.ultracraft.block.CerberusBlock;
import net.mcreator.ultracraft.block.BlueSkullBlock;
import net.mcreator.ultracraft.block.BlueAltarPBlock;
import net.mcreator.ultracraft.block.BlueAltarBlock;
import net.mcreator.ultracraft.UltracraftMod;

public class UltracraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UltracraftMod.MODID);
	public static final RegistryObject<Block> BLUE_SKULL = REGISTRY.register("blue_skull", () -> new BlueSkullBlock());
	public static final RegistryObject<Block> BLUE_ALTAR = REGISTRY.register("blue_altar", () -> new BlueAltarBlock());
	public static final RegistryObject<Block> RED_SKULL = REGISTRY.register("red_skull", () -> new RedSkullBlock());
	public static final RegistryObject<Block> RED_ALTAR = REGISTRY.register("red_altar", () -> new RedAltarBlock());
	public static final RegistryObject<Block> TERMINAL_LOWER = REGISTRY.register("terminal_lower", () -> new TerminalLowerBlock());
	public static final RegistryObject<Block> TERMINAL_MIDDLE = REGISTRY.register("terminal_middle", () -> new TerminalMiddleBlock());
	public static final RegistryObject<Block> TERMINAL_UPPER = REGISTRY.register("terminal_upper", () -> new TerminalUpperBlock());
	public static final RegistryObject<Block> CERBERUS = REGISTRY.register("cerberus", () -> new CerberusBlock());
	public static final RegistryObject<Block> BLUE_ALTAR_P = REGISTRY.register("blue_altar_p", () -> new BlueAltarPBlock());
	public static final RegistryObject<Block> RED_ALTAR_P = REGISTRY.register("red_altar_p", () -> new RedAltarPBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BlueSkullBlock.registerRenderLayer();
			BlueAltarBlock.registerRenderLayer();
			RedSkullBlock.registerRenderLayer();
			RedAltarBlock.registerRenderLayer();
			TerminalLowerBlock.registerRenderLayer();
			TerminalMiddleBlock.registerRenderLayer();
			TerminalUpperBlock.registerRenderLayer();
			CerberusBlock.registerRenderLayer();
			BlueAltarPBlock.registerRenderLayer();
			RedAltarPBlock.registerRenderLayer();
		}
	}
}
