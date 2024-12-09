package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class EngineCTestOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.HOPPER && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.IRON_TRAPDOOR) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("engine", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "go")) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			for (int index0 = 0; index0 < 15; index0++) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 2), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("particle flame ~ ~ ~ 0 " + (Mth.nextDouble(RandomSource.create(), -0.7, -0.1) + " 0 0.1 0 force")));
			}
			CreatePyrotechnicsMod.queueServerWork(5, () -> {
				for (int index1 = 0; index1 < 15; index1++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("particle flame ~ ~ ~ 0 " + (Mth.nextDouble(RandomSource.create(), -0.7, -0.1) + " 0 0.1 0 force")));
				}
				CreatePyrotechnicsMod.queueServerWork(5, () -> {
					for (int index2 = 0; index2 < 15; index2++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("particle flame ~ ~ ~ 0 " + (Mth.nextDouble(RandomSource.create(), -0.7, -0.1) + " 0 0.1 0 force")));
					}
					CreatePyrotechnicsMod.queueServerWork(5, () -> {
						for (int index3 = 0; index3 < 15; index3++) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("particle flame ~ ~ ~ 0 " + (Mth.nextDouble(RandomSource.create(), -0.7, -0.1) + " 0 0.1 0 force")));
						}
						CreatePyrotechnicsMod.queueServerWork(5, () -> {
							for (int index4 = 0; index4 < 15; index4++) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											("particle flame ~ ~ ~ 0 " + (Mth.nextDouble(RandomSource.create(), -0.7, -0.1) + " 0 0.1 0 force")));
							}
						});
					});
				});
			});
		}
	}
}
