package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

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
