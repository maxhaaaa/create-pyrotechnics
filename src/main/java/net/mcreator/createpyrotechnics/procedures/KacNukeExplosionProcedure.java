package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class KacNukeExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1Procedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					E3Procedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						E4Procedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							E5Procedure.execute(world, x, y, z);
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E6Procedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									E7Procedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(10, () -> {
										E8Procedure.execute(world, x, y, z);
										CreatePyrotechnicsMod.queueServerWork(10, () -> {
											E9Procedure.execute(world, x, y, z);
											CreatePyrotechnicsMod.queueServerWork(30, () -> {
												CreatePyrotechnicsMod.queueServerWork(40, () -> {
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
