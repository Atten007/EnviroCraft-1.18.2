package net.mcreator.envirocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.envirocraft.entity.EnviroChickenEntity;

public class EnviroChickenRenderer extends MobRenderer<EnviroChickenEntity, ChickenModel<EnviroChickenEntity>> {
	public EnviroChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnviroChickenEntity entity) {
		return new ResourceLocation("envirocraft:textures/chicken.png");
	}
}
