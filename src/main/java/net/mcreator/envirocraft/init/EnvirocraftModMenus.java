
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.envirocraft.world.inventory.WindTurbineGUIMenu;
import net.mcreator.envirocraft.world.inventory.WaterTankGUIMenu;
import net.mcreator.envirocraft.world.inventory.SolarCellGUIMenu;
import net.mcreator.envirocraft.world.inventory.RecyclingMachineGUIMenu;
import net.mcreator.envirocraft.world.inventory.PowerBoxGUIMenu;
import net.mcreator.envirocraft.world.inventory.OceanGeneratorGUIMenu;
import net.mcreator.envirocraft.world.inventory.GreenGeneratorGUIMenu;
import net.mcreator.envirocraft.world.inventory.EnviroChestGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnvirocraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<SolarCellGUIMenu> SOLAR_CELL_GUI = register("solar_cell_gui",
			(id, inv, extraData) -> new SolarCellGUIMenu(id, inv, extraData));
	public static final MenuType<WindTurbineGUIMenu> WIND_TURBINE_GUI = register("wind_turbine_gui",
			(id, inv, extraData) -> new WindTurbineGUIMenu(id, inv, extraData));
	public static final MenuType<OceanGeneratorGUIMenu> OCEAN_GENERATOR_GUI = register("ocean_generator_gui",
			(id, inv, extraData) -> new OceanGeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<PowerBoxGUIMenu> POWER_BOX_GUI = register("power_box_gui",
			(id, inv, extraData) -> new PowerBoxGUIMenu(id, inv, extraData));
	public static final MenuType<GreenGeneratorGUIMenu> GREEN_GENERATOR_GUI = register("green_generator_gui",
			(id, inv, extraData) -> new GreenGeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<WaterTankGUIMenu> WATER_TANK_GUI = register("water_tank_gui",
			(id, inv, extraData) -> new WaterTankGUIMenu(id, inv, extraData));
	public static final MenuType<EnviroChestGUIMenu> ENVIRO_CHEST_GUI = register("enviro_chest_gui",
			(id, inv, extraData) -> new EnviroChestGUIMenu(id, inv, extraData));
	public static final MenuType<RecyclingMachineGUIMenu> RECYCLING_MACHINE_GUI = register("recycling_machine_gui",
			(id, inv, extraData) -> new RecyclingMachineGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
