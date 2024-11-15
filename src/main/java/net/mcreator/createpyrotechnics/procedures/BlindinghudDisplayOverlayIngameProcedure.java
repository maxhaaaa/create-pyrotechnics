package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModMobEffects;

public class BlindinghudDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CreatePyrotechnicsModMobEffects.BURNTRETNAS.get()) ? _livEnt.getEffect(CreatePyrotechnicsModMobEffects.BURNTRETNAS.get()).getAmplifier() : 0) > 1) {
			return true;
		}
		return false;
	}
}
