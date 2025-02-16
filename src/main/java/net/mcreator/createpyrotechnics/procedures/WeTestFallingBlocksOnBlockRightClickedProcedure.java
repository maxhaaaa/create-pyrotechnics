package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WeTestFallingBlocksOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world) {
		CreatePyrotechnicsMod.queueServerWork(5, () -> {
			CreatePyrotechnicsMod.queueServerWork(5, () -> {
			});
		});
	}
}
