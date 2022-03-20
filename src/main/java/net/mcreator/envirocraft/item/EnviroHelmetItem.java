
package net.mcreator.envirocraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.envirocraft.init.EnvirocraftModTabs;

public class EnviroHelmetItem extends Item {
	public EnviroHelmetItem() {
		super(new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
