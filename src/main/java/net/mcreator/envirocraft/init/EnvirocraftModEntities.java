
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.envirocraft.entity.EnviroVillagerEntity;
import net.mcreator.envirocraft.entity.EnviroSheepEntity;
import net.mcreator.envirocraft.entity.EnviroRabbitEntity;
import net.mcreator.envirocraft.entity.EnviroPigEntity;
import net.mcreator.envirocraft.entity.EnviroCraftMonsterEntity;
import net.mcreator.envirocraft.entity.EnviroCowEntity;
import net.mcreator.envirocraft.entity.EnviroChickenEntity;
import net.mcreator.envirocraft.entity.EnviroBrineEntity;
import net.mcreator.envirocraft.EnvirocraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnvirocraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, EnvirocraftMod.MODID);
	public static final RegistryObject<EntityType<EnviroCraftMonsterEntity>> ENVIRO_CRAFT_MONSTER = register("enviro_craft_monster",
			EntityType.Builder.<EnviroCraftMonsterEntity>of(EnviroCraftMonsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroCraftMonsterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnviroPigEntity>> ENVIRO_PIG = register("enviro_pig",
			EntityType.Builder.<EnviroPigEntity>of(EnviroPigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroPigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<EnviroSheepEntity>> ENVIRO_SHEEP = register("enviro_sheep",
			EntityType.Builder.<EnviroSheepEntity>of(EnviroSheepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroSheepEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<EnviroBrineEntity>> ENVIRO_BRINE = register("enviro_brine",
			EntityType.Builder.<EnviroBrineEntity>of(EnviroBrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroBrineEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnviroCowEntity>> ENVIRO_COW = register("enviro_cow",
			EntityType.Builder.<EnviroCowEntity>of(EnviroCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<EnviroChickenEntity>> ENVIRO_CHICKEN = register("enviro_chicken",
			EntityType.Builder.<EnviroChickenEntity>of(EnviroChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroChickenEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<EnviroRabbitEntity>> ENVIRO_RABBIT = register("enviro_rabbit",
			EntityType.Builder.<EnviroRabbitEntity>of(EnviroRabbitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroRabbitEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<EnviroVillagerEntity>> ENVIRO_VILLAGER = register("enviro_villager",
			EntityType.Builder.<EnviroVillagerEntity>of(EnviroVillagerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnviroVillagerEntity::new)

					.sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EnviroCraftMonsterEntity.init();
			EnviroPigEntity.init();
			EnviroSheepEntity.init();
			EnviroBrineEntity.init();
			EnviroCowEntity.init();
			EnviroChickenEntity.init();
			EnviroRabbitEntity.init();
			EnviroVillagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENVIRO_CRAFT_MONSTER.get(), EnviroCraftMonsterEntity.createAttributes().build());
		event.put(ENVIRO_PIG.get(), EnviroPigEntity.createAttributes().build());
		event.put(ENVIRO_SHEEP.get(), EnviroSheepEntity.createAttributes().build());
		event.put(ENVIRO_BRINE.get(), EnviroBrineEntity.createAttributes().build());
		event.put(ENVIRO_COW.get(), EnviroCowEntity.createAttributes().build());
		event.put(ENVIRO_CHICKEN.get(), EnviroChickenEntity.createAttributes().build());
		event.put(ENVIRO_RABBIT.get(), EnviroRabbitEntity.createAttributes().build());
		event.put(ENVIRO_VILLAGER.get(), EnviroVillagerEntity.createAttributes().build());
	}
}
