package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ShockWavePower1SaltedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MushroomCloud2TestProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					E3shockwaveProcedure.execute(world, x, y, z);
					E5SRProcedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						E6SRProcedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							E7SRProcedure.execute(world, x, y, z);
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E8SRProcedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									E7shockwaveProcedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(10, () -> {
										CreatePyrotechnicsMod.queueServerWork(10, () -> {
											CreatePyrotechnicsMod.queueServerWork(10, () -> {
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
