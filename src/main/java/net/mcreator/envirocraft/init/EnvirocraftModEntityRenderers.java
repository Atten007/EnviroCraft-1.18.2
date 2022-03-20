
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.envirocraft.client.renderer.EnviroVillagerRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroSheepRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroRabbitRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroPigRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroCraftMonsterRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroCowRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroChickenRenderer;
import net.mcreator.envirocraft.client.renderer.EnviroBrineRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnvirocraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_CRAFT_MONSTER.get(), EnviroCraftMonsterRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_PIG.get(), EnviroPigRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_SHEEP.get(), EnviroSheepRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_BRINE.get(), EnviroBrineRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_COW.get(), EnviroCowRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_CHICKEN.get(), EnviroChickenRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_RABBIT.get(), EnviroRabbitRenderer::new);
		event.registerEntityRenderer(EnvirocraftModEntities.ENVIRO_VILLAGER.get(), EnviroVillagerRenderer::new);
	}
}
