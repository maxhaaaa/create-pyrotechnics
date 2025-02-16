package net.mcreator.createpyrotechnics.client.gui;

public class ValueenteringguiScreen extends AbstractContainerScreen<ValueenteringguiMenu> {

	private final static HashMap<String, Object> guistate = ValueenteringguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox valueentering;
	EditBox input;
	EditBox pinmode;

	Button button_enter;

	public ValueenteringguiScreen(ValueenteringguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/valueenteringgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		valueentering.render(guiGraphics, mouseX, mouseY, partialTicks);
		input.render(guiGraphics, mouseX, mouseY, partialTicks);
		pinmode.render(guiGraphics, mouseX, mouseY, partialTicks);

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

		if (valueentering.isFocused())
			return valueentering.keyPressed(key, b, c);
		if (input.isFocused())
			return input.keyPressed(key, b, c);
		if (pinmode.isFocused())
			return pinmode.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		valueentering.tick();
		input.tick();
		pinmode.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String valueenteringValue = valueentering.getValue();
		String inputValue = input.getValue();
		String pinmodeValue = pinmode.getValue();
		super.resize(minecraft, width, height);
		valueentering.setValue(valueenteringValue);
		input.setValue(inputValue);
		pinmode.setValue(pinmodeValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturnprevvarbProcedure.execute(world, x, y, z, guistate), 64, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.valueenteringgui.label_current_varb_number"), 16, 12, -12829636, false);
	}

	@Override
	public void init() {
		super.init();

		valueentering = new EditBox(this.font, this.leftPos + 28, this.topPos + 59, 118, 18, Component.translatable("gui.create_pyrotechnics.valueenteringgui.valueentering")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.valueentering").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.valueentering").getString());
				else
					setSuggestion(null);
			}
		};
		valueentering.setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.valueentering").getString());
		valueentering.setMaxLength(32767);

		guistate.put("text:valueentering", valueentering);
		this.addWidget(this.valueentering);
		input = new EditBox(this.font, this.leftPos + 28, this.topPos + 33, 118, 18, Component.translatable("gui.create_pyrotechnics.valueenteringgui.input")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.input").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.input").getString());
				else
					setSuggestion(null);
			}
		};
		input.setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.input").getString());
		input.setMaxLength(32767);

		guistate.put("text:input", input);
		this.addWidget(this.input);
		pinmode = new EditBox(this.font, this.leftPos + 28, this.topPos + 88, 118, 18, Component.translatable("gui.create_pyrotechnics.valueenteringgui.pinmode")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.pinmode").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.pinmode").getString());
				else
					setSuggestion(null);
			}
		};
		pinmode.setSuggestion(Component.translatable("gui.create_pyrotechnics.valueenteringgui.pinmode").getString());
		pinmode.setMaxLength(32767);

		guistate.put("text:pinmode", pinmode);
		this.addWidget(this.pinmode);

		button_enter = Button.builder(Component.translatable("gui.create_pyrotechnics.valueenteringgui.button_enter"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ValueenteringguiButtonMessage(0, x, y, z));
				ValueenteringguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 120, 51, 20).build();

		guistate.put("button:button_enter", button_enter);
		this.addRenderableWidget(button_enter);

	}

}
