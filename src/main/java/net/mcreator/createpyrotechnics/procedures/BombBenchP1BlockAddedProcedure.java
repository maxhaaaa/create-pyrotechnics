package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BombBenchP1BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x - 1, y, z), CreatePyrotechnicsModBlocks.BOMB_BENCH_P_2.get().defaultBlockState(), 3);
	}
}
