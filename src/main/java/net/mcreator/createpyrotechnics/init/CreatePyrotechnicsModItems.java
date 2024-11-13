
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createpyrotechnics.item.PinassignerItem;
import net.mcreator.createpyrotechnics.item.LazerdesignatorItem;
import net.mcreator.createpyrotechnics.item.HandheldPumpItem;
import net.mcreator.createpyrotechnics.item.DebugstickItem;
import net.mcreator.createpyrotechnics.item.DatawiretesterItem;
import net.mcreator.createpyrotechnics.item.BombsphereItem;
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
	public static final RegistryObject<Item> LAZERDESIGNATOR = REGISTRY.register("lazerdesignator", () -> new LazerdesignatorItem());
	public static final RegistryObject<Item> MORTARORMISSLESHOOTER_SPAWN_EGG = REGISTRY.register("mortarormissleshooter_spawn_egg", () -> new ForgeSpawnEggItem(CreatePyrotechnicsModEntities.MORTARORMISSLESHOOTER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DESIGNATOR_SPAWN_EGG = REGISTRY.register("designator_spawn_egg", () -> new ForgeSpawnEggItem(CreatePyrotechnicsModEntities.DESIGNATOR, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> EXPLOSIVESPHEREWORKBENCH = block(CreatePyrotechnicsModBlocks.EXPLOSIVESPHEREWORKBENCH);
	public static final RegistryObject<Item> BOMBSPHERE = REGISTRY.register("bombsphere", () -> new BombsphereItem());
	public static final RegistryObject<Item> DATAWIRETESTER = REGISTRY.register("datawiretester", () -> new DatawiretesterItem());
	public static final RegistryObject<Item> HANDHELD_PUMP = REGISTRY.register("handheld_pump", () -> new HandheldPumpItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
