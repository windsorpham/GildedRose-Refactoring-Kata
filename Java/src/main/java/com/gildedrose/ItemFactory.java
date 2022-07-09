package com.gildedrose;

public class ItemFactory {
	public IItem getItem(Item itemInput) {
		if(itemInput.name.contains("Aged Brie"))
			return new AgedBrieItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else if(itemInput.name.contains("Backstage passes"))
			return new BackstagePassesItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else if(itemInput.name.contains("Sulfuras"))
			return new SulfurasItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else if(itemInput.name.contains("Conjured"))
			return new ConjuredItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else
			return new NormalItem(itemInput.name, itemInput.sellIn, itemInput.quality);
	}
}
