package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class E3SHProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double amount, double radius, double shockwave) {
		boolean limit2 = false;
		boolean limit = false;
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		double size = 0;
		double y_cord = 0;
		double above = 0;
		limit2 = false;
		limit = false;
		above = shockwave;
		size = 12;
		y_cord = y;
		loop = 0;
		pa = amount;
		xr = radius;
		zr = radius;
		while (loop < pa) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"kill @e[distance=..200,type=item]");
			if ((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord + 1, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR
					&& !((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR)) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
							Level.ExplosionInteraction.TNT);
				loop = loop + 1;
				y_cord = y;
				limit = false;
			} else {
				if (y_cord > -50 && limit == false) {
					if (y_cord > -10 && limit == false && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (!((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord + 1, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR
								&& !((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR))) {
							y_cord = y_cord - 1;
						} else {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
										Level.ExplosionInteraction.TNT);
							loop = loop + 1;
							y_cord = y;
							limit = false;
						}
					} else if (y_cord > -10 && limit == false) {
						if (!((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord + 1, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR
								&& !((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR))) {
							y_cord = y_cord - 1;
						} else {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
										Level.ExplosionInteraction.TNT);
							loop = loop + 1;
							y_cord = y;
							limit = false;
						}
					} else {
						limit = true;
						if (y_cord < 10) {
							if (!((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord + 1, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR
									&& !((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR))) {
								y_cord = y_cord + 1;
							} else {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
											Level.ExplosionInteraction.TNT);
								loop = loop + 1;
								y_cord = y;
								limit = false;
							}
						} else {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
										Level.ExplosionInteraction.TNT);
							loop = loop + 1;
							y_cord = y;
							limit = false;
						}
					}
				} else {
					limit = true;
					if (y_cord < 50) {
						if (!((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord + 1, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR
								&& !((world.getBlockState(BlockPos.containing(x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y_cord, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr))).getBlock() == Blocks.AIR))) {
							y_cord = y_cord + 1;
						} else {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
										Level.ExplosionInteraction.TNT);
							loop = loop + 1;
							y_cord = y;
							limit = false;
						}
					} else {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), (y_cord + above + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr), (float) size,
									Level.ExplosionInteraction.TNT);
						loop = loop + 1;
						y_cord = y;
						limit = false;
					}
				}
			}
		}
	}
}
