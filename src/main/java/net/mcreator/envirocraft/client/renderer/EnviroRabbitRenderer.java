package net.mcreator.envirocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.envirocraft.entity.EnviroRabbitEntity;

public class EnviroRabbitRenderer extends MobRenderer<EnviroRabbitEntity, SilverfishModel<EnviroRabbitEntity>> {
	public EnviroRabbitRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnviroRabbitEntity entity) {
		return new ResourceLocation("envirocraft:textures/white.png");
	}
}
