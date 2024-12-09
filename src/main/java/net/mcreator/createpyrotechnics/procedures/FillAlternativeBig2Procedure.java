package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FillAlternativeBig2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FillAlternativeBigYProcedure.execute(world, x, y, z);
		FillAlternativeBigYProcedure.execute(world, x, y + 9, z);
		FillAlternativeBigYProcedure.execute(world, x, y - 9, z);
	}
}
