
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createpyrotechnics.block.WeTestFallingBlocksBlock;
import net.mcreator.createpyrotechnics.block.ValuestorageblockBlock;
import net.mcreator.createpyrotechnics.block.TrinitytestBlock;
import net.mcreator.createpyrotechnics.block.ThrusterCTestBlock;
import net.mcreator.createpyrotechnics.block.ThrusterBlock;
import net.mcreator.createpyrotechnics.block.TestSaltedNukesBlock;
import net.mcreator.createpyrotechnics.block.TestCustomMissileBlock;
import net.mcreator.createpyrotechnics.block.StrategicNukePlaceholderBlock;
import net.mcreator.createpyrotechnics.block.StrategicNukePlaceholder2Block;
import net.mcreator.createpyrotechnics.block.SizeTesterBlock;
import net.mcreator.createpyrotechnics.block.SiloBlockBlock;
import net.mcreator.createpyrotechnics.block.ShockwaveTesterBlock;
import net.mcreator.createpyrotechnics.block.RadarBlock;
import net.mcreator.createpyrotechnics.block.PlaceholderBlock;
import net.mcreator.createpyrotechnics.block.ParticleTestingBlock;
import net.mcreator.createpyrotechnics.block.NuclearCoreBlock;
import net.mcreator.createpyrotechnics.block.MissileNavigationBlock;
import net.mcreator.createpyrotechnics.block.MissileControllPanelBlock;
import net.mcreator.createpyrotechnics.block.MissileBodyStage3Block;
import net.mcreator.createpyrotechnics.block.MissileBodyPlaceholderBlock;
import net.mcreator.createpyrotechnics.block.MissileBodyBlock;
import net.mcreator.createpyrotechnics.block.MIRVTest1Block;
import net.mcreator.createpyrotechnics.block.LinkerCTestBlock;
import net.mcreator.createpyrotechnics.block.LaunchPadBlock;
import net.mcreator.createpyrotechnics.block.ICBMGuidanceSystemBlock;
import net.mcreator.createpyrotechnics.block.FuelTankBlock;
import net.mcreator.createpyrotechnics.block.ExplosivesphereworkbenchBlock;
import net.mcreator.createpyrotechnics.block.EnrichmentBlock;
import net.mcreator.createpyrotechnics.block.EngineCTestBlock;
import net.mcreator.createpyrotechnics.block.DynamiteTestBlockBlock;
import net.mcreator.createpyrotechnics.block.DesignatorblockBlock;
import net.mcreator.createpyrotechnics.block.DatawirestopperBlock;
import net.mcreator.createpyrotechnics.block.DatawireblockBlock;
import net.mcreator.createpyrotechnics.block.ComputerblockBlock;
import net.mcreator.createpyrotechnics.block.CautionSignUpperBlock;
import net.mcreator.createpyrotechnics.block.CautionSignBottomBlock;
import net.mcreator.createpyrotechnics.block.BombBenchP2Block;
import net.mcreator.createpyrotechnics.block.BombBenchP1Block;
import net.mcreator.createpyrotechnics.block.BodySlabCTestBlock;
import net.mcreator.createpyrotechnics.block.BodyCTestBlock;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class CreatePyrotechnicsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreatePyrotechnicsMod.MODID);
	public static final RegistryObject<Block> COMPUTERBLOCK = REGISTRY.register("computerblock", () -> new ComputerblockBlock());
	public static final RegistryObject<Block> DATAWIREBLOCK = REGISTRY.register("datawireblock", () -> new DatawireblockBlock());
	public static final RegistryObject<Block> DATAWIRESTOPPER = REGISTRY.register("datawirestopper", () -> new DatawirestopperBlock());
	public static final RegistryObject<Block> SILO_BLOCK = REGISTRY.register("silo_block", () -> new SiloBlockBlock());
	public static final RegistryObject<Block> VALUESTORAGEBLOCK = REGISTRY.register("valuestorageblock", () -> new ValuestorageblockBlock());
	public static final RegistryObject<Block> EXPLOSIVESPHEREWORKBENCH = REGISTRY.register("explosivesphereworkbench", () -> new ExplosivesphereworkbenchBlock());
	public static final RegistryObject<Block> PLACEHOLDER = REGISTRY.register("placeholder", () -> new PlaceholderBlock());
	public static final RegistryObject<Block> DESIGNATORBLOCK = REGISTRY.register("designatorblock", () -> new DesignatorblockBlock());
	public static final RegistryObject<Block> TRINITYTEST = REGISTRY.register("trinitytest", () -> new TrinitytestBlock());
	public static final RegistryObject<Block> THRUSTER = REGISTRY.register("thruster", () -> new ThrusterBlock());
	public static final RegistryObject<Block> FUEL_TANK = REGISTRY.register("fuel_tank", () -> new FuelTankBlock());
	public static final RegistryObject<Block> MISSILE_BODY = REGISTRY.register("missile_body", () -> new MissileBodyBlock());
	public static final RegistryObject<Block> MISSILE_CONTROLL_PANEL = REGISTRY.register("missile_controll_panel", () -> new MissileControllPanelBlock());
	public static final RegistryObject<Block> MISSILE_NAVIGATION = REGISTRY.register("missile_navigation", () -> new MissileNavigationBlock());
	public static final RegistryObject<Block> MISSILE_BODY_STAGE_3 = REGISTRY.register("missile_body_stage_3", () -> new MissileBodyStage3Block());
	public static final RegistryObject<Block> PARTICLE_TESTING = REGISTRY.register("particle_testing", () -> new ParticleTestingBlock());
	public static final RegistryObject<Block> BOMB_BENCH_P_2 = REGISTRY.register("bomb_bench_p_2", () -> new BombBenchP2Block());
	public static final RegistryObject<Block> BOMB_BENCH_P_1 = REGISTRY.register("bomb_bench_p_1", () -> new BombBenchP1Block());
	public static final RegistryObject<Block> STRATEGIC_NUKE_PLACEHOLDER = REGISTRY.register("strategic_nuke_placeholder", () -> new StrategicNukePlaceholderBlock());
	public static final RegistryObject<Block> WE_TEST_FALLING_BLOCKS = REGISTRY.register("we_test_falling_blocks", () -> new WeTestFallingBlocksBlock());
	public static final RegistryObject<Block> STRATEGIC_NUKE_PLACEHOLDER_2 = REGISTRY.register("strategic_nuke_placeholder_2", () -> new StrategicNukePlaceholder2Block());
	public static final RegistryObject<Block> SHOCKWAVE_TESTER = REGISTRY.register("shockwave_tester", () -> new ShockwaveTesterBlock());
	public static final RegistryObject<Block> RADAR = REGISTRY.register("radar", () -> new RadarBlock());
	public static final RegistryObject<Block> NUCLEAR_CORE = REGISTRY.register("nuclear_core", () -> new NuclearCoreBlock());
	public static final RegistryObject<Block> MISSILE_BODY_PLACEHOLDER = REGISTRY.register("missile_body_placeholder", () -> new MissileBodyPlaceholderBlock());
	public static final RegistryObject<Block> ICBM_GUIDANCE_SYSTEM = REGISTRY.register("icbm_guidance_system", () -> new ICBMGuidanceSystemBlock());
	public static final RegistryObject<Block> MIRV_TEST_1 = REGISTRY.register("mirv_test_1", () -> new MIRVTest1Block());
	public static final RegistryObject<Block> DYNAMITE_TEST_BLOCK = REGISTRY.register("dynamite_test_block", () -> new DynamiteTestBlockBlock());
	public static final RegistryObject<Block> ENRICHMENT = REGISTRY.register("enrichment", () -> new EnrichmentBlock());
	public static final RegistryObject<Block> TEST_SALTED_NUKES = REGISTRY.register("test_salted_nukes", () -> new TestSaltedNukesBlock());
	public static final RegistryObject<Block> ENGINE_C_TEST = REGISTRY.register("engine_c_test", () -> new EngineCTestBlock());
	public static final RegistryObject<Block> LINKER_C_TEST = REGISTRY.register("linker_c_test", () -> new LinkerCTestBlock());
	public static final RegistryObject<Block> LAUNCH_PAD = REGISTRY.register("launch_pad", () -> new LaunchPadBlock());
	public static final RegistryObject<Block> TEST_CUSTOM_MISSILE = REGISTRY.register("test_custom_missile", () -> new TestCustomMissileBlock());
	public static final RegistryObject<Block> BODY_C_TEST = REGISTRY.register("body_c_test", () -> new BodyCTestBlock());
	public static final RegistryObject<Block> THRUSTER_C_TEST = REGISTRY.register("thruster_c_test", () -> new ThrusterCTestBlock());
	public static final RegistryObject<Block> CAUTION_SIGN_BOTTOM = REGISTRY.register("caution_sign_bottom", () -> new CautionSignBottomBlock());
	public static final RegistryObject<Block> CAUTION_SIGN_UPPER = REGISTRY.register("caution_sign_upper", () -> new CautionSignUpperBlock());
	public static final RegistryObject<Block> BODY_SLAB_C_TEST = REGISTRY.register("body_slab_c_test", () -> new BodySlabCTestBlock());
	public static final RegistryObject<Block> SIZE_TESTER = REGISTRY.register("size_tester", () -> new SizeTesterBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
