package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class VariationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -112;
		for (int index0 = 0; index0 < 224; index0++) {
			sy = -56;
			for (int index1 = 0; index1 < 80; index1++) {
				sz = -112;
				for (int index2 = 0; index2 < 224; index2++) {
					if (sx >= -80 && sx <= 80 && sz >= -80 && sz <= 80 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK && Math.random() < 0.15) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
					} else if (sx >= -48 && sx <= 48 && sz >= -48 && sz <= 48 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK && Math.random() < 0.3) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK && Math.random() < 0.03) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
