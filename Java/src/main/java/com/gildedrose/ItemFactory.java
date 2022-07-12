package com.gildedrose;

public class ItemFactory {
	private static final String BACKSTAGE_PASSES = "Backstage passes";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras";
    private static final String CONJURED = "Conjured";
    private ItemFactory()
    {
    }
	public static final IItem getItem(Item itemInput) {
		if(itemInput.name.contains(AGED_BRIE))
			return new AgedBrieItem(itemInput);
		else if(itemInput.name.contains(BACKSTAGE_PASSES))
			return new BackstagePassesItem(itemInput);
		else if(itemInput.name.contains(SULFURAS))
			return new SulfurasItem(itemInput);
		else if(itemInput.name.contains(CONJURED))
			return new ConjuredItem(itemInput);
		else
			return new NormalItem(itemInput);
	}
}
