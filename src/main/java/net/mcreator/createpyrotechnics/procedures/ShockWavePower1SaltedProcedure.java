package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class ShockWavePower1SaltedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		OgMushroomCloudProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
			E3SRProcedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				E4SRProcedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					E3shockwaveProcedure.execute(world, x, y, z);
					E5SRProcedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						E4shockwaveProcedure.execute(world, x, y, z);
						E6SRProcedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							E5shockwaveProcedure.execute(world, x, y, z);
							E7SRProcedure.execute(world, x, y, z);
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E6shockwaveProcedure.execute(world, x, y, z);
								E8SRProcedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									E7shockwaveProcedure.execute(world, x, y, z);
									E9SRProcedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(10, () -> {
										E10SRProcedure.execute(world, x, y, z);
										CreatePyrotechnicsMod.queueServerWork(10, () -> {
											E11SRProcedure.execute(world, x, y, z);
											CreatePyrotechnicsMod.queueServerWork(10, () -> {
												E12SRProcedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(10, () -> {
													E13SRProcedure.execute(world, x, y, z);
													CreatePyrotechnicsMod.queueServerWork(10, () -> {
														E14SRProcedure.execute(world, x, y, z);
														CreatePyrotechnicsMod.queueServerWork(10, () -> {
															E15SRProcedure.execute(world, x, y, z);
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
			});
		});
	}
}
