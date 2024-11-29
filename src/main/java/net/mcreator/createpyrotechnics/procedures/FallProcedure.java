package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class FallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FallingSphere2Procedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(5, () -> {
			F1Procedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(5, () -> {
				F2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(5, () -> {
					F3Procedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(5, () -> {
						F4Procedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(5, () -> {
							F5Procedure.execute(world, x, y, z);
							CreatePyrotechnicsMod.queueServerWork(5, () -> {
								F6Procedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(5, () -> {
									F7Procedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(5, () -> {
										F8Procedure.execute(world, x, y, z);
										CreatePyrotechnicsMod.queueServerWork(5, () -> {
											F9Procedure.execute(world, x, y, z);
											CreatePyrotechnicsMod.queueServerWork(5, () -> {
												F10Procedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(5, () -> {
													F11Procedure.execute(world, x, y, z);
													CreatePyrotechnicsMod.queueServerWork(5, () -> {
														F12Procedure.execute(world, x, y, z);
														CreatePyrotechnicsMod.queueServerWork(5, () -> {
															F13Procedure.execute(world, x, y, z);
															CreatePyrotechnicsMod.queueServerWork(5, () -> {
																F14Procedure.execute(world, x, y, z);
																CreatePyrotechnicsMod.queueServerWork(5, () -> {
																	F15Procedure.execute(world, x, y, z);
																	CreatePyrotechnicsMod.queueServerWork(5, () -> {
																		F16Procedure.execute(world, x, y, z);
																		CreatePyrotechnicsMod.queueServerWork(5, () -> {
																			F17Procedure.execute(world, x, y, z);
																			CreatePyrotechnicsMod.queueServerWork(5, () -> {
																				F18Procedure.execute(world, x, y, z);
																				CreatePyrotechnicsMod.queueServerWork(5, () -> {
																					F19Procedure.execute(world, x, y, z);
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
