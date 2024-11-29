
package net.mcreator.createpyrotechnics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CoreItem extends Item {
	public CoreItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
