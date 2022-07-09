package com.gildedrose;

public class AgedBrieItem extends Item implements IItem{

	public AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		
		if(quality < 50) {
			quality = quality + 1;
		}
		
		sellIn = sellIn -1;
		
		//I think this is a bug, because there is not describing about increases faster
		/*
		if (sellIn < 0 && quality < 50) {
        	quality = quality + 1;
        }
        */
	}
}
