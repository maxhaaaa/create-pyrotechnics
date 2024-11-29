
package net.mcreator.createpyrotechnics.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StrategicNukePlaceholderBlock extends Block {
	public StrategicNukePlaceholderBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		StrategicMushroomCloudProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}