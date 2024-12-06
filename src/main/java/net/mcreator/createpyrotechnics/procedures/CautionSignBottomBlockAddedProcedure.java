package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModBlocks;

public class CautionSignBottomBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), CreatePyrotechnicsModBlocks.CAUTION_SIGN_UPPER.get().defaultBlockState(), 3);
	}
}
