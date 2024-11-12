package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CallexplodeinmotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ExplodeandmotionProcedure.execute(world, x, y, z, 10, 5);
	}
}
