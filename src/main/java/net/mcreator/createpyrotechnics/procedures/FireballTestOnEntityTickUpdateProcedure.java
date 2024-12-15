package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class FireballTestOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("size", (entity.getPersistentData().getDouble("size") + 1));
		{
			Entity _ent = entity;
			_ent.setYRot((float) (entity.getYRot() + 1));
			_ent.setXRot((float) (entity.getXRot() + 1));
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		CreatePyrotechnicsMod.queueServerWork(120, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
