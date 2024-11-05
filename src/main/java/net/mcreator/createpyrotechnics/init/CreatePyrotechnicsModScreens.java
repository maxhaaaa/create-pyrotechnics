
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.createpyrotechnics.client.gui.ValueenteringguiScreen;
import net.mcreator.createpyrotechnics.client.gui.SiloguinewScreen;
import net.mcreator.createpyrotechnics.client.gui.ComputernavigatorScreen;
import net.mcreator.createpyrotechnics.client.gui.BevsslotsguiScreen;
import net.mcreator.createpyrotechnics.client.gui.BevsguitestingidkScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatePyrotechnicsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CreatePyrotechnicsModMenus.BEVSGUITESTINGIDK.get(), BevsguitestingidkScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.BEVSSLOTSGUI.get(), BevsslotsguiScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.COMPUTERNAVIGATOR.get(), ComputernavigatorScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.SILOGUINEW.get(), SiloguinewScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.VALUEENTERINGGUI.get(), ValueenteringguiScreen::new);
		});
	}
}
