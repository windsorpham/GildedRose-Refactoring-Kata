package com.gildedrose;

public class SulfurasItem extends Item implements IItem{

	public SulfurasItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		// not change value
	}
}
