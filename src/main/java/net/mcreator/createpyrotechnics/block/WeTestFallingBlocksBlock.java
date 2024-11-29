
package net.mcreator.createpyrotechnics.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WeTestFallingBlocksBlock extends Block {
	public WeTestFallingBlocksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		WeTestFallingBlocksOnBlockRightClickedProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}