package net.mcreator.sex.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sex.entity.PLayreEntity;

public class PLayreModel extends GeoModel<PLayreEntity> {
	@Override
	public ResourceLocation getAnimationResource(PLayreEntity entity) {
		return new ResourceLocation("sex", "animations/stevec.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PLayreEntity entity) {
		return new ResourceLocation("sex", "geo/stevec.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PLayreEntity entity) {
		return new ResourceLocation("sex", "textures/entities/" + entity.getTexture() + ".png");
	}

}
