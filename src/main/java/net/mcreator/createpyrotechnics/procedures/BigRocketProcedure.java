package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BigRocketProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double launch = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		found = false;
		for (int index0 = 0; index0 < 12; index0++) {
			sy = -16;
			for (int index1 = 0; index1 < 32; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
					if (!((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR)) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("summon block_display ~ ~ ~ {block_state:{Name:" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock()).toString()).substring(10) + "}}"));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("msg @a summon block_display ~ ~ ~ {block_state:{Name:" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock()).toString()).substring(10) + "}}"));
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
					} else {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
