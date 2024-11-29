package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class WeTestFallingBlocksOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FallProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(5, () -> {
			FallProcedure.execute(world, x, y - 1, z);
			CreatePyrotechnicsMod.queueServerWork(5, () -> {
				FallProcedure.execute(world, x, y + 1, z);
			});
		});
	}
}
