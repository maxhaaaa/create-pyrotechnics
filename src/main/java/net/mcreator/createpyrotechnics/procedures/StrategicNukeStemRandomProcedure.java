package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class StrategicNukeStemRandomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 15; index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:strategic_cloud ~ ~ ~ " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)
								+ (" " + Mth.nextDouble(RandomSource.create(), 6, 11) + " " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3) + " 1.2 0 force")));
		}
		for (int index1 = 0; index1 < 30; index1++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:strategic_cloud ~ ~ ~ " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)
								+ (" " + Mth.nextDouble(RandomSource.create(), -13, 11) + " " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3) + " 1.2 0 force")));
		}
	}
}
