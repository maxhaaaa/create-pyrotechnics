package net.mcreator.createpyrotechnics.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createpyrotechnics.block.model.TrinitytestDisplayModel;
import net.mcreator.createpyrotechnics.block.display.TrinitytestDisplayItem;

public class TrinitytestDisplayItemRenderer extends GeoItemRenderer<TrinitytestDisplayItem> {
	public TrinitytestDisplayItemRenderer() {
		super(new TrinitytestDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrinitytestDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
