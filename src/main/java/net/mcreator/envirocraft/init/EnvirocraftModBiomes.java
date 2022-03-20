
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.envirocraft.world.biome.EnviroWoodedMountainsBiome;
import net.mcreator.envirocraft.world.biome.EnviroWoodedHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroWoodedBiome;
import net.mcreator.envirocraft.world.biome.EnviroTundraHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroTundraBiome;
import net.mcreator.envirocraft.world.biome.EnviroTaigaHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroTaigaBiome;
import net.mcreator.envirocraft.world.biome.EnviroSwampHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroSwampBiome;
import net.mcreator.envirocraft.world.biome.EnviroSavannaBiome;
import net.mcreator.envirocraft.world.biome.EnviroPineTaigaHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroPineTaigaBiome;
import net.mcreator.envirocraft.world.biome.EnviroOceanWarmBiome;
import net.mcreator.envirocraft.world.biome.EnviroOceanLukewarmBiome;
import net.mcreator.envirocraft.world.biome.EnviroOceanFrozenBiome;
import net.mcreator.envirocraft.world.biome.EnviroOceanColdBiome;
import net.mcreator.envirocraft.world.biome.EnviroOceanBiome;
import net.mcreator.envirocraft.world.biome.EnviroMountainsBiome;
import net.mcreator.envirocraft.world.biome.EnviroLandsHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroLandsForestHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroLandsForestBiome;
import net.mcreator.envirocraft.world.biome.EnviroLandsBiome;
import net.mcreator.envirocraft.world.biome.EnviroLakeBiome;
import net.mcreator.envirocraft.world.biome.EnviroJungleHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroJungleBiome;
import net.mcreator.envirocraft.world.biome.EnviroIcyHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroIcyBiome;
import net.mcreator.envirocraft.world.biome.EnviroHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroForestHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroForestBiome;
import net.mcreator.envirocraft.world.biome.EnviroFlowerHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroFlowerForestHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroFlowerForestBiome;
import net.mcreator.envirocraft.world.biome.EnviroFlowerBiome;
import net.mcreator.envirocraft.world.biome.EnviroDesertBiome;
import net.mcreator.envirocraft.world.biome.EnviroDeepOceanBiome;
import net.mcreator.envirocraft.world.biome.EnviroBirchForestHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroBirchForestBiome;
import net.mcreator.envirocraft.world.biome.EnviroBiomeBiome;
import net.mcreator.envirocraft.world.biome.EnviroBigTaigaHillsBiome;
import net.mcreator.envirocraft.world.biome.EnviroBigTaigaBiome;
import net.mcreator.envirocraft.EnvirocraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnvirocraftModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, EnvirocraftMod.MODID);
	public static final RegistryObject<Biome> ENVIRO_BIOME = REGISTRY.register("enviro_biome", () -> EnviroBiomeBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_HILLS = REGISTRY.register("enviro_hills", () -> EnviroHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_FOREST = REGISTRY.register("enviro_forest", () -> EnviroForestBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_DESERT = REGISTRY.register("enviro_desert", () -> EnviroDesertBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_FOREST_HILLS = REGISTRY.register("enviro_forest_hills",
			() -> EnviroForestHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_SWAMP = REGISTRY.register("enviro_swamp", () -> EnviroSwampBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_JUNGLE = REGISTRY.register("enviro_jungle", () -> EnviroJungleBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_MOUNTAINS = REGISTRY.register("enviro_mountains", () -> EnviroMountainsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_ICY = REGISTRY.register("enviro_icy", () -> EnviroIcyBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_SWAMP_HILLS = REGISTRY.register("enviro_swamp_hills", () -> EnviroSwampHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_JUNGLE_HILLS = REGISTRY.register("enviro_jungle_hills",
			() -> EnviroJungleHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_SAVANNA = REGISTRY.register("enviro_savanna", () -> EnviroSavannaBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_TAIGA = REGISTRY.register("enviro_taiga", () -> EnviroTaigaBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_LANDS = REGISTRY.register("enviro_lands", () -> EnviroLandsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_BIG_TAIGA = REGISTRY.register("enviro_big_taiga", () -> EnviroBigTaigaBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_TAIGA_HILLS = REGISTRY.register("enviro_taiga_hills", () -> EnviroTaigaHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_BIRCH_FOREST = REGISTRY.register("enviro_birch_forest",
			() -> EnviroBirchForestBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_BIRCH_FOREST_HILLS = REGISTRY.register("enviro_birch_forest_hills",
			() -> EnviroBirchForestHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_FLOWER_FOREST = REGISTRY.register("enviro_flower_forest",
			() -> EnviroFlowerForestBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_OCEAN = REGISTRY.register("enviro_ocean", () -> EnviroOceanBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_BIG_TAIGA_HILLS = REGISTRY.register("enviro_big_taiga_hills",
			() -> EnviroBigTaigaHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_ICY_HILLS = REGISTRY.register("enviro_icy_hills", () -> EnviroIcyHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_PINE_TAIGA = REGISTRY.register("enviro_pine_taiga", () -> EnviroPineTaigaBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_PINE_TAIGA_HILLS = REGISTRY.register("enviro_pine_taiga_hills",
			() -> EnviroPineTaigaHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_FLOWER_FOREST_HILLS = REGISTRY.register("enviro_flower_forest_hills",
			() -> EnviroFlowerForestHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_FLOWER_HILLS = REGISTRY.register("enviro_flower_hills",
			() -> EnviroFlowerHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_LANDS_FOREST = REGISTRY.register("enviro_lands_forest",
			() -> EnviroLandsForestBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_LANDS_HILLS = REGISTRY.register("enviro_lands_hills", () -> EnviroLandsHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_LANDS_FOREST_HILLS = REGISTRY.register("enviro_lands_forest_hills",
			() -> EnviroLandsForestHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_DEEP_OCEAN = REGISTRY.register("enviro_deep_ocean", () -> EnviroDeepOceanBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_FLOWER = REGISTRY.register("enviro_flower", () -> EnviroFlowerBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_WOODED_MOUNTAINS = REGISTRY.register("enviro_wooded_mountains",
			() -> EnviroWoodedMountainsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_TUNDRA = REGISTRY.register("enviro_tundra", () -> EnviroTundraBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_TUNDRA_HILLS = REGISTRY.register("enviro_tundra_hills",
			() -> EnviroTundraHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_LAKE = REGISTRY.register("enviro_lake", () -> EnviroLakeBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_OCEAN_WARM = REGISTRY.register("enviro_ocean_warm", () -> EnviroOceanWarmBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_OCEAN_COLD = REGISTRY.register("enviro_ocean_cold", () -> EnviroOceanColdBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_OCEAN_FROZEN = REGISTRY.register("enviro_ocean_frozen",
			() -> EnviroOceanFrozenBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_WOODED = REGISTRY.register("enviro_wooded", () -> EnviroWoodedBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_WOODED_HILLS = REGISTRY.register("enviro_wooded_hills",
			() -> EnviroWoodedHillsBiome.createBiome());
	public static final RegistryObject<Biome> ENVIRO_OCEAN_LUKEWARM = REGISTRY.register("enviro_ocean_lukewarm",
			() -> EnviroOceanLukewarmBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EnviroBiomeBiome.init();
			EnviroHillsBiome.init();
			EnviroForestBiome.init();
			EnviroDesertBiome.init();
			EnviroForestHillsBiome.init();
			EnviroSwampBiome.init();
			EnviroJungleBiome.init();
			EnviroMountainsBiome.init();
			EnviroIcyBiome.init();
			EnviroSwampHillsBiome.init();
			EnviroJungleHillsBiome.init();
			EnviroSavannaBiome.init();
			EnviroTaigaBiome.init();
			EnviroLandsBiome.init();
			EnviroBigTaigaBiome.init();
			EnviroTaigaHillsBiome.init();
			EnviroBirchForestBiome.init();
			EnviroBirchForestHillsBiome.init();
			EnviroFlowerForestBiome.init();
			EnviroOceanBiome.init();
			EnviroBigTaigaHillsBiome.init();
			EnviroIcyHillsBiome.init();
			EnviroPineTaigaBiome.init();
			EnviroPineTaigaHillsBiome.init();
			EnviroFlowerForestHillsBiome.init();
			EnviroFlowerHillsBiome.init();
			EnviroLandsForestBiome.init();
			EnviroLandsHillsBiome.init();
			EnviroLandsForestHillsBiome.init();
			EnviroDeepOceanBiome.init();
			EnviroFlowerBiome.init();
			EnviroWoodedMountainsBiome.init();
			EnviroTundraBiome.init();
			EnviroTundraHillsBiome.init();
			EnviroLakeBiome.init();
			EnviroOceanWarmBiome.init();
			EnviroOceanColdBiome.init();
			EnviroOceanFrozenBiome.init();
			EnviroWoodedBiome.init();
			EnviroWoodedHillsBiome.init();
			EnviroOceanLukewarmBiome.init();
		});
	}
}
