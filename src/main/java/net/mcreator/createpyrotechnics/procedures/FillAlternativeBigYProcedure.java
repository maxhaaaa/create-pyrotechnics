package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FillAlternativeBigYProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FillAlternativeBigProcedure.execute(world, x, y, z);
		FillAlternativeBigProcedure.execute(world, x, y + 3, z);
		FillAlternativeBigProcedure.execute(world, x, y - 3, z);
	}
}
