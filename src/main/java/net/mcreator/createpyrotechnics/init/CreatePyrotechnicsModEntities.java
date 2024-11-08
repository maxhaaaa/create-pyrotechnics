
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.createpyrotechnics.entity.TestingMortarEntity;
import net.mcreator.createpyrotechnics.entity.NukeprojEntity;
import net.mcreator.createpyrotechnics.entity.MortarormissleshooterEntity;
import net.mcreator.createpyrotechnics.entity.DESIGNATOREntity;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatePyrotechnicsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<EntityType<NukeprojEntity>> NUKEPROJ = register("nukeproj",
			EntityType.Builder.<NukeprojEntity>of(NukeprojEntity::new, MobCategory.MISC).setCustomClientFactory(NukeprojEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TestingMortarEntity>> TESTING_MORTAR = register("testing_mortar",
			EntityType.Builder.<TestingMortarEntity>of(TestingMortarEntity::new, MobCategory.MISC).setCustomClientFactory(TestingMortarEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarormissleshooterEntity>> MORTARORMISSLESHOOTER = register("mortarormissleshooter",
			EntityType.Builder.<MortarormissleshooterEntity>of(MortarormissleshooterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MortarormissleshooterEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<DESIGNATOREntity>> DESIGNATOR = register("designator",
			EntityType.Builder.<DESIGNATOREntity>of(DESIGNATOREntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DESIGNATOREntity::new)

					.sized(0.4f, 0.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MortarormissleshooterEntity.init();
			DESIGNATOREntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MORTARORMISSLESHOOTER.get(), MortarormissleshooterEntity.createAttributes().build());
		event.put(DESIGNATOR.get(), DESIGNATOREntity.createAttributes().build());
	}
}
