
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

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
			}).withSearchBar().build());
}
