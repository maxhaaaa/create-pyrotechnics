package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.network.CreatePyrotechnicsModVariables;

public class FalloutWorldEventProcedure {
	public static void execute(LevelAccessor world) {
		if (3 <= CreatePyrotechnicsModVariables.MapVariables.get(world).fallout) {
			world.getLevelData().setRaining(true);
		}
	}
}
