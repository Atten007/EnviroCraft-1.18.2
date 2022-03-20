
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.envirocraft.item.WindSwordItem;
import net.mcreator.envirocraft.item.WindShovelItem;
import net.mcreator.envirocraft.item.WindPickaxeItem;
import net.mcreator.envirocraft.item.WindHoeItem;
import net.mcreator.envirocraft.item.WindDustItem;
import net.mcreator.envirocraft.item.WindAxeItem;
import net.mcreator.envirocraft.item.WindArmorItem;
import net.mcreator.envirocraft.item.SolarShardItem;
import net.mcreator.envirocraft.item.OceanSwordItem;
import net.mcreator.envirocraft.item.OceanShovelItem;
import net.mcreator.envirocraft.item.OceanPickaxeItem;
import net.mcreator.envirocraft.item.OceanIngotItem;
import net.mcreator.envirocraft.item.OceanHoeItem;
import net.mcreator.envirocraft.item.OceanAxeItem;
import net.mcreator.envirocraft.item.OceanArmorItem;
import net.mcreator.envirocraft.item.EnviroWaterItem;
import net.mcreator.envirocraft.item.EnviroSwordItem;
import net.mcreator.envirocraft.item.EnviroStickItem;
import net.mcreator.envirocraft.item.EnviroSongItem;
import net.mcreator.envirocraft.item.EnviroSmokeItemItem;
import net.mcreator.envirocraft.item.EnviroShovelItem;
import net.mcreator.envirocraft.item.EnviroRodItem;
import net.mcreator.envirocraft.item.EnviroPickaxeItem;
import net.mcreator.envirocraft.item.EnviroNoteItem;
import net.mcreator.envirocraft.item.EnviroLavaItem;
import net.mcreator.envirocraft.item.EnviroItemItem;
import net.mcreator.envirocraft.item.EnviroItem;
import net.mcreator.envirocraft.item.EnviroHoeItem;
import net.mcreator.envirocraft.item.EnviroHelmetItem;
import net.mcreator.envirocraft.item.EnviroGemItem;
import net.mcreator.envirocraft.item.EnviroFluidItem;
import net.mcreator.envirocraft.item.EnviroFaceItem;
import net.mcreator.envirocraft.item.EnviroDimItem;
import net.mcreator.envirocraft.item.EnviroBallItem;
import net.mcreator.envirocraft.item.EnviroAxeItem;
import net.mcreator.envirocraft.item.EnviroArmorItem;
import net.mcreator.envirocraft.item.EnergySwordItem;
import net.mcreator.envirocraft.item.EnergyShovelItem;
import net.mcreator.envirocraft.item.EnergyPickaxeItem;
import net.mcreator.envirocraft.item.EnergyItem;
import net.mcreator.envirocraft.item.EnergyHoeItem;
import net.mcreator.envirocraft.item.EnergyAxeItem;
import net.mcreator.envirocraft.item.EnergyArmorItem;
import net.mcreator.envirocraft.EnvirocraftMod;

public class EnvirocraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnvirocraftMod.MODID);
	public static final RegistryObject<Item> SOLAR_CELL = block(EnvirocraftModBlocks.SOLAR_CELL, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO = REGISTRY.register("enviro", () -> new EnviroItem());
	public static final RegistryObject<Item> ENVIRO_ORE = block(EnvirocraftModBlocks.ENVIRO_ORE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_BLOCK = block(EnvirocraftModBlocks.ENVIRO_BLOCK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_PICKAXE = REGISTRY.register("enviro_pickaxe", () -> new EnviroPickaxeItem());
	public static final RegistryObject<Item> ENVIRO_AXE = REGISTRY.register("enviro_axe", () -> new EnviroAxeItem());
	public static final RegistryObject<Item> ENVIRO_SWORD = REGISTRY.register("enviro_sword", () -> new EnviroSwordItem());
	public static final RegistryObject<Item> ENVIRO_SHOVEL = REGISTRY.register("enviro_shovel", () -> new EnviroShovelItem());
	public static final RegistryObject<Item> ENVIRO_HOE = REGISTRY.register("enviro_hoe", () -> new EnviroHoeItem());
	public static final RegistryObject<Item> ENVIRO_ARMOR_HELMET = REGISTRY.register("enviro_armor_helmet", () -> new EnviroArmorItem.Helmet());
	public static final RegistryObject<Item> ENVIRO_ARMOR_CHESTPLATE = REGISTRY.register("enviro_armor_chestplate",
			() -> new EnviroArmorItem.Chestplate());
	public static final RegistryObject<Item> ENVIRO_ARMOR_LEGGINGS = REGISTRY.register("enviro_armor_leggings", () -> new EnviroArmorItem.Leggings());
	public static final RegistryObject<Item> ENVIRO_ARMOR_BOOTS = REGISTRY.register("enviro_armor_boots", () -> new EnviroArmorItem.Boots());
	public static final RegistryObject<Item> ENVIRO_TREE = block(EnvirocraftModBlocks.ENVIRO_TREE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_TURBINE = block(EnvirocraftModBlocks.WIND_TURBINE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_GENERATOR = block(EnvirocraftModBlocks.OCEAN_GENERATOR, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_DUST = REGISTRY.register("wind_dust", () -> new WindDustItem());
	public static final RegistryObject<Item> WIND_ORE = block(EnvirocraftModBlocks.WIND_ORE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_BLOCK = block(EnvirocraftModBlocks.WIND_BLOCK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_PICKAXE = REGISTRY.register("wind_pickaxe", () -> new WindPickaxeItem());
	public static final RegistryObject<Item> WIND_AXE = REGISTRY.register("wind_axe", () -> new WindAxeItem());
	public static final RegistryObject<Item> WIND_SWORD = REGISTRY.register("wind_sword", () -> new WindSwordItem());
	public static final RegistryObject<Item> WIND_SHOVEL = REGISTRY.register("wind_shovel", () -> new WindShovelItem());
	public static final RegistryObject<Item> WIND_HOE = REGISTRY.register("wind_hoe", () -> new WindHoeItem());
	public static final RegistryObject<Item> WIND_ARMOR_HELMET = REGISTRY.register("wind_armor_helmet", () -> new WindArmorItem.Helmet());
	public static final RegistryObject<Item> WIND_ARMOR_CHESTPLATE = REGISTRY.register("wind_armor_chestplate", () -> new WindArmorItem.Chestplate());
	public static final RegistryObject<Item> WIND_ARMOR_LEGGINGS = REGISTRY.register("wind_armor_leggings", () -> new WindArmorItem.Leggings());
	public static final RegistryObject<Item> WIND_ARMOR_BOOTS = REGISTRY.register("wind_armor_boots", () -> new WindArmorItem.Boots());
	public static final RegistryObject<Item> OCEAN_INGOT = REGISTRY.register("ocean_ingot", () -> new OceanIngotItem());
	public static final RegistryObject<Item> OCEAN_ORE = block(EnvirocraftModBlocks.OCEAN_ORE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_BLOCK = block(EnvirocraftModBlocks.OCEAN_BLOCK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_PICKAXE = REGISTRY.register("ocean_pickaxe", () -> new OceanPickaxeItem());
	public static final RegistryObject<Item> OCEAN_AXE = REGISTRY.register("ocean_axe", () -> new OceanAxeItem());
	public static final RegistryObject<Item> OCEAN_SWORD = REGISTRY.register("ocean_sword", () -> new OceanSwordItem());
	public static final RegistryObject<Item> OCEAN_SHOVEL = REGISTRY.register("ocean_shovel", () -> new OceanShovelItem());
	public static final RegistryObject<Item> OCEAN_HOE = REGISTRY.register("ocean_hoe", () -> new OceanHoeItem());
	public static final RegistryObject<Item> OCEAN_ARMOR_HELMET = REGISTRY.register("ocean_armor_helmet", () -> new OceanArmorItem.Helmet());
	public static final RegistryObject<Item> OCEAN_ARMOR_CHESTPLATE = REGISTRY.register("ocean_armor_chestplate",
			() -> new OceanArmorItem.Chestplate());
	public static final RegistryObject<Item> OCEAN_ARMOR_LEGGINGS = REGISTRY.register("ocean_armor_leggings", () -> new OceanArmorItem.Leggings());
	public static final RegistryObject<Item> OCEAN_ARMOR_BOOTS = REGISTRY.register("ocean_armor_boots", () -> new OceanArmorItem.Boots());
	public static final RegistryObject<Item> ENVIRO_CRAFT_MONSTER = REGISTRY.register("enviro_craft_monster_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_CRAFT_MONSTER, -6684928, -13421569,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_GRASS = block(EnvirocraftModBlocks.ENVIRO_GRASS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_FLUID_BUCKET = REGISTRY.register("enviro_fluid_bucket", () -> new EnviroFluidItem());
	public static final RegistryObject<Item> ENVIRO_PORTAL_FRAME = block(EnvirocraftModBlocks.ENVIRO_PORTAL_FRAME,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_CRAFT_PORTAL_BLOCK = block(EnvirocraftModBlocks.ENVIRO_CRAFT_PORTAL_BLOCK,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_DIM = REGISTRY.register("enviro_dim", () -> new EnviroDimItem());
	public static final RegistryObject<Item> ENVIRO_WOOD_WOOD = block(EnvirocraftModBlocks.ENVIRO_WOOD_WOOD, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_LOG = block(EnvirocraftModBlocks.ENVIRO_WOOD_LOG, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_PLANKS = block(EnvirocraftModBlocks.ENVIRO_WOOD_PLANKS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_LEAVES = block(EnvirocraftModBlocks.ENVIRO_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ENVIRO_WOOD_STAIRS = block(EnvirocraftModBlocks.ENVIRO_WOOD_STAIRS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_SLAB = block(EnvirocraftModBlocks.ENVIRO_WOOD_SLAB, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_FENCE = block(EnvirocraftModBlocks.ENVIRO_WOOD_FENCE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_FENCE_GATE = block(EnvirocraftModBlocks.ENVIRO_WOOD_FENCE_GATE,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_WOOD_PRESSURE_PLATE = block(EnvirocraftModBlocks.ENVIRO_WOOD_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ENVIRO_WOOD_BUTTON = block(EnvirocraftModBlocks.ENVIRO_WOOD_BUTTON, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_WOOD = block(EnvirocraftModBlocks.OCEAN_WOOD, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_LOG = block(EnvirocraftModBlocks.OCEAN_LOG, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_PLANKS = block(EnvirocraftModBlocks.OCEAN_PLANKS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_LEAVES = block(EnvirocraftModBlocks.OCEAN_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OCEAN_STAIRS = block(EnvirocraftModBlocks.OCEAN_STAIRS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_SLAB = block(EnvirocraftModBlocks.OCEAN_SLAB, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_FENCE = block(EnvirocraftModBlocks.OCEAN_FENCE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_FENCE_GATE = block(EnvirocraftModBlocks.OCEAN_FENCE_GATE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> OCEAN_PRESSURE_PLATE = block(EnvirocraftModBlocks.OCEAN_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> OCEAN_BUTTON = block(EnvirocraftModBlocks.OCEAN_BUTTON, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_WOOD = block(EnvirocraftModBlocks.WIND_WOOD, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_LOG = block(EnvirocraftModBlocks.WIND_LOG, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_PLANKS = block(EnvirocraftModBlocks.WIND_PLANKS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_LEAVES = block(EnvirocraftModBlocks.WIND_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WIND_STAIRS = block(EnvirocraftModBlocks.WIND_STAIRS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_SLAB = block(EnvirocraftModBlocks.WIND_SLAB, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_FENCE = block(EnvirocraftModBlocks.WIND_FENCE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_FENCE_GATE = block(EnvirocraftModBlocks.WIND_FENCE_GATE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WIND_PRESSURE_PLATE = block(EnvirocraftModBlocks.WIND_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> WIND_BUTTON = block(EnvirocraftModBlocks.WIND_BUTTON, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_PIG = REGISTRY.register("enviro_pig_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_PIG, -3407719, -26164,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_SAND = block(EnvirocraftModBlocks.ENVIRO_SAND, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_STONE = block(EnvirocraftModBlocks.ENVIRO_STONE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_ICE = block(EnvirocraftModBlocks.ENVIRO_ICE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> POWER_BOX = block(EnvirocraftModBlocks.POWER_BOX, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_DIRT = block(EnvirocraftModBlocks.ENVIRO_DIRT, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_VINES = block(EnvirocraftModBlocks.ENVIRO_VINES, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_PLANT = block(EnvirocraftModBlocks.ENVIRO_PLANT, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_SHEEP = REGISTRY.register("enviro_sheep_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_SHEEP, -3355444, -1,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_BRINE = REGISTRY.register("enviro_brine_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_BRINE, -13408513, -6737152,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_COW = REGISTRY.register("enviro_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_COW, -10079488, -6684928,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_CHICKEN = REGISTRY.register("enviro_chicken_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_CHICKEN, -1, -52480,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_RABBIT = REGISTRY.register("enviro_rabbit_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_RABBIT, -10079488, -6710887,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_WATER_BUCKET = REGISTRY.register("enviro_water_bucket", () -> new EnviroWaterItem());
	public static final RegistryObject<Item> ENVIRO_LAVA_BUCKET = REGISTRY.register("enviro_lava_bucket", () -> new EnviroLavaItem());
	public static final RegistryObject<Item> GREEN_GENERATOR = block(EnvirocraftModBlocks.GREEN_GENERATOR, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> WATER_TANK = block(EnvirocraftModBlocks.WATER_TANK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_FRAME = block(EnvirocraftModBlocks.ENVIRO_FRAME, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_GEM = REGISTRY.register("enviro_gem", () -> new EnviroGemItem());
	public static final RegistryObject<Item> ENVIRO_STICK = REGISTRY.register("enviro_stick", () -> new EnviroStickItem());
	public static final RegistryObject<Item> ENVIRO_ITEM = REGISTRY.register("enviro_item", () -> new EnviroItemItem());
	public static final RegistryObject<Item> ENVIRO_FIREWORK_BLOCK = block(EnvirocraftModBlocks.ENVIRO_FIREWORK_BLOCK,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY = REGISTRY.register("energy", () -> new EnergyItem());
	public static final RegistryObject<Item> ENERGY_ORE = block(EnvirocraftModBlocks.ENERGY_ORE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_BLOCK = block(EnvirocraftModBlocks.ENERGY_BLOCK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_PICKAXE = REGISTRY.register("energy_pickaxe", () -> new EnergyPickaxeItem());
	public static final RegistryObject<Item> ENERGY_AXE = REGISTRY.register("energy_axe", () -> new EnergyAxeItem());
	public static final RegistryObject<Item> ENERGY_SWORD = REGISTRY.register("energy_sword", () -> new EnergySwordItem());
	public static final RegistryObject<Item> ENERGY_SHOVEL = REGISTRY.register("energy_shovel", () -> new EnergyShovelItem());
	public static final RegistryObject<Item> ENERGY_HOE = REGISTRY.register("energy_hoe", () -> new EnergyHoeItem());
	public static final RegistryObject<Item> ENERGY_ARMOR_HELMET = REGISTRY.register("energy_armor_helmet", () -> new EnergyArmorItem.Helmet());
	public static final RegistryObject<Item> ENERGY_ARMOR_CHESTPLATE = REGISTRY.register("energy_armor_chestplate",
			() -> new EnergyArmorItem.Chestplate());
	public static final RegistryObject<Item> ENERGY_ARMOR_LEGGINGS = REGISTRY.register("energy_armor_leggings", () -> new EnergyArmorItem.Leggings());
	public static final RegistryObject<Item> ENERGY_ARMOR_BOOTS = REGISTRY.register("energy_armor_boots", () -> new EnergyArmorItem.Boots());
	public static final RegistryObject<Item> ENERGY_WOOD_WOOD = block(EnvirocraftModBlocks.ENERGY_WOOD_WOOD, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_LOG = block(EnvirocraftModBlocks.ENERGY_WOOD_LOG, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_PLANKS = block(EnvirocraftModBlocks.ENERGY_WOOD_PLANKS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_LEAVES = block(EnvirocraftModBlocks.ENERGY_WOOD_LEAVES, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_STAIRS = block(EnvirocraftModBlocks.ENERGY_WOOD_STAIRS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_SLAB = block(EnvirocraftModBlocks.ENERGY_WOOD_SLAB, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_FENCE = block(EnvirocraftModBlocks.ENERGY_WOOD_FENCE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_FENCE_GATE = block(EnvirocraftModBlocks.ENERGY_WOOD_FENCE_GATE,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_PRESSURE_PLATE = block(EnvirocraftModBlocks.ENERGY_WOOD_PRESSURE_PLATE,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENERGY_WOOD_BUTTON = block(EnvirocraftModBlocks.ENERGY_WOOD_BUTTON, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> TRIANGLE_GENERATOR = block(EnvirocraftModBlocks.TRIANGLE_GENERATOR, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> SOLAR_SHARD = REGISTRY.register("solar_shard", () -> new SolarShardItem());
	public static final RegistryObject<Item> ENVIRO_PUMPKIN = block(EnvirocraftModBlocks.ENVIRO_PUMPKIN, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_SONG = REGISTRY.register("enviro_song", () -> new EnviroSongItem());
	public static final RegistryObject<Item> ENVIRO_STORAGE = block(EnvirocraftModBlocks.ENVIRO_STORAGE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_ROD = REGISTRY.register("enviro_rod", () -> new EnviroRodItem());
	public static final RegistryObject<Item> ENVIRO_HELMET = REGISTRY.register("enviro_helmet", () -> new EnviroHelmetItem());
	public static final RegistryObject<Item> ENVIRO_GRAVEL = block(EnvirocraftModBlocks.ENVIRO_GRAVEL, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_NOTE = REGISTRY.register("enviro_note", () -> new EnviroNoteItem());
	public static final RegistryObject<Item> ENVIRO_CHEST = block(EnvirocraftModBlocks.ENVIRO_CHEST, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_BALL = REGISTRY.register("enviro_ball", () -> new EnviroBallItem());
	public static final RegistryObject<Item> ENVIRO_LOG = block(EnvirocraftModBlocks.ENVIRO_LOG, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_MUSHROOM = block(EnvirocraftModBlocks.ENVIRO_MUSHROOM, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_FACE = REGISTRY.register("enviro_face", () -> new EnviroFaceItem());
	public static final RegistryObject<Item> ENVIRO_SMOKE_ITEM = REGISTRY.register("enviro_smoke_item", () -> new EnviroSmokeItemItem());
	public static final RegistryObject<Item> ENVIRO_ORE_BLOCK = block(EnvirocraftModBlocks.ENVIRO_ORE_BLOCK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_VILLAGER = REGISTRY.register("enviro_villager_spawn_egg",
			() -> new ForgeSpawnEggItem(EnvirocraftModEntities.ENVIRO_VILLAGER, -10079488, -6710887,
					new Item.Properties().tab(EnvirocraftModTabs.TAB_ENVIROCRAFT)));
	public static final RegistryObject<Item> ENVIRO_ROD_BLOCK = block(EnvirocraftModBlocks.ENVIRO_ROD_BLOCK, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_TORCH = block(EnvirocraftModBlocks.ENVIRO_TORCH, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_BLOCK_RED = block(EnvirocraftModBlocks.ENVIRO_BLOCK_RED, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_BLOCK_BLUE = block(EnvirocraftModBlocks.ENVIRO_BLOCK_BLUE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_CROPS = block(EnvirocraftModBlocks.ENVIRO_CROPS, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> RECYCLING_MACHINE = block(EnvirocraftModBlocks.RECYCLING_MACHINE, EnvirocraftModTabs.TAB_ENVIROCRAFT);
	public static final RegistryObject<Item> ENVIRO_DIRT_WITH_GEM = block(EnvirocraftModBlocks.ENVIRO_DIRT_WITH_GEM,
			EnvirocraftModTabs.TAB_ENVIROCRAFT);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
