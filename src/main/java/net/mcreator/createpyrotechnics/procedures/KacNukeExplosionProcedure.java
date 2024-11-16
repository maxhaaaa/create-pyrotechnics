package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class KacNukeExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		MushroomCloudProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			OptimalE1Procedure.execute(world, x, y, z, 30);
		});
	}
}
