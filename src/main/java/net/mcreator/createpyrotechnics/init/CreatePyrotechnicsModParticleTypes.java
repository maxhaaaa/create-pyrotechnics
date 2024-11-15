
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<SimpleParticleType> EXPLOSION = REGISTRY.register("explosion", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PARTICLEHEAVY = REGISTRY.register("particleheavy", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CAP_PARTICLE = REGISTRY.register("cap_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FLASH = REGISTRY.register("flash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CLOUD = REGISTRY.register("cloud", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SMOKE_CLOUD = REGISTRY.register("smoke_cloud", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SHOCKWAVE_PARTICLE = REGISTRY.register("shockwave_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FIREPILLARPARTICLE = REGISTRY.register("firepillarparticle", () -> new SimpleParticleType(true));
}
