package com.gildedrose;

import com.gildedrose.Item;
import com.gildedrose.ItemFactory;

public class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
    	this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemFactory.update(item);
        }
    }

}
