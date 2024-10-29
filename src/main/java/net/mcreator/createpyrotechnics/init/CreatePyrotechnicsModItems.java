
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.createpyrotechnics.item.DebugstickItem;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<Item> DEBUGSTICK = REGISTRY.register("debugstick", () -> new DebugstickItem());
	// Start of user code block custom items
	// End of user code block custom items
}
