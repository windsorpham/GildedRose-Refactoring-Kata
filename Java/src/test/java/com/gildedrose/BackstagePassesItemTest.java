package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BackstagePassesItemTest {
	@Test
    void testSuccess() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
		BackstagePassesItem item = new BackstagePassesItem(i);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", i.name);
        assertEquals(15, i.sellIn);
        assertEquals(20, i.quality);
    }

	@Test
    void itShouldDecrementSellIn() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        BackstagePassesItem item = new BackstagePassesItem(i);
        item.update();
        assertEquals(14, i.sellIn);
    }

	@Test
    void itShouldIncrementQuality1WhenSellInOver10() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        BackstagePassesItem item = new BackstagePassesItem(i);
        item.update();
        assertEquals(21, i.quality);
    }

	@Test
    void itShouldIncrementQuality2WhenSellInLessAndEqual10() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        BackstagePassesItem item = new BackstagePassesItem(i);
        item.update();
        assertEquals(22, i.quality);
    }

	@Test
    void itShouldIncrementQuality3WhenSellInLessAndEqual5() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        BackstagePassesItem item = new BackstagePassesItem(i);
        item.update();
        assertEquals(23, i.quality);
    }

	@Test
    void itShouldQualityEqual0WhenSellInLess0() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        BackstagePassesItem item = new BackstagePassesItem(i);
        item.update();
        assertEquals(0, i.quality);
    }

	@Test
    void itShouldQualityNotOver50() {
        Item i = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50);
        BackstagePassesItem item = new BackstagePassesItem(i);
		item.update();
        assertEquals(50, i.quality);
    }
}
