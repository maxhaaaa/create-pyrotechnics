
package net.mcreator.createpyrotechnics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GasCanisterItem extends Item {
	public GasCanisterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
