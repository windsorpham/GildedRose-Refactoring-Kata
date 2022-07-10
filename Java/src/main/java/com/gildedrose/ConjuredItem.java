package com.gildedrose;

public class ConjuredItem extends NormalItem{

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void calQuality() {
		quality = quality - 2;
	}
}
