package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SulfurasItemTest {
	@Test
    void testSuccess() {
		Item i = new Item("Sulfuras, Hand of Ragnaros", 2, 80);
        SulfurasItem item = new SulfurasItem(i);
        assertEquals("Sulfuras, Hand of Ragnaros", i.name);
        assertEquals(2, i.sellIn);
        assertEquals(80, i.quality);
    }

	@Test
    void itShouldNotChangeSellIn() {
        Item i = new Item("Sulfuras, Hand of Ragnaros", 2, 80);
        SulfurasItem item = new SulfurasItem(i);
		item.update();
        assertEquals(2, i.sellIn);
    }

	@Test
    void itShouldNotChangeQuality() {
        Item i = new Item("Sulfuras, Hand of Ragnaros", 2, 80);
        SulfurasItem item = new SulfurasItem(i);
		item.update();
        assertEquals(80, i.quality);
    }
}
