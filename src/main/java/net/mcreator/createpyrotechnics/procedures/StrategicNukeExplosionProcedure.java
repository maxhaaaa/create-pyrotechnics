package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class StrategicNukeExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Mth.nextDouble(RandomSource.create(), 0, 10);
		if (random > 5) {
			StrategicMushroomCloudProcedure.execute(world, x, y, z);
		} else {
		}
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					S3Procedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						S4Procedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							S5Procedure.execute(world, x, y, z);
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								S6Procedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									S7Procedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(10, () -> {
										S8Procedure.execute(world, x, y, z);
										CreatePyrotechnicsMod.queueServerWork(10, () -> {
											S9Procedure.execute(world, x, y, z);
											CreatePyrotechnicsMod.queueServerWork(30, () -> {
												S10Procedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(40, () -> {
													E11Procedure.execute(world, x, y, z);
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
	}
}
