package net.mcreator.createpyrotechnics.client.gui;

public class Launch3Screen extends AbstractContainerScreen<Launch3Menu> {

	private final static HashMap<String, Object> guistate = Launch3Menu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_dx_01;
	Button button_launch;
	Button button_dx_011;
	Button button_dy_01;
	Button button_dy_011;
	Button button_dz_01;
	Button button_dz_011;
	Button button_check_cords;
	Button button_link_code;

	public Launch3Screen(Launch3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 256;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/launch_3.png");

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
	}

	@Override
	public void init() {
		super.init();

		button_dx_01 = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_dx_01"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(0, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 3, 66, 20).build();

		guistate.put("button:button_dx_01", button_dx_01);
		this.addRenderableWidget(button_dx_01);

		button_launch = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_launch"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(1, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 163, this.topPos + 30, 56, 20).build();

		guistate.put("button:button_launch", button_launch);
		this.addRenderableWidget(button_launch);

		button_dx_011 = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_dx_011"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(2, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 73, this.topPos + 3, 66, 20).build();

		guistate.put("button:button_dx_011", button_dx_011);
		this.addRenderableWidget(button_dx_011);

		button_dy_01 = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_dy_01"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(3, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 21, 66, 20).build();

		guistate.put("button:button_dy_01", button_dy_01);
		this.addRenderableWidget(button_dy_01);

		button_dy_011 = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_dy_011"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(4, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 73, this.topPos + 21, 66, 20).build();

		guistate.put("button:button_dy_011", button_dy_011);
		this.addRenderableWidget(button_dy_011);

		button_dz_01 = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_dz_01"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(5, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 39, 66, 20).build();

		guistate.put("button:button_dz_01", button_dz_01);
		this.addRenderableWidget(button_dz_01);

		button_dz_011 = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_dz_011"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(6, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 73, this.topPos + 39, 66, 20).build();

		guistate.put("button:button_dz_011", button_dz_011);
		this.addRenderableWidget(button_dz_011);

		button_check_cords = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_check_cords"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(7, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 163, this.topPos + 3, 82, 20).build();

		guistate.put("button:button_check_cords", button_check_cords);
		this.addRenderableWidget(button_check_cords);

		button_link_code = Button.builder(Component.translatable("gui.create_pyrotechnics.launch_3.button_link_code"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new Launch3ButtonMessage(8, x, y, z));
				Launch3ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 163, this.topPos + 57, 72, 20).build();

		guistate.put("button:button_link_code", button_link_code);
		this.addRenderableWidget(button_link_code);

	}

}
