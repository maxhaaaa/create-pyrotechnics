package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.network.CreatePyrotechnicsModVariables;

public class FalloutWarningProcedure {
	public static boolean execute(LevelAccessor world) {
		return 3 <= CreatePyrotechnicsModVariables.MapVariables.get(world).fallout && 160 >= CreatePyrotechnicsModVariables.MapVariables.get(world).alarm_timer;
	}
}
