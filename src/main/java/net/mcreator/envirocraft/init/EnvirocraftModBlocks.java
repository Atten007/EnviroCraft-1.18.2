
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.envirocraft.block.WindWoodBlock;
import net.mcreator.envirocraft.block.WindTurbineBlock;
import net.mcreator.envirocraft.block.WindStairsBlock;
import net.mcreator.envirocraft.block.WindSlabBlock;
import net.mcreator.envirocraft.block.WindPressurePlateBlock;
import net.mcreator.envirocraft.block.WindPlanksBlock;
import net.mcreator.envirocraft.block.WindOreBlock;
import net.mcreator.envirocraft.block.WindLogBlock;
import net.mcreator.envirocraft.block.WindLeavesBlock;
import net.mcreator.envirocraft.block.WindFenceGateBlock;
import net.mcreator.envirocraft.block.WindFenceBlock;
import net.mcreator.envirocraft.block.WindButtonBlock;
import net.mcreator.envirocraft.block.WindBlockBlock;
import net.mcreator.envirocraft.block.WaterTankBlock;
import net.mcreator.envirocraft.block.TriangleGeneratorBlock;
import net.mcreator.envirocraft.block.SolarCellBlock;
import net.mcreator.envirocraft.block.RecyclingMachineBlock;
import net.mcreator.envirocraft.block.PowerBoxBlock;
import net.mcreator.envirocraft.block.OceanWoodBlock;
import net.mcreator.envirocraft.block.OceanStairsBlock;
import net.mcreator.envirocraft.block.OceanSlabBlock;
import net.mcreator.envirocraft.block.OceanPressurePlateBlock;
import net.mcreator.envirocraft.block.OceanPlanksBlock;
import net.mcreator.envirocraft.block.OceanOreBlock;
import net.mcreator.envirocraft.block.OceanLogBlock;
import net.mcreator.envirocraft.block.OceanLeavesBlock;
import net.mcreator.envirocraft.block.OceanGeneratorBlock;
import net.mcreator.envirocraft.block.OceanFenceGateBlock;
import net.mcreator.envirocraft.block.OceanFenceBlock;
import net.mcreator.envirocraft.block.OceanButtonBlock;
import net.mcreator.envirocraft.block.OceanBlockBlock;
import net.mcreator.envirocraft.block.GreenGeneratorBlock;
import net.mcreator.envirocraft.block.EnviroWoodWoodBlock;
import net.mcreator.envirocraft.block.EnviroWoodStairsBlock;
import net.mcreator.envirocraft.block.EnviroWoodSlabBlock;
import net.mcreator.envirocraft.block.EnviroWoodPressurePlateBlock;
import net.mcreator.envirocraft.block.EnviroWoodPlanksBlock;
import net.mcreator.envirocraft.block.EnviroWoodLogBlock;
import net.mcreator.envirocraft.block.EnviroWoodLeavesBlock;
import net.mcreator.envirocraft.block.EnviroWoodFenceGateBlock;
import net.mcreator.envirocraft.block.EnviroWoodFenceBlock;
import net.mcreator.envirocraft.block.EnviroWoodButtonBlock;
import net.mcreator.envirocraft.block.EnviroWaterBlock;
import net.mcreator.envirocraft.block.EnviroVinesBlock;
import net.mcreator.envirocraft.block.EnviroTreeBlock;
import net.mcreator.envirocraft.block.EnviroTorchBlock;
import net.mcreator.envirocraft.block.EnviroStorageBlock;
import net.mcreator.envirocraft.block.EnviroStoneBlock;
import net.mcreator.envirocraft.block.EnviroSandBlock;
import net.mcreator.envirocraft.block.EnviroRodBlockBlock;
import net.mcreator.envirocraft.block.EnviroPumpkinBlock;
import net.mcreator.envirocraft.block.EnviroPortalFrameBlock;
import net.mcreator.envirocraft.block.EnviroPlantBlock;
import net.mcreator.envirocraft.block.EnviroOreBlockBlock;
import net.mcreator.envirocraft.block.EnviroOreBlock;
import net.mcreator.envirocraft.block.EnviroMushroomBlock;
import net.mcreator.envirocraft.block.EnviroLogBlock;
import net.mcreator.envirocraft.block.EnviroLavaBlock;
import net.mcreator.envirocraft.block.EnviroIceBlock;
import net.mcreator.envirocraft.block.EnviroGravelBlock;
import net.mcreator.envirocraft.block.EnviroGrassBlock;
import net.mcreator.envirocraft.block.EnviroFrameBlock;
import net.mcreator.envirocraft.block.EnviroFluidBlock;
import net.mcreator.envirocraft.block.EnviroFireworkBlockBlock;
import net.mcreator.envirocraft.block.EnviroDirtWithGemBlock;
import net.mcreator.envirocraft.block.EnviroDirtBlock;
import net.mcreator.envirocraft.block.EnviroDimPortalBlock;
import net.mcreator.envirocraft.block.EnviroCropsBlock;
import net.mcreator.envirocraft.block.EnviroCraftPortalBlockBlock;
import net.mcreator.envirocraft.block.EnviroChestBlock;
import net.mcreator.envirocraft.block.EnviroBlockRedBlock;
import net.mcreator.envirocraft.block.EnviroBlockBlueBlock;
import net.mcreator.envirocraft.block.EnviroBlockBlock;
import net.mcreator.envirocraft.block.EnergyWoodWoodBlock;
import net.mcreator.envirocraft.block.EnergyWoodStairsBlock;
import net.mcreator.envirocraft.block.EnergyWoodSlabBlock;
import net.mcreator.envirocraft.block.EnergyWoodPressurePlateBlock;
import net.mcreator.envirocraft.block.EnergyWoodPlanksBlock;
import net.mcreator.envirocraft.block.EnergyWoodLogBlock;
import net.mcreator.envirocraft.block.EnergyWoodLeavesBlock;
import net.mcreator.envirocraft.block.EnergyWoodFenceGateBlock;
import net.mcreator.envirocraft.block.EnergyWoodFenceBlock;
import net.mcreator.envirocraft.block.EnergyWoodButtonBlock;
import net.mcreator.envirocraft.block.EnergyOreBlock;
import net.mcreator.envirocraft.block.EnergyBlockBlock;
import net.mcreator.envirocraft.EnvirocraftMod;

public class EnvirocraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnvirocraftMod.MODID);
	public static final RegistryObject<Block> SOLAR_CELL = REGISTRY.register("solar_cell", () -> new SolarCellBlock());
	public static final RegistryObject<Block> ENVIRO_ORE = REGISTRY.register("enviro_ore", () -> new EnviroOreBlock());
	public static final RegistryObject<Block> ENVIRO_BLOCK = REGISTRY.register("enviro_block", () -> new EnviroBlockBlock());
	public static final RegistryObject<Block> ENVIRO_TREE = REGISTRY.register("enviro_tree", () -> new EnviroTreeBlock());
	public static final RegistryObject<Block> WIND_TURBINE = REGISTRY.register("wind_turbine", () -> new WindTurbineBlock());
	public static final RegistryObject<Block> OCEAN_GENERATOR = REGISTRY.register("ocean_generator", () -> new OceanGeneratorBlock());
	public static final RegistryObject<Block> WIND_ORE = REGISTRY.register("wind_ore", () -> new WindOreBlock());
	public static final RegistryObject<Block> WIND_BLOCK = REGISTRY.register("wind_block", () -> new WindBlockBlock());
	public static final RegistryObject<Block> OCEAN_ORE = REGISTRY.register("ocean_ore", () -> new OceanOreBlock());
	public static final RegistryObject<Block> OCEAN_BLOCK = REGISTRY.register("ocean_block", () -> new OceanBlockBlock());
	public static final RegistryObject<Block> ENVIRO_GRASS = REGISTRY.register("enviro_grass", () -> new EnviroGrassBlock());
	public static final RegistryObject<Block> ENVIRO_FLUID = REGISTRY.register("enviro_fluid", () -> new EnviroFluidBlock());
	public static final RegistryObject<Block> ENVIRO_PORTAL_FRAME = REGISTRY.register("enviro_portal_frame", () -> new EnviroPortalFrameBlock());
	public static final RegistryObject<Block> ENVIRO_CRAFT_PORTAL_BLOCK = REGISTRY.register("enviro_craft_portal_block",
			() -> new EnviroCraftPortalBlockBlock());
	public static final RegistryObject<Block> ENVIRO_DIM_PORTAL = REGISTRY.register("enviro_dim_portal", () -> new EnviroDimPortalBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_WOOD = REGISTRY.register("enviro_wood_wood", () -> new EnviroWoodWoodBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_LOG = REGISTRY.register("enviro_wood_log", () -> new EnviroWoodLogBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_PLANKS = REGISTRY.register("enviro_wood_planks", () -> new EnviroWoodPlanksBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_LEAVES = REGISTRY.register("enviro_wood_leaves", () -> new EnviroWoodLeavesBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_STAIRS = REGISTRY.register("enviro_wood_stairs", () -> new EnviroWoodStairsBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_SLAB = REGISTRY.register("enviro_wood_slab", () -> new EnviroWoodSlabBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_FENCE = REGISTRY.register("enviro_wood_fence", () -> new EnviroWoodFenceBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_FENCE_GATE = REGISTRY.register("enviro_wood_fence_gate",
			() -> new EnviroWoodFenceGateBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_PRESSURE_PLATE = REGISTRY.register("enviro_wood_pressure_plate",
			() -> new EnviroWoodPressurePlateBlock());
	public static final RegistryObject<Block> ENVIRO_WOOD_BUTTON = REGISTRY.register("enviro_wood_button", () -> new EnviroWoodButtonBlock());
	public static final RegistryObject<Block> OCEAN_WOOD = REGISTRY.register("ocean_wood", () -> new OceanWoodBlock());
	public static final RegistryObject<Block> OCEAN_LOG = REGISTRY.register("ocean_log", () -> new OceanLogBlock());
	public static final RegistryObject<Block> OCEAN_PLANKS = REGISTRY.register("ocean_planks", () -> new OceanPlanksBlock());
	public static final RegistryObject<Block> OCEAN_LEAVES = REGISTRY.register("ocean_leaves", () -> new OceanLeavesBlock());
	public static final RegistryObject<Block> OCEAN_STAIRS = REGISTRY.register("ocean_stairs", () -> new OceanStairsBlock());
	public static final RegistryObject<Block> OCEAN_SLAB = REGISTRY.register("ocean_slab", () -> new OceanSlabBlock());
	public static final RegistryObject<Block> OCEAN_FENCE = REGISTRY.register("ocean_fence", () -> new OceanFenceBlock());
	public static final RegistryObject<Block> OCEAN_FENCE_GATE = REGISTRY.register("ocean_fence_gate", () -> new OceanFenceGateBlock());
	public static final RegistryObject<Block> OCEAN_PRESSURE_PLATE = REGISTRY.register("ocean_pressure_plate", () -> new OceanPressurePlateBlock());
	public static final RegistryObject<Block> OCEAN_BUTTON = REGISTRY.register("ocean_button", () -> new OceanButtonBlock());
	public static final RegistryObject<Block> WIND_WOOD = REGISTRY.register("wind_wood", () -> new WindWoodBlock());
	public static final RegistryObject<Block> WIND_LOG = REGISTRY.register("wind_log", () -> new WindLogBlock());
	public static final RegistryObject<Block> WIND_PLANKS = REGISTRY.register("wind_planks", () -> new WindPlanksBlock());
	public static final RegistryObject<Block> WIND_LEAVES = REGISTRY.register("wind_leaves", () -> new WindLeavesBlock());
	public static final RegistryObject<Block> WIND_STAIRS = REGISTRY.register("wind_stairs", () -> new WindStairsBlock());
	public static final RegistryObject<Block> WIND_SLAB = REGISTRY.register("wind_slab", () -> new WindSlabBlock());
	public static final RegistryObject<Block> WIND_FENCE = REGISTRY.register("wind_fence", () -> new WindFenceBlock());
	public static final RegistryObject<Block> WIND_FENCE_GATE = REGISTRY.register("wind_fence_gate", () -> new WindFenceGateBlock());
	public static final RegistryObject<Block> WIND_PRESSURE_PLATE = REGISTRY.register("wind_pressure_plate", () -> new WindPressurePlateBlock());
	public static final RegistryObject<Block> WIND_BUTTON = REGISTRY.register("wind_button", () -> new WindButtonBlock());
	public static final RegistryObject<Block> ENVIRO_SAND = REGISTRY.register("enviro_sand", () -> new EnviroSandBlock());
	public static final RegistryObject<Block> ENVIRO_STONE = REGISTRY.register("enviro_stone", () -> new EnviroStoneBlock());
	public static final RegistryObject<Block> ENVIRO_ICE = REGISTRY.register("enviro_ice", () -> new EnviroIceBlock());
	public static final RegistryObject<Block> POWER_BOX = REGISTRY.register("power_box", () -> new PowerBoxBlock());
	public static final RegistryObject<Block> ENVIRO_DIRT = REGISTRY.register("enviro_dirt", () -> new EnviroDirtBlock());
	public static final RegistryObject<Block> ENVIRO_VINES = REGISTRY.register("enviro_vines", () -> new EnviroVinesBlock());
	public static final RegistryObject<Block> ENVIRO_PLANT = REGISTRY.register("enviro_plant", () -> new EnviroPlantBlock());
	public static final RegistryObject<Block> ENVIRO_WATER = REGISTRY.register("enviro_water", () -> new EnviroWaterBlock());
	public static final RegistryObject<Block> ENVIRO_LAVA = REGISTRY.register("enviro_lava", () -> new EnviroLavaBlock());
	public static final RegistryObject<Block> GREEN_GENERATOR = REGISTRY.register("green_generator", () -> new GreenGeneratorBlock());
	public static final RegistryObject<Block> WATER_TANK = REGISTRY.register("water_tank", () -> new WaterTankBlock());
	public static final RegistryObject<Block> ENVIRO_FRAME = REGISTRY.register("enviro_frame", () -> new EnviroFrameBlock());
	public static final RegistryObject<Block> ENVIRO_FIREWORK_BLOCK = REGISTRY.register("enviro_firework_block",
			() -> new EnviroFireworkBlockBlock());
	public static final RegistryObject<Block> ENERGY_ORE = REGISTRY.register("energy_ore", () -> new EnergyOreBlock());
	public static final RegistryObject<Block> ENERGY_BLOCK = REGISTRY.register("energy_block", () -> new EnergyBlockBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_WOOD = REGISTRY.register("energy_wood_wood", () -> new EnergyWoodWoodBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_LOG = REGISTRY.register("energy_wood_log", () -> new EnergyWoodLogBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_PLANKS = REGISTRY.register("energy_wood_planks", () -> new EnergyWoodPlanksBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_LEAVES = REGISTRY.register("energy_wood_leaves", () -> new EnergyWoodLeavesBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_STAIRS = REGISTRY.register("energy_wood_stairs", () -> new EnergyWoodStairsBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_SLAB = REGISTRY.register("energy_wood_slab", () -> new EnergyWoodSlabBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_FENCE = REGISTRY.register("energy_wood_fence", () -> new EnergyWoodFenceBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_FENCE_GATE = REGISTRY.register("energy_wood_fence_gate",
			() -> new EnergyWoodFenceGateBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_PRESSURE_PLATE = REGISTRY.register("energy_wood_pressure_plate",
			() -> new EnergyWoodPressurePlateBlock());
	public static final RegistryObject<Block> ENERGY_WOOD_BUTTON = REGISTRY.register("energy_wood_button", () -> new EnergyWoodButtonBlock());
	public static final RegistryObject<Block> TRIANGLE_GENERATOR = REGISTRY.register("triangle_generator", () -> new TriangleGeneratorBlock());
	public static final RegistryObject<Block> ENVIRO_PUMPKIN = REGISTRY.register("enviro_pumpkin", () -> new EnviroPumpkinBlock());
	public static final RegistryObject<Block> ENVIRO_STORAGE = REGISTRY.register("enviro_storage", () -> new EnviroStorageBlock());
	public static final RegistryObject<Block> ENVIRO_GRAVEL = REGISTRY.register("enviro_gravel", () -> new EnviroGravelBlock());
	public static final RegistryObject<Block> ENVIRO_CHEST = REGISTRY.register("enviro_chest", () -> new EnviroChestBlock());
	public static final RegistryObject<Block> ENVIRO_LOG = REGISTRY.register("enviro_log", () -> new EnviroLogBlock());
	public static final RegistryObject<Block> ENVIRO_MUSHROOM = REGISTRY.register("enviro_mushroom", () -> new EnviroMushroomBlock());
	public static final RegistryObject<Block> ENVIRO_ORE_BLOCK = REGISTRY.register("enviro_ore_block", () -> new EnviroOreBlockBlock());
	public static final RegistryObject<Block> ENVIRO_ROD_BLOCK = REGISTRY.register("enviro_rod_block", () -> new EnviroRodBlockBlock());
	public static final RegistryObject<Block> ENVIRO_TORCH = REGISTRY.register("enviro_torch", () -> new EnviroTorchBlock());
	public static final RegistryObject<Block> ENVIRO_BLOCK_RED = REGISTRY.register("enviro_block_red", () -> new EnviroBlockRedBlock());
	public static final RegistryObject<Block> ENVIRO_BLOCK_BLUE = REGISTRY.register("enviro_block_blue", () -> new EnviroBlockBlueBlock());
	public static final RegistryObject<Block> ENVIRO_CROPS = REGISTRY.register("enviro_crops", () -> new EnviroCropsBlock());
	public static final RegistryObject<Block> RECYCLING_MACHINE = REGISTRY.register("recycling_machine", () -> new RecyclingMachineBlock());
	public static final RegistryObject<Block> ENVIRO_DIRT_WITH_GEM = REGISTRY.register("enviro_dirt_with_gem", () -> new EnviroDirtWithGemBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			EnviroTreeBlock.registerRenderLayer();
			EnviroVinesBlock.registerRenderLayer();
			EnviroPlantBlock.registerRenderLayer();
			EnviroFrameBlock.registerRenderLayer();
			EnviroRodBlockBlock.registerRenderLayer();
			EnviroTorchBlock.registerRenderLayer();
			EnviroCropsBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			EnviroGrassBlock.blockColorLoad(event);
		}
	}
}
