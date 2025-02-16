package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MissileBodyPlaceholderOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.HOPPER && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.HOPPER
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.HOPPER && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.HOPPER) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 2, z))).getBlock() == Blocks.IRON_TRAPDOOR && (world.getBlockState(BlockPos.containing(x - 1, y - 2, z))).getBlock() == Blocks.IRON_TRAPDOOR
						&& (world.getBlockState(BlockPos.containing(x, y - 2, z + 1))).getBlock() == Blocks.IRON_TRAPDOOR && (world.getBlockState(BlockPos.containing(x, y - 2, z - 1))).getBlock() == Blocks.IRON_TRAPDOOR) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.HOPPER) {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putBoolean("thruster", true);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STONE
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STONE) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.STONE
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.STONE) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 2, z))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x - 1, y - 2, z))).getBlock() == Blocks.STONE
						&& (world.getBlockState(BlockPos.containing(x, y - 2, z + 1))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x, y - 2, z - 1))).getBlock() == Blocks.STONE) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.STONE
							&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.STONE) {
						if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.STONE
								&& (world.getBlockState(BlockPos.containing(x, y + 2, z + 1))).getBlock() == Blocks.STONE && (world.getBlockState(BlockPos.containing(x, y + 2, z - 1))).getBlock() == Blocks.STONE) {
							if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GREEN_WOOL) {
								if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WHITE_WOOL) {
									if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
										if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.WHITE_WOOL) {
											if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.HOPPER) {
												if (!world.isClientSide()) {
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putBoolean("body1", true);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
											} else if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.MAGENTA_WOOL) {
												if (!world.isClientSide()) {
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putBoolean("body2", true);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DIORITE
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.DIORITE) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.DIORITE
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.DIORITE) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 2, z))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x - 1, y - 2, z))).getBlock() == Blocks.DIORITE
						&& (world.getBlockState(BlockPos.containing(x, y - 2, z + 1))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x, y - 2, z - 1))).getBlock() == Blocks.DIORITE) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.DIORITE
							&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.DIORITE && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.DIORITE) {
						if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z))).getBlock() == Blocks.GRAY_WOOL && (world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.GRAY_WOOL
								&& (world.getBlockState(BlockPos.containing(x, y + 2, z + 1))).getBlock() == Blocks.GRAY_WOOL && (world.getBlockState(BlockPos.containing(x, y + 2, z - 1))).getBlock() == Blocks.GRAY_WOOL) {
							if ((world.getBlockState(BlockPos.containing(x + 1, y - 3, z))).getBlock() == Blocks.STONE_STAIRS && (world.getBlockState(BlockPos.containing(x - 1, y - 3, z))).getBlock() == Blocks.STONE_STAIRS
									&& (world.getBlockState(BlockPos.containing(x, y - 3, z + 1))).getBlock() == Blocks.STONE_STAIRS && (world.getBlockState(BlockPos.containing(x, y - 3, z - 1))).getBlock() == Blocks.STONE_STAIRS) {
								if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GREEN_WOOL) {
									if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.MAGENTA_WOOL) {
										if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
											if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.WHITE_WOOL) {
												if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.HOPPER) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putBoolean("body3", true);
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.GRANITE && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.GRANITE
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.GRANITE && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.GRANITE) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.GRANITE && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.GRANITE
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.GRANITE && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.GRANITE) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.GRANITE_STAIRS && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.GRANITE_STAIRS
						&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.GRANITE_STAIRS && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.GRANITE_STAIRS) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL && (world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL
							&& (world.getBlockState(BlockPos.containing(x, y + 2, z + 1))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL && (world.getBlockState(BlockPos.containing(x, y + 2, z - 1))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL) {
						if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.HOPPER) {
							if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.POLISHED_BLACKSTONE) {
								if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CreatePyrotechnicsModBlocks.ICBM_GUIDANCE_SYSTEM.get()) {
									if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.POLISHED_BLACKSTONE) {
										if ((world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.POLISHED_BLACKSTONE_WALL) {
											if (!world.isClientSide()) {
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putBoolean("body4", true);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "body1")) == true) {
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 4, z), "thruster")) == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("link", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "body2")) == true) {
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 6, z), "body1")) == true && (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 6, z), "link")) == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("link", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "body3")) == true) {
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 7, z), "body2")) == true && (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 7, z), "link")) == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("link", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "body4")) == true) {
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 4, z), "body3")) == true && (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y - 4, z), "link")) == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("link", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
