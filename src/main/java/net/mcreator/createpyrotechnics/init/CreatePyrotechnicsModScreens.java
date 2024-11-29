
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.createpyrotechnics.client.gui.WarheadcraftingguiScreen;
import net.mcreator.createpyrotechnics.client.gui.ValueenteringguiScreen;
import net.mcreator.createpyrotechnics.client.gui.TrinitytestguiScreen;
import net.mcreator.createpyrotechnics.client.gui.ToxifierLabScreen;
import net.mcreator.createpyrotechnics.client.gui.SiloguinewScreen;
import net.mcreator.createpyrotechnics.client.gui.RadarTestScreen;
import net.mcreator.createpyrotechnics.client.gui.PumpingScreen;
import net.mcreator.createpyrotechnics.client.gui.LaunchScreen;
import net.mcreator.createpyrotechnics.client.gui.Launch3Screen;
import net.mcreator.createpyrotechnics.client.gui.Launch2Screen;
import net.mcreator.createpyrotechnics.client.gui.ComputernavigatorScreen;
import net.mcreator.createpyrotechnics.client.gui.BombBenchScreen;
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
			MenuScreens.register(CreatePyrotechnicsModMenus.WARHEADCRAFTINGGUI.get(), WarheadcraftingguiScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.PUMPING.get(), PumpingScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.TOXIFIER_LAB.get(), ToxifierLabScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.TRINITYTESTGUI.get(), TrinitytestguiScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.LAUNCH.get(), LaunchScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.LAUNCH_2.get(), Launch2Screen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.BOMB_BENCH.get(), BombBenchScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.RADAR_TEST.get(), RadarTestScreen::new);
			MenuScreens.register(CreatePyrotechnicsModMenus.LAUNCH_3.get(), Launch3Screen::new);
		});
	}
}
