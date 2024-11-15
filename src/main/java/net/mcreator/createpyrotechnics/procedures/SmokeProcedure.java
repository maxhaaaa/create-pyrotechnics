package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SmokeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = Mth.nextDouble(RandomSource.create(), 0, 100);
		xr = Mth.nextDouble(RandomSource.create(), 0, 50);
		zr = Mth.nextDouble(RandomSource.create(), 0, 50);
		while (loop < pa) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), y, (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr)), Vec2.ZERO, _level, 4, "", Component.literal(""),
								_level.getServer(), null).withSuppressedOutput(),
						("particle create_pyrotechnics:smoke_cloud ~ ~ ~ " + ((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr) - (x + 0.5)) + " " + 0.05 + " " + ((z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr) - (z + 0.5))
								+ " 0.3 0 force"));
			loop = loop + 1;
		}
	}
}
