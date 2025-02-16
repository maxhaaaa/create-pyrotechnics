package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DisplayFalloutProcedure {
public static boolean execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return false;
return
world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX(),entity.getY(),entity.getZ()))&&3<&&entity.isInWaterRainOrBubble();
}
}
