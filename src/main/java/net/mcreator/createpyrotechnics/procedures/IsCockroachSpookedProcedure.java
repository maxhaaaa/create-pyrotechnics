package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class IsCockroachSpookedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof CockroachEntity _datEntI ? _datEntI.getEntityData().get(CockroachEntity.DATA_spooked) : 0) < 1;
	}
}
