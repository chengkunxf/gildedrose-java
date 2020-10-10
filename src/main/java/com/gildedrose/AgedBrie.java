package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie( int sellIn, int quality) {
        super(AGED_BRIE,sellIn,quality);
    }

    @Override
    protected void udpateQualityAfterExpiration() {
        increaseQuality();
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }

}
