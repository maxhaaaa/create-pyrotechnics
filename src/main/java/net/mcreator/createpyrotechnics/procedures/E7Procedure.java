package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class E7Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = 75;
		xr = 70;
		zr = 70;
		while (loop < pa) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"kill @e[distance=..200,type=item]");
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), y, (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), 12, Level.ExplosionInteraction.TNT);
			loop = loop + 1;
		}
	}
}
