package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createpyrotechnics.network.CreatePyrotechnicsModVariables;

public class ClearFalloutProcedure {
	public static void execute(LevelAccessor world) {
		CreatePyrotechnicsModVariables.MapVariables.get(world).fallout = 0;
		CreatePyrotechnicsModVariables.MapVariables.get(world).syncData(world);
	}
}
