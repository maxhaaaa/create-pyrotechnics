package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ReturnPotencyProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + RoundNumForDisplayProcedure.execute((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("potency"));
	}
}
