package net.mcreator.createpyrotechnics.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createpyrotechnics.entity.TestFireballEntity;

public class TestFireballModel extends GeoModel<TestFireballEntity> {
	@Override
	public ResourceLocation getAnimationResource(TestFireballEntity entity) {
		return new ResourceLocation("create_pyrotechnics", "animations/wait.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestFireballEntity entity) {
		return new ResourceLocation("create_pyrotechnics", "geo/wait.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestFireballEntity entity) {
		return new ResourceLocation("create_pyrotechnics", "textures/entities/" + entity.getTexture() + ".png");
	}

}
