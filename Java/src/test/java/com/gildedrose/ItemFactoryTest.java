package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ItemFactoryTest {
	@Test
    void testAgedBrieItemSuccess() {
		ItemFactory itemFactory = new ItemFactory();
		Item item  = new Item ("Aged Brie", 2, 0);
    	IItem agedBrieItem = itemFactory.getItem(item);
        assertEquals(AgedBrieItem.class, agedBrieItem.getClass());
    }
	
	@Test
    void testBackstagePassesItemSuccess() {
		ItemFactory itemFactory = new ItemFactory();
		Item item  = new Item ("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    	IItem backstagePassesItem = itemFactory.getItem(item);
        assertEquals(BackstagePassesItem.class, backstagePassesItem.getClass());
    }
	
	@Test
    void testSulfurasItemSuccess() {
		ItemFactory itemFactory = new ItemFactory();
		Item item  = new Item ("Sulfuras, Hand of Ragnaros", 0, 80);
    	IItem sulfurasItem = itemFactory.getItem(item);
        assertEquals(SulfurasItem.class, sulfurasItem.getClass());
    }
	
	@Test
    void testConjuredItemSuccess() {
		ItemFactory itemFactory = new ItemFactory();
		Item item  = new Item ("Conjured Mana Cake", 3, 6);
    	IItem conjuredItem = itemFactory.getItem(item);
        assertEquals(ConjuredItem.class, conjuredItem.getClass());
    }
	
	@Test
    void testNormalItemSuccess() {
		ItemFactory itemFactory = new ItemFactory();
		Item item  = new Item ("Elixir of the Mongoose", 5, 7);
    	IItem normalItem = itemFactory.getItem(item);
        assertEquals(NormalItem.class, normalItem.getClass());
    }
}
