package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModAttributes;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.List;
import java.util.Comparator;

public class E1Procedure {
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
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(500 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()))
					_livingEntity0.getAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()).setBaseValue(1);
				CreatePyrotechnicsMod.queueServerWork(100, () -> {
					if (entityiterator instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()))
						_livingEntity1.getAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()).setBaseValue(0);
				});
			}
		}
		loop = 0;
		increase = 0;
		size = sizeD;
		particleAmount = 50;
		masterRadius = 10;
		for (int index0 = 0; index0 < (int) size; index0++) {
			while (loop < particleAmount) {
				yRadius = masterRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[distance=..200,type=item]");
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 0.5 + Math.sin(((Math.PI * 10 * zRadius) / particleAmount) * loop) * zRadius), (y + Math.sin(((Math.PI * 2) / particleAmount) * loop) * yRadius),
							(z + 0.5 + Math.cos(((Math.PI * 10 * xRadius) / particleAmount) * loop) * xRadius), 10, Level.ExplosionInteraction.TNT);
				xRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
				zRadius = Math.cos(((Math.PI * 2) / particleAmount) * loop) * yRadius;
				loop = loop + 1;
			}
			masterRadius = masterRadius + 2;
			particleAmount = 2 * Math.PI * masterRadius;
			loop = 0;
		}
	}
}
