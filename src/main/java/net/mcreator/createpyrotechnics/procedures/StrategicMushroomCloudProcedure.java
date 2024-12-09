package net.mcreator.createpyrotechnics.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

public class StrategicMushroomCloudProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle create_pyrotechnics:strategic_flash ~ ~ ~ 0 0 0 0 1 force");
		CreatePyrotechnicsMod.queueServerWork(20, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 15, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 100, Level.ExplosionInteraction.NONE);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_pyrotechnics:explosion")), SoundSource.NEUTRAL, 125, -1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_pyrotechnics:explosion")), SoundSource.NEUTRAL, 125, -1, false);
				}
			}
		});
		StrategicNukeStemRandomProcedure.execute(world, x, y, z);
		StrategicNukeShockwaveRandomProcedure.execute(world, x, y + 5, z);
		StrategicNukeCapRandomProcedure.execute(world, x, y + 5, z);
	}
}
