
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
import net.mcreator.createpyrotechnics.block.entity.SiloBlockBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.DatawireblockBlockEntity;
import net.mcreator.createpyrotechnics.block.entity.ComputerblockBlockEntity;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COMPUTERBLOCK = register("computerblock", CreatePyrotechnicsModBlocks.COMPUTERBLOCK, ComputerblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DATAWIREBLOCK = register("datawireblock", CreatePyrotechnicsModBlocks.DATAWIREBLOCK, DatawireblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SILO_BLOCK = register("silo_block", CreatePyrotechnicsModBlocks.SILO_BLOCK, SiloBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VALUESTORAGEBLOCK = register("valuestorageblock", CreatePyrotechnicsModBlocks.VALUESTORAGEBLOCK, ValuestorageblockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
