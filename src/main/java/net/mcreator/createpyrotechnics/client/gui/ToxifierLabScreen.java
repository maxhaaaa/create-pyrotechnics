package net.mcreator.createpyrotechnics.client.gui;

public class ToxifierLabScreen extends AbstractContainerScreen<ToxifierLabMenu> {

	private final static HashMap<String, Object> guistate = ToxifierLabMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_empty;
	Button button_empty1;
	Button button_add_water;
	Button button_add_poison_powder;
	Button button_seal;

	public ToxifierLabScreen(ToxifierLabMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/toxifier_lab.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.toxifier_lab.label_flame"), 70, 54, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnFlameProcedure.execute(entity), 59, 64, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.toxifier_lab.label_potency"), 21, 83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.toxifier_lab.label_duration"), 112, 83, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnPotencyProcedure.execute(entity), 11, 94, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnDurationProcedure.execute(), 95, 94, -12829636, false);
	}

	@Override
	public void init() {
		super.init();

		button_empty = Button.builder(Component.translatable("gui.create_pyrotechnics.toxifier_lab.button_empty"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ToxifierLabButtonMessage(0, x, y, z));
				ToxifierLabButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 21, this.topPos + 54, 30, 20).build();

		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);

		button_empty1 = Button.builder(Component.translatable("gui.create_pyrotechnics.toxifier_lab.button_empty1"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ToxifierLabButtonMessage(1, x, y, z));
				ToxifierLabButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 120, this.topPos + 54, 30, 20).build();

		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);

		button_add_water = Button.builder(Component.translatable("gui.create_pyrotechnics.toxifier_lab.button_add_water"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ToxifierLabButtonMessage(2, x, y, z));
				ToxifierLabButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 52, this.topPos + 108, 72, 20).build();

		guistate.put("button:button_add_water", button_add_water);
		this.addRenderableWidget(button_add_water);

		button_add_poison_powder = Button.builder(Component.translatable("gui.create_pyrotechnics.toxifier_lab.button_add_poison_powder"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ToxifierLabButtonMessage(3, x, y, z));
				ToxifierLabButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 31, this.topPos + 135, 113, 20).build();

		guistate.put("button:button_add_poison_powder", button_add_poison_powder);
		this.addRenderableWidget(button_add_poison_powder);

		button_seal = Button.builder(Component.translatable("gui.create_pyrotechnics.toxifier_lab.button_seal"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ToxifierLabButtonMessage(4, x, y, z));
				ToxifierLabButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 24, 46, 20).build();

		guistate.put("button:button_seal", button_seal);
		this.addRenderableWidget(button_seal);

	}

}
