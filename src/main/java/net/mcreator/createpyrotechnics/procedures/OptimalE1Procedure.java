package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

public class OptimalE1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double sizeD) {
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yRadius = 0;
		double masterRadius = 0;
		double size = 0;
		double yheight = 0;
		double increase = 0;
		boolean next = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(500 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CreatePyrotechnicsModMobEffects.BURNTRETNAS.get(), 60, 1, false, false));
			}
		}
		loop = 0;
		increase = 0;
		size = sizeD;
		particleAmount = 25;
		for (int index0 = 0; index0 < (int) size; index0++) {
			while (loop < particleAmount) {
				yRadius = masterRadius / 2;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[distance=..800,type=item]");
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 0.5 + Math.sin(((Math.PI * 10 * zRadius) / particleAmount) * loop) * zRadius), (y + Math.sin(((Math.PI * 2) / particleAmount) * loop) * yRadius),
							(z + 0.5 + Math.cos(((Math.PI * 10 * xRadius) / particleAmount) * loop) * xRadius), 15, Level.ExplosionInteraction.TNT);
				xRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
				zRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
				loop = loop + 1;
			}
			masterRadius = masterRadius + 10;
			particleAmount = 2 * Math.PI * masterRadius;
			loop = 0;
		}
	}
}
