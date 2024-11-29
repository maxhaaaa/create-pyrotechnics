package net.mcreator.createpyrotechnics.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createpyrotechnics.block.model.NuclearCoreBlockModel;
import net.mcreator.createpyrotechnics.block.entity.NuclearCoreTileEntity;

public class NuclearCoreTileRenderer extends GeoBlockRenderer<NuclearCoreTileEntity> {
	public NuclearCoreTileRenderer() {
		super(new NuclearCoreBlockModel());
	}

	@Override
	public RenderType getRenderType(NuclearCoreTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
