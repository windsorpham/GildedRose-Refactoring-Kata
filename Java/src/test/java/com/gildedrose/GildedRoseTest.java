package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item i = new Item("Aged Brie", 2, 0);
        Item[] items = new Item[] { i};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, i.quality);
    }

}
