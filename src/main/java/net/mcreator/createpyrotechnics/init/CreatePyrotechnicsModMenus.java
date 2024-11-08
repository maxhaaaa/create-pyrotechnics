
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.createpyrotechnics.world.inventory.ValueenteringguiMenu;
import net.mcreator.createpyrotechnics.world.inventory.SiloguinewMenu;
import net.mcreator.createpyrotechnics.world.inventory.ComputernavigatorMenu;
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
}
