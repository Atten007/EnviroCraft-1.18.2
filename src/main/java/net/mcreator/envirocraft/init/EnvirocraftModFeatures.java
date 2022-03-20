
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.envirocraft.world.features.plants.EnviroVinesFeature;
import net.mcreator.envirocraft.world.features.plants.EnviroTreeFeature;
import net.mcreator.envirocraft.world.features.plants.EnviroPlantFeature;
import net.mcreator.envirocraft.world.features.plants.EnviroCropsFeature;
import net.mcreator.envirocraft.world.features.ores.WindOreFeature;
import net.mcreator.envirocraft.world.features.ores.OceanOreFeature;
import net.mcreator.envirocraft.world.features.ores.EnviroOreFeature;
import net.mcreator.envirocraft.world.features.ores.EnergyOreFeature;
import net.mcreator.envirocraft.world.features.lakes.EnviroWaterFeature;
import net.mcreator.envirocraft.world.features.lakes.EnviroLavaFeature;
import net.mcreator.envirocraft.world.features.lakes.EnviroFluidFeature;
import net.mcreator.envirocraft.world.features.WindTurbineBuildFeature;
import net.mcreator.envirocraft.world.features.SolarParkFeature;
import net.mcreator.envirocraft.world.features.OceanGeneratorRoomFeature;
import net.mcreator.envirocraft.EnvirocraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class EnvirocraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EnvirocraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ENVIRO_ORE = register("enviro_ore", EnviroOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EnviroOreFeature.GENERATE_BIOMES, EnviroOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_TREE = register("enviro_tree", EnviroTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, EnviroTreeFeature.GENERATE_BIOMES, EnviroTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WIND_ORE = register("wind_ore", WindOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WindOreFeature.GENERATE_BIOMES, WindOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OCEAN_ORE = register("ocean_ore", OceanOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OceanOreFeature.GENERATE_BIOMES, OceanOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OCEAN_GENERATOR_ROOM = register("ocean_generator_room", OceanGeneratorRoomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OceanGeneratorRoomFeature.GENERATE_BIOMES,
					OceanGeneratorRoomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WIND_TURBINE_BUILD = register("wind_turbine_build", WindTurbineBuildFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, WindTurbineBuildFeature.GENERATE_BIOMES,
					WindTurbineBuildFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_FLUID = register("enviro_fluid", EnviroFluidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, EnviroFluidFeature.GENERATE_BIOMES, EnviroFluidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_VINES = register("enviro_vines", EnviroVinesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, EnviroVinesFeature.GENERATE_BIOMES, EnviroVinesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_PLANT = register("enviro_plant", EnviroPlantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, EnviroPlantFeature.GENERATE_BIOMES, EnviroPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_WATER = register("enviro_water", EnviroWaterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, EnviroWaterFeature.GENERATE_BIOMES, EnviroWaterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_LAVA = register("enviro_lava", EnviroLavaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, EnviroLavaFeature.GENERATE_BIOMES, EnviroLavaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENERGY_ORE = register("energy_ore", EnergyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EnergyOreFeature.GENERATE_BIOMES, EnergyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SOLAR_PARK = register("solar_park", SolarParkFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SolarParkFeature.GENERATE_BIOMES, SolarParkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENVIRO_CROPS = register("enviro_crops", EnviroCropsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, EnviroCropsFeature.GENERATE_BIOMES, EnviroCropsFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
