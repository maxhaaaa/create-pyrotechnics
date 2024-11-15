package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class KacNukeExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MushroomCloudProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1Procedure.execute(world, x, y, z, 50);
		});
	}
}
