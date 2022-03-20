
package net.mcreator.envirocraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.envirocraft.init.EnvirocraftModTabs;

public class EnviroSongItem extends RecordItem {
	public EnviroSongItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music.under_water")),
				new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT).stacksTo(1).rarity(Rarity.RARE));
	}
}
