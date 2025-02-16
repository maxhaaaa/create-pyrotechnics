package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ShockwavePower2TestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MushroomCloud2TestProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
			CreatePyrotechnicsMod.queueServerWork(10, () -> {
				E2Procedure.execute(world, x, y, z);
				CreatePyrotechnicsMod.queueServerWork(10, () -> {
					E3SHProcedure.execute(world, x, y, z, 25, 30, 75);
					E3SHProcedure.execute(world, x, y, z, 35, 30, 65);
					E3SHProcedure.execute(world, x, y, z, 40, 30, 55);
					E3SHProcedure.execute(world, x, y, z, 45, 30, 45);
					E3SHProcedure.execute(world, x, y, z, 50, 30, 35);
					E3SHProcedure.execute(world, x, y, z, 75, 30, 20);
					E3shockwaveProcedure.execute(world, x, y, z);
					CreatePyrotechnicsMod.queueServerWork(20, () -> {
						E3SHProcedure.execute(world, x, y, z, 25, 40, 75);
						E3SHProcedure.execute(world, x, y, z, 35, 40, 65);
						E3SHProcedure.execute(world, x, y, z, 40, 40, 55);
						E3SHProcedure.execute(world, x, y, z, 45, 40, 45);
						E3SHProcedure.execute(world, x, y, z, 50, 40, 35);
						E3SHProcedure.execute(world, x, y, z, 75, 40, 20);
						E4shockwaveProcedure.execute(world, x, y, z);
						CreatePyrotechnicsMod.queueServerWork(20, () -> {
							E3SHProcedure.execute(world, x, y, z, 25, 50, 75);
							E3SHProcedure.execute(world, x, y, z, 35, 50, 65);
							E3SHProcedure.execute(world, x, y, z, 40, 50, 55);
							E3SHProcedure.execute(world, x, y, z, 45, 50, 45);
							E3SHProcedure.execute(world, x, y, z, 50, 50, 35);
							E3SHProcedure.execute(world, x, y, z, 75, 50, 20);
							CreatePyrotechnicsMod.queueServerWork(30, () -> {
								E3SHProcedure.execute(world, x, y, z, 25, 60, 75);
								E3SHProcedure.execute(world, x, y, z, 35, 60, 65);
								E3SHProcedure.execute(world, x, y, z, 40, 60, 55);
								E3SHProcedure.execute(world, x, y, z, 45, 60, 45);
								E3SHProcedure.execute(world, x, y, z, 50, 60, 35);
								E3SHProcedure.execute(world, x, y, z, 75, 60, 20);
								E6shockwaveProcedure.execute(world, x, y, z);
								CreatePyrotechnicsMod.queueServerWork(10, () -> {
									E3SHProcedure.execute(world, x, y, z, 35, 70, 65);
									E3SHProcedure.execute(world, x, y, z, 40, 70, 55);
									E3SHProcedure.execute(world, x, y, z, 45, 70, 45);
									E3SHProcedure.execute(world, x, y, z, 50, 70, 35);
									E3SHProcedure.execute(world, x, y, z, 75, 70, 20);
									E7shockwaveProcedure.execute(world, x, y, z);
									CreatePyrotechnicsMod.queueServerWork(15, () -> {
										E3SHProcedure.execute(world, x, y, z, 40, 80, 55);
										E3SHProcedure.execute(world, x, y, z, 45, 80, 45);
										E3SHProcedure.execute(world, x, y, z, 50, 80, 35);
										E3SHProcedure.execute(world, x, y, z, 75, 80, 20);
										CreatePyrotechnicsMod.queueServerWork(15, () -> {
											E3SHProcedure.execute(world, x, y, z, 45, 90, 45);
											E3SHProcedure.execute(world, x, y, z, 50, 90, 35);
											E3SHProcedure.execute(world, x, y, z, 75, 90, 20);
											CreatePyrotechnicsMod.queueServerWork(20, () -> {
												E3SHProcedure.execute(world, x, y, z, 50, 100, 35);
												E3SHProcedure.execute(world, x, y, z, 75, 100, 20);
												E10shockwaveProcedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(20, () -> {
													E3SHProcedure.execute(world, x, y, z, 75, 110, 20);
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
