
package net.mcreator.createpyrotechnics.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.createpyrotechnics.entity.DESIGNATOREntity;

public class DESIGNATORRenderer extends MobRenderer<DESIGNATOREntity, SilverfishModel<DESIGNATOREntity>> {
	public DESIGNATORRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel<DESIGNATOREntity>(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DESIGNATOREntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/invisisisisis.png");
	}
}
