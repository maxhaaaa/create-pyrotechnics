
package net.mcreator.createpyrotechnics.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.createpyrotechnics.entity.FireballTestEntity;
import net.mcreator.createpyrotechnics.client.model.Modelfireball;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FireballTestRenderer extends MobRenderer<FireballTestEntity, Modelfireball<FireballTestEntity>> {
	public FireballTestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfireball<FireballTestEntity>(context.bakeLayer(Modelfireball.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<FireballTestEntity, Modelfireball<FireballTestEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("create_pyrotechnics:textures/entities/fireball.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FireballTestEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelfireball(Minecraft.getInstance().getEntityModels().bakeLayer(Modelfireball.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(FireballTestEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(25f, 25f, 25f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireballTestEntity entity) {
		return new ResourceLocation("create_pyrotechnics:textures/entities/fireball.png");
	}

	@Override
	protected boolean isShaking(FireballTestEntity entity) {
		return true;
	}
}
