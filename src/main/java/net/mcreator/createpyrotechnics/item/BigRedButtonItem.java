
package net.mcreator.createpyrotechnics.item;

public class BigRedButtonItem extends Item {
	public BigRedButtonItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BigRedButtonRightclickedProcedure.execute();
		return ar;
	}
}