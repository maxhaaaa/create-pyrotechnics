
package net.mcreator.createpyrotechnics.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.createpyrotechnics.entity.MortarormissleshooterEntity;

public class MortarormissleshooterRenderer extends MobRenderer<MortarormissleshooterEntity, ChickenModel<MortarormissleshooterEntity>> {
	public MortarormissleshooterRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel<MortarormissleshooterEntity>(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MortarormissleshooterEntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/invisisisisis.png");
	}
}
