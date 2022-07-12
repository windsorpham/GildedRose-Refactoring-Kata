package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConjuredItemTest {
	@Test
    void testSuccess() {
        Item i = new Item("Conjured Mana Cake", 3, 6);
		ConjuredItem item = new ConjuredItem(i);
        assertEquals("Conjured Mana Cake", i.name);
        assertEquals(3, i.sellIn);
        assertEquals(6, i.quality);
    }

	@Test
    void itShouldDecrementSellIn() {
        Item i = new Item("Conjured Mana Cake", 3, 6);
        ConjuredItem item = new ConjuredItem(i);
		item.update();
        assertEquals(2, i.sellIn);
    }

	@Test
    void itShouldDecrementQuality2() {
        Item i = new Item("Conjured Mana Cake", 3, 6);
        ConjuredItem item = new ConjuredItem(i);
		item.update();
        assertEquals(4, i.quality);
    }

	@Test
    void itShouldQualityNotNegative() {
        Item i = new Item("Conjured Mana Cake", 3, 1);
        ConjuredItem item = new ConjuredItem(i);
		item.update();
        assertEquals(0, i.quality);
    }
}
