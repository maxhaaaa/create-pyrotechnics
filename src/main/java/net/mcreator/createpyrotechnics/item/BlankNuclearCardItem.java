
package net.mcreator.createpyrotechnics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlankNuclearCardItem extends Item {
	public BlankNuclearCardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
