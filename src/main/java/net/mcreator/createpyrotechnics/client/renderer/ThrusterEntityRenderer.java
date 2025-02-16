
package net.mcreator.createpyrotechnics.client.renderer;

public class ThrusterEntityRenderer extends HumanoidMobRenderer<ThrusterEntityEntity, HumanoidModel<ThrusterEntityEntity>> {
	public ThrusterEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ThrusterEntityEntity>(context.bakeLayer(ModelLayers.PLAYER)), 1f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ThrusterEntityEntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/invisisisisis.png");
	}
}