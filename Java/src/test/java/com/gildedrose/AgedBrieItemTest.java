package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AgedBrieItemTest {
	@Test
    void testSuccess() {
		AgedBrieItem item = new AgedBrieItem("Aged Brie", 2, 0);
        assertEquals("Aged Brie", item.name);
        assertEquals(2, item.sellIn);
        assertEquals(0, item.quality);
    }
	
	@Test
    void itShouldDecrementSellIn() {
		AgedBrieItem item = new AgedBrieItem("Aged Brie", 2, 0);
		item.update();
        assertEquals(1, item.sellIn);
    }
	
	@Test
    void itShouldIncrementQuality() {
		AgedBrieItem item = new AgedBrieItem("Aged Brie", 2, 0);
		item.update();
        assertEquals(1, item.quality);
    }
	
	@Test
    void itShouldQualityNotOver50() {
		AgedBrieItem item = new AgedBrieItem("Aged Brie", 2, 50);
		item.update();
        assertEquals(50, item.quality);
    }
}
