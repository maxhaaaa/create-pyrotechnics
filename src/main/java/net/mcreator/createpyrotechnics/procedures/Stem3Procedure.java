package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Stem3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 15; index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:cloud ~ ~ ~ " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)
								+ (" " + Mth.nextDouble(RandomSource.create(), 9, 12) + " " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3) + " 0.6 0 force")));
		}
		for (int index1 = 0; index1 < 30; index1++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:cloud ~ ~ ~ " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)
								+ (" " + Mth.nextDouble(RandomSource.create(), -14, 12) + " " + Mth.nextDouble(RandomSource.create(), -0.3, 0.3) + " 0.6 0 force")));
		}
	}
}
