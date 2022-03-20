
package net.mcreator.envirocraft.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.AquaticFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import net.mcreator.envirocraft.world.features.treedecorators.EnviroWoodedHillsTrunkDecorator;
import net.mcreator.envirocraft.world.features.treedecorators.EnviroWoodedHillsLeaveDecorator;
import net.mcreator.envirocraft.world.features.treedecorators.EnviroWoodedHillsFruitDecorator;
import net.mcreator.envirocraft.init.EnvirocraftModEntities;
import net.mcreator.envirocraft.init.EnvirocraftModBlocks;
import net.mcreator.envirocraft.init.EnvirocraftModBiomes;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class EnviroWoodedHillsBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).ambientLoopSound(new SoundEvent(new ResourceLocation("ambient.cave")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("block.amethyst_block.chime")), 9000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("ambient.nether_wastes.loop")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("music.creative")), 12000, 24000, true))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.END_ROD, 0.0025f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:tree_enviro_wooded_hills",
						FeatureUtils.register("envirocraft:tree_enviro_wooded_hills", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(EnvirocraftModBlocks.ENVIRO_WOOD_LOG.get().defaultBlockState()),
										new StraightTrunkPlacer(7, 2, 0),
										BlockStateProvider.simple(EnvirocraftModBlocks.ENVIRO_WOOD_WOOD.get().defaultBlockState()),
										new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
												.decorators(ImmutableList.of(EnviroWoodedHillsLeaveDecorator.INSTANCE,
														EnviroWoodedHillsTrunkDecorator.INSTANCE, EnviroWoodedHillsFruitDecorator.INSTANCE))
												.build()),
						List.of(CountPlacement.of(10), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:grass_enviro_wooded_hills", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils
				.register("envirocraft:seagrass_enviro_wooded_hills", AquaticFeatures.SEAGRASS_SHORT, AquaticPlacements.seagrassPlacement(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:flower_enviro_wooded_hills", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(9),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:brown_mushroom_enviro_wooded_hills", VegetationFeatures.PATCH_BROWN_MUSHROOM,
						List.of(CountPlacement.of(2), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:red_mushroom_enviro_wooded_hills", VegetationFeatures.PATCH_RED_MUSHROOM,
						List.of(CountPlacement.of(2), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:mushrooms_huge_enviro_wooded_hills", VegetationFeatures.MUSHROOM_ISLAND_VEGETATION,
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:patch_sugar_cane_enviro_wooded_hills", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:patch_cactus_enviro_wooded_hills", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_sand_enviro_wooded_hills",
						FeatureUtils.register("envirocraft:disk_sand_enviro_wooded_hills", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_GRASS.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_DIRT.get().defaultBlockState()))),
						List.of(CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_gravel_enviro_wooded_hills",
						FeatureUtils.register("envirocraft:disk_gravel_enviro_wooded_hills", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_GRASS.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_DIRT.get().defaultBlockState()))),
						List.of(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_CRAFT_MONSTER.get(), 30, 1, 9));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_PIG.get(), 30, 2, 10));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).temperature(0.75f)
				.downfall(0.251f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(EnvirocraftModBiomes.ENVIRO_WOODED_HILLS.get())),
				BiomeDictionary.Type.FOREST, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.HILLS);
	}
}
