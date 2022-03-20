package net.mcreator.envirocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.envirocraft.entity.EnviroVillagerEntity;

public class EnviroVillagerRenderer extends MobRenderer<EnviroVillagerEntity, VillagerModel<EnviroVillagerEntity>> {
	public EnviroVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnviroVillagerEntity entity) {
		return new ResourceLocation("envirocraft:textures/envirovillager.png");
	}
}
