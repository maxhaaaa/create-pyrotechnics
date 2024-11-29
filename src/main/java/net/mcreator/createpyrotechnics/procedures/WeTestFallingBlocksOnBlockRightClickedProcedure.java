package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WeTestFallingBlocksOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world) {
		FallProcedure.execute(world);
		CreatePyrotechnicsMod.queueServerWork(5, () -> {
			FallProcedure.execute(world);
			CreatePyrotechnicsMod.queueServerWork(5, () -> {
				FallProcedure.execute(world);
			});
		});
	}
}
