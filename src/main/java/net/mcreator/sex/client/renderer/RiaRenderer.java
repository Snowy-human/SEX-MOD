
package net.mcreator.sex.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sex.entity.model.RiaModel;
import net.mcreator.sex.entity.RiaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;
import software.bernie.geckolib.cache.object.GeoBone;

public class RiaRenderer extends GeoEntityRenderer<RiaEntity> {

		float scaleB = RiaEntity.boobsscale;



	public RiaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RiaModel());
		this.shadowRadius = 0.5f;
		
	}

	@Override
	public RenderType getRenderType(RiaEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override 
	public void preRender(PoseStack poseStack, RiaEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		GeoBone bone = model.getBone("boobs").get();
		bone.updateScale(scaleB, scaleB, scaleB);
		if (scaleB >= 2.0) { 
			scaleB = 2.0f;
			}
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
	
}
