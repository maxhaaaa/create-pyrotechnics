package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LaunchPadOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double launch = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "start")) == true) {
			sy = 1;
			for (int index0 = 0; index0 < 64; index0++) {
				if (!((world.getBlockState(BlockPos.containing(x, y + sy, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + sy, z))).getBlock() instanceof LiquidBlock)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + sy), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon block_display ~ ~ ~ {block_state:{Name:" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y + sy, z))).getBlock()).toString()).substring(10) + "}}"));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CreatePyrotechnicsModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(x, y + sy, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + sy), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("msg @a summon block_display ~ ~ ~ {block_state:{Name:" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y + sy, z))).getBlock()).toString()).substring(10) + "}}"));
					world.setBlock(BlockPos.containing(x, y + sy, z), Blocks.AIR.defaultBlockState(), 3);
					sy = sy + 1;
				} else {
					sy = sy + 1;
				}
			}
		}
		if (sy >= 64) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("start", false);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
