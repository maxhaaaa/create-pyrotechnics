package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModAttributes;

public class BlindinghudDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(CreatePyrotechnicsModAttributes.BLINDED.get())
				? _livingEntity0.getAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()).getBaseValue()
				: 0) == 1) {
			return true;
		}
		return false;
	}
}
