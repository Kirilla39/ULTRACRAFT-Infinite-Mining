
package net.mcreator.ultracraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ultracraft.procedures.MotorSwordFrontToolInHandTickProcedure;

import java.util.List;

public class MotorSwordFrontItem extends SwordItem {
	public MotorSwordFrontItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 1.9999999999999996f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(null));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("you know who else uses motor-sword with a gun?"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MotorSwordFrontToolInHandTickProcedure.execute(world, entity);
	}
}
