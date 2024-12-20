package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.entity.TestFireballEntity;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class TestFireballOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TestFireballEntity) {
			((TestFireballEntity) entity).setAnimation("new");
		}
		CreatePyrotechnicsMod.queueServerWork(100, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
