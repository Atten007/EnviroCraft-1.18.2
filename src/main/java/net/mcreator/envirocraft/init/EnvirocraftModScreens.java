
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.envirocraft.client.gui.WindTurbineGUIScreen;
import net.mcreator.envirocraft.client.gui.WaterTankGUIScreen;
import net.mcreator.envirocraft.client.gui.SolarCellGUIScreen;
import net.mcreator.envirocraft.client.gui.RecyclingMachineGUIScreen;
import net.mcreator.envirocraft.client.gui.PowerBoxGUIScreen;
import net.mcreator.envirocraft.client.gui.OceanGeneratorGUIScreen;
import net.mcreator.envirocraft.client.gui.GreenGeneratorGUIScreen;
import net.mcreator.envirocraft.client.gui.EnviroChestGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnvirocraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EnvirocraftModMenus.SOLAR_CELL_GUI, SolarCellGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.WIND_TURBINE_GUI, WindTurbineGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.OCEAN_GENERATOR_GUI, OceanGeneratorGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.POWER_BOX_GUI, PowerBoxGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.GREEN_GENERATOR_GUI, GreenGeneratorGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.WATER_TANK_GUI, WaterTankGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.ENVIRO_CHEST_GUI, EnviroChestGUIScreen::new);
			MenuScreens.register(EnvirocraftModMenus.RECYCLING_MACHINE_GUI, RecyclingMachineGUIScreen::new);
		});
	}
}
