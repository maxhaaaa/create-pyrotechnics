
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createpyrotechnics.client.particle.ParticleheavyParticle;
import net.mcreator.createpyrotechnics.client.particle.ExplosionParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatePyrotechnicsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.EXPLOSION.get(), ExplosionParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.PARTICLEHEAVY.get(), ParticleheavyParticle::provider);
	}
}
