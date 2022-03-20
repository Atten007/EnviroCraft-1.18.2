
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.envirocraft.fluid.EnviroWaterFluid;
import net.mcreator.envirocraft.fluid.EnviroLavaFluid;
import net.mcreator.envirocraft.fluid.EnviroFluidFluid;
import net.mcreator.envirocraft.EnvirocraftMod;

public class EnvirocraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EnvirocraftMod.MODID);
	public static final RegistryObject<Fluid> ENVIRO_FLUID = REGISTRY.register("enviro_fluid", () -> new EnviroFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ENVIRO_FLUID = REGISTRY.register("flowing_enviro_fluid", () -> new EnviroFluidFluid.Flowing());
	public static final RegistryObject<Fluid> ENVIRO_WATER = REGISTRY.register("enviro_water", () -> new EnviroWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ENVIRO_WATER = REGISTRY.register("flowing_enviro_water", () -> new EnviroWaterFluid.Flowing());
	public static final RegistryObject<Fluid> ENVIRO_LAVA = REGISTRY.register("enviro_lava", () -> new EnviroLavaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ENVIRO_LAVA = REGISTRY.register("flowing_enviro_lava", () -> new EnviroLavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ENVIRO_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ENVIRO_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ENVIRO_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ENVIRO_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ENVIRO_LAVA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ENVIRO_LAVA.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
