package net.mcreator.createpyrotechnics.block.renderer;

public class TrinitytestTileRenderer extends GeoBlockRenderer<TrinitytestTileEntity> {
	public TrinitytestTileRenderer() {
		super(new TrinitytestBlockModel());
	}

	@Override
	public RenderType getRenderType(TrinitytestTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}