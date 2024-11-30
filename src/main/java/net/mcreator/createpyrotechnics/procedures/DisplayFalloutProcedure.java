package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.network.CreatePyrotechnicsModVariables;

public class DisplayFalloutProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())) && 3 < CreatePyrotechnicsModVariables.MapVariables.get(world).fallout && entity.isInWaterRainOrBubble();
	}
}
