package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpiration() {
        if (quality < 50) {
            increaseQuality();
        }
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            increaseQuality();
        }
    }
}
