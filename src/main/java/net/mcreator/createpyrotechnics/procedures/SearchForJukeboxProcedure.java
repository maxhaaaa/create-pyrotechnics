package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SearchForJukeboxProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean found = false;
		double x = 0;
		double y = 0;
		double z = 0;
		found = false;
		x = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			y = -2;
			for (int index1 = 0; index1 < 5; index1++) {
				z = -2;
				for (int index2 = 0; index2 < 5; index2++) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("has_record") instanceof BooleanProperty _getbp1 && (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp1)) {
						found = true;
						break;
					}
					z = z + 1;
				}
				y = y + 1;
			}
			x = x + 1;
		}
		return found;
	}
}
