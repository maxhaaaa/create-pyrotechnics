package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

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
		}
	}
}
