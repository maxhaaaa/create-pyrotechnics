package net.mcreator.createpyrotechnics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createpyrotechnics.world.inventory.ComputernavigatorMenu;
import net.mcreator.createpyrotechnics.procedures.ReturnvirtualblockProcedure;
import net.mcreator.createpyrotechnics.procedures.ExectuablefoundProcedure;
import net.mcreator.createpyrotechnics.network.ComputernavigatorButtonMessage;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ComputernavigatorScreen extends AbstractContainerScreen<ComputernavigatorMenu> {
	private final static HashMap<String, Object> guistate = ComputernavigatorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_return_to_original_block;
	Button button_empty;
	Button button_empty1;
	Button button_up_y_axis;
	Button button_down_y_axis;
	Button button_error_infinite_dataloop_detecte;
	ImageButton imagebutton_gui_arrow_left;
	ImageButton imagebutton_gui_arrow_right;
	ImageButton imagebutton_gui_launch_button_red;

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

				ReturnvirtualblockProcedure.execute(world, x, y, z), 39, 44, -12829636, false);
		if (ExectuablefoundProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.computernavigator.label_exectuable_block_detected"), 18, 98, -65485, false);
	}

	@Override
	public void init() {
		super.init();
		button_return_to_original_block = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_return_to_original_block"), e -> {
		}).bounds(this.leftPos + 9, this.topPos + 140, 150, 20).build();
		guistate.put("button:button_return_to_original_block", button_return_to_original_block);
		this.addRenderableWidget(button_return_to_original_block);
		button_empty = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_empty"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(1, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 73, this.topPos + 15, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_empty1"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(2, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 112, 40, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_up_y_axis = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_up_y_axis"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(3, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -7, this.topPos + 9, 72, 20).build();
		guistate.put("button:button_up_y_axis", button_up_y_axis);
		this.addRenderableWidget(button_up_y_axis);
		button_down_y_axis = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_down_y_axis"), e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(4, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -22, this.topPos + 114, 82, 20).build();
		guistate.put("button:button_down_y_axis", button_down_y_axis);
		this.addRenderableWidget(button_down_y_axis);
		button_error_infinite_dataloop_detecte = Button.builder(Component.translatable("gui.create_pyrotechnics.computernavigator.button_error_infinite_dataloop_detecte"), e -> {
		}).bounds(this.leftPos + -58, this.topPos + -22, 286, 20).build();
		guistate.put("button:button_error_infinite_dataloop_detecte", button_error_infinite_dataloop_detecte);
		this.addRenderableWidget(button_error_infinite_dataloop_detecte);
		imagebutton_gui_arrow_left = new ImageButton(this.leftPos + 18, this.topPos + 74, 16, 15, 0, 0, 15, new ResourceLocation("create_pyrotechnics:textures/screens/atlas/imagebutton_gui_arrow_left.png"), 16, 30, e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(6, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gui_arrow_left", imagebutton_gui_arrow_left);
		this.addRenderableWidget(imagebutton_gui_arrow_left);
		imagebutton_gui_arrow_right = new ImageButton(this.leftPos + 144, this.topPos + 74, 16, 15, 0, 0, 15, new ResourceLocation("create_pyrotechnics:textures/screens/atlas/imagebutton_gui_arrow_right.png"), 16, 30, e -> {
			if (true) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(7, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gui_arrow_right", imagebutton_gui_arrow_right);
		this.addRenderableWidget(imagebutton_gui_arrow_right);
		imagebutton_gui_launch_button_red = new ImageButton(this.leftPos + 75, this.topPos + 72, 20, 19, 0, 0, 19, new ResourceLocation("create_pyrotechnics:textures/screens/atlas/imagebutton_gui_launch_button_red.png"), 20, 38, e -> {
			if (ExectuablefoundProcedure.execute(world, x, y, z)) {
				CreatePyrotechnicsMod.PACKET_HANDLER.sendToServer(new ComputernavigatorButtonMessage(8, x, y, z));
				ComputernavigatorButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ExectuablefoundProcedure.execute(world, x, y, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_gui_launch_button_red", imagebutton_gui_launch_button_red);
		this.addRenderableWidget(imagebutton_gui_launch_button_red);
	}
}
