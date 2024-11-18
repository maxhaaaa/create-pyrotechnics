package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExplosionParticles1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) 3.5, Level.ExplosionInteraction.TNT);
		for (int index0 = 0; index0 < 21; index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle minecraft:campfire_cosy_smoke ~ ~ ~ "
								+ (Mth.nextDouble(RandomSource.create(), -0.6, 0.6) + "" + (" " + (Mth.nextDouble(RandomSource.create(), 1.2, 2.6) + "" + (" " + (Mth.nextDouble(RandomSource.create(), -0.6, 0.6) + " 0.025 0 force")))))));
		}
	}
}
