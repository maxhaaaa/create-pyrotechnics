package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ModdedExplosionparticle1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 7, Level.ExplosionInteraction.TNT);
		for (int index0 = 0; index0 < 200; index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle minecraft:campfire_cosy_smoke ~ ~ ~ "
								+ (Mth.nextDouble(RandomSource.create(), -1.2, 1.2) + "" + (" " + (Mth.nextDouble(RandomSource.create(), 1.2, 2.6) + "" + (" " + (Mth.nextDouble(RandomSource.create(), -0.6, 0.6) + " 0.05 0 force")))))));
		}
	}
}
