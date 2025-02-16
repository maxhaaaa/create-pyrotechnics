
package net.mcreator.createpyrotechnics.client.renderer;

public class DESIGNATORRenderer extends MobRenderer<DESIGNATOREntity, SilverfishModel<DESIGNATOREntity>> {
	public DESIGNATORRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel<DESIGNATOREntity>(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DESIGNATOREntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/invisisisisis.png");
	}
}