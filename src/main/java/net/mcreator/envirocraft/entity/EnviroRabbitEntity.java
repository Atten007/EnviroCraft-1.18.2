
package net.mcreator.envirocraft.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.envirocraft.init.EnvirocraftModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class EnviroRabbitEntity extends PathfinderMob {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("envirocraft:enviro_icy"),
			new ResourceLocation("envirocraft:enviro_forest_hills"), new ResourceLocation("envirocraft:enviro_jungle_hills"),
			new ResourceLocation("envirocraft:enviro_forest"), new ResourceLocation("envirocraft:enviro_hills"),
			new ResourceLocation("envirocraft:enviro_jungle"), new ResourceLocation("envirocraft:enviro_pine_taiga"),
			new ResourceLocation("envirocraft:enviro_big_taiga"), new ResourceLocation("envirocraft:enviro_icy_hills"),
			new ResourceLocation("envirocraft:enviro_swamp"), new ResourceLocation("envirocraft:enviro_birch_forest_hills"),
			new ResourceLocation("envirocraft:enviro_deep_ocean"), new ResourceLocation("envirocraft:enviro_lands_forest"),
			new ResourceLocation("envirocraft:enviro_lands_forest_hills"), new ResourceLocation("envirocraft:enviro_mountains"),
			new ResourceLocation("envirocraft:enviro_lands_hills"), new ResourceLocation("envirocraft:enviro_flower"),
			new ResourceLocation("envirocraft:enviro_savanna"), new ResourceLocation("envirocraft:enviro_desert"),
			new ResourceLocation("envirocraft:enviro_flower_hills"), new ResourceLocation("envirocraft:enviro_pine_taiga_hills"),
			new ResourceLocation("envirocraft:enviro_biome"), new ResourceLocation("envirocraft:enviro_big_taiga_hills"),
			new ResourceLocation("envirocraft:enviro_flower_forest_hills"), new ResourceLocation("envirocraft:enviro_swamp_hills"),
			new ResourceLocation("envirocraft:enviro_flower_forest"), new ResourceLocation("envirocraft:enviro_taiga_hills"),
			new ResourceLocation("envirocraft:enviro_birch_forest"), new ResourceLocation("envirocraft:enviro_ocean"),
			new ResourceLocation("envirocraft:enviro_lands"), new ResourceLocation("envirocraft:enviro_taiga"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.CREATURE)
					.add(new MobSpawnSettings.SpawnerData(EnvirocraftModEntities.ENVIRO_RABBIT.get(), 10, 1, 8));
	}

	public EnviroRabbitEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EnvirocraftModEntities.ENVIRO_RABBIT.get(), world);
	}

	public EnviroRabbitEntity(EntityType<EnviroRabbitEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.rabbit.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.rabbit.jump")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.rabbit.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.rabbit.death"));
	}

	public static void init() {
		SpawnPlacements.register(EnvirocraftModEntities.ENVIRO_RABBIT.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		return builder;
	}
}
