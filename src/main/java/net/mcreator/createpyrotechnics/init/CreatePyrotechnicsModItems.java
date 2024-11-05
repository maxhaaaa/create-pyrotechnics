
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createpyrotechnics.item.PinassignerItem;
import net.mcreator.createpyrotechnics.item.DebugstickItem;
import net.mcreator.createpyrotechnics.item.BallisticsbuildingtoolItem;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<Item> DEBUGSTICK = REGISTRY.register("debugstick", () -> new DebugstickItem());
	public static final RegistryObject<Item> COMPUTERBLOCK = block(CreatePyrotechnicsModBlocks.COMPUTERBLOCK);
	public static final RegistryObject<Item> DATAWIREBLOCK = block(CreatePyrotechnicsModBlocks.DATAWIREBLOCK);
	public static final RegistryObject<Item> DATAWIRESTOPPER = block(CreatePyrotechnicsModBlocks.DATAWIRESTOPPER);
	public static final RegistryObject<Item> BALLISTICSBUILDINGTOOL = REGISTRY.register("ballisticsbuildingtool", () -> new BallisticsbuildingtoolItem());
	public static final RegistryObject<Item> SILO_BLOCK = block(CreatePyrotechnicsModBlocks.SILO_BLOCK);
	public static final RegistryObject<Item> VALUESTORAGEBLOCK = block(CreatePyrotechnicsModBlocks.VALUESTORAGEBLOCK);
	public static final RegistryObject<Item> PINASSIGNER = REGISTRY.register("pinassigner", () -> new PinassignerItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
