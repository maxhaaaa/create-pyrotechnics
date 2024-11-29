package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class ShockwavePower3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		StrategicMushroomCloudProcedure.execute(world, x, y, z);
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
									CreatePyrotechnicsMod.queueServerWork(10, () -> {
										E8shockwaveProcedure.execute(world, x, y, z);
										CreatePyrotechnicsMod.queueServerWork(10, () -> {
											E9shockwaveProcedure.execute(world, x, y, z);
											CreatePyrotechnicsMod.queueServerWork(10, () -> {
												E10shockwaveProcedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(10, () -> {
													E11shockwaveProcedure.execute(world, x, y, z);
													CreatePyrotechnicsMod.queueServerWork(10, () -> {
														E12shockwaveProcedure.execute(world, x, y, z);
														CreatePyrotechnicsMod.queueServerWork(10, () -> {
															E13shockwaveProcedure.execute(world, x, y, z);
															CreatePyrotechnicsMod.queueServerWork(10, () -> {
																E14shockwaveProcedure.execute(world, x, y, z);
																CreatePyrotechnicsMod.queueServerWork(10, () -> {
																	E15shockwaveProcedure.execute(world, x, y, z);
																	CreatePyrotechnicsMod.queueServerWork(10, () -> {
																		E16shockwaveProcedure.execute(world, x, y, z);
																		CreatePyrotechnicsMod.queueServerWork(10, () -> {
																			E17shockwaveProcedure.execute(world, x, y, z);
																			CreatePyrotechnicsMod.queueServerWork(10, () -> {
																				E18shockwaveProcedure.execute(world, x, y, z);
																				CreatePyrotechnicsMod.queueServerWork(15, () -> {
																					E19shockwaveProcedure.execute(world, x, y, z);
																					CreatePyrotechnicsMod.queueServerWork(15, () -> {
																						E20shockwaveProcedure.execute(world, x, y, z);
																						CreatePyrotechnicsMod.queueServerWork(20, () -> {
																							E21shockwaveProcedure.execute(world, x, y, z);
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
