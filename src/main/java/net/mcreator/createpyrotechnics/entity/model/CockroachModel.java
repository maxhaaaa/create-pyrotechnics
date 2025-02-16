package net.mcreator.createpyrotechnics.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class CockroachModel extends GeoModel<CockroachEntity> {
	@Override
	public ResourceLocation getAnimationResource(CockroachEntity entity) {
		return new ResourceLocation("create_pyrotechnics", "animations/cockroach.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CockroachEntity entity) {
		return new ResourceLocation("create_pyrotechnics", "geo/cockroach.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CockroachEntity entity) {
		return new ResourceLocation("create_pyrotechnics", "textures/entities/" + entity.getTexture() + ".png");
	}

}