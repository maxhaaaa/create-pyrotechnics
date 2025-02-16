
package net.mcreator.createpyrotechnics.client.renderer;

public class CockroachRenderer extends GeoEntityRenderer<CockroachEntity> {
	public CockroachRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CockroachModel());
		this.shadowRadius = 0.2f;
	}

	@Override
	public RenderType getRenderType(CockroachEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, CockroachEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(CockroachEntity entityLivingBaseIn) {
		return 0.0F;
	}
}