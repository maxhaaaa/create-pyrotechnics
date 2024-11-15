package net.mcreator.createpyrotechnics.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createpyrotechnics.item.IgiveuaidsItem;

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
