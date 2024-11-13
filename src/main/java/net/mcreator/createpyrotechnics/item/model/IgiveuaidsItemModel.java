package net.mcreator.createpyrotechnics.item.model;

public class IgiveuaidsItemModel extends GeoModel<IgiveuaidsItem> {
	@Override
	public ResourceLocation getAnimationResource(IgiveuaidsItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "animations/degle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IgiveuaidsItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "geo/degle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IgiveuaidsItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "textures/item/degm.png");
	}
}