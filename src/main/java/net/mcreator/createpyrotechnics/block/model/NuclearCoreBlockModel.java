package net.mcreator.createpyrotechnics.block.model;

public class NuclearCoreBlockModel extends GeoModel<NuclearCoreTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NuclearCoreTileEntity animatable) {
		return new ResourceLocation("create_pyrotechnics", "animations/nuclearcore.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NuclearCoreTileEntity animatable) {
		return new ResourceLocation("create_pyrotechnics", "geo/nuclearcore.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NuclearCoreTileEntity animatable) {
		return new ResourceLocation("create_pyrotechnics", "textures/block/nuclearcore.png");
	}
}