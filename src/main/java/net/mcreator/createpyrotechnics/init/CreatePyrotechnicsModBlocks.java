
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createpyrotechnics.block.DatawireblockBlock;
import net.mcreator.createpyrotechnics.block.ComputerblockBlock;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<Block> COMPUTERBLOCK = REGISTRY.register("computerblock", () -> new ComputerblockBlock());
	public static final RegistryObject<Block> DATAWIREBLOCK = REGISTRY.register("datawireblock", () -> new DatawireblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
