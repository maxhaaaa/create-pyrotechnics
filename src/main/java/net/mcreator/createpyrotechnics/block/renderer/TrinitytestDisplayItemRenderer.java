package net.mcreator.createpyrotechnics.block.renderer;

public class TrinitytestDisplayItemRenderer extends GeoItemRenderer<TrinitytestDisplayItem> {
	public TrinitytestDisplayItemRenderer() {
		super(new TrinitytestDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrinitytestDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}