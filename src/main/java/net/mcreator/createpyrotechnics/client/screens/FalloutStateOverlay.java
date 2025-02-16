
package net.mcreator.createpyrotechnics.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FalloutStateOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof InventoryScreen) {
			int w = event.getScreen().width;
			int h = event.getScreen().height;

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

			DisplayFalloutProcedure.execute(world, entity)

			) {

				event.getGuiGraphics().blit(new ResourceLocation("create_pyrotechnics:textures/screens/radiation_symbol.png"), w / 2 + 126, h / 2 + -112, 0, 0, 16, 16, 16, 16);

				event.getGuiGraphics().blit(new ResourceLocation("create_pyrotechnics:textures/screens/radiation_symbol.png"), w / 2 + 189, h / 2 + -112, 0, 0, 16, 16, 16, 16);

				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.create_pyrotechnics.fallout_state.label_fallout"), w / 2 + 144, h / 2 + -112, -3407872, false);

			}

			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}

}
