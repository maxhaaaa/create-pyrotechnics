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

public class DynamiteTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = 50;
		xr = 0.25;
		zr = 0.25;
		while (loop < pa) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), y, (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr)), Vec2.ZERO, _level, 4, "", Component.literal(""),
								_level.getServer(), null).withSuppressedOutput(),
						("particle minecraft:campfire_cosy_smoke ~ ~ ~ " + ((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr) - (x + 0.5)) + " " + Mth.nextDouble(RandomSource.create(), 0.85, 0.95) + " "
								+ ((z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr) - (z + 0.5)) + " 0.12 0 force"));
			loop = loop + 1;
		}
	}
}
