package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FallProcedure {
	public static void execute(LevelAccessor world) {
		FallingSphere2Procedure.execute();
		CreatePyrotechnicsMod.queueServerWork(5, () -> {
			F1Procedure.execute();
			CreatePyrotechnicsMod.queueServerWork(5, () -> {
				F2Procedure.execute();
				CreatePyrotechnicsMod.queueServerWork(5, () -> {
					F3Procedure.execute();
					CreatePyrotechnicsMod.queueServerWork(5, () -> {
						F4Procedure.execute();
						CreatePyrotechnicsMod.queueServerWork(5, () -> {
							F5Procedure.execute();
							CreatePyrotechnicsMod.queueServerWork(5, () -> {
								F6Procedure.execute();
								CreatePyrotechnicsMod.queueServerWork(5, () -> {
									F7Procedure.execute();
									CreatePyrotechnicsMod.queueServerWork(5, () -> {
										F8Procedure.execute();
										CreatePyrotechnicsMod.queueServerWork(5, () -> {
											F9Procedure.execute();
											CreatePyrotechnicsMod.queueServerWork(5, () -> {
												F10Procedure.execute();
												CreatePyrotechnicsMod.queueServerWork(5, () -> {
													F11Procedure.execute();
													CreatePyrotechnicsMod.queueServerWork(5, () -> {
														F12Procedure.execute();
														CreatePyrotechnicsMod.queueServerWork(5, () -> {
															F13Procedure.execute();
															CreatePyrotechnicsMod.queueServerWork(5, () -> {
																F14Procedure.execute();
																CreatePyrotechnicsMod.queueServerWork(5, () -> {
																	F15Procedure.execute();
																	CreatePyrotechnicsMod.queueServerWork(5, () -> {
																		F16Procedure.execute();
																		CreatePyrotechnicsMod.queueServerWork(5, () -> {
																			F17Procedure.execute();
																			CreatePyrotechnicsMod.queueServerWork(5, () -> {
																				F18Procedure.execute();
																				CreatePyrotechnicsMod.queueServerWork(5, () -> {
																					F19Procedure.execute();
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
