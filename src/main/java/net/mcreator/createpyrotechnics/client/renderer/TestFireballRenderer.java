
package net.mcreator.createpyrotechnics.client.renderer;

public class TestFireballRenderer extends GeoEntityRenderer<TestFireballEntity> {
	public TestFireballRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TestFireballModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new TestFireballLayer(this));
	}

	@Override
	public RenderType getRenderType(TestFireballEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TestFireballEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 2f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}