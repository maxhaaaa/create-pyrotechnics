package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Cap3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = 50;
		xr = 5;
		zr = 5;
		while (loop < pa) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), y, (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr)), Vec2.ZERO, _level, 4, "", Component.literal(""),
								_level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:cap_particle ~ ~ ~ " + ((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr) - (x + 0.5)) + " " + Mth.nextDouble(RandomSource.create(), 20, 22) + " "
								+ ((z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr) - (z + 0.5)) + " 0.6 0 force"));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:cap_particle ~ ~ ~ 0 " + Mth.nextDouble(RandomSource.create(), 20, 22) + " 0 " + "0.6 0 force"));
			loop = loop + 1;
		}
	}
}
