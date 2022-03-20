
package net.mcreator.envirocraft.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
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

import net.mcreator.envirocraft.world.features.treedecorators.EnviroJungleHillsTrunkDecorator;
import net.mcreator.envirocraft.world.features.treedecorators.EnviroJungleHillsLeaveDecorator;
import net.mcreator.envirocraft.world.features.treedecorators.EnviroJungleHillsFruitDecorator;
import net.mcreator.envirocraft.init.EnvirocraftModEntities;
import net.mcreator.envirocraft.init.EnvirocraftModBlocks;
import net.mcreator.envirocraft.init.EnvirocraftModBiomes;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class EnviroJungleHillsBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).ambientLoopSound(new SoundEvent(new ResourceLocation("ambient.cave")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("block.amethyst_cluster.break")), 9000, 8, 2))
				.ambientAdditionsSound(
						new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("ambient.underwater.loop.additions")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("music.creative")), 12000, 24000, true))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.CRIT, 0.0025f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:tree_enviro_jungle_hills",
						FeatureUtils.register("envirocraft:tree_enviro_jungle_hills", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(EnvirocraftModBlocks.ENVIRO_WOOD_LOG.get().defaultBlockState()),
										new MegaJungleTrunkPlacer(7, 2, 19),
										BlockStateProvider.simple(EnvirocraftModBlocks.ENVIRO_WOOD_WOOD.get().defaultBlockState()),
										new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2), new TwoLayersFeatureSize(1, 1, 2))
												.decorators(ImmutableList.of(EnviroJungleHillsLeaveDecorator.INSTANCE,
														EnviroJungleHillsTrunkDecorator.INSTANCE, EnviroJungleHillsFruitDecorator.INSTANCE))
												.build()),
						List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:grass_enviro_jungle_hills", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils
				.register("envirocraft:seagrass_enviro_jungle_hills", AquaticFeatures.SEAGRASS_SHORT, AquaticPlacements.seagrassPlacement(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:flower_enviro_jungle_hills", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(5),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:brown_mushroom_enviro_jungle_hills", VegetationFeatures.PATCH_BROWN_MUSHROOM,
						List.of(CountPlacement.of(1), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:red_mushroom_enviro_jungle_hills", VegetationFeatures.PATCH_RED_MUSHROOM,
						List.of(CountPlacement.of(1), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:mushrooms_huge_enviro_jungle_hills", VegetationFeatures.MUSHROOM_ISLAND_VEGETATION,
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:patch_sugar_cane_enviro_jungle_hills", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:patch_cactus_enviro_jungle_hills", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_sand_enviro_jungle_hills",
						FeatureUtils.register("envirocraft:disk_sand_enviro_jungle_hills", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_GRASS.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_BLOCK.get().defaultBlockState()))),
						List.of(CountPlacement.of(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_gravel_enviro_jungle_hills",
						FeatureUtils.register("envirocraft:disk_gravel_enviro_jungle_hills", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_GRASS.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_BLOCK.get().defaultBlockState()))),
						List.of(CountPlacement.of(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_PIG.get(), 3, 1, 15));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_CRAFT_MONSTER.get(), 3, 1, 15));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).temperature(1.205f)
				.downfall(0.995f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(EnvirocraftModBiomes.ENVIRO_JUNGLE_HILLS.get())),
				BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HILLS);
	}
}
