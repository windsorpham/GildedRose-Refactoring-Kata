package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ItemFactoryTest {
	@Test
    void testAgedBrieItemSuccess() {
		Item item  = new Item ("Aged Brie", 2, 0);
        IItem agedBrieItem = ItemFactory.getItem(item);
        assertEquals(AgedBrieItem.class, agedBrieItem.getClass());
    }

	@Test
    void testBackstagePassesItemSuccess() {
		Item item  = new Item ("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        IItem backstagePassesItem = ItemFactory.getItem(item);
        assertEquals(BackstagePassesItem.class, backstagePassesItem.getClass());
    }

	@Test
    void testSulfurasItemSuccess() {
		Item item  = new Item ("Sulfuras, Hand of Ragnaros", 0, 80);
        IItem sulfurasItem = ItemFactory.getItem(item);
        assertEquals(SulfurasItem.class, sulfurasItem.getClass());
    }

	@Test
    void testConjuredItemSuccess() {
		Item item  = new Item ("Conjured Mana Cake", 3, 6);
        IItem conjuredItem = ItemFactory.getItem(item);
        assertEquals(ConjuredItem.class, conjuredItem.getClass());
    }

	@Test
    void testNormalItemSuccess() {
		Item item  = new Item ("Elixir of the Mongoose", 5, 7);
        IItem normalItem = ItemFactory.getItem(item);
        assertEquals(NormalItem.class, normalItem.getClass());
    }
}
