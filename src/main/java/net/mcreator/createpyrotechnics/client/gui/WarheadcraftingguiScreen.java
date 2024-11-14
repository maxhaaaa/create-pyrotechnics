package net.mcreator.createpyrotechnics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createpyrotechnics.world.inventory.WarheadcraftingguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WarheadcraftingguiScreen extends AbstractContainerScreen<WarheadcraftingguiMenu> {
	private final static HashMap<String, Object> guistate = WarheadcraftingguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_gui_launch_button_red;
	ImageButton imagebutton_gui_arrow_left;

	public WarheadcraftingguiScreen(WarheadcraftingguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_pyrotechnics:textures/screens/warheadcraftinggui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 87 && mouseX < leftPos + 111 && mouseY > topPos + 9 && mouseY < topPos + 33)
			guiGraphics.renderTooltip(font, Component.translatable("gui.create_pyrotechnics.warheadcraftinggui.tooltip_warning_if_warhead_sphere_is_not"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/warhead_ball.png"), this.leftPos + 82, this.topPos + 40, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_background.png"), this.leftPos + 18, this.topPos + 55, 0, 0, 32, 14, 32, 14);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_segment_1.png"), this.leftPos + 23, this.topPos + 60, 0, 0, 6, 4, 6, 4);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_segment_3.png"), this.leftPos + 26, this.topPos + 60, 0, 0, 7, 4, 7, 4);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_segment_4.png"), this.leftPos + 30, this.topPos + 60, 0, 0, 7, 4, 7, 4);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_segment_6.png"), this.leftPos + 42, this.topPos + 61, 0, 0, 3, 3, 3, 3);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_segment_4.png"), this.leftPos + 34, this.topPos + 60, 0, 0, 7, 4, 7, 4);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/gui_battery_themed_progression_bar_design_segment_4.png"), this.leftPos + 38, this.topPos + 60, 0, 0, 7, 4, 7, 4);

		guiGraphics.blit(new ResourceLocation("create_pyrotechnics:textures/screens/cog_image.png"), this.leftPos + 8, this.topPos + 83, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.warheadcraftinggui.label_explosive_power"), 4, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.warheadcraftinggui.label_weight"), 5, 22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.warheadcraftinggui.label_seal"), 87, 86, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.create_pyrotechnics.warheadcraftinggui.label_air_tank_level"), 14, 46, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_gui_launch_button_red = new ImageButton(this.leftPos + 87, this.topPos + 97, 20, 19, 0, 0, 19, new ResourceLocation("create_pyrotechnics:textures/screens/atlas/imagebutton_gui_launch_button_red.png"), 20, 38, e -> {
		});
		guistate.put("button:imagebutton_gui_launch_button_red", imagebutton_gui_launch_button_red);
		this.addRenderableWidget(imagebutton_gui_launch_button_red);
		imagebutton_gui_arrow_left = new ImageButton(this.leftPos + 130, this.topPos + 47, 16, 15, 0, 0, 15, new ResourceLocation("create_pyrotechnics:textures/screens/atlas/imagebutton_gui_arrow_left.png"), 16, 30, e -> {
		});
		guistate.put("button:imagebutton_gui_arrow_left", imagebutton_gui_arrow_left);
		this.addRenderableWidget(imagebutton_gui_arrow_left);
	}
}
