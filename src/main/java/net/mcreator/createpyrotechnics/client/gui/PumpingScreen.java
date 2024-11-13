package net.mcreator.createpyrotechnics.client.gui;

public class PumpingScreen extends AbstractContainerScreen<PumpingMenu> {

	private final static HashMap<String, Object> guistate = PumpingMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_pump;
	Button button_empty;
	Button button_empty1;
	Button button_seal;

	public PumpingScreen(PumpingMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/pumping.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturnPsiProcedure.execute(), 84, 71, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.pumping.label_psi"), 62, 71, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.pumping.label_vent"), 50, 87, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnVentProcedure.execute(), 76, 87, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnSealProcedure.execute(), 62, 126, -12829636, false);
	}

	@Override
	public void init() {
		super.init();

		button_pump = Button.builder(Component.translatable("gui.create_pyrotechnics.pumping.button_pump"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new PumpingButtonMessage(0, x, y, z));
				PumpingButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 49, 46, 20).build();

		guistate.put("button:button_pump", button_pump);
		this.addRenderableWidget(button_pump);

		button_empty = Button.builder(Component.translatable("gui.create_pyrotechnics.pumping.button_empty"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new PumpingButtonMessage(1, x, y, z));
				PumpingButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 83, 30, 20).build();

		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);

		button_empty1 = Button.builder(Component.translatable("gui.create_pyrotechnics.pumping.button_empty1"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new PumpingButtonMessage(2, x, y, z));
				PumpingButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 137, this.topPos + 83, 30, 20).build();

		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);

		button_seal = Button.builder(Component.translatable("gui.create_pyrotechnics.pumping.button_seal"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new PumpingButtonMessage(3, x, y, z));
				PumpingButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 103, 46, 20).build();

		guistate.put("button:button_seal", button_seal);
		this.addRenderableWidget(button_seal);

	}

}
