package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ToxSealPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack test = ItemStack.EMPTY;
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CreatePyrotechnicsModItems.DELETED_MOD_ELEMENT.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
