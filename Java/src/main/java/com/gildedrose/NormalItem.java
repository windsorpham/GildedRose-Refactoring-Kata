package com.gildedrose;

public class NormalItem extends Item implements IItem{

	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		sellIn = sellIn -1;
		if(quality > 0)
			quality = quality - 1;
		if(sellIn < 0 && quality > 0)
			quality = quality - 1;
	}

}
