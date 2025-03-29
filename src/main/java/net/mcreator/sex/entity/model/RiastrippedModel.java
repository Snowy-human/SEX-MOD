package net.mcreator.sex.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sex.entity.RiastrippedEntity;

public class RiastrippedModel extends GeoModel<RiastrippedEntity> {
	@Override
	public ResourceLocation getAnimationResource(RiastrippedEntity entity) {
		return new ResourceLocation("sex", "animations/ria_nude.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RiastrippedEntity entity) {
		return new ResourceLocation("sex", "geo/ria_nude.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RiastrippedEntity entity) {
		return new ResourceLocation("sex", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RiastrippedEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
