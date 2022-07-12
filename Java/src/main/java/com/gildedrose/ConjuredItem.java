package com.gildedrose;

public class ConjuredItem extends AbstractItem{

	public ConjuredItem(Item item) {
		super(item);
	}

	@Override
	public void calQuality() {
		item.quality = item.quality - 2;
	}
}
