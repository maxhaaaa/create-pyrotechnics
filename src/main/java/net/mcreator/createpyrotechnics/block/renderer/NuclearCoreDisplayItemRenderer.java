package net.mcreator.createpyrotechnics.block.renderer;

public class NuclearCoreDisplayItemRenderer extends GeoItemRenderer<NuclearCoreDisplayItem> {
	public NuclearCoreDisplayItemRenderer() {
		super(new NuclearCoreDisplayModel());
	}

	@Override
	public RenderType getRenderType(NuclearCoreDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}