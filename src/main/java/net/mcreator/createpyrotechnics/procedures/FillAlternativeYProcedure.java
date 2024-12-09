package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FillAlternativeYProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FillAlternativeProcedure.execute(world, x, y, z);
		FillAlternativeProcedure.execute(world, x, y + 1, z);
		FillAlternativeProcedure.execute(world, x, y - 1, z);
	}
}
