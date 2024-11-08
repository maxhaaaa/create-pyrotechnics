
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.createpyrotechnics.client.renderer.MortarormissleshooterRenderer;
import net.mcreator.createpyrotechnics.client.renderer.DESIGNATORRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatePyrotechnicsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.NUKEPROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.TESTING_MORTAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.MORTARORMISSLESHOOTER.get(), MortarormissleshooterRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.DESIGNATOR.get(), DESIGNATORRenderer::new);
	}
}
