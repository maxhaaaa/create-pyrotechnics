package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FallingSphere2Procedure {
	public static void execute() {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		double yRadius = 0;
		double masterRadius = 0;
		loop = 0;
		particleAmount = 30;
		masterRadius = 5;
		while (loop < particleAmount) {
			yRadius = masterRadius;
			FallingSphereProcedure.execute();
			xRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
			zRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
			loop = loop + 1;
		}
	}
}
