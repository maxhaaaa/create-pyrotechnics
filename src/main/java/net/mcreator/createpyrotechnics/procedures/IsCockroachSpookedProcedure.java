package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.entity.CockroachEntity;

public class IsCockroachSpookedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof CockroachEntity _datEntI ? _datEntI.getEntityData().get(CockroachEntity.DATA_spooked) : 0) < 1;
	}
}
