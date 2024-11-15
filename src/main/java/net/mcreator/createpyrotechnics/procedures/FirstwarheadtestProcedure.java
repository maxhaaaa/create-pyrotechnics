package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FirstwarheadtestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MushroomCloudProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1Procedure.execute(world, x, y, z);
		});
	}
}
