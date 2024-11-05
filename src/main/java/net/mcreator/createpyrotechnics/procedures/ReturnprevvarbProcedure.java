package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class ReturnprevvarbProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
		if (guistate == null)
			return "";
		return "" + (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), (guistate.containsKey("text:customevarible") ? ((EditBox) guistate.get("text:customevarible")).getValue() : "")));
	}
}
