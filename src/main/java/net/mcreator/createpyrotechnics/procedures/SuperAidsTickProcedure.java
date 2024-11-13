package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class SuperAidsTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle(ParticleTypes.POOF, x, y, z, 0, 0, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 2, 0.1, 0.1, 0.1, 0.1);
		immediatesourceentity.setNoGravity(true);
		CreatePyrotechnicsMod.queueServerWork(4, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
