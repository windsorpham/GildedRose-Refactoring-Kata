package com.gildedrose;

public class BackstagePassesItem extends AbstractItem{
    private static final int TEN_DAYS = 10;
    private static final int FIVE_DAYS = 5;
	public BackstagePassesItem(Item item) {
		super(item);
	}

	@Override
	public void calQuality() {
		if (overdue()) {
        	item.quality = item.quality - item.quality;
        }
		else if (item.sellIn <= FIVE_DAYS) {
            item.quality = item.quality + 3;
        }

		else if (item.sellIn <= TEN_DAYS) {
            item.quality = item.quality + 2;
        }
        else
            item.quality = item.quality + 1;
	}


}
