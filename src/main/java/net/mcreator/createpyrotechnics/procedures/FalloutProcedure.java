package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.network.CreatePyrotechnicsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FalloutProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean alarm = false;
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())) && 3 < CreatePyrotechnicsModVariables.MapVariables.get(world).fallout) {
			if (entity.isInWaterRainOrBubble()) {
				entity.getPersistentData().putDouble("radiation", Math.ceil(entity.getPersistentData().getDouble("radiation") + 1));
				entity.getPersistentData().putDouble("radiation2", Math.ceil(entity.getPersistentData().getDouble("radiation2") + 1));
				entity.getPersistentData().putDouble("radiation3", Math.ceil(entity.getPersistentData().getDouble("radiation3") + 1));
			}
		}
		if (entity.getPersistentData().getDouble("radiation") >= 100) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
			entity.getPersistentData().putDouble("radiation", 0);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 5));
		}
		if (entity.getPersistentData().getDouble("radiation2") >= 2000) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 3);
			entity.getPersistentData().putDouble("radiation2", 0);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 2000, 1));
		}
		if (entity.getPersistentData().getDouble("radiation3") >= 6000) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 5);
			entity.getPersistentData().putDouble("radiation3", 0);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 6000, 1));
		}
		if (CreatePyrotechnicsModVariables.MapVariables.get(world).alarm == false && 3 <= CreatePyrotechnicsModVariables.MapVariables.get(world).fallout) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_pyrotechnics:nuclear_alarm")), SoundSource.AMBIENT, 3, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_pyrotechnics:nuclear_alarm")), SoundSource.AMBIENT, 3, 1, false);
				}
			}
			CreatePyrotechnicsModVariables.MapVariables.get(world).alarm = true;
			CreatePyrotechnicsModVariables.MapVariables.get(world).syncData(world);
		} else if (3 > CreatePyrotechnicsModVariables.MapVariables.get(world).fallout) {
			CreatePyrotechnicsModVariables.MapVariables.get(world).alarm = false;
			CreatePyrotechnicsModVariables.MapVariables.get(world).syncData(world);
			CreatePyrotechnicsModVariables.MapVariables.get(world).alarm_timer = 0;
			CreatePyrotechnicsModVariables.MapVariables.get(world).syncData(world);
		}
		if (160 >= CreatePyrotechnicsModVariables.MapVariables.get(world).alarm_timer && 3 <= CreatePyrotechnicsModVariables.MapVariables.get(world).fallout) {
			CreatePyrotechnicsModVariables.MapVariables.get(world).alarm_timer = CreatePyrotechnicsModVariables.MapVariables.get(world).alarm_timer + 1;
			CreatePyrotechnicsModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
