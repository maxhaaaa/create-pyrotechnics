package net.mcreator.createpyrotechnics.block.renderer;

public class NuclearCoreTileRenderer extends GeoBlockRenderer<NuclearCoreTileEntity> {
	public NuclearCoreTileRenderer() {
		super(new NuclearCoreBlockModel());
	}

	@Override
	public RenderType getRenderType(NuclearCoreTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}