package net.mcreator.sex.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sex.entity.RobotEntity;

public class RobotModel extends GeoModel<RobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotEntity entity) {
		return new ResourceLocation("sex", "animations/robot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotEntity entity) {
		return new ResourceLocation("sex", "geo/robot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotEntity entity) {
		return new ResourceLocation("sex", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RobotEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
