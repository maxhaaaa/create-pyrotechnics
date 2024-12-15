package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MegaMindProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pa = 0;
		double loop = 0;
		double zr = 0;
		double xr = 0;
		loop = 0;
		pa = 7;
		xr = 60;
		zr = 60;
		while (loop < pa) {
			ThisMayBeItProcedure.execute(world, x + 0.5 + Math.cos((Math.PI * 2 + pa) * loop) * xr, y, z + 0.5 + Math.sin((Math.PI * 2 + pa) * loop) * zr);
			loop = loop + 1;
		}
	}
}
