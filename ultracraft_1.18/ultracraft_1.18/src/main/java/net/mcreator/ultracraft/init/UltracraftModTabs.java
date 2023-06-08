
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultracraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UltracraftModTabs {
	public static CreativeModeTab TAB_ULTRACRAFT;

	public static void load() {
		TAB_ULTRACRAFT = new CreativeModeTab("tabultracraft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UltracraftModItems.ICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
