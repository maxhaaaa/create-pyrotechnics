package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.network.CreatePyrotechnicsModVariables;

public class ICBMGuidanceSystemOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (CreatePyrotechnicsModVariables.MapVariables.get(world).activate == new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "link")) {
			ICBMLaunchProcedureProcedure.execute();
		}
	}
}
