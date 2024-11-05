package net.mcreator.createpyrotechnics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createpyrotechnics.world.inventory.ComputernavigatorMenu;
import net.mcreator.createpyrotechnics.procedures.ReturnvirtualblockProcedure;
import net.mcreator.createpyrotechnics.network.ComputernavigatorButtonMessage;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ComputernavigatorScreen extends AbstractContainerScreen<ComputernavigatorMenu> {
	private final static HashMap<String, Object> guistate = ComputernavigatorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_v;
	Button button_execute;
	Button button_return_to_original_block;

	public ComputernavigatorScreen(ComputernavigatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/computernavigator.png");

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

				ReturnvirtualblockProcedure.execute(world, x, y, z), 4, 51, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.computernavigator.label_exectuable_block_detected"), 18, 98, -65485, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_empty"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(0, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 74, this.topPos + 10, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_empty1"), e -> {
		}).bounds(this.leftPos + 133, this.topPos + 71, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_empty2"), e -> {
		}).bounds(this.leftPos + 7, this.topPos + 71, 30, 20).build();
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_v = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_v"), e -> {
		}).bounds(this.leftPos + 72, this.topPos + 124, 30, 20).build();
		guistate.put("button:button_v", button_v);
		this.addRenderableWidget(button_v);
		button_execute = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_execute"), e -> {
		}).bounds(this.leftPos + 57, this.topPos + 72, 61, 20).build();
		guistate.put("button:button_execute", button_execute);
		this.addRenderableWidget(button_execute);
		button_return_to_original_block = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_return_to_original_block"), e -> {
		}).bounds(this.leftPos + 19, this.topPos + 147, 150, 20).build();
		guistate.put("button:button_return_to_original_block", button_return_to_original_block);
		this.addRenderableWidget(button_return_to_original_block);
	}
}
