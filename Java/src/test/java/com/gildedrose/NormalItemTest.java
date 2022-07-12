package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NormalItemTest {
	@Test
    void testSuccess() {
        Item i = new Item("Elixir of the Mongoose", 5, 7);
		NormalItem item = new NormalItem(i);
        assertEquals("Elixir of the Mongoose", i.name);
        assertEquals(5, i.sellIn);
        assertEquals(7, item.item.quality);
    }

	@Test
    void itShouldDecrementSellIn() {
        Item i = new Item("Elixir of the Mongoose", 5, 7);
        NormalItem item = new NormalItem(i);
		item.update();
        assertEquals(4, i.sellIn);
    }

	@Test
    void itShouldDecrementQuality1() {
        Item i = new Item("Elixir of the Mongoose", 5, 7);
        NormalItem item = new NormalItem(i);
		item.update();
        assertEquals(6, i.quality);
    }

	@Test
    void itShouldDecrementQuality2WhenConjured() {
        Item i = new Item("Elixir of the Mongoose", -1, 7);
        NormalItem item = new NormalItem(i);
		item.update();
        assertEquals(5, i.quality);
    }

	@Test
    void itShouldQualityNotNegative() {
        Item i = new Item("Elixir of the Mongoose", -3, 0);
        NormalItem item = new NormalItem(i);
		item.update();
        assertEquals(0, i.quality);
    }

	@Test
    void testToStringSuccess() {
        Item i = new Item("Elixir of the Mongoose", -3, 0);
        NormalItem item = new NormalItem(i);
		item.update();
        assertEquals("Elixir of the Mongoose, -4, 0", i.toString());
    }
}
