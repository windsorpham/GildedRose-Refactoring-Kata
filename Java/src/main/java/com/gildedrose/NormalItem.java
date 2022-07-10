package com.gildedrose;

public class NormalItem extends Item{
	public static final int MAX_QUALITY = 50;
	public static final int TEN_DAYS = 10;
	public static final int FIVE_DAYS = 5;
	public static final int SELLIN_DAY_OVERDUE = 0;
	
	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	protected void update() {
		setQuality();
		decrementSellIn();
	}

	private void decrementSellIn() {
		sellIn = sellIn - 1;
	}

	protected boolean overdue() {
		return sellIn <= SELLIN_DAY_OVERDUE;
	}

	private void setQuality() {
		calQuality();
	    quality = Math.max(0, Math.min(MAX_QUALITY, quality));
	}
	
	protected void calQuality() {
		if(overdue())
		{
			quality = quality - 2;
		}
		else 
			quality = quality - 1;
	}
}
