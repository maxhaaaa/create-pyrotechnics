package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ExplodeandmotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double intensity, double power, double speed_divider) {
		for (int index0 = 0; index0 < (int) intensity; index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("/summon falling_block ~ ~ ~ {BlockState:{Name:\"" + ""
								+ ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), power + power * (-2), 0), y + Mth.nextDouble(RandomSource.create(), power + power * (-2), 0),
										z + Mth.nextDouble(RandomSource.create(), power + power * (-2), 0)))).getBlock()).toString()
								+ "\"},Time:1,Motion:[" + Mth.nextDouble(RandomSource.create(), power / speed_divider + intensity * (-2), intensity) / speed_divider + "d," + (power / speed_divider + Mth.nextDouble(RandomSource.create(), 1, 2)) + "d,"
								+ Mth.nextDouble(RandomSource.create(), power / speed_divider + intensity * (-2), intensity) / speed_divider + "d]}"));
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) power, Level.ExplosionInteraction.MOB);
	}
}
