
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createpyrotechnics.client.particle.SmokeCloudParticle;
import net.mcreator.createpyrotechnics.client.particle.ShockwaveParticleParticle;
import net.mcreator.createpyrotechnics.client.particle.ParticleheavyParticle;
import net.mcreator.createpyrotechnics.client.particle.NuclearExplosionParticle;
import net.mcreator.createpyrotechnics.client.particle.FlashParticle;
import net.mcreator.createpyrotechnics.client.particle.FirepillarparticleParticle;
import net.mcreator.createpyrotechnics.client.particle.ExplosionParticle;
import net.mcreator.createpyrotechnics.client.particle.CloudParticle;
import net.mcreator.createpyrotechnics.client.particle.CapParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatePyrotechnicsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.EXPLOSION.get(), ExplosionParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.PARTICLEHEAVY.get(), ParticleheavyParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.CLOUD.get(), CloudParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.FLASH.get(), FlashParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.CAP_PARTICLE.get(), CapParticleParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.SMOKE_CLOUD.get(), SmokeCloudParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.SHOCKWAVE_PARTICLE.get(), ShockwaveParticleParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.FIREPILLARPARTICLE.get(), FirepillarparticleParticle::provider);
		event.registerSpriteSet(CreatePyrotechnicsModParticleTypes.NUCLEAR_EXPLOSION.get(), NuclearExplosionParticle::provider);
	}
}
