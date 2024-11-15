package net.mcreator.createpyrotechnics.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createpyrotechnics.block.display.TrinitytestDisplayItem;

public class TrinitytestDisplayModel extends GeoModel<TrinitytestDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrinitytestDisplayItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "animations/trinity_drop_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrinitytestDisplayItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "geo/trinity_drop_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrinitytestDisplayItem entity) {
		return new ResourceLocation("create_pyrotechnics", "textures/block/trinity_drop_tower_texture.png");
	}
}
