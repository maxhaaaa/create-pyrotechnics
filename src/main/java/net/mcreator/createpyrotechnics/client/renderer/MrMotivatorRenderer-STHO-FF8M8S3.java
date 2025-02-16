
package net.mcreator.createpyrotechnics.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.createpyrotechnics.entity.MrMotivatorEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class MrMotivatorRenderer extends MobRenderer<MrMotivatorEntity, SilverfishModel<MrMotivatorEntity>> {
	public MrMotivatorRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel<MrMotivatorEntity>(context.bakeLayer(ModelLayers.SILVERFISH)), 0.1f);
	}

	@Override
	protected void scale(MrMotivatorEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.01f, 0.01f, 0.01f);
	}

	@Override
	public ResourceLocation getTextureLocation(MrMotivatorEntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/invisisisisis.png");
	}
}
