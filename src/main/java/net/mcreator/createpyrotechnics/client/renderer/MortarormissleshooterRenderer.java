
package net.mcreator.createpyrotechnics.client.renderer;

public class MortarormissleshooterRenderer extends MobRenderer<MortarormissleshooterEntity, ChickenModel<MortarormissleshooterEntity>> {
	public MortarormissleshooterRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel<MortarormissleshooterEntity>(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MortarormissleshooterEntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/invisisisisis.png");
	}
}