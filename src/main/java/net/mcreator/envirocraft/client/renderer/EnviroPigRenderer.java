package net.mcreator.envirocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.envirocraft.entity.EnviroPigEntity;

public class EnviroPigRenderer extends MobRenderer<EnviroPigEntity, PigModel<EnviroPigEntity>> {
	public EnviroPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnviroPigEntity entity) {
		return new ResourceLocation("envirocraft:textures/pig.png");
	}
}
