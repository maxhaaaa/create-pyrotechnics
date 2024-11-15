package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PlusFlameProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("heat") == 3)) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("heat",
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("heat") + 1));
		}
	}
}
