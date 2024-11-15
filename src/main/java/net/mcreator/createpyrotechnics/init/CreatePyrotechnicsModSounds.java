
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<SoundEvent> EXPLOSION = REGISTRY.register("explosion", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("create_pyrotechnics", "explosion")));
	public static final RegistryObject<SoundEvent> NUKE = REGISTRY.register("nuke", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("create_pyrotechnics", "nuke")));
}
