
package net.mcreator.envirocraft.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
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
import net.minecraft.util.valueproviders.UniformInt;
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
import net.minecraft.core.Registry;

import net.mcreator.envirocraft.init.EnvirocraftModBlocks;
import net.mcreator.envirocraft.init.EnvirocraftModBiomes;

import java.util.List;

public class EnviroLakeBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("ambient.underwater.loop.additions")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("ambient.underwater.enter")), 9000, 8, 2))
				.ambientAdditionsSound(
						new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("entity.minecart.inside.underwater")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("ambient.underwater.loop")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:seagrass_enviro_lake", AquaticFeatures.SEAGRASS_SHORT, AquaticPlacements.seagrassPlacement(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:patch_sugar_cane_enviro_lake", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_sand_enviro_lake",
						FeatureUtils.register("envirocraft:disk_sand_enviro_lake", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_FLUID.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_FLUID.get().defaultBlockState()))),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("envirocraft:disk_gravel_enviro_lake",
						FeatureUtils.register("envirocraft:disk_gravel_enviro_lake", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(EnvirocraftModBlocks.ENVIRO_FLUID.get().defaultBlockState(),
												EnvirocraftModBlocks.ENVIRO_FLUID.get().defaultBlockState()))),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).temperature(0.5f)
				.downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(EnvirocraftModBiomes.ENVIRO_LAKE.get())),
				BiomeDictionary.Type.OCEAN);
	}
}
