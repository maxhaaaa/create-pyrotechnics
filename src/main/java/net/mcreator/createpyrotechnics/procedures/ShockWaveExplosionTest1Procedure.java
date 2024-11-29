package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class ShockWaveExplosionTest1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		OgMushroomCloudProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					E3shockwaveProcedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						E4shockwaveProcedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							E5shockwaveProcedure.execute(world, x, y, z);
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E6shockwaveProcedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									E7shockwaveProcedure.execute(world, x, y, z);
								});
							});
						});
					});
				});
			});
		});
	}
}
