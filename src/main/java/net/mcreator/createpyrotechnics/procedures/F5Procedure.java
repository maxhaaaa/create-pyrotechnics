package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class F5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yRadius = 0;
		double masterRadius = 0;
		loop = 0;
		particleAmount = 400;
		masterRadius = 55;
		while (loop < particleAmount) {
			yRadius = masterRadius;
			FallingSphereProcedure.execute(world, x + 0.5 + Math.sin(((Math.PI * 10 * zRadius) / particleAmount) * loop) * zRadius, y + Math.sin(((Math.PI * 2) / particleAmount) * loop) * yRadius,
					z + 0.5 + Math.cos(((Math.PI * 10 * xRadius) / particleAmount) * loop) * xRadius);
			xRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
			zRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
			loop = loop + 1;
		}
	}
}
