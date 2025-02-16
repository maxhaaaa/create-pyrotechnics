package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CockroachOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof CockroachEntity _datEntI ? _datEntI.getEntityData().get(CockroachEntity.DATA_spooked) : 0) > 0) {
			if (entity instanceof CockroachEntity _datEntSetI)
				_datEntSetI.getEntityData().set(CockroachEntity.DATA_spooked, (int) ((entity instanceof CockroachEntity _datEntI ? _datEntI.getEntityData().get(CockroachEntity.DATA_spooked) : 0) - 1));
		}
		if (SearchForJukeboxProcedure.execute(world)) {
			if (!(((CockroachEntity) entity).animationprocedure).equals("dance")) {
				if (entity instanceof CockroachEntity) {
					((CockroachEntity) entity).setAnimation("dance");
				}
			}
		}
	}
}
