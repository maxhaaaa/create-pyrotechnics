
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

import net.mcreator.createpyrotechnics.item.TesterItem;
import net.mcreator.createpyrotechnics.item.PinassignerItem;
import net.mcreator.createpyrotechnics.item.LazerdesignatorItem;
import net.mcreator.createpyrotechnics.item.IgiveuaidsItem;
import net.mcreator.createpyrotechnics.item.HandheldToxifierLabItem;
import net.mcreator.createpyrotechnics.item.HandheldPumpItem;
import net.mcreator.createpyrotechnics.item.GasCanisterItem;
import net.mcreator.createpyrotechnics.item.DebugstickItem;
import net.mcreator.createpyrotechnics.item.DatawiretesterItem;
import net.mcreator.createpyrotechnics.item.BombsphereItem;
import net.mcreator.createpyrotechnics.item.BombBenchBlockItem;
import net.mcreator.createpyrotechnics.item.BigRedButtonItem;
import net.mcreator.createpyrotechnics.item.BallisticsbuildingtoolItem;
import net.mcreator.createpyrotechnics.block.display.TrinitytestDisplayItem;
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
	public static final RegistryObject<Item> DESIGNATORBLOCK = block(CreatePyrotechnicsModBlocks.DESIGNATORBLOCK);
	public static final RegistryObject<Item> PLACEHOLDER = block(CreatePyrotechnicsModBlocks.PLACEHOLDER);
	public static final RegistryObject<Item> HANDHELD_PUMP = REGISTRY.register("handheld_pump", () -> new HandheldPumpItem());
	public static final RegistryObject<Item> IGIVEUAIDS = REGISTRY.register("igiveuaids", () -> new IgiveuaidsItem());
	public static final RegistryObject<Item> TRINITYTEST = REGISTRY.register(CreatePyrotechnicsModBlocks.TRINITYTEST.getId().getPath(), () -> new TrinitytestDisplayItem(CreatePyrotechnicsModBlocks.TRINITYTEST.get(), new Item.Properties()));
	public static final RegistryObject<Item> HANDHELD_TOXIFIER_LAB = REGISTRY.register("handheld_toxifier_lab", () -> new HandheldToxifierLabItem());
	public static final RegistryObject<Item> GAS_CANISTER = REGISTRY.register("gas_canister", () -> new GasCanisterItem());
	public static final RegistryObject<Item> BOMB_BENCH_BLOCK = REGISTRY.register("bomb_bench_block", () -> new BombBenchBlockItem());
	public static final RegistryObject<Item> BIG_RED_BUTTON = REGISTRY.register("big_red_button", () -> new BigRedButtonItem());
	public static final RegistryObject<Item> THRUSTER = block(CreatePyrotechnicsModBlocks.THRUSTER);
	public static final RegistryObject<Item> MISSILE_BODY_STAGE_3 = block(CreatePyrotechnicsModBlocks.MISSILE_BODY_STAGE_3);
	public static final RegistryObject<Item> PARTICLE_TESTING = block(CreatePyrotechnicsModBlocks.PARTICLE_TESTING);
	public static final RegistryObject<Item> TESTER = REGISTRY.register("tester", () -> new TesterItem());
	public static final RegistryObject<Item> FUEL_TANK = block(CreatePyrotechnicsModBlocks.FUEL_TANK);
	public static final RegistryObject<Item> MISSILE_NAVIGATION = block(CreatePyrotechnicsModBlocks.MISSILE_NAVIGATION);
	public static final RegistryObject<Item> BOMB_BENCH_P_2 = block(CreatePyrotechnicsModBlocks.BOMB_BENCH_P_2);
	public static final RegistryObject<Item> MISSILE_CONTROLL_PANEL = block(CreatePyrotechnicsModBlocks.MISSILE_CONTROLL_PANEL);
	public static final RegistryObject<Item> BOMB_BENCH_P_1 = block(CreatePyrotechnicsModBlocks.BOMB_BENCH_P_1);
	public static final RegistryObject<Item> MISSILE_BODY = block(CreatePyrotechnicsModBlocks.MISSILE_BODY);
	public static final RegistryObject<Item> MODDEDPARTICLETEST = block(CreatePyrotechnicsModBlocks.MODDEDPARTICLETEST);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
