package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConjuredItemTest {
	@Test
    void testSuccess() {
		ConjuredItem item = new ConjuredItem("Conjured Mana Cake", 3, 6);
        assertEquals("Conjured Mana Cake", item.name);
        assertEquals(3, item.sellIn);
        assertEquals(6, item.quality);
    }
	
	@Test
    void itShouldDecrementSellIn() {
		ConjuredItem item = new ConjuredItem("Conjured Mana Cake", 3, 6);
		item.update();
        assertEquals(2, item.sellIn);
    }
	
	@Test
    void itShouldDecrementQuality2() {
		ConjuredItem item = new ConjuredItem("Conjured Mana Cake", 3, 6);
		item.update();
        assertEquals(4, item.quality);
    }
	
	@Test
    void itShouldQualityNotNegative() {
		ConjuredItem item = new ConjuredItem("Conjured Mana Cake", 3, 1);
		item.update();
        assertEquals(0, item.quality);
    }
}
