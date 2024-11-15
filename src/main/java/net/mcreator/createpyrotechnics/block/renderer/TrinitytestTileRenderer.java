package net.mcreator.createpyrotechnics.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createpyrotechnics.block.model.TrinitytestBlockModel;
import net.mcreator.createpyrotechnics.block.entity.TrinitytestTileEntity;

public class TrinitytestTileRenderer extends GeoBlockRenderer<TrinitytestTileEntity> {
	public TrinitytestTileRenderer() {
		super(new TrinitytestBlockModel());
	}

	@Override
	public RenderType getRenderType(TrinitytestTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
