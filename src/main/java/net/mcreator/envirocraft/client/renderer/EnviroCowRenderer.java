package net.mcreator.envirocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.envirocraft.entity.EnviroCowEntity;

public class EnviroCowRenderer extends MobRenderer<EnviroCowEntity, CowModel<EnviroCowEntity>> {
	public EnviroCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnviroCowEntity entity) {
		return new ResourceLocation("envirocraft:textures/cow.png");
	}
}
