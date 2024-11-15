package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class FirstwarheadtestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double explosive_power) {
		MushroomCloudProcedure.execute(world, x, y, z);
		CreatePyrotechnicsMod.queueServerWork(10, () -> {
			E1Procedure.execute(world, x, y, z, explosive_power / 1000);
		});
	}
}
