package net.mcreator.sex.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sex.entity.RiaexpanEntity;

public class RiaexpanModel extends GeoModel<RiaexpanEntity> {
	@Override
	public ResourceLocation getAnimationResource(RiaexpanEntity entity) {
		return new ResourceLocation("sex", "animations/ria.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RiaexpanEntity entity) {
		return new ResourceLocation("sex", "geo/ria.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RiaexpanEntity entity) {
		return new ResourceLocation("sex", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RiaexpanEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
