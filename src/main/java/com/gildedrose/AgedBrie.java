package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie( int sellIn, int quality) {
        super(AGED_BRIE,sellIn,quality);
    }

    @Override
    protected void udpateQualityAfterExpiration() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
