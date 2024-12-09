package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.entity.Entity;

public class FireballTestModelVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity.getPersistentData().getDouble("size");
	}
}
