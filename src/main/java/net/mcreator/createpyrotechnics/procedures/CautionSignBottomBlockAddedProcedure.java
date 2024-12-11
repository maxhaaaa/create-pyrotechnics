package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CautionSignBottomBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), CreatePyrotechnicsModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
	}
}
