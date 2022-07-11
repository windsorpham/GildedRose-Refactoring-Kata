package com.gildedrose;

class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
    	this.items = items;
    }

    public void updateQuality() {
    	NormalItem item;
    	for (int i = 0; i < items.length; i++) {
    		item = ItemFactory.getItem(items[i]);
    		item.update();
        	this.items[i] = (Item) item;
        }
    }

}
