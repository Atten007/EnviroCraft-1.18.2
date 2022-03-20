
package net.mcreator.envirocraft.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import java.util.Set;
import java.util.List;

public class WindTurbineBuildFeature extends Feature<NoneFeatureConfiguration> {
	public static WindTurbineBuildFeature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new WindTurbineBuildFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("envirocraft:wind_turbine_build", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("envirocraft:wind_turbine_build", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"),
			new ResourceLocation("envirocraft:enviro_forest_hills"), new ResourceLocation("envirocraft:enviro_jungle_hills"),
			new ResourceLocation("birch_forest"), new ResourceLocation("envirocraft:enviro_hills"),
			new ResourceLocation("envirocraft:enviro_wooded_hills"), new ResourceLocation("envirocraft:enviro_icy_hills"),
			new ResourceLocation("bamboo_jungle"), new ResourceLocation("dark_forest"), new ResourceLocation("envirocraft:enviro_birch_forest_hills"),
			new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("envirocraft:enviro_lands_forest_hills"),
			new ResourceLocation("envirocraft:enviro_lands_hills"), new ResourceLocation("taiga"), new ResourceLocation("snowy_taiga"),
			new ResourceLocation("swamp"), new ResourceLocation("envirocraft:enviro_flower_hills"),
			new ResourceLocation("envirocraft:enviro_pine_taiga_hills"), new ResourceLocation("envirocraft:enviro_big_taiga_hills"),
			new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("envirocraft:enviro_flower_forest_hills"),
			new ResourceLocation("windswept_hills"), new ResourceLocation("envirocraft:enviro_tundra_hills"),
			new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("windswept_savanna"),
			new ResourceLocation("envirocraft:enviro_swamp_hills"), new ResourceLocation("windswept_forest"),
			new ResourceLocation("envirocraft:enviro_taiga_hills"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"),
			new ResourceLocation("desert"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("envirocraft:enviro_dim")));
	private StructureTemplate template = null;

	public WindTurbineBuildFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("envirocraft", "windturbine"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 100000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
