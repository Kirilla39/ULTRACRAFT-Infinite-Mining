
package net.mcreator.ultracraft.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ultracraft.procedures.BlackMarketMorphRightclickedProcedure;
import net.mcreator.ultracraft.init.UltracraftModTabs;

import java.util.List;

public class BlackMarketMorphItem extends Item {
	public BlackMarketMorphItem() {
		super(new Item.Properties().tab(UltracraftModTabs.TAB_ULTRACRAFT).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("bonus from Unfortunate Spacemen"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BlackMarketMorphRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
