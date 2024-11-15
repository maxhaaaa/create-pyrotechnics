
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.createpyrotechnics.potion.BurntretnasMobEffect;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<MobEffect> BURNTRETNAS = REGISTRY.register("burntretnas", () -> new BurntretnasMobEffect());
}
