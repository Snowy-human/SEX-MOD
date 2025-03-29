
package net.mcreator.sex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.sex.init.SexModFluids;

public class CumItem extends BucketItem {
	public CumItem() {
		super(SexModFluids.CUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
