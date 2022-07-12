package com.gildedrose;

public class NormalItem extends AbstractItem{
	public NormalItem(Item item) {
		super(item);
	}
	@Override
    public void calQuality() {
		if(overdue())
		{
			item.quality = item.quality - 2;
		}
		else
            item.quality = item.quality - 1;
	}
}
