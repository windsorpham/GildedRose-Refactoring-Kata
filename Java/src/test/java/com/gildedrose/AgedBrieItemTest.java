package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AgedBrieItemTest {
	@Test
    void testSuccess() {
        Item i = new Item("Aged Brie", 2, 0);
		AgedBrieItem item = new AgedBrieItem(i);
        assertEquals("Aged Brie", i.name);
        assertEquals(2, i.sellIn);
        assertEquals(0, i.quality);
    }

	@Test
    void itShouldDecrementSellIn() {
        Item i = new Item("Aged Brie", 2, 0);
        AgedBrieItem item = new AgedBrieItem(i);
		item.update();
        assertEquals(1, i.sellIn);
    }

	@Test
    void itShouldIncrementQuality() {
        Item i = new Item("Aged Brie", 2, 0);
        AgedBrieItem item = new AgedBrieItem(i);
		item.update();
        assertEquals(1, i.quality);
    }

	@Test
    void itShouldQualityNotOver50() {
        Item i = new Item("Aged Brie", 2, 50);
        AgedBrieItem item = new AgedBrieItem(i);
		item.update();
        assertEquals(50, i.quality);
    }
}
