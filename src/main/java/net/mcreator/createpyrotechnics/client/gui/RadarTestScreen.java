package net.mcreator.createpyrotechnics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createpyrotechnics.world.inventory.RadarTestMenu;
import net.mcreator.createpyrotechnics.network.RadarTestButtonMessage;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RadarTestScreen extends AbstractContainerScreen<RadarTestMenu> {
	private final static HashMap<String, Object> guistate = RadarTestMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_launch;
	Button button_dx_01;
	Button button_dx_011;
	Button button_dy_01;
	Button button_dy_011;
	Button button_dz_01;
	Button button_dz_011;
	Button button_check_cords;

	public RadarTestScreen(RadarTestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/radar_test.png");

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
		button_launch = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_launch"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(0, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 87, this.topPos + 30, 56, 20).build();
		guistate.put("button:button_launch", button_launch);
		this.addRenderableWidget(button_launch);
		button_dx_01 = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_dx_01"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(1, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 3, 66, 20).build();
		guistate.put("button:button_dx_01", button_dx_01);
		this.addRenderableWidget(button_dx_01);
		button_dx_011 = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_dx_011"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(2, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 30, 66, 20).build();
		guistate.put("button:button_dx_011", button_dx_011);
		this.addRenderableWidget(button_dx_011);
		button_dy_01 = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_dy_01"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(3, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 57, 66, 20).build();
		guistate.put("button:button_dy_01", button_dy_01);
		this.addRenderableWidget(button_dy_01);
		button_dy_011 = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_dy_011"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(4, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 84, 66, 20).build();
		guistate.put("button:button_dy_011", button_dy_011);
		this.addRenderableWidget(button_dy_011);
		button_dz_01 = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_dz_01"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(5, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 111, 66, 20).build();
		guistate.put("button:button_dz_01", button_dz_01);
		this.addRenderableWidget(button_dz_01);
		button_dz_011 = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_dz_011"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(6, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 138, 66, 20).build();
		guistate.put("button:button_dz_011", button_dz_011);
		this.addRenderableWidget(button_dz_011);
		button_check_cords = Button.builder(Component.translatable("gui.create_pyrotechnics.radar_test.button_check_cords"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new RadarTestButtonMessage(7, x, y, z));
				RadarTestButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 87, this.topPos + 3, 82, 20).build();
		guistate.put("button:button_check_cords", button_check_cords);
		this.addRenderableWidget(button_check_cords);
	}
}
