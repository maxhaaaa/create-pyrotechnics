
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createpyrotechnics.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatePyrotechnicsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SALTED_NUKES = GameRules.register("saltedNukes", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SALTED_NUKES_BADLANDS = GameRules.register("saltedNukesBadlands", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> EVAPORATE_WATER = GameRules.register("evaporateWater", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> VILLAGE_DESTROYER_NUKES = GameRules.register("villageDestroyerNukes", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TREE_CHARCOAL = GameRules.register("treeCharcoal", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
}
