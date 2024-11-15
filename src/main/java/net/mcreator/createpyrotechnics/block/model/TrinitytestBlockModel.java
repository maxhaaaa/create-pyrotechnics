package net.mcreator.createpyrotechnics.block.model;

public class TrinitytestBlockModel extends GeoModel<TrinitytestTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrinitytestTileEntity animatable) {
		return new ResourceLocation("create_pyrotechnics", "animations/trinity_drop_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrinitytestTileEntity animatable) {
		return new ResourceLocation("create_pyrotechnics", "geo/trinity_drop_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrinitytestTileEntity animatable) {
		return new ResourceLocation("create_pyrotechnics", "textures/block/trinity_drop_tower_texture.png");
	}
}