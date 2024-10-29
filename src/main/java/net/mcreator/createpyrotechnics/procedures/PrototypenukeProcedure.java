package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModParticleTypes;
import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModAttributes;

import java.util.List;
import java.util.Comparator;

public class PrototypenukeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double sphereloop = 0;
		double particleAmount = 0;
		double yheight = 0;
		double increase = 0;
		loop = 0;
		sphereloop = 3;
		particleAmount = 50;
		xRadius = 1;
		zRadius = 1;
		yheight = 0;
		size = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()))
					_livingEntity0.getAttribute(CreatePyrotechnicsModAttributes.BLINDED.get()).setBaseValue(1);
			}
		}
		for (int index0 = 0; index0 < (int) sphereloop; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				while (loop < particleAmount) {
					world.addParticle((SimpleParticleType) (CreatePyrotechnicsModParticleTypes.EXPLOSION.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
							(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.01, 0);
					loop = loop + 1;
				}
				yheight = yheight + 0.5;
				loop = 0;
				if (increase == 4) {
					particleAmount = particleAmount + 10;
					increase = 0;
				} else {
					increase = increase + 1;
				}
				xRadius = xRadius + 2;
				zRadius = zRadius + 2;
			}
		}
		for (int index3 = 0; index3 < (int) sphereloop; index3++) {
			for (int index4 = 0; index4 < 5; index4++) {
				while (loop < particleAmount) {
					world.addParticle((SimpleParticleType) (CreatePyrotechnicsModParticleTypes.EXPLOSION.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
							(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.01, 0);
					loop = loop + 1;
				}
				yheight = yheight + 1;
				loop = 0;
				if (increase == 4) {
					particleAmount = particleAmount + 10;
					increase = 0;
				} else {
					increase = increase + 1;
				}
				xRadius = xRadius - 2;
				zRadius = zRadius - 2;
			}
		}
		loop = 0;
		particleAmount = 30;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		size = 0;
		for (int index6 = 0; index6 < 50; index6++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatePyrotechnicsModParticleTypes.EXPLOSION.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight - 1;
		}
		loop = 0;
		particleAmount = 10;
		size = 20;
		sphereloop = 3;
		xRadius = 1;
		zRadius = 1;
		yheight = 0;
		for (int index8 = 0; index8 < (int) sphereloop; index8++) {
			for (int index9 = 0; index9 < (int) size; index9++) {
				while (loop < particleAmount) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 4, Level.ExplosionInteraction.MOB);
					loop = loop + 1;
				}
				loop = 0;
				if (increase == 4) {
					particleAmount = particleAmount + 3;
					increase = 0;
				} else {
					increase = increase + 1;
				}
				xRadius = xRadius + 1;
				zRadius = zRadius + 1;
			}
			xRadius = 0;
			zRadius = 0;
			yheight = yheight - 1;
			size = size + 10;
		}
	}
}
