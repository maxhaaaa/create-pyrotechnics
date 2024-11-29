package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

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
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E6shockwaveProcedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
								});
							});
						});
					});
				});
			});
		});
	}
}
