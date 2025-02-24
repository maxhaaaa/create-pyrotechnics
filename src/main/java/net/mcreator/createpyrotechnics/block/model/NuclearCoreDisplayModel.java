package net.mcreator.createpyrotechnics.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createpyrotechnics.block.display.NuclearCoreDisplayItem;

public class NuclearCoreDisplayModel extends GeoModel<NuclearCoreDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NuclearCoreDisplayItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "animations/nuclearcore.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NuclearCoreDisplayItem animatable) {
		return new ResourceLocation("create_pyrotechnics", "geo/nuclearcore.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NuclearCoreDisplayItem entity) {
		return new ResourceLocation("create_pyrotechnics", "textures/block/nuclearcore.png");
	}
}
