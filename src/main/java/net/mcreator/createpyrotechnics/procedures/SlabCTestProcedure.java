package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModEntities;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.List;
import java.util.Comparator;

public class SlabCTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y - 1, z), "go")) == true) {
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x, y + 20, z), (world.getBlockState(BlockPos.containing(x, y, z))));
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CreatePyrotechnicsModEntities.MR_MOTIVATOR.get().spawn(_level, BlockPos.containing(x, y + 20, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			CreatePyrotechnicsMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, (y + 20), z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						entityiterator.setNoGravity(true);
						entityiterator.getPersistentData().putBoolean("rocket", true);
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			});
		}
	}
}
