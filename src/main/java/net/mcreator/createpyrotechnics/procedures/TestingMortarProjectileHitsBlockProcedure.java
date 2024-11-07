package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModParticleTypes;

public class TestingMortarProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
		for (int index0 = 0; index0 < 200; index0++) {
			world.addParticle((SimpleParticleType) (CreatePyrotechnicsModParticleTypes.PARTICLEHEAVY.get()), x, y, z, (Mth.nextDouble(RandomSource.create(), -5, 5)), (Mth.nextDouble(RandomSource.create(), 0, 3)),
					(Mth.nextDouble(RandomSource.create(), -5, 5)));
		}
	}
}
