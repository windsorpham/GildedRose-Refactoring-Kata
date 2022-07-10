package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BackstagePassesItemTest {
	@Test
    void testSuccess() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(15, item.sellIn);
        assertEquals(20, item.quality);
    }
	
	@Test
    void itShouldDecrementSellIn() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        item.update();
        assertEquals(14, item.sellIn);
    }
	
	@Test
    void itShouldIncrementQuality1WhenSellInOver10() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        item.update();
        assertEquals(21, item.quality);
    }
	
	@Test
    void itShouldIncrementQuality2WhenSellInLessAndEqual10() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        item.update();
        assertEquals(22, item.quality);
    }
	
	@Test
    void itShouldIncrementQuality3WhenSellInLessAndEqual5() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        item.update();
        assertEquals(23, item.quality);
    }
	
	@Test
    void itShouldQualityEqual0WhenSellInLess0() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        item.update();
        assertEquals(0, item.quality);
    }
	
	@Test
    void itShouldQualityNotOver50() {
		BackstagePassesItem item = new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 3, 50);
		item.update();
        assertEquals(50, item.quality);
    }
}
