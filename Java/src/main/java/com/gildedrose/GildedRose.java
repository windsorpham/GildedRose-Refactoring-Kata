package com.gildedrose;

class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
    	this.items = items;
    }

    public void updateQuality() {
    	for (int i = 0; i < items.length; i++) {
    		IItem item;
    		switch (items[i].name) {
            case  "Aged Brie":
            	item = new AgedBrieItem(items[i].name, items[i].sellIn, items[i].quality);
                break;
            case  "Backstage passes to a TAFKAL80ETC concert":
            	item = new BackstagePassesItem(items[i].name, items[i].sellIn, items[i].quality);
                break;
            case  "Sulfuras, Hand of Ragnaros":
            	item = new SulfurasItem(items[i].name, items[i].sellIn, items[i].quality);
                break;
            case  "Conjured Mana Cake":
            	item = new ConjuredItem(items[i].name, items[i].sellIn, items[i].quality);
                break;
            default:
            	item = new NormalItem(items[i].name, items[i].sellIn, items[i].quality);
    		}
    		item.updateQuality();
        	this.items[i] = (Item) item;
        }
    }
    	    
}