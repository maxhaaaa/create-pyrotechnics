package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MIRVTest1OnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		CreatePyrotechnicsMod.queueServerWork(1, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			CreatePyrotechnicsMod.queueServerWork(1, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				CreatePyrotechnicsMod.queueServerWork(1, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				});
			});
		});
		for (int index0 = 0; index0 < 3; index0++) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSecondsOnFire(100);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot((Mth.nextDouble(RandomSource.create(), -2, 2)), (Mth.nextDouble(RandomSource.create(), -1, 0.2)), (Mth.nextDouble(RandomSource.create(), -2, 2)), 7, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
