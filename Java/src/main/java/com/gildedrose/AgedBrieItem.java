package com.gildedrose;

class AgedBrieItem extends AbstractItem{

	public AgedBrieItem(Item item) {
		super(item);
	}


	public void calQuality() {
		item.quality = item.quality + 1;
		//I think this is a bug, because there is not describing about increases faster
		/*
		if (sellIn < 0 && quality < 50) {
        	quality = quality + 1;
        }
        */
	}
}
