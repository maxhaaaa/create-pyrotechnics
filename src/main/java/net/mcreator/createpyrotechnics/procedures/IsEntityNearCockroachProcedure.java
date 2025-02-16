package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class IsEntityNearCockroachProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty() || !world.getEntitiesOfClass(PathfinderMob.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty());
	}
}
