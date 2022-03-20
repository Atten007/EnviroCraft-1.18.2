
package net.mcreator.envirocraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.envirocraft.init.EnvirocraftModTabs;
import net.mcreator.envirocraft.init.EnvirocraftModItems;

public abstract class EnergyArmorItem extends ArmorItem {
	public EnergyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EnvirocraftModItems.ENERGY.get()));
			}

			@Override
			public String getName() {
				return "energy_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EnergyArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "envirocraft:textures/models/armor/energy_layer_1.png";
		}
	}

	public static class Chestplate extends EnergyArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "envirocraft:textures/models/armor/energy_layer_1.png";
		}
	}

	public static class Leggings extends EnergyArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "envirocraft:textures/models/armor/energy_layer_2.png";
		}
	}

	public static class Boots extends EnergyArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "envirocraft:textures/models/armor/energy_layer_1.png";
		}
	}
}
