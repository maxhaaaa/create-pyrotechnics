package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ReturnPotencyProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + RoundNumForDisplayProcedure.execute((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("potency"));
	}
}
