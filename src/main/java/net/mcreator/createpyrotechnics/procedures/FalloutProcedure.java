package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.eventbus.api.Event;

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

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
boolean alarm = false;
if (world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX(),entity.getY(),entity.getZ()))&&3<) {if (entity.isInWaterRainOrBubble()) {entity.getPersistentData().putDouble("radiation", Math.ceil(entity.getPersistentData().getDouble("radiation")+1));entity.getPersistentData().putDouble("radiation2", Math.ceil(entity.getPersistentData().getDouble("radiation2")+1));entity.getPersistentData().putDouble("radiation3", Math.ceil(entity.getPersistentData().getDouble("radiation3")+1));}}if (entity.getPersistentData().getDouble("radiation")>=100) {entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);entity.getPersistentData().putDouble("radiation", 0);if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,100,5));}if (entity.getPersistentData().getDouble("radiation2")>=2000) {entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 3);entity.getPersistentData().putDouble("radiation2", 0);if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER,2000,1));}if (entity.getPersistentData().getDouble("radiation3")>=6000) {entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 5);entity.getPersistentData().putDouble("radiation3", 0);if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.POISON,6000,1));}if (==false&&3<=) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(entity.getX(),entity.getY(),entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_pyrotechnics:nuclear_alarm")),
SoundSource.AMBIENT, 3, 1);
} else {
_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_pyrotechnics:nuclear_alarm")),
SoundSource.AMBIENT, 3, 1, false);
}
}
}else if (3>) {}if (160>=&&3<=) {}
}
}
