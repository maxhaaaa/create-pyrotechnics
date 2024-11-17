package net.mcreator.createpyrotechnics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModItems;
import net.mcreator.createpyrotechnics.init.CreatePyrotechnicsModBlocks;

public class BombBenchBlockRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, y + 1, z), CreatePyrotechnicsModBlocks.BOMB_BENCH_P_1.get().defaultBlockState(), 3);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(CreatePyrotechnicsModItems.BOMB_BENCH_BLOCK.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
