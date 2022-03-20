
package net.mcreator.envirocraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.envirocraft.init.EnvirocraftModTabs;
import net.mcreator.envirocraft.init.EnvirocraftModFluids;

public class EnviroFluidItem extends BucketItem {
	public EnviroFluidItem() {
		super(EnvirocraftModFluids.ENVIRO_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(EnvirocraftModTabs.TAB_ENVIROCRAFT));
	}
}
