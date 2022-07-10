package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SulfurasItemTest {
	@Test
    void testSuccess() {
		SulfurasItem item = new SulfurasItem("Sulfuras, Hand of Ragnaros", 2, 80);
        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        assertEquals(2, item.sellIn);
        assertEquals(80, item.quality);
    }
	
	@Test
    void itShouldNotChangeSellIn() {
		SulfurasItem item = new SulfurasItem("Sulfuras, Hand of Ragnaros", 2, 80);
		item.update();
        assertEquals(2, item.sellIn);
    }
	
	@Test
    void itShouldNotChangeQuality() {
		SulfurasItem item = new SulfurasItem("Sulfuras, Hand of Ragnaros", 2, 80);
		item.update();
        assertEquals(80, item.quality);
    }
}
