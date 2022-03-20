
package net.mcreator.envirocraft.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
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
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.envirocraft.world.features.treedecorators.EnviroPineTaigaTrunkDecorator;
import net.mcreator.envirocraft.world.features.treedecorators.EnviroPineTaigaLeaveDecorator;
import net.mcreator.envirocraft.world.features.treedecorators.EnviroPineTaigaFruitDecorator;
import net.mcreator.envirocraft.init.EnvirocraftModEntities;
import net.mcreator.envirocraft.init.EnvirocraftModBlocks;
import net.mcreator.envirocraft.init.EnvirocraftModBiomes;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class EnviroPineTaigaBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).ambientLoopSound(new SoundEvent(new ResourceLocation("ambient.cave")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("block.ancient_debris.break")), 9000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("ambient.underwater.loop")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("music.creative")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("envirocraft:tree_enviro_pine_taiga",
				FeatureUtils.register("envirocraft:tree_enviro_pine_taiga", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
						BlockStateProvider.simple(EnvirocraftModBlocks.ENVIRO_WOOD_LOG.get().defaultBlockState()), new GiantTrunkPlacer(18, 2, 14),
						BlockStateProvider.simple(EnvirocraftModBlocks.ENVIRO_WOOD_LEAVES.get().defaultBlockState()),
						new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 4)), new TwoLayersFeatureSize(1, 1, 2))
								.decorators(ImmutableList.of(EnviroPineTaigaLeaveDecorator.INSTANCE, EnviroPineTaigaTrunkDecorator.INSTANCE,
										EnviroPineTaigaFruitDecorator.INSTANCE))
								.build()),
				List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
						PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:grass_enviro_pine_taiga", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:flower_enviro_pine_taiga", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(7),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_sand_enviro_pine_taiga",
						FeatureUtils.register("envirocraft:disk_sand_enviro_pine_taiga", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_GRASS.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_DIRT.get().defaultBlockState()))),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_gravel_enviro_pine_taiga",
						FeatureUtils.register("envirocraft:disk_gravel_enviro_pine_taiga", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_GRASS.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_DIRT.get().defaultBlockState()))),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_PIG.get(), 5, 2, 16));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_CRAFT_MONSTER.get(), 5, 2, 16));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.TAIGA).temperature(0.1f)
				.downfall(0.2f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(EnvirocraftModBiomes.ENVIRO_PINE_TAIGA.get())),
				BiomeDictionary.Type.COLD);
	}
}
