
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
import net.mcreator.createpyrotechnics.entity.SuperAidsEntity;
import net.mcreator.createpyrotechnics.entity.StrategicWarheadEntity;
import net.mcreator.createpyrotechnics.entity.RadarLaserEntity;
import net.mcreator.createpyrotechnics.entity.RadarLaser2Entity;
import net.mcreator.createpyrotechnics.entity.NukeprojEntity;
import net.mcreator.createpyrotechnics.entity.MortarormissleshooterEntity;
import net.mcreator.createpyrotechnics.entity.ICBMPlaceHolder1Entity;
import net.mcreator.createpyrotechnics.entity.DESIGNATOREntity;
import net.mcreator.createpyrotechnics.entity.CockroachEntity;
import net.mcreator.createpyrotechnics.entity.AidsEntity;
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
	public static final RegistryObject<EntityType<AidsEntity>> AIDS = register("aids",
			EntityType.Builder.<AidsEntity>of(AidsEntity::new, MobCategory.MISC).setCustomClientFactory(AidsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SuperAidsEntity>> SUPER_AIDS = register("super_aids",
			EntityType.Builder.<SuperAidsEntity>of(SuperAidsEntity::new, MobCategory.MISC).setCustomClientFactory(SuperAidsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ICBMPlaceHolder1Entity>> ICBM_PLACE_HOLDER_1 = register("icbm_place_holder_1", EntityType.Builder.<ICBMPlaceHolder1Entity>of(ICBMPlaceHolder1Entity::new, MobCategory.MISC)
			.setCustomClientFactory(ICBMPlaceHolder1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CockroachEntity>> COCKROACH = register("cockroach",
			EntityType.Builder.<CockroachEntity>of(CockroachEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CockroachEntity::new)

					.sized(0.2f, 0.1f));
	public static final RegistryObject<EntityType<RadarLaserEntity>> RADAR_LASER = register("radar_laser",
			EntityType.Builder.<RadarLaserEntity>of(RadarLaserEntity::new, MobCategory.MISC).setCustomClientFactory(RadarLaserEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RadarLaser2Entity>> RADAR_LASER_2 = register("radar_laser_2",
			EntityType.Builder.<RadarLaser2Entity>of(RadarLaser2Entity::new, MobCategory.MISC).setCustomClientFactory(RadarLaser2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StrategicWarheadEntity>> STRATEGIC_WARHEAD = register("strategic_warhead", EntityType.Builder.<StrategicWarheadEntity>of(StrategicWarheadEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StrategicWarheadEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MortarormissleshooterEntity.init();
			DESIGNATOREntity.init();
			CockroachEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MORTARORMISSLESHOOTER.get(), MortarormissleshooterEntity.createAttributes().build());
		event.put(DESIGNATOR.get(), DESIGNATOREntity.createAttributes().build());
		event.put(COCKROACH.get(), CockroachEntity.createAttributes().build());
	}
}
