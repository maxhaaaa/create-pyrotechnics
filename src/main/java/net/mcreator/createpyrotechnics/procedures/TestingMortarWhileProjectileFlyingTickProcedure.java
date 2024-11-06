package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModParticleTypes;

public class TestingMortarWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (CreatePyrotechnicsModParticleTypes.EXPLOSION.get()), x, y, z, 0, 0, 0);
	}
}
