package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.PathfinderMob;

public class IsEntityNearCockroachProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty() || !world.getEntitiesOfClass(PathfinderMob.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty());
	}
}
