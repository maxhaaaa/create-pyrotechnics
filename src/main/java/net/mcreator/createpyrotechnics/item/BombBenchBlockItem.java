
package net.mcreator.createpyrotechnics.item;

public class BombBenchBlockItem extends Item {
	public BombBenchBlockItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BombBenchBlockRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}