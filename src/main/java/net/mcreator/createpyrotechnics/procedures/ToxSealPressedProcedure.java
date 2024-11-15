package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModItems;

public class ToxSealPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack test = ItemStack.EMPTY;
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CreatePyrotechnicsModItems.GAS_CANISTER.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
