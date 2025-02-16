package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ShockwavePower2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MushroomCloud2TestProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					E3shockwaveProcedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						E4shockwaveProcedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E6shockwaveProcedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									E7shockwaveProcedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(15, () -> {
										E8shockwaveProcedure.execute(world, x, y, z);
										CreatePyrotechnicsMod.queueServerWork(15, () -> {
											E9shockwaveProcedure.execute(world, x, y, z);
											CreatePyrotechnicsMod.queueServerWork(20, () -> {
												E10shockwaveProcedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(20, () -> {
													E11shockwaveProcedure.execute(world, x, y, z);
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
