package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ReturnExplosivepowerProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return "" + (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "EXPLOSIVE_POWER"));
	}
}
