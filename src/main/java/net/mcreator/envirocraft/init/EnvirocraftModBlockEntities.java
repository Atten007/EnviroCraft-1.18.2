
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.envirocraft.block.entity.WaterTankBlockEntity;
import net.mcreator.envirocraft.block.entity.SolarCellBlockEntity;
import net.mcreator.envirocraft.block.entity.RecyclingMachineBlockEntity;
import net.mcreator.envirocraft.block.entity.EnviroChestBlockEntity;
import net.mcreator.envirocraft.EnvirocraftMod;

public class EnvirocraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, EnvirocraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_CELL = register("solar_cell", EnvirocraftModBlocks.SOLAR_CELL,
			SolarCellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WATER_TANK = register("water_tank", EnvirocraftModBlocks.WATER_TANK,
			WaterTankBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENVIRO_CHEST = register("enviro_chest", EnvirocraftModBlocks.ENVIRO_CHEST,
			EnviroChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RECYCLING_MACHINE = register("recycling_machine", EnvirocraftModBlocks.RECYCLING_MACHINE,
			RecyclingMachineBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
