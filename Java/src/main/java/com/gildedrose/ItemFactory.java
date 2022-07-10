package com.gildedrose;

public class ItemFactory {
	public static final String BACKSTAGE_PASSES = "Backstage passes";
	public static final String AGED_BRIE = "Aged Brie";
	public static final String SULFURAS = "Sulfuras";
	public static final String CONJURED = "Conjured";
	   
	public NormalItem getItem(Item itemInput) {
		if(itemInput.name.contains(AGED_BRIE))
			return new AgedBrieItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else if(itemInput.name.contains(BACKSTAGE_PASSES))
			return new BackstagePassesItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else if(itemInput.name.contains(SULFURAS))
			return new SulfurasItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else if(itemInput.name.contains(CONJURED))
			return new ConjuredItem(itemInput.name, itemInput.sellIn, itemInput.quality);
		else
			return new NormalItem(itemInput.name, itemInput.sellIn, itemInput.quality);
	}
}
