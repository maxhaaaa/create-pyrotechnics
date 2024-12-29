package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModEntities;
import net.mcreator.createpyrotechnics.entity.TestShockwaveEntity;

public class TestShockwaveProjectaileProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = 10;
		xr = 30;
		zr = 30;
		while (loop < pa) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new TestShockwaveEntity(CreatePyrotechnicsModEntities.TEST_SHOCKWAVE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setSecondsOnFire(100);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 25, 3);
				_entityToSpawn.setPos((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr), y, (z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr));
				_entityToSpawn.shoot(((x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr) - (x + 0.5) + Mth.nextDouble(RandomSource.create(), -0.7, 0.7)), 0,
						((z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr) - (z + 0.5) + Mth.nextDouble(RandomSource.create(), -0.7, 0.7)), (float) 0.3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			loop = loop + 1;
		}
	}
}
