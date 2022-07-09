package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NormalItemTest {
	@Test
    void testSuccess() {
		NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
        assertEquals("Elixir of the Mongoose", item.name);
        assertEquals(5, item.sellIn);
        assertEquals(7, item.quality);
    }
	
	@Test
    void itShouldDecrementSellIn() {
		NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
		item.updateQuality();
        assertEquals(4, item.sellIn);
    }
	
	@Test
    void itShouldDecrementQuality1() {
		NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
		item.updateQuality();
        assertEquals(6, item.quality);
    }
	
	@Test
    void itShouldDecrementQuality2WhenConjured() {
		NormalItem item = new NormalItem("Elixir of the Mongoose", -1, 7);
		item.updateQuality();
        assertEquals(5, item.quality);
    }
	
	@Test
    void itShouldQualityNotNegative() {
		NormalItem item = new NormalItem("Elixir of the Mongoose", -3, 0);
		item.updateQuality();
        assertEquals(0, item.quality);
    }
	
	@Test
    void testToStringSuccess() {
		NormalItem item = new NormalItem("Elixir of the Mongoose", -3, 0);
		item.updateQuality();
        assertEquals("Elixir of the Mongoose, -4, 0", item.toString());
    }
}
