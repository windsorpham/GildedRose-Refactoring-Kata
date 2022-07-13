package com.gildedrose;

public class ItemFactory {
	private static final String BACKSTAGE_PASSES = "Backstage passes";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras";
    private static final String CONJURED = "Conjured";
    private ItemFactory()
    {
    }
	public static final void update(Item itemInput) {
		if(itemInput.name.contains(AGED_BRIE))
            (new AgedBrieItem(itemInput)).update();
		else if(itemInput.name.contains(BACKSTAGE_PASSES))
			(new BackstagePassesItem(itemInput)).update();
		else if(itemInput.name.contains(SULFURAS))
			(new SulfurasItem(itemInput)).update();
		else if(itemInput.name.contains(CONJURED))
            (new ConjuredItem(itemInput)).update();
		else
            (new NormalItem(itemInput)).update();
	}
}
