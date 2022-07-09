package com.gildedrose;

public class BackstagePassesItem extends AgedBrieItem implements IItem{

	public BackstagePassesItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {

		if (sellIn < 11) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
		
        if (sellIn < 6) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
        
        super.updateQuality();
        
        if (sellIn < 0) {
        	quality = quality - quality;
        }
	}


}
