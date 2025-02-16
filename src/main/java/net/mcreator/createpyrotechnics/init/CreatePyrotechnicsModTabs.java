
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatePyrotechnicsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATEPYROTECHNICS = REGISTRY.register("createpyrotechnics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_pyrotechnics.createpyrotechnics")).icon(() -> new ItemStack(CreatePyrotechnicsModItems.DEBUGSTICK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreatePyrotechnicsModBlocks.COMPUTERBLOCK.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.DATAWIREBLOCK.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.BALLISTICSBUILDINGTOOL.get());
				tabData.accept(CreatePyrotechnicsModBlocks.SILO_BLOCK.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.VALUESTORAGEBLOCK.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.PINASSIGNER.get());
				tabData.accept(CreatePyrotechnicsModItems.LAZERDESIGNATOR.get());
				tabData.accept(CreatePyrotechnicsModItems.DESIGNATOR_SPAWN_EGG.get());
				tabData.accept(CreatePyrotechnicsModBlocks.EXPLOSIVESPHEREWORKBENCH.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.DATAWIRETESTER.get());
				tabData.accept(CreatePyrotechnicsModBlocks.PLACEHOLDER.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.HANDHELD_PUMP.get());
				tabData.accept(CreatePyrotechnicsModBlocks.DESIGNATORBLOCK.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.TRINITYTEST.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.THRUSTER.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.FUEL_TANK.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.MISSILE_BODY.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.MISSILE_CONTROLL_PANEL.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.MISSILE_NAVIGATION.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.MISSILE_BODY_STAGE_3.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.TESTER.get());
				tabData.accept(CreatePyrotechnicsModItems.BIG_RED_BUTTON.get());
				tabData.accept(CreatePyrotechnicsModBlocks.PARTICLE_TESTING.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.BOMB_BENCH_BLOCK.get());
				tabData.accept(CreatePyrotechnicsModItems.RADAR_TESTER.get());
				tabData.accept(CreatePyrotechnicsModBlocks.STRATEGIC_NUKE_PLACEHOLDER.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.WE_TEST_FALLING_BLOCKS.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.STRATEGIC_NUKE_PLACEHOLDER_2.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.SHOCKWAVE_TESTER.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.RADAR.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.NUCLEAR_CORE.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.MISSILE_BODY_PLACEHOLDER.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.ICBM_GUIDANCE_SYSTEM.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.MIRV_TESTER.get());
				tabData.accept(CreatePyrotechnicsModBlocks.DYNAMITE_TEST_BLOCK.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.ENRICHMENT.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.TEST_SALTED_NUKES.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.ENGINE_C_TEST.get().asItem());
				tabData.accept(CreatePyrotechnicsModItems.FIREBALL_TEST_SPAWN_EGG.get());
				tabData.accept(CreatePyrotechnicsModBlocks.LINKER_C_TEST.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.LAUNCH_PAD.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.TEST_CUSTOM_MISSILE.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.BODY_C_TEST.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.THRUSTER_C_TEST.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.CAUTION_SIGN_BOTTOM.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.CAUTION_SIGN_UPPER.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.BODY_SLAB_C_TEST.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.SIZE_TESTER.get().asItem());
				tabData.accept(CreatePyrotechnicsModBlocks.MODDEDPARTICLETEST.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CreatePyrotechnicsModItems.COCKROACH_SPAWN_EGG.get());
			tabData.accept(CreatePyrotechnicsModItems.FIREBALL_TEST_SPAWN_EGG.get());
			tabData.accept(CreatePyrotechnicsModItems.MR_MOTIVATOR_SPAWN_EGG.get());
			tabData.accept(CreatePyrotechnicsModItems.THRUSTER_ENTITY_SPAWN_EGG.get());
		}
	}
}
