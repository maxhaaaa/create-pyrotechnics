package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class AidsWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 0, 0);
		immediatesourceentity.setNoGravity(true);
		CreatePyrotechnicsMod.queueServerWork(100, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
