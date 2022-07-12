package com.gildedrose;

public abstract class AbstractItem implements IItem
{
    private static final int MAX_QUALITY = 50;
    private static final int SELLIN_DAY_OVERDUE = 0;
    protected Item item;
    protected AbstractItem(Item item)
    {
        this.item = item;
    }

    public void update() {
        setQuality();
        decrementSellIn();
    }
    public abstract void calQuality();
    private void setQuality() {
        calQuality();
        item.quality = Math.max(0, Math.min(MAX_QUALITY, item.quality));
    }
    protected boolean overdue() {
        return item.sellIn <= SELLIN_DAY_OVERDUE;
    }
    private void decrementSellIn() {
        item.sellIn = item.sellIn - 1;
    }

}
