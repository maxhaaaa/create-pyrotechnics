
package net.mcreator.createpyrotechnics.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FalloutAlertOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);

		if (

		FalloutWarningProcedure.execute()

		) {

			event.getGuiGraphics().blit(new ResourceLocation("create_pyrotechnics:textures/screens/radiation_symbol.png"), w / 2 + -63, h / 2 + -76, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("create_pyrotechnics:textures/screens/radiation_symbol.png"), w / 2 + 45, h / 2 + -76, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.create_pyrotechnics.fallout_alert.label_fallout"), w / 2 + -45, h / 2 + -76, -3407872, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.create_pyrotechnics.fallout_alert.label_do_not_stand_in_the_rain"), w / 2 + -36, h / 2 + -67, -3407872, false);

		}

		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}

}
