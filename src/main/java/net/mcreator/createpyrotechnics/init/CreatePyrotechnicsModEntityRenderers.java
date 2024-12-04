
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
import net.mcreator.createpyrotechnics.client.renderer.CockroachRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatePyrotechnicsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.NUKEPROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.TESTING_MORTAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.MORTARORMISSLESHOOTER.get(), MortarormissleshooterRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.DESIGNATOR.get(), DESIGNATORRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.AIDS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.SUPER_AIDS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.ICBM_PLACE_HOLDER_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.COCKROACH.get(), CockroachRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.RADAR_LASER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.RADAR_LASER_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.STRATEGIC_WARHEAD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatePyrotechnicsModEntities.MIRV_TEST.get(), ThrownItemRenderer::new);
	}
}
