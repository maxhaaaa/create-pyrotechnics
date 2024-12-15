package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FillAlternativeBigProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FillAlternativeYProcedure.execute(world, x, y, z);
		FillAlternativeYProcedure.execute(world, x + 3, y, z);
		FillAlternativeYProcedure.execute(world, x - 3, y, z);
		FillAlternativeYProcedure.execute(world, x, y, z - 3);
		FillAlternativeYProcedure.execute(world, x, y, z + 3);
		FillAlternativeYProcedure.execute(world, x + 3, y, z + 3);
		FillAlternativeYProcedure.execute(world, x + 3, y, z - 3);
		FillAlternativeYProcedure.execute(world, x - 3, y, z - 3);
		FillAlternativeYProcedure.execute(world, x - 3, y, z + 3);
	}
}
