package com.gildedrose;

public class AgedBrieItem extends NormalItem{

	public AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void calQuality() {
		quality = quality + 1;
		//I think this is a bug, because there is not describing about increases faster
		/*
		if (sellIn < 0 && quality < 50) {
        	quality = quality + 1;
        }
        */
	}
}
