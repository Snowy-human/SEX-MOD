package net.mcreator.sex.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sex.entity.JennyEntity;

public class JennyModel extends GeoModel<JennyEntity> {
	@Override
	public ResourceLocation getAnimationResource(JennyEntity entity) {
		return new ResourceLocation("sex", "animations/jenny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JennyEntity entity) {
		return new ResourceLocation("sex", "geo/jenny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JennyEntity entity) {
		return new ResourceLocation("sex", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(JennyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
