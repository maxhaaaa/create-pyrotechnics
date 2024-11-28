package net.mcreator.createpyrotechnics.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createpyrotechnics.block.model.NuclearCoreDisplayModel;
import net.mcreator.createpyrotechnics.block.display.NuclearCoreDisplayItem;

public class NuclearCoreDisplayItemRenderer extends GeoItemRenderer<NuclearCoreDisplayItem> {
	public NuclearCoreDisplayItemRenderer() {
		super(new NuclearCoreDisplayModel());
	}

	@Override
	public RenderType getRenderType(NuclearCoreDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
