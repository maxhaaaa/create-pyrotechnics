package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FillAlternativeYProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FillAlternativeProcedure.execute(world, x, y, z);
		FillAlternativeProcedure.execute(world, x, y + 1, z);
		FillAlternativeProcedure.execute(world, x, y - 1, z);
	}
}
