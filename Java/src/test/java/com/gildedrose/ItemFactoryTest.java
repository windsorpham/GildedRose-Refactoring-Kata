package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ItemFactoryTest {
	@Test
    void testAgedBrieItemSuccess() {
		Item item  = new Item ("Aged Brie", 2, 0);
        ItemFactory.update(item);
        assertEquals(1, item.sellIn);
    }

	@Test
    void testBackstagePassesItemSuccess() {
		Item item  = new Item ("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        ItemFactory.update(item);
        assertEquals(14, item.sellIn);
    }

	@Test
    void testSulfurasItemSuccess() {
		Item item  = new Item ("Sulfuras, Hand of Ragnaros", 0, 80);
        ItemFactory.update(item);
        assertEquals(0, item.sellIn);
    }

	@Test
    void testConjuredItemSuccess() {
		Item item  = new Item ("Conjured Mana Cake", 3, 6);
        ItemFactory.update(item);
        assertEquals(2, item.sellIn);
    }

	@Test
    void testNormalItemSuccess() {
		Item item  = new Item ("Elixir of the Mongoose", 5, 7);
        ItemFactory.update(item);
        assertEquals(4, item.sellIn);
    }
}
