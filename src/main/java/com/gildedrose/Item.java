package com.gildedrose;

public class Item {

    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected void something() {
        updateQuality();

        updateSellIn();

        if (isExpried()) {
            updateQualityAfterExpiration();
        }
    }

    protected void updateQualityAfterExpiration() {
        if (isBackstagePass()) {

        } else {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

    private boolean isExpried() {
        return sellIn < 0;
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected boolean isBackstagePass() {
        return false;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
