package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Test1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = 50;
		xr = 15;
		zr = 15;
		while (loop < pa) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), y, (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr)), Vec2.ZERO, _level, 4, "", Component.literal(""),
								_level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:shockwave_particle ~ ~ ~ " + ((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr) - (x + 0.5)) + " " + 0.05 + " " + ((z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr) - (z + 0.5))
								+ " 0.3 0 force"));
			loop = loop + 1;
		}
	}
}
