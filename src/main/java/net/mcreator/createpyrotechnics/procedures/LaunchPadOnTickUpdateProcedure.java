package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LaunchPadOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("custom_missile:tag")))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y + 1, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("l", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).is(BlockTags.create(new ResourceLocation("custom_missile:tag")))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y + 2, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("l", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).is(BlockTags.create(new ResourceLocation("custom_missile:tag")))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y + 3, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("l", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 4, z))).is(BlockTags.create(new ResourceLocation("custom_missile:tag")))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y + 4, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("l", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 5, z))).is(BlockTags.create(new ResourceLocation("custom_missile:tag")))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y + 5, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("l", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
