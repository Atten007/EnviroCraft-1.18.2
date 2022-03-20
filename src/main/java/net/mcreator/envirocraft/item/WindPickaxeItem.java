
package net.mcreator.envirocraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.envirocraft.init.EnvirocraftModTabs;
import net.mcreator.envirocraft.init.EnvirocraftModItems;

public class WindPickaxeItem extends PickaxeItem {
	public WindPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EnvirocraftModItems.WIND_DUST.get()));
			}
		}, 1, -3f, new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT));
	}
}
