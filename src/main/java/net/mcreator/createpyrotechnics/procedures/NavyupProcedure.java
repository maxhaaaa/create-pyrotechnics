package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

public class NavyupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double y_change = 0;
		double z_change = 0;
		double x_change = 0;
		double virtual_target_change = 0;
		String virtualblock = "";
		String targetvirtualblock = "";
		String virtualblockx = "";
		String virtualblockz = "";
		String virtualblocky = "";
		NavigateupProcedure.execute(world, x, y, z, 1, 0, 1, 0, "vry", "vry", "vrx", "vry", "vrz");
	}
}
