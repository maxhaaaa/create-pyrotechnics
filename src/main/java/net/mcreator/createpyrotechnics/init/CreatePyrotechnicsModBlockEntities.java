
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.createpyrotechnics.block.entity.ValuestorageblockBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.TrinitytestTileEntity;
import net.mcreator.createpyrotechnics.block.entity.ThrusterBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.SiloBlockBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.MissileNavigationBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.MissileControllPanelBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.MissileBodyStage3BlockEntity;
import net.mcreator.createpyrotechnics.block.entity.MissileBodyBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.FuelTankBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.ExplosivesphereworkbenchBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.DatawireblockBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.ComputerblockBlockEntity;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COMPUTERBLOCK = register("computerblock", CreatePyrotechnicsModBlocks.COMPUTERBLOCK, ComputerblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DATAWIREBLOCK = register("datawireblock", CreatePyrotechnicsModBlocks.DATAWIREBLOCK, DatawireblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SILO_BLOCK = register("silo_block", CreatePyrotechnicsModBlocks.SILO_BLOCK, SiloBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VALUESTORAGEBLOCK = register("valuestorageblock", CreatePyrotechnicsModBlocks.VALUESTORAGEBLOCK, ValuestorageblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXPLOSIVESPHEREWORKBENCH = register("explosivesphereworkbench", CreatePyrotechnicsModBlocks.EXPLOSIVESPHEREWORKBENCH, ExplosivesphereworkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<TrinitytestTileEntity>> TRINITYTEST = REGISTRY.register("trinitytest", () -> BlockEntityType.Builder.of(TrinitytestTileEntity::new, CreatePyrotechnicsModBlocks.TRINITYTEST.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> THRUSTER = register("thruster", CreatePyrotechnicsModBlocks.THRUSTER, ThrusterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MISSILE_BODY_STAGE_3 = register("missile_body_stage_3", CreatePyrotechnicsModBlocks.MISSILE_BODY_STAGE_3, MissileBodyStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FUEL_TANK = register("fuel_tank", CreatePyrotechnicsModBlocks.FUEL_TANK, FuelTankBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MISSILE_NAVIGATION = register("missile_navigation", CreatePyrotechnicsModBlocks.MISSILE_NAVIGATION, MissileNavigationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MISSILE_CONTROLL_PANEL = register("missile_controll_panel", CreatePyrotechnicsModBlocks.MISSILE_CONTROLL_PANEL, MissileControllPanelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MISSILE_BODY = register("missile_body", CreatePyrotechnicsModBlocks.MISSILE_BODY, MissileBodyBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
