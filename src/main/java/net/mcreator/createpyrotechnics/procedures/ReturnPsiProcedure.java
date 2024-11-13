package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ReturnPsiProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("PSI"));
	}
}
