
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.createpyrotechnics.world.inventory.WarheadcraftingguiMenu;
import net.mcreator.createpyrotechnics.world.inventory.ValueenteringguiMenu;
import net.mcreator.createpyrotechnics.world.inventory.TrinitytestguiMenu;
import net.mcreator.createpyrotechnics.world.inventory.ToxifierLabMenu;
import net.mcreator.createpyrotechnics.world.inventory.SiloguinewMenu;
import net.mcreator.createpyrotechnics.world.inventory.RadarTestMenu;
import net.mcreator.createpyrotechnics.world.inventory.PumpingMenu;
import net.mcreator.createpyrotechnics.world.inventory.LaunchMenu;
import net.mcreator.createpyrotechnics.world.inventory.Launch3Menu;
import net.mcreator.createpyrotechnics.world.inventory.Launch2Menu;
import net.mcreator.createpyrotechnics.world.inventory.EnrichmentguiMenu;
import net.mcreator.createpyrotechnics.world.inventory.ComputernavigatorMenu;
import net.mcreator.createpyrotechnics.world.inventory.BombBenchMenu;
import net.mcreator.createpyrotechnics.world.inventory.BevsslotsguiMenu;
import net.mcreator.createpyrotechnics.world.inventory.BevsguitestingidkMenu;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<MenuType<BevsguitestingidkMenu>> BEVSGUITESTINGIDK = REGISTRY.register("bevsguitestingidk", () -> IForgeMenuType.create(BevsguitestingidkMenu::new));
	public static final RegistryObject<MenuType<BevsslotsguiMenu>> BEVSSLOTSGUI = REGISTRY.register("bevsslotsgui", () -> IForgeMenuType.create(BevsslotsguiMenu::new));
	public static final RegistryObject<MenuType<ComputernavigatorMenu>> COMPUTERNAVIGATOR = REGISTRY.register("computernavigator", () -> IForgeMenuType.create(ComputernavigatorMenu::new));
	public static final RegistryObject<MenuType<SiloguinewMenu>> SILOGUINEW = REGISTRY.register("siloguinew", () -> IForgeMenuType.create(SiloguinewMenu::new));
	public static final RegistryObject<MenuType<ValueenteringguiMenu>> VALUEENTERINGGUI = REGISTRY.register("valueenteringgui", () -> IForgeMenuType.create(ValueenteringguiMenu::new));
	public static final RegistryObject<MenuType<WarheadcraftingguiMenu>> WARHEADCRAFTINGGUI = REGISTRY.register("warheadcraftinggui", () -> IForgeMenuType.create(WarheadcraftingguiMenu::new));
	public static final RegistryObject<MenuType<PumpingMenu>> PUMPING = REGISTRY.register("pumping", () -> IForgeMenuType.create(PumpingMenu::new));
	public static final RegistryObject<MenuType<ToxifierLabMenu>> TOXIFIER_LAB = REGISTRY.register("toxifier_lab", () -> IForgeMenuType.create(ToxifierLabMenu::new));
	public static final RegistryObject<MenuType<TrinitytestguiMenu>> TRINITYTESTGUI = REGISTRY.register("trinitytestgui", () -> IForgeMenuType.create(TrinitytestguiMenu::new));
	public static final RegistryObject<MenuType<LaunchMenu>> LAUNCH = REGISTRY.register("launch", () -> IForgeMenuType.create(LaunchMenu::new));
	public static final RegistryObject<MenuType<Launch2Menu>> LAUNCH_2 = REGISTRY.register("launch_2", () -> IForgeMenuType.create(Launch2Menu::new));
	public static final RegistryObject<MenuType<BombBenchMenu>> BOMB_BENCH = REGISTRY.register("bomb_bench", () -> IForgeMenuType.create(BombBenchMenu::new));
	public static final RegistryObject<MenuType<RadarTestMenu>> RADAR_TEST = REGISTRY.register("radar_test", () -> IForgeMenuType.create(RadarTestMenu::new));
	public static final RegistryObject<MenuType<Launch3Menu>> LAUNCH_3 = REGISTRY.register("launch_3", () -> IForgeMenuType.create(Launch3Menu::new));
	public static final RegistryObject<MenuType<EnrichmentguiMenu>> ENRICHMENTGUI = REGISTRY.register("enrichmentgui", () -> IForgeMenuType.create(EnrichmentguiMenu::new));
}
