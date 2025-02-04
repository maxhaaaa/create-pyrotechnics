package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class E1ogProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yRadius = 0;
		double masterRadius = 0;
		loop = 0;
		particleAmount = 50;
		masterRadius = 10;
		while (loop < particleAmount) {
			yRadius = masterRadius;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"kill @e[distance=..200,type=item]");
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 0.5 + Math.sin(((Math.PI * 10 * zRadius) / particleAmount) * loop) * zRadius), (y + Math.sin(((Math.PI * 2) / particleAmount) * loop) * yRadius),
						(z + 0.5 + Math.cos(((Math.PI * 10 * xRadius) / particleAmount) * loop) * xRadius), 10, Level.ExplosionInteraction.TNT);
			xRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
			zRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
			loop = loop + 1;
		}
	}
}
