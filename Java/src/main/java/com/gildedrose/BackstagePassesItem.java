package com.gildedrose;

public class BackstagePassesItem extends NormalItem{

	public BackstagePassesItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void calQuality() {
		if (overdue()) {
        	quality = quality - quality;
        }
		else if (sellIn <= FIVE_DAYS) {
            quality = quality + 3;
        }
		
		else if (sellIn <= TEN_DAYS) {
            quality = quality + 2;
        }
        else
        	quality = quality + 1;
	}


}
