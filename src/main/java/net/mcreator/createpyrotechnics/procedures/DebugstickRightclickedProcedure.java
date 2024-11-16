package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModAttributes;

public class DebugstickRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double intensity, double speed_divider) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()))
			_livingEntity0.getAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()).setBaseValue(0);
		ExplodeandmotionProcedure.execute(world, x, y, z, intensity, 10, speed_divider);
	}
}
