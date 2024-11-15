package net.mcreator.createpyrotechnics.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModBlockEntities;
import net.mcreator.createpyrotechnics.block.renderer.TrinitytestTileRenderer;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

@Mod.EventBusSubscriber(modid = CreatePyrotechnicsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CreatePyrotechnicsModBlockEntities.TRINITYTEST.get(), context -> new TrinitytestTileRenderer());
	}
}
