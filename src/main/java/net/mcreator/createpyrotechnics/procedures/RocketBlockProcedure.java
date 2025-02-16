package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class RocketBlockProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("rocket") == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle large_smoke ~ ~-1 ~ 0 0 0 0.05 1 force");
		}
		if (entity.getPersistentData().getBoolean("rocket1") == true) {
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 0.5), 0));
		}
	}
}
