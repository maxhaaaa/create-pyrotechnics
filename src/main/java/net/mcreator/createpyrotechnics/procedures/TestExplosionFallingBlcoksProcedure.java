package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TestExplosionFallingBlcoksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		OgMushroomCloudProcedure.execute(world, x, y, z);
		WeTestFallingBlocksOnBlockRightClickedProcedure.execute(world);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1ogProcedure.execute(world, x, y, z);
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
												E10Procedure.execute(world, x, y, z);
												CreatePyrotechnicsMod.queueServerWork(40, () -> {
													E11Procedure.execute(world, x, y, z);
													WeTestFallingBlocksOnBlockRightClickedProcedure.execute(world);
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
